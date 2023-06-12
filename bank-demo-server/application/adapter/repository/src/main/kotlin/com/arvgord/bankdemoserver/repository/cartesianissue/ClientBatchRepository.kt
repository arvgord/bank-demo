package com.arvgord.bankdemoserver.repository.cartesianissue

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.arvgord.bankdemoserver.repository.cartesianissue.entity.batch.ClientEntityBatch

@Repository
interface ClientBatchRepository : JpaRepository<ClientEntityBatch, Long>