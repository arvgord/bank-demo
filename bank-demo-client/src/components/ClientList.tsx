import React from "react";
import {List, ListItem, ListItemText, Skeleton} from "@mui/material";
import * as bankdemo_v1_messages_client_name_pb from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_name_pb";
import * as bankdemo_v1_messages_client_list_item_pb
    from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_list_item_pb";
import {ClientListItem} from "@arvgord/bank-demo-api/bankdemo/v1/messages/client_list_item_pb";

type ClientListProps = {
    loading: boolean;
    clientsList: Array<bankdemo_v1_messages_client_list_item_pb.ClientListItem.AsObject>
}

export function ClientList({loading, clientsList}: ClientListProps) {
    return (
        <div>
            <List dense={true}>
                {clientsList.map((client, index) => getListItem(client, index, loading))}
            </List>
        </div>
    );
}

function getListItem(client: ClientListItem.AsObject, index: number, loading: boolean) {
    const item = <ListItem key={index}>
        <ListItemText
            primary={getName(client.clientName)}
            secondary={'Secondary text'}
            style={{marginTop: 10}}
        />
    </ListItem>
    return loading ? (
        <Skeleton variant="rounded" animation={"wave"} style={{marginTop: 10}}>
            {item}
        </Skeleton>
    ) : item
}

function getName(clientName: bankdemo_v1_messages_client_name_pb.ClientName.AsObject | undefined): string {
    const lastName = clientName?.lastName?.value ? clientName?.lastName?.value : ""
    const middleName = clientName?.middleName?.value ? clientName?.middleName?.value : ""
    const firstName = clientName?.firstName?.value ? clientName?.firstName?.value : ""
    return lastName + " " + firstName + " " + middleName
}