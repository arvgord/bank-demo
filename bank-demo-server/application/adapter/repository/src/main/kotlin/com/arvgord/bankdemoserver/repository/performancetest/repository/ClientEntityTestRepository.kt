package com.arvgord.bankdemoserver.repository.performancetest.repository

import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityTest
import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityTest_
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ClientEntityTestRepository : JpaRepository<ClientEntityTest, Long> {

    @Query("select c.id from ClientEntityTest c")
    fun getAllIds(pageable: Pageable): Page<Long>

    @EntityGraph(
        attributePaths = [
            ClientEntityTest_.ACCOUNTS1,
            ClientEntityTest_.ACCOUNTS2,
            ClientEntityTest_.ACCOUNTS3,
            ClientEntityTest_.ACCOUNTS4,
            ClientEntityTest_.ACCOUNTS5
        ]
    )
    fun getAllByIdIn(clientIds: List<Long>): List<ClientEntityTest>

    @EntityGraph(
        attributePaths = [
            ClientEntityTest_.ACCOUNTS1,
            ClientEntityTest_.ACCOUNTS2,
            ClientEntityTest_.ACCOUNTS3,
            ClientEntityTest_.ACCOUNTS4,
            ClientEntityTest_.ACCOUNTS5,
            ClientEntityTest_.ACCOUNTS6,
            ClientEntityTest_.ACCOUNTS7,
            ClientEntityTest_.ACCOUNTS8,
            ClientEntityTest_.ACCOUNTS9,
            ClientEntityTest_.ACCOUNTS10
        ]
    )
    fun searchAllByIdIn(clientIds: List<Long>): List<ClientEntityTest>

    @EntityGraph(
        attributePaths = [
            ClientEntityTest_.ACCOUNTS1,
            ClientEntityTest_.ACCOUNTS2,
            ClientEntityTest_.ACCOUNTS3,
            ClientEntityTest_.ACCOUNTS4,
            ClientEntityTest_.ACCOUNTS5,
            ClientEntityTest_.ACCOUNTS6,
            ClientEntityTest_.ACCOUNTS7,
            ClientEntityTest_.ACCOUNTS8,
            ClientEntityTest_.ACCOUNTS9,
            ClientEntityTest_.ACCOUNTS10,
            ClientEntityTest_.ACCOUNTS11,
            ClientEntityTest_.ACCOUNTS12,
            ClientEntityTest_.ACCOUNTS13,
            ClientEntityTest_.ACCOUNTS14,
            ClientEntityTest_.ACCOUNTS15
        ]
    )
    fun findAllByIdIn(clientIds: List<Long>): List<ClientEntityTest>

    @EntityGraph(
        attributePaths = [
            ClientEntityTest_.ACCOUNTS1,
            ClientEntityTest_.ACCOUNTS2,
            ClientEntityTest_.ACCOUNTS3,
            ClientEntityTest_.ACCOUNTS4,
            ClientEntityTest_.ACCOUNTS5,
            ClientEntityTest_.ACCOUNTS6,
            ClientEntityTest_.ACCOUNTS7,
            ClientEntityTest_.ACCOUNTS8,
            ClientEntityTest_.ACCOUNTS9,
            ClientEntityTest_.ACCOUNTS10,
            ClientEntityTest_.ACCOUNTS11,
            ClientEntityTest_.ACCOUNTS12,
            ClientEntityTest_.ACCOUNTS13,
            ClientEntityTest_.ACCOUNTS14,
            ClientEntityTest_.ACCOUNTS15,
            ClientEntityTest_.ACCOUNTS16,
            ClientEntityTest_.ACCOUNTS17,
            ClientEntityTest_.ACCOUNTS18,
            ClientEntityTest_.ACCOUNTS19,
            ClientEntityTest_.ACCOUNTS20
        ]
    )
    fun readAlByIdIn(clientIds: List<Long>): List<ClientEntityTest>
}