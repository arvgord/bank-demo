package com.arvgord.bankdemoserver.repository.performancetest.mapping

import org.mapstruct.CollectionMappingStrategy
import org.mapstruct.MapperConfig
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy

@MapperConfig(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    implementationName = "<CLASS_NAME>Impl_Test"
)
interface MapperConfiguration