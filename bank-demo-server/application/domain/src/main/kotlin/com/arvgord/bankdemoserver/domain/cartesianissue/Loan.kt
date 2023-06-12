package com.arvgord.bankdemoserver.domain.cartesianissue

import java.math.BigDecimal

data class Loan(
    var amount: BigDecimal,
    var rate: BigDecimal
)