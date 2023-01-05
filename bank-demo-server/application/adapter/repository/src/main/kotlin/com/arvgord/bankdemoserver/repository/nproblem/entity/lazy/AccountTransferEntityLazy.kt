package com.arvgord.bankdemoserver.repository.nproblem.entity.lazy

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "ACCOUNT_TRANSFER")
class AccountTransferEntityLazy(

    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "TRANSFER_AMOUNT")
    var transferAmount: BigDecimal? = null,

    @Column(name = "FROM_ACCOUNT")
    var fromAccount: String? = null,

    @Column(name = "TO_ACCOUNT")
    var toAccount: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityLazy? = null
)