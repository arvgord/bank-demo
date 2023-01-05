package com.arvgord.bankdemoserver.repository.nproblem.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class Address(
    @Column(name = "ADDRESS_CITY")
    var city: String? = null,

    @Column(name = "ADDRESS_STREET")
    var street: String? = null,

    @Column(name = "ADDRESS_HOUSE")
    var house: String? = null,

    @Column(name = "ADDRESS_FLAT")
    var flat: String? = null
)