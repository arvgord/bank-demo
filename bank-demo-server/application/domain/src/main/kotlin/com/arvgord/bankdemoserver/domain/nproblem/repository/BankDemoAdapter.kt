package com.arvgord.bankdemoserver.domain.nproblem.repository

import com.arvgord.bankdemoserver.domain.nproblem.interaction.ExtractingStrategy
import com.arvgord.bankdemoserver.domain.nproblem.interaction.PageRequest
import com.arvgord.bankdemoserver.domain.nproblem.interaction.PageResponse

interface BankDemoAdapter {

    fun getClients(pageRequest: PageRequest, extractingStrategy: ExtractingStrategy): PageResponse
}