package com.arvgord.bankdemoserver.domain.cartesianissue

import java.math.BigDecimal

data class Deposit(
    var amount: BigDecimal,
    var rate: BigDecimal
)