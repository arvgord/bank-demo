package com.arvgord.bankdemoserver.mapping.grpc.nproblem.v1

import com.arvgord.api.grpc.bankdemo.v1.BankDemoOuterClass
import org.mapstruct.Mapper
import com.arvgord.bankdemoserver.domain.nproblem.interaction.GetClientListRequest

@Mapper(config = MapperConfiguration::class)
interface GetClientListRequestMapper {

    fun map(grpc: BankDemoOuterClass.GetClientListRequest): GetClientListRequest
}