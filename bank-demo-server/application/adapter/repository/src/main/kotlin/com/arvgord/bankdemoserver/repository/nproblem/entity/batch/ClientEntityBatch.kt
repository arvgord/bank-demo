package com.arvgord.bankdemoserver.repository.nproblem.entity.batch

import com.arvgord.bankdemoserver.repository.nproblem.entity.Address
import com.arvgord.bankdemoserver.repository.nproblem.entity.ClientName
import org.hibernate.annotations.BatchSize
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "CLIENT")
class ClientEntityBatch(

    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Embedded
    var clientName: ClientName? = null,

    @Embedded
    var clientAddress: Address? = null,

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @BatchSize(size = 50)
    var accounts: Set<AccountEntityBatch> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @BatchSize(size = 50)
    var deposits: Set<DepositEntityBatch> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @BatchSize(size = 50)
    var loans: Set<LoanEntityBatch> = mutableSetOf(),

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @BatchSize(size = 50)
    var transfers: Set<AccountTransferEntityBatch> = mutableSetOf()
)