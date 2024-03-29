package com.arvgord.bankdemoserver.repository.cartesianissue.entity.lazy

import java.math.BigDecimal
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

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