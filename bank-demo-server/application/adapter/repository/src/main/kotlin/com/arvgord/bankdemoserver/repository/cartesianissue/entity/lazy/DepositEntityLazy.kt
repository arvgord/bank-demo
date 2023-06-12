package com.arvgord.bankdemoserver.repository.cartesianissue.entity.lazy

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "DEPOSIT")
class DepositEntityLazy(

    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "AMOUNT")
    var amount: BigDecimal? = null,

    @Column(name = "RATE")
    var rate: BigDecimal? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityLazy? = null
)