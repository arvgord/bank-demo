import React from "react";
import {
    Skeleton,
    Table,
    TableBody,
    TableCell,
    TableContainer,
    TableHead,
    TablePagination,
    TableRow
} from "@mui/material";
import * as bankdemo_v1_messages_client_name_pb from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_name_pb";
import * as bankdemo_v1_messages_client_list_item_pb
    from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_list_item_pb";
import TablePaginationActions from "@mui/material/TablePagination/TablePaginationActions";
import {GetClientListResponse} from "@arvgord/bank-demo-api/bankdemo/v1/api/business/bank_demo_pb";
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";

type ClientListProps = {
    loading: boolean
    size: number
    page: number
    onChangeSize: (size: number) => void
    onChangePage: (page: number) => void
    response: GetClientListResponse.AsObject,
    strategy: ExtractingStrategy
}

export function ClientTable({loading, size, page, onChangeSize, onChangePage, response, strategy}: ClientListProps) {
    return (
        <div>
            <TableContainer>
                <Table sx={{minWidth: 1000, maxWidth: 1000}}>
                    <TableHead>
                        <TableRow>
                            <TablePagination
                                count={response.totalClients?.value ? response.totalClients.value : 0}
                                color="primary"
                                onPageChange={(e, n) => onChangePage(n)}
                                rowsPerPageOptions={[50, 100, 300, 1000]}
                                rowsPerPage={size}
                                onRowsPerPageChange={e => {
                                    onChangeSize(parseInt(e.target.value, 10))
                                    onChangePage(0)
                                }}
                                page={page}
                                ActionsComponent={TablePaginationActions}
                                showFirstButton={true}
                                showLastButton={true}
                            />
                        </TableRow>
                        <TableRow>
                            <TableCell sx={{width: "20%"}}>Client name</TableCell>
                            <TableCell sx={{width: '8%'}}>
                                Total<br/>
                                accounts
                            </TableCell>
                            <TableCell sx={{width: '14%'}}>
                                Total<br/>
                                accounts<br/>
                                balance
                            </TableCell>
                            <TableCell sx={{width: '8%'}}>
                                Total<br/>
                                deposits
                            </TableCell>
                            <TableCell sx={{width: '8%'}}>
                                Average<br/>
                                deposits<br/>
                                rate
                            </TableCell>
                            {getByStrategyType(strategy, null, <>
                                <TableCell sx={{width: '8%'}}>
                                    Total<br/>
                                    loans
                                </TableCell>
                                <TableCell sx={{width: '8%'}}>
                                    Average<br/>
                                    loans<br/>
                                    rate
                                </TableCell>
                                <TableCell sx={{width: '8%'}}>
                                    Total<br/>
                                    transfers
                                </TableCell>
                                <TableCell sx={{width: '14%'}}>
                                    Total<br/>
                                    transfers<br/>
                                    amount
                                </TableCell>
                            </>)}
                        </TableRow>
                    </TableHead>
                    {getTableBody(response.clientsList, loading, strategy)}
                </Table>
            </TableContainer>
        </div>
    );
}

function getTableBody(clientsList: Array<bankdemo_v1_messages_client_list_item_pb.ClientListItem.AsObject>, loading: boolean, strategy: ExtractingStrategy): React.ReactNode {
    const data = <TableBody>
        {clientsList.map((client, index) => (
            <TableRow key={index}>
                <TableCell>{getClientName(client.clientName)}</TableCell>
                <TableCell>{client.totalAccounts?.value ? client.totalAccounts.value : 0}</TableCell>
                <TableCell>{client.totalAccountsBalance?.value ? client.totalAccountsBalance.value : 0}</TableCell>
                <TableCell>{client.totalDeposits?.value ? client.totalDeposits.value : 0}</TableCell>
                <TableCell>{client.avgDepositsRate?.value ? client.avgDepositsRate.value : 0}</TableCell>
                {getByStrategyType(strategy, null, <>
                    <TableCell>{client.totalLoans?.value ? client.totalLoans.value : 0}</TableCell>
                    <TableCell>{client.avgLoansRate?.value ? client.avgLoansRate.value : 0}</TableCell>
                    <TableCell>{client.totalTransfers?.value ? client.totalTransfers.value : 0}</TableCell>
                    <TableCell>{client.totalTransfersAmount?.value ? client.totalTransfersAmount.value : 0}</TableCell>
                </>)}
            </TableRow>
        ))}
    </TableBody>
    const array  = getByStrategyType(strategy, [1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9]) as Array<number>
    const loadingAnimation = <TableBody>
        {[1, 2, 3, 4].map(rowNumber => (
            <TableRow key={rowNumber}>
                {array.map(cellNumber => (
                    <TableCell><Skeleton key={cellNumber} variant="rounded" animation={"wave"}/></TableCell>
                ))}
            </TableRow>
        ))}
    </TableBody>
    return loading ? loadingAnimation : data
}

function getByStrategyType(strategy: ExtractingStrategy, defValue: null | Array<number>, value: Array<number> | React.ReactNode) {
    switch (strategy) {
        case ExtractingStrategy.EXTRACTING_STRATEGY_ENTITY_GRAPH_PAGEABLE_SKIP_FIELDS:
            return defValue
        default:
            return value
    }
}

function getClientName(clientName: bankdemo_v1_messages_client_name_pb.ClientName.AsObject | undefined) {
    const lastName = clientName?.lastName?.value ? clientName?.lastName.value : ""
    const middleName = clientName?.middleName?.value ? clientName?.middleName.value[0] + "." : ""
    const firstName = clientName?.firstName?.value ? clientName?.firstName.value[0] + "." : ""
    return lastName + " " + firstName + " " + middleName
}