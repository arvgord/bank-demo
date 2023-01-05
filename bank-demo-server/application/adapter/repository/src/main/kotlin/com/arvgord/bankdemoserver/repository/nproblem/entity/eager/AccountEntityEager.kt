package com.arvgord.bankdemoserver.repository.nproblem.entity.eager

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "ACCOUNT")
class AccountEntityEager(

    @Id
    var id: Long? = null,

    @Column(name = "AMOUNT")
    var amount: BigDecimal? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityEager? = null
)