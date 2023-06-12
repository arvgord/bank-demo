package com.arvgord.bankdemoserver.repository.cartesianissue

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import com.arvgord.bankdemoserver.repository.cartesianissue.entity.lazy.ClientEntityLazy
import com.arvgord.bankdemoserver.repository.cartesianissue.entity.lazy.ClientEntityLazy_

@Repository
interface ClientLazyRepository : JpaRepository<ClientEntityLazy, Long>, JpaSpecificationExecutor<ClientEntityLazy> {

    @EntityGraph(
        attributePaths = [
            ClientEntityLazy_.ACCOUNTS, ClientEntityLazy_.DEPOSITS, ClientEntityLazy_.LOANS, ClientEntityLazy_.TRANSFERS
        ]
    )
    fun getAllBy(pageable: Pageable): Page<ClientEntityLazy>

    @Query("select c.id from ClientEntityLazy c")
    fun getAllIds(pageable: Pageable): Page<Long>

    @EntityGraph(
        attributePaths = [
            ClientEntityLazy_.ACCOUNTS, ClientEntityLazy_.DEPOSITS, ClientEntityLazy_.LOANS, ClientEntityLazy_.TRANSFERS
        ]
    )
    fun findAllByIdIn(clientIds: List<Long>): List<ClientEntityLazy>

    @EntityGraph(attributePaths = [ClientEntityLazy_.ACCOUNTS, ClientEntityLazy_.DEPOSITS])
    fun getAllByIdIn(clientIds: List<Long>): List<ClientEntityLazy>
}