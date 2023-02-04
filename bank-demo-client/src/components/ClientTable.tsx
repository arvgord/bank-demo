import React from "react";
import {
    Skeleton,
    Table,
    TableBody, TableCell,
    TableContainer,
    TableHead, TablePagination,
    TableRow
} from "@mui/material";
import * as bankdemo_v1_messages_client_name_pb from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_name_pb";
import * as bankdemo_v1_messages_client_list_item_pb
    from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_list_item_pb";
import TablePaginationActions from "@mui/material/TablePagination/TablePaginationActions";
import {GetClientListResponse} from "@arvgord/bank-demo-api/bankdemo/v1/api/business/bank_demo_pb";

type ClientListProps = {
    loading: boolean
    size: number
    page: number
    onChangeSize: (size: number) => void
    onChangePage: (page: number) => void
    response: GetClientListResponse.AsObject
}

export function ClientTable({loading, size, page, onChangeSize, onChangePage, response}: ClientListProps) {
    return (
        <div>
            <TableContainer>
                <Table sx={{ minWidth: 600, maxWidth: 850 }}>
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
                            <TableCell width={250}>Client name</TableCell>
                            <TableCell width={150}>Client city</TableCell>
                            <TableCell width={50}>Total accounts</TableCell>
                            <TableCell width={50}>Total deposits</TableCell>
                            <TableCell width={50}>Total loans</TableCell>
                            <TableCell width={50}>Total transfers</TableCell>
                        </TableRow>
                    </TableHead>
                    {getTableBody(response.clientsList, loading)}
                </Table>
            </TableContainer>
        </div>
    );
}

function getTableBody(clientsList: Array<bankdemo_v1_messages_client_list_item_pb.ClientListItem.AsObject>, loading: boolean) {
    const data = <TableBody>
        {clientsList.map((client, index) => (
            <TableRow key={index}>
                <TableCell>{getClientName(client.clientName)}</TableCell>
                <TableCell>{client.clientAddress?.city?.value ? client.clientAddress.city.value : 0}</TableCell>
                <TableCell>{client.totalAccounts?.value ? client.totalAccounts.value : 0}</TableCell>
                <TableCell>{client.totalDeposits?.value ? client.totalDeposits.value : 0}</TableCell>
                <TableCell>{client.totalLoans?.value ? client.totalLoans.value : 0}</TableCell>
                <TableCell>{client.totalTransfers?.value ? client.totalLoans?.value : 0}</TableCell>
            </TableRow>
        ))}
    </TableBody>
    const loadingAnimation = <TableBody>
        {[1, 2, 3, 4].map((client, index) => (
            <TableRow key={index}>
                <TableCell><Skeleton key={index} variant="rounded" animation={"wave"} /></TableCell>
                <TableCell><Skeleton key={index} variant="rounded" animation={"wave"} /></TableCell>
                <TableCell><Skeleton key={index} variant="rounded" animation={"wave"} /></TableCell>
                <TableCell><Skeleton key={index} variant="rounded" animation={"wave"} /></TableCell>
                <TableCell><Skeleton key={index} variant="rounded" animation={"wave"} /></TableCell>
                <TableCell><Skeleton key={index} variant="rounded" animation={"wave"} /></TableCell>
            </TableRow>
        ))}
    </TableBody>
    return loading ? loadingAnimation : data
}

function getClientName(clientName: bankdemo_v1_messages_client_name_pb.ClientName.AsObject | undefined): string {
    const lastName = clientName?.lastName?.value ? clientName?.lastName?.value : ""
    const middleName = clientName?.middleName?.value ? clientName?.middleName?.value : ""
    const firstName = clientName?.firstName?.value ? clientName?.firstName?.value : ""
    return lastName + " " + firstName + " " + middleName
}