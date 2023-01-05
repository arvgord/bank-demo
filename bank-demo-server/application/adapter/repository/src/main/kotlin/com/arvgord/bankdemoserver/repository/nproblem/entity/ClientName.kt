package com.arvgord.bankdemoserver.repository.nproblem.entity

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class ClientName(
    @Column(name = "CLIENT_FIRST_NAME")
    var firstName: String? = null,

    @Column(name = "CLIENT_MIDDLE_NAME")
    var middleName: String? = null,

    @Column(name = "CLIENT_LAST_NAME")
    var lastName: String? = null
)