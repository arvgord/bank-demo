package com.arvgord.bankdemoserver.repository.nproblem.mapping

import com.arvgord.bankdemoserver.domain.nproblem.client.Client
import com.arvgord.bankdemoserver.repository.nproblem.entity.batch.ClientEntityBatch
import com.arvgord.bankdemoserver.repository.nproblem.entity.eager.ClientEntityEager
import com.arvgord.bankdemoserver.repository.nproblem.entity.lazy.ClientEntityLazy
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(config = MapperConfiguration::class)
interface ClientEntityMapper {

    fun map(entity: ClientEntityBatch): Client

    fun map(entity: ClientEntityEager): Client

    fun map(entity: ClientEntityLazy): Client

    // Without ignoring loans lead to n+1 problem
    @Mappings(
        Mapping(target = "transfers", ignore = true),
        Mapping(target = "loans", ignore = true)
    )
    fun mapEntityGraphSkipFields(entity: ClientEntityLazy): Client
}