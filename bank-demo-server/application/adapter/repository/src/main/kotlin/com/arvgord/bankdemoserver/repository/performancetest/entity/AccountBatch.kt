package com.arvgord.bankdemoserver.repository.performancetest.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "ACCOUNT_1")
class AccountBatch1(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_2")
class AccountBatch2(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_3")
class AccountBatch3(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_4")
class AccountBatch4(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_5")
class AccountBatch5(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_6")
class AccountBatch6(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_7")
class AccountBatch7(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_8")
class AccountBatch8(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_9")
class AccountBatch9(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_10")
class AccountBatch10(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_11")
class AccountBatch11(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_12")
class AccountBatch12(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_13")
class AccountBatch13(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_14")
class AccountBatch14(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_15")
class AccountBatch15(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_16")
class AccountBatch16(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_17")
class AccountBatch17(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_18")
class AccountBatch18(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_19")
class AccountBatch19(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)

@Entity
@Table(name = "ACCOUNT_20")
class AccountBatch20(
    @Id
    @Column(name = "ID")
    var id: Long? = null,

    @Column(name = "NUMBER")
    var number: String? = null,

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    var client: ClientEntityBatchTest? = null
)