import React from 'react';
import {useGetList} from "./components/Requests";
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";

function App() {
    const {loading, data, error} = useGetList(0, 100, ExtractingStrategy.EXTRACTING_STRATEGY_EAGER)
    if (loading) return <h1>Loading</h1>
    if (error) return <h1>${error}</h1>
    return (
        <div>
          {data.clientsList.length}
        </div>
    );
}

export default App;
