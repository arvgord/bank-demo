import {useState} from 'react';
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";
import {ClientTable} from "./components/ClientTable";
import {useGetList} from "./components/Requests";
import {StrategyButtons} from "./components/StrategyButtons";

function App() {
    const [page, setPage] = useState(0);
    const [size, setSize] = useState(50);
    const [strategy, setStrategy] = useState(ExtractingStrategy.EXTRACTING_STRATEGY_LAZY);
    const {loading, response, error} = useGetList(page, size, strategy);

    return (
        <div>
            <StrategyButtons strategy={strategy} onChangeStrategy={strategy => setStrategy(strategy)}/>
            <ClientTable
                loading={loading}
                size={size}
                page={page}
                onChangeSize={size => setSize(size)}
                onChangePage={page => setPage(page)}
                response={response}
            />
        </div>
    );
}

export default App;