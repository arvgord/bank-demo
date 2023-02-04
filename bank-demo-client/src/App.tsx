import {useState} from 'react';
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";
import {ClientList} from "./components/ClientList";
import {useGetList} from "./components/Requests";
import {StrategyButtons} from "./components/StrategyButtons";
import {MenuItem, Pagination, Select, Stack} from "@mui/material";

function App() {
    const [page, setPage] = useState(0);
    const [size, setSize] = useState(50);
    const [strategy, setStrategy] = useState(ExtractingStrategy.EXTRACTING_STRATEGY_LAZY);
    const {loading, response, error} = useGetList(page, size, strategy);

    return (
        <div>
            <Stack
                direction="column"
                alignItems="center"
                justifyContent="flex-start"
                spacing={2}
                style={{margin: "20px 20px 0 20px"}}
            >
                <StrategyButtons strategy={strategy} changeStrategy={s => setStrategy(s)} />
                <Stack
                    direction="row"
                    alignItems="center"
                >
                    <Pagination
                        count={response.totalPages?.value}
                        onChange={(e, n) => setPage(n - 1)}
                        color="primary"
                    />
                    <Select
                        value={size}
                        onChange={e => setSize(e.target.value as number)}
                        color="primary"
                        style={{height: 35}}
                    >
                        <MenuItem value={50}>50</MenuItem>
                        <MenuItem value={100}>100</MenuItem>
                        <MenuItem value={300}>300</MenuItem>
                        <MenuItem value={1000}>1000</MenuItem>
                    </Select>
                </Stack>
                <ClientList loading={loading} clientsList={response.clientsList}/>
            </Stack>
        </div>
    );
}

export default App;
