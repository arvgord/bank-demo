package com.arvgord.bankdemoserver.domain.cartesianissue.repository

import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.ExtractingStrategy
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.PageRequest
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.PageResponse

interface BankDemoAdapter {

    fun getClients(pageRequest: PageRequest, extractingStrategy: ExtractingStrategy): PageResponse
}