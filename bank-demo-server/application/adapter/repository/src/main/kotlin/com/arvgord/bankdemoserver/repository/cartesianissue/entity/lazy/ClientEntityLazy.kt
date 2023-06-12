package com.arvgord.bankdemoserver.repository.cartesianissue.entity.lazy

import com.arvgord.bankdemoserver.repository.cartesianissue.entity.Address
import com.arvgord.bankdemoserver.repository.cartesianissue.entity.ClientName
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "CLIENT")
class ClientEntityLazy(

    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Embedded
    var clientName: ClientName? = null,

    @Embedded
    var clientAddress: Address? = null,

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    var accounts: Set<AccountEntityLazy> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    var deposits: Set<DepositEntityLazy> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    var loans: Set<LoanEntityLazy> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    var transfers: Set<AccountTransferEntityLazy> = mutableSetOf()
)