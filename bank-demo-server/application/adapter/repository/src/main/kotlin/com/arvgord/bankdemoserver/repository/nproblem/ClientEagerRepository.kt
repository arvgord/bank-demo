package com.arvgord.bankdemoserver.repository.nproblem

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.arvgord.bankdemoserver.repository.nproblem.entity.eager.ClientEntityEager

@Repository
interface ClientEagerRepository : JpaRepository<ClientEntityEager, Long>