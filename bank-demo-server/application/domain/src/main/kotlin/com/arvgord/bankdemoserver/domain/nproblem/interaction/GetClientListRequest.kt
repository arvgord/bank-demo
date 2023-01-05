package com.arvgord.bankdemoserver.domain.nproblem.interaction

class GetClientListRequest(
    val pageRequest: PageRequest,
    val extractingStrategy: ExtractingStrategy
)