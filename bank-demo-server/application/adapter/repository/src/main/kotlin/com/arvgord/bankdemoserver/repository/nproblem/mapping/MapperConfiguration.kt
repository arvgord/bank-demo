package com.arvgord.bankdemoserver.repository.nproblem.mapping

import org.mapstruct.CollectionMappingStrategy
import org.mapstruct.MapperConfig
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.ReportingPolicy

@MapperConfig(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
)
interface MapperConfiguration