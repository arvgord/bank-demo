package com.arvgord.bankdemoserver.domain.nproblem.client

import com.arvgord.bankdemoserver.domain.nproblem.Account
import com.arvgord.bankdemoserver.domain.nproblem.AccountTransfer
import com.arvgord.bankdemoserver.domain.nproblem.Deposit
import com.arvgord.bankdemoserver.domain.nproblem.Loan

data class Client(
    var clientName: ClientName,
    var clientAddress: Address,
    var accounts: MutableSet<Account> = mutableSetOf(),
    var deposits: MutableSet<Deposit> = mutableSetOf(),
    var loans: MutableSet<Loan>? = mutableSetOf(),
    var transfers: MutableSet<AccountTransfer>? = mutableSetOf()
)