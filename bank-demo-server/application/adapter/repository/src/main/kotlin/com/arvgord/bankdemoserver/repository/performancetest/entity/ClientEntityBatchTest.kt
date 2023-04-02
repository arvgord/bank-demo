package com.arvgord.bankdemoserver.repository.performancetest.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import org.hibernate.annotations.BatchSize

@Entity
@Table(name = "CLIENT_TEST")
class ClientEntityBatchTest(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts1: Set<AccountBatch1> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts2: Set<AccountBatch2> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts3: Set<AccountBatch3> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts4: Set<AccountBatch4> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts5: Set<AccountBatch5> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts6: Set<AccountBatch6> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts7: Set<AccountBatch7> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts8: Set<AccountBatch8> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts9: Set<AccountBatch9> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts10: Set<AccountBatch10> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts11: Set<AccountBatch11> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts12: Set<AccountBatch12> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts13: Set<AccountBatch13> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts14: Set<AccountBatch14> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts15: Set<AccountBatch15> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts16: Set<AccountBatch16> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts17: Set<AccountBatch17> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts18: Set<AccountBatch18> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts19: Set<AccountBatch19> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    @BatchSize(size = 50)
    var accounts20: Set<AccountBatch20> = mutableSetOf()
)