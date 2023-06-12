package com.arvgord.bankdemoserver.domain.cartesianissue

import java.math.BigDecimal

data class AccountTransfer(
    var transferAmount: BigDecimal,
    var fromAccount: String,
    var toAccount: String
)