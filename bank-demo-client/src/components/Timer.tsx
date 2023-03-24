import {useEffect, useState} from "react";
import {CircularProgress} from "@mui/material";

export function Timer({loading, requestTime}: { loading: Boolean, requestTime: number }) {
    const [seconds, setSeconds] = useState(0)

    useEffect(() => {
        if (loading) setSeconds(0)
    }, [loading])

    useEffect(() => {
        setSeconds(Math.floor((requestTime / 1000) * 100) / 100)
    }, [requestTime])

    const result = loading ? <CircularProgress size={25} sx={{marginLeft: 1}} /> : seconds
    return (
        <h1>Request time: {result}</h1>
    );
}