package com.arvgord.bankdemoserver.domain.cartesianissue.interaction

class GetClientListResponse(
    val clients: List<ClientListItem>,
    val totalClients: Long,
    val totalPages: Int
)