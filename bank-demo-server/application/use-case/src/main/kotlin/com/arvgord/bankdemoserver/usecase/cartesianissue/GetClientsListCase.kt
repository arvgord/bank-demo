package com.arvgord.bankdemoserver.usecase.cartesianissue

import org.springframework.stereotype.Component
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.ClientListItem
import com.arvgord.bankdemoserver.domain.cartesianissue.repository.BankDemoAdapter
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.GetClientListRequest
import com.arvgord.bankdemoserver.domain.cartesianissue.interaction.GetClientListResponse
import com.arvgord.bankdemoserver.usecase.api.cartesianissue.GetClientsListApi
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

@Component
class GetClientsListCase(
    private val bankDemoAdapter: BankDemoAdapter
) : GetClientsListApi {

    override fun getClients(request: GetClientListRequest): GetClientListResponse {
        val result = bankDemoAdapter.getClients(request.pageRequest, request.extractingStrategy)
        val clients = result.clients
            .map {
                val depositsRateSum = it.deposits.sumOf { dep -> dep.rate }
                var avgDepositsRate = BigDecimal(0)
                if (depositsRateSum > avgDepositsRate) {
                    avgDepositsRate = depositsRateSum.divide(BigDecimal(it.deposits.size), MathContext.DECIMAL32)
                        .setScale(2, RoundingMode.HALF_DOWN)
                }
                val loansRateSum = it.loans?.sumOf { loan -> loan.rate } ?: BigDecimal(0)
                var avgLoansRate = BigDecimal(0)
                if (loansRateSum > avgLoansRate) {
                    avgLoansRate = loansRateSum.divide(BigDecimal(it.loans!!.size), MathContext.DECIMAL32)
                        .setScale(2, RoundingMode.HALF_DOWN)
                }
                ClientListItem(
                    it.clientName,
                    it.clientAddress,
                    it.accounts.size,
                    it.accounts.sumOf { acc -> acc.amount },
                    it.deposits.size,
                    it.deposits.sumOf { dep -> dep.amount },
                    avgDepositsRate,
                    it.loans?.size,
                    it.loans?.sumOf { loan -> loan.amount },
                    avgLoansRate,
                    it.transfers?.size,
                    it.transfers?.sumOf { tr -> tr.transferAmount }
                )
            }
        return GetClientListResponse(clients, result.totalClients, result.totalPages)
    }
}