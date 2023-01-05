package com.arvgord.bankdemoserver.domain.nproblem

import java.math.BigDecimal

data class AccountTransfer(
    var transferAmount: BigDecimal,
    var fromAccount: String,
    var toAccount: String
)