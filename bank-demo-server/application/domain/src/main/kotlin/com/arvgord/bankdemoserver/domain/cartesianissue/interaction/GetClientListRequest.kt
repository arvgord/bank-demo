package com.arvgord.bankdemoserver.domain.cartesianissue.interaction

class GetClientListRequest(
    val pageRequest: PageRequest,
    val extractingStrategy: ExtractingStrategy
)