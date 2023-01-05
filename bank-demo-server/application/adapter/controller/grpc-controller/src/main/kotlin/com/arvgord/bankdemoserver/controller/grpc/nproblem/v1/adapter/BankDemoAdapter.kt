package com.arvgord.bankdemoserver.controller.grpc.nproblem.v1.adapter

import com.arvgord.api.grpc.bankdemo.v1.BankDemoOuterClass.GetClientListRequest
import com.arvgord.api.grpc.bankdemo.v1.BankDemoOuterClass.GetClientListResponse
import org.springframework.stereotype.Component
import com.arvgord.bankdemoserver.mapping.grpc.nproblem.v1.GetClientListResponseMapper
import com.arvgord.bankdemoserver.mapping.grpc.nproblem.v1.GetClientListRequestMapper
import com.arvgord.bankdemoserver.usecase.api.nproblem.GetClientsListApi

@Component
class BankDemoAdapter(
    private val getClientsListApi: GetClientsListApi,
    private val requestMapper: GetClientListRequestMapper,
    private val responseMapper: GetClientListResponseMapper
) {

    fun getClientList(request: GetClientListRequest): GetClientListResponse {
        val mappedRequest = requestMapper.map(request)
        val result = getClientsListApi.getClients(mappedRequest)
        return responseMapper.map(result)
    }
}