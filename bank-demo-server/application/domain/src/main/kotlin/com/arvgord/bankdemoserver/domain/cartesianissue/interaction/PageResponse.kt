package com.arvgord.bankdemoserver.domain.cartesianissue.interaction

import com.arvgord.bankdemoserver.domain.cartesianissue.client.Client

class PageResponse(
    val clients: List<Client>,
    val totalClients: Long,
    val totalPages: Int
)