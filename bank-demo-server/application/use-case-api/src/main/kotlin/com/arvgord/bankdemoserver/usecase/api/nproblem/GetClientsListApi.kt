package com.arvgord.bankdemoserver.usecase.api.nproblem

import com.arvgord.bankdemoserver.domain.nproblem.interaction.GetClientListRequest
import com.arvgord.bankdemoserver.domain.nproblem.interaction.GetClientListResponse

interface GetClientsListApi {

    fun getClients(request: GetClientListRequest): GetClientListResponse
}