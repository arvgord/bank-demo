package com.arvgord.bankdemoserver.domain.nproblem

import java.math.BigDecimal

data class Loan(
    var amount: BigDecimal,
    var rate: BigDecimal
)