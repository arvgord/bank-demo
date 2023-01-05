package com.arvgord.bankdemoserver.domain.nproblem.interaction

import com.arvgord.bankdemoserver.domain.nproblem.client.Client

class PageResponse(
    val clients: List<Client>,
    val totalClients: Long,
    val totalPages: Int
)