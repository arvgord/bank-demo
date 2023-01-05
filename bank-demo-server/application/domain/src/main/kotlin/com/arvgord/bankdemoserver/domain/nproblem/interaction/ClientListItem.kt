package com.arvgord.bankdemoserver.domain.nproblem.interaction

import com.arvgord.bankdemoserver.domain.nproblem.client.Address
import com.arvgord.bankdemoserver.domain.nproblem.client.ClientName
import java.math.BigDecimal

class ClientListItem(
    val clientName: ClientName,
    val clientAddress: Address,
    val totalAccounts: Int,
    val totalAccountsBalance: BigDecimal,
    val totalDeposits: Int,
    val totalDepositsAmount: BigDecimal,
    val avgDepositsRate: BigDecimal,
    val totalLoans: Int? = null,
    val totalLoansAmount: BigDecimal? = null,
    val avgLoansRate: BigDecimal? = null,
    val totalTransfers: Int? = null,
    val totalTransfersAmount: BigDecimal? = null
)