package com.arvgord.bankdemoserver.repository.nproblem.adapter

import org.springframework.data.domain.PageImpl
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import com.arvgord.bankdemoserver.domain.nproblem.interaction.ExtractingStrategy
import com.arvgord.bankdemoserver.domain.nproblem.interaction.PageRequest
import com.arvgord.bankdemoserver.domain.nproblem.interaction.PageResponse
import com.arvgord.bankdemoserver.domain.nproblem.repository.BankDemoAdapter
import com.arvgord.bankdemoserver.repository.nproblem.ClientBatchRepository
import com.arvgord.bankdemoserver.repository.nproblem.ClientEagerRepository
import com.arvgord.bankdemoserver.repository.nproblem.ClientLazyRepository
import com.arvgord.bankdemoserver.repository.nproblem.entity.lazy.ClientEntityLazy
import com.arvgord.bankdemoserver.repository.nproblem.entity.lazy.ClientEntityLazy_
import com.arvgord.bankdemoserver.repository.nproblem.mapping.ClientEntityMapper
import org.springframework.data.jpa.domain.Specification
import jakarta.persistence.criteria.JoinType
import org.springframework.data.domain.PageRequest as SpringPageRequest

@Component
@Transactional
class BankDemoAdapterImpl(
    private val clientBatchRepository : ClientBatchRepository,
    private val clientEagerRepository: ClientEagerRepository,
    private val clientLazyRepository: ClientLazyRepository,
    private val mapper: ClientEntityMapper
) : BankDemoAdapter {

    override fun getClients(pageRequest: PageRequest, extractingStrategy: ExtractingStrategy): PageResponse {
        val pageable = SpringPageRequest.of(pageRequest.page, pageRequest.size)
        val result = when (extractingStrategy) {
            ExtractingStrategy.LAZY -> clientLazyRepository.findAll(pageable).map { mapper.map(it) }
            ExtractingStrategy.EAGER -> clientEagerRepository.findAll(pageable).map { mapper.map(it) }
            ExtractingStrategy.BATCH -> clientBatchRepository.findAll(pageable).map { mapper.map(it) }
            ExtractingStrategy.CRITERIA -> clientLazyRepository.findAll(getSpec(), pageable).map { mapper.map(it) }
            ExtractingStrategy.ENTITY_GRAPH -> clientLazyRepository.getAllBy(pageable).map { mapper.map(it) }
            ExtractingStrategy.ENTITY_GRAPH_PAGEABLE -> {
                val clientIds = clientLazyRepository.getAllIds(pageable)
                val result = clientLazyRepository.findAllByIdIn(clientIds.content)
                    .map { mapper.map(it) }
                PageImpl(result, pageable, clientIds.totalElements)
            }
            ExtractingStrategy.ENTITY_GRAPH_PAGEABLE_SKIP_FIELDS -> {
                val clientIds = clientLazyRepository.getAllIds(pageable)
                val result = clientLazyRepository.getAllByIdIn(clientIds.content)
                    .map { mapper.mapEntityGraphSkipFields(it) }
                PageImpl(result, pageable, clientIds.totalElements)
            }
        }
        return PageResponse(result.content, result.totalElements, result.totalPages)
    }

    private fun getSpec(): Specification<ClientEntityLazy> {
        return Specification<ClientEntityLazy> { root, cq, cb ->
            // To except exception: query specified join fetching, but the owner of the fetched association was not present in the select list
            if (cq.resultType == ClientEntityLazy::class.java) {
                root.fetch(ClientEntityLazy_.accounts, JoinType.LEFT)
                root.fetch(ClientEntityLazy_.deposits, JoinType.LEFT)
                root.fetch(ClientEntityLazy_.loans, JoinType.LEFT)
                root.fetch(ClientEntityLazy_.transfers, JoinType.LEFT)
            }
            cb.and()
        }
    }
}