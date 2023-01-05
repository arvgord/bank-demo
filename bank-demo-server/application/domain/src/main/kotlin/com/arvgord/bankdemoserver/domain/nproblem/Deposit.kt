package com.arvgord.bankdemoserver.domain.nproblem

import java.math.BigDecimal

data class Deposit(
    var amount: BigDecimal,
    var rate: BigDecimal
)