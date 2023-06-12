package com.arvgord.bankdemoserver.domain.cartesianissue.client

import com.arvgord.bankdemoserver.domain.cartesianissue.Account
import com.arvgord.bankdemoserver.domain.cartesianissue.AccountTransfer
import com.arvgord.bankdemoserver.domain.cartesianissue.Deposit
import com.arvgord.bankdemoserver.domain.cartesianissue.Loan

data class Client(
    var clientName: ClientName,
    var clientAddress: Address,
    var accounts: MutableSet<Account> = mutableSetOf(),
    var deposits: MutableSet<Deposit> = mutableSetOf(),
    var loans: MutableSet<Loan>? = mutableSetOf(),
    var transfers: MutableSet<AccountTransfer>? = mutableSetOf()
)