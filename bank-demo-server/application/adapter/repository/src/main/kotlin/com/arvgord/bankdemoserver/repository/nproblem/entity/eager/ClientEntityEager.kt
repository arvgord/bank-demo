package com.arvgord.bankdemoserver.repository.nproblem.entity.eager

import com.arvgord.bankdemoserver.repository.nproblem.entity.Address
import com.arvgord.bankdemoserver.repository.nproblem.entity.ClientName
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "CLIENT")
class ClientEntityEager(

    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Embedded
    var clientName: ClientName? = null,

    @Embedded
    var clientAddress: Address? = null,

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    var accounts: Set<AccountEntityEager> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    var deposits: Set<DepositEntityEager> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    var loans: Set<LoanEntityEager> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    var transfers: Set<AccountTransferEntityEager> = mutableSetOf()
)