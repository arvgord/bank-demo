package com.arvgord.bankdemoserver.usecase.api.cartesianissue

import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.GetClientListRequest
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.GetClientListResponse

interface GetClientsListApi {

    fun getClients(request: GetClientListRequest): GetClientListResponse
}