import {useEffect, useState} from "react";

export function Timer({ loading, requestTime } : { loading: Boolean, requestTime: number }) {
    const [seconds, setSeconds] = useState(0)

    useEffect(() => {
        setSeconds(Math.floor((requestTime/1000) * 100) / 100)
    }, [requestTime])

    useEffect(() => {
        if (loading) setSeconds(0)
    }, [loading])

    return (
        <h1>Request time: {seconds}</h1>
    );
}