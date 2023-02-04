import {useEffect, useState} from 'react';
import {
    GetClientListRequest, GetClientListResponse
} from "@arvgord/bank-demo-api/bankdemo/v1/api/business/bank_demo_pb";
import {PageRequest} from "@arvgord/bank-demo-api/bankdemo/v1/messages/page_request_pb";
import {Int32Value} from "google-protobuf/google/protobuf/wrappers_pb";
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";
import {BankDemoPromiseClient} from "@arvgord/bank-demo-api/bankdemo/v1/api/business/bank_demo_grpc_web_pb";

export function useGetList(page: number, size: number, strategy: ExtractingStrategy) {
    const [response, setResponse] = useState(new GetClientListResponse().toObject())
    const [error, setError] = useState()
    const [loading, setLoading] = useState(true)

    useEffect(() => setLoading(true), [page, size, strategy])

    useEffect(() => {
        if (!page && !size && !strategy) return
        const service = new BankDemoPromiseClient('http://localhost:8080', null, null)
        const request = new GetClientListRequest()
        const pageRequest = new PageRequest()
        pageRequest.setPage(new Int32Value().setValue(page))
        pageRequest.setSize(new Int32Value().setValue(size))
        request.setPageRequest(pageRequest)
        request.setExtractingStrategy(strategy)
        service.getClientList(request, {})
            .then(result => result.toObject())
            .then(setResponse)
            .then(() => setLoading(false))
            .catch(setError)
    }, [page, size, strategy]);

    return {
        loading,
        response,
        error
    };
}