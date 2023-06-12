package com.arvgord.bankdemoserver.mapping.grpc.cartesianissue.v1

import com.arvgord.api.grpc.bankdemo.v1.BankDemoOuterClass
import org.mapstruct.Mapper
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.GetClientListResponse

@Mapper(config = MapperConfiguration::class)
interface GetClientListResponseMapper {

    fun map(domain: GetClientListResponse): BankDemoOuterClass.GetClientListResponse
}