package com.arvgord.bankdemoserver.repository.performancetest.mapping

import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityBatchTest
import com.arvgord.bankdemoserver.repository.performancetest.entity.ClientEntityTest
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(config = MapperConfiguration::class)
interface ClientMapper {

    @Mappings(
        Mapping(target = "accounts6", ignore = true),
        Mapping(target = "accounts7", ignore = true),
        Mapping(target = "accounts8", ignore = true),
        Mapping(target = "accounts9", ignore = true),
        Mapping(target = "accounts10", ignore = true),
        Mapping(target = "accounts11", ignore = true),
        Mapping(target = "accounts12", ignore = true),
        Mapping(target = "accounts13", ignore = true),
        Mapping(target = "accounts14", ignore = true),
        Mapping(target = "accounts15", ignore = true),
        Mapping(target = "accounts16", ignore = true),
        Mapping(target = "accounts17", ignore = true),
        Mapping(target = "accounts18", ignore = true),
        Mapping(target = "accounts19", ignore = true),
        Mapping(target = "accounts20", ignore = true)
    )
    fun map5batch(entity: ClientEntityBatchTest): ClientEntityBatchTest

    @Mappings(
        Mapping(target = "accounts11", ignore = true),
        Mapping(target = "accounts12", ignore = true),
        Mapping(target = "accounts13", ignore = true),
        Mapping(target = "accounts14", ignore = true),
        Mapping(target = "accounts15", ignore = true),
        Mapping(target = "accounts16", ignore = true),
        Mapping(target = "accounts17", ignore = true),
        Mapping(target = "accounts18", ignore = true),
        Mapping(target = "accounts19", ignore = true),
        Mapping(target = "accounts20", ignore = true)
    )
    fun map10batch(entity: ClientEntityBatchTest): ClientEntityBatchTest

    @Mappings(
        Mapping(target = "accounts16", ignore = true),
        Mapping(target = "accounts17", ignore = true),
        Mapping(target = "accounts18", ignore = true),
        Mapping(target = "accounts19", ignore = true),
        Mapping(target = "accounts20", ignore = true)
    )
    fun map15batch(entity: ClientEntityBatchTest): ClientEntityBatchTest

    fun map20batch(entity: ClientEntityBatchTest): ClientEntityBatchTest

    @Mappings(
        Mapping(target = "accounts6", ignore = true),
        Mapping(target = "accounts7", ignore = true),
        Mapping(target = "accounts8", ignore = true),
        Mapping(target = "accounts9", ignore = true),
        Mapping(target = "accounts10", ignore = true),
        Mapping(target = "accounts11", ignore = true),
        Mapping(target = "accounts12", ignore = true),
        Mapping(target = "accounts13", ignore = true),
        Mapping(target = "accounts14", ignore = true),
        Mapping(target = "accounts15", ignore = true),
        Mapping(target = "accounts16", ignore = true),
        Mapping(target = "accounts17", ignore = true),
        Mapping(target = "accounts18", ignore = true),
        Mapping(target = "accounts19", ignore = true),
        Mapping(target = "accounts20", ignore = true)
    )
    fun map5(entity: ClientEntityTest): ClientEntityTest

    @Mappings(
        Mapping(target = "accounts11", ignore = true),
        Mapping(target = "accounts12", ignore = true),
        Mapping(target = "accounts13", ignore = true),
        Mapping(target = "accounts14", ignore = true),
        Mapping(target = "accounts15", ignore = true),
        Mapping(target = "accounts16", ignore = true),
        Mapping(target = "accounts17", ignore = true),
        Mapping(target = "accounts18", ignore = true),
        Mapping(target = "accounts19", ignore = true),
        Mapping(target = "accounts20", ignore = true)
    )
    fun map10(entity: ClientEntityTest): ClientEntityTest

    @Mappings(
        Mapping(target = "accounts16", ignore = true),
        Mapping(target = "accounts17", ignore = true),
        Mapping(target = "accounts18", ignore = true),
        Mapping(target = "accounts19", ignore = true),
        Mapping(target = "accounts20", ignore = true)
    )
    fun map15(entity: ClientEntityTest): ClientEntityTest

    fun map20(entity: ClientEntityTest): ClientEntityTest
}