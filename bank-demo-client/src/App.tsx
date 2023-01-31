import React, {useEffect, useState} from 'react';
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";
import {
    BankDemoPromiseClient
} from '@arvgord/bank-demo-api/bankdemo/v1/api/business/bank_demo_grpc_web_pb'
import {GetClientListRequest} from '@arvgord/bank-demo-api/bankdemo/v1/api/business/bank_demo_pb'
import {PageRequest} from '@arvgord/bank-demo-api/bankdemo/v1/messages/page_request_pb'
import {Int32Value} from "google-protobuf/google/protobuf/wrappers_pb";

function App() {
    const [service] = useState(new BankDemoPromiseClient('http://localhost:8080', null, null))
    useEffect(() => {
        const request = new GetClientListRequest()
        const pageRequest = new PageRequest()
        pageRequest.setPage(new Int32Value().setValue(0))
        pageRequest.setSize(new Int32Value().setValue(5))
        request.setPageRequest(pageRequest)
        request.setExtractingStrategy(ExtractingStrategy.EXTRACTING_STRATEGY_BATCH)
        service.getClientList(request, {}).then(m => console.log(m)).catch(e => console.log(e))
    }, [])
    return (
        <div>
            Test
        </div>
    );
}

export default App;
