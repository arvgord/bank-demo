package com.arvgord.bankdemoserver.repository.performancetest.adapter

import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityBatchTest
import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityTest
import com.arvgord.bankdemoserver.repository.performancetest.mapping.ClientMapper
import com.arvgord.bankdemoserver.repository.performancetest.repository.ClientEntityBatchTestRepository
import com.arvgord.bankdemoserver.repository.performancetest.repository.ClientEntityTestRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional
class PerformanceTestAdapter(
    private val batchRepository: ClientEntityBatchTestRepository,
    private val pageableEntityGraphRepository: ClientEntityTestRepository,
    private val mapper: ClientMapper
) {

    fun getClientsWith5AccountsListBatch(pageRequest: PageRequest): Page<ClientEntityBatchTest> =
        batchRepository.findAll(pageRequest).map { mapper.map5batch(it) }

    fun getClientsWith10AccountsListBatch(pageRequest: PageRequest): Page<ClientEntityBatchTest> =
        batchRepository.findAll(pageRequest).map { mapper.map10batch(it) }

    fun getClientsWith15AccountsListBatch(pageRequest: PageRequest): Page<ClientEntityBatchTest> =
        batchRepository.findAll(pageRequest).map { mapper.map15batch(it) }

    fun getClientsWith20AccountsListBatch(pageRequest: PageRequest): Page<ClientEntityBatchTest> =
        batchRepository.findAll(pageRequest).map { mapper.map20batch(it) }

    fun getClientsWith5AccountsListEntityGraph(pageRequest: PageRequest): Page<ClientEntityTest> {
        val clientIds = pageableEntityGraphRepository.getAllIds(pageRequest)
        val result = pageableEntityGraphRepository.getAllByIdIn(clientIds.content).map { mapper.map5(it) }
        return PageImpl(result, pageRequest, clientIds.totalElements)
    }

    fun getClientsWith10AccountsListEntityGraph(pageRequest: PageRequest): Page<ClientEntityTest> {
        val clientIds = pageableEntityGraphRepository.getAllIds(pageRequest)
        val result = pageableEntityGraphRepository.searchAllByIdIn(clientIds.content).map { mapper.map10(it) }
        return PageImpl(result, pageRequest, clientIds.totalElements)
    }

    fun getClientsWith15AccountsListEntityGraph(pageRequest: PageRequest): Page<ClientEntityTest> {
        val clientIds = pageableEntityGraphRepository.getAllIds(pageRequest)
        val result = pageableEntityGraphRepository.findAllByIdIn(clientIds.content).map { mapper.map15(it) }
        return PageImpl(result, pageRequest, clientIds.totalElements)
    }

    fun getClientsWith20AccountsListEntityGraph(pageRequest: PageRequest): Page<ClientEntityTest> {
        val clientIds = pageableEntityGraphRepository.getAllIds(pageRequest)
        val result = pageableEntityGraphRepository.readAlByIdIn(clientIds.content).map { mapper.map20(it) }
        return PageImpl(result, pageRequest, clientIds.totalElements)
    }
}