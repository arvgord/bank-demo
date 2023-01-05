package com.arvgord.bankdemoserver.domain.nproblem.interaction

class GetClientListResponse(
    val clients: List<ClientListItem>,
    val totalClients: Long,
    val totalPages: Int
)