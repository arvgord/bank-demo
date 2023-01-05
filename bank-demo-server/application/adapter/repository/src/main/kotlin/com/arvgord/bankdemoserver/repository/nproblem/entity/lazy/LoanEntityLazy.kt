package com.arvgord.bankdemoserver.repository.nproblem.entity.lazy

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "LOAN")
class LoanEntityLazy(

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