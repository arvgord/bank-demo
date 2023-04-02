package com.arvgord.bankdemoserver.repository.performancetest.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "CLIENT_TEST")
class ClientEntityTest(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @OneToMany(mappedBy = "client")
    var accounts1: Set<Account1> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts2: Set<Account2> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts3: Set<Account3> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts4: Set<Account4> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts5: Set<Account5> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts6: Set<Account6> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts7: Set<Account7> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts8: Set<Account8> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts9: Set<Account9> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts10: Set<Account10> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts11: Set<Account11> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts12: Set<Account12> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts13: Set<Account13> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts14: Set<Account14> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts15: Set<Account15> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts16: Set<Account16> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts17: Set<Account17> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts18: Set<Account18> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts19: Set<Account19> = mutableSetOf(),

    @OneToMany(mappedBy = "client")
    var accounts20: Set<Account20> = mutableSetOf()
)