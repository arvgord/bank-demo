package com.arvgord.bankdemoserver.repository.performancetest.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "ACCOUNT_1")
class Account1(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_2")
class Account2(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_3")
class Account3(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_4")
class Account4(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_5")
class Account5(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_6")
class Account6(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_7")
class Account7(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_8")
class Account8(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_9")
class Account9(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_10")
class Account10(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_11")
class Account11(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_12")
class Account12(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_13")
class Account13(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_14")
class Account14(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_15")
class Account15(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_16")
class Account16(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_17")
class Account17(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_18")
class Account18(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_19")
class Account19(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)

@Entity
@Table(name = "ACCOUNT_20")
class Account20(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityTest? = null
)