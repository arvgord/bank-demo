package com.arvgord.bankdemoserver.mapping.grpc.nproblem.v1

import org.mapstruct.CollectionMappingStrategy
import org.mapstruct.MapperConfig
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy

@MapperConfig(
    componentModel = "spring",
    uses = [GrpcProtobufUtil::class],
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    implementationName = "<CLASS_NAME>Impl_V1"
)
interface MapperConfiguration