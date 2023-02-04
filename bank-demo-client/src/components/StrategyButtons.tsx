import {ToggleButton, ToggleButtonGroup} from "@mui/material";
import {ExtractingStrategy} from "@arvgord/bank-demo-api/bankdemo/v1/messages/extracting_strategy_pb";

type StrategyButtonsProps = {
    strategy: ExtractingStrategy
    changeStrategy: (s: ExtractingStrategy) => void
}

export function StrategyButtons( { strategy, changeStrategy } : StrategyButtonsProps ) {
    return (
        <ToggleButtonGroup
            color="primary"
            value={strategy}
            exclusive
            onChange={(e, s) => {if (s) changeStrategy(s)}}
        >
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_LAZY}>
                LAZY
            </ToggleButton>
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_EAGER}>
                EAGER
            </ToggleButton>
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_BATCH}>
                BATCH
            </ToggleButton>
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_CRITERIA}>
                CRITERIA
            </ToggleButton>
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_ENTITY_GRAPH}>
                ENTITY GRAPH
            </ToggleButton>
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_ENTITY_GRAPH_PAGEABLE}>
                ENTITY GRAPH PAGEABLE
            </ToggleButton>
            <ToggleButton value={ExtractingStrategy.EXTRACTING_STRATEGY_ENTITY_GRAPH_PAGEABLE_SKIP_FIELDS}>
                ENTITY GRAPH PAGEABLE SKIP FIELDS
            </ToggleButton>
        </ToggleButtonGroup>
    );
}