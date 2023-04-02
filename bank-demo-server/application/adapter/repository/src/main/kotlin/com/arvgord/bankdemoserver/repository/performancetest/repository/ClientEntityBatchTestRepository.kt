package com.arvgord.bankdemoserver.repository.performancetest.repository

import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityBatchTest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientEntityBatchTestRepository : JpaRepository<ClientEntityBatchTest, Long>