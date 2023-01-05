package com.arvgord.bankdemoserver.controller.grpc.nproblem.v1

import com.arvgord.api.grpc.bankdemo.v1.BankDemoGrpcKt
import com.arvgord.api.grpc.bankdemo.v1.BankDemoOuterClass.GetClientListRequest
import com.arvgord.api.grpc.bankdemo.v1.BankDemoOuterClass.GetClientListResponse
import io.grpc.Status
import io.grpc.StatusException
import org.lognet.springboot.grpc.GRpcService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import com.arvgord.bankdemoserver.controller.grpc.nproblem.v1.adapter.BankDemoAdapter

@GRpcService
class BankDemoNProblemController(
    private val adapter: BankDemoAdapter
) : BankDemoGrpcKt.BankDemoCoroutineImplBase() {
    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    override suspend fun getClientList(request: GetClientListRequest): GetClientListResponse =
        try {
            logger.info(
                "getClientList(page: {}, size: {}, extracting_strategy: {})",
                request.pageRequest.page.value,
                request.pageRequest.size.value,
                request.extractingStrategy
            )
            adapter.getClientList(request)
        } catch (e: Exception) {
            logger.error("getClientList exception", e)
            throw StatusException(Status.INTERNAL.withDescription(e.message)) // Pass message for test case only
        }
}