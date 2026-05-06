import React, { useState, useEffect }from "react";


const Combo = () => {
    const [count, setCount] = useState(0);
    

    const increment = () => {
        setCount(count + 1);
    }
    const decrement= () =>{
        setCount(count - 1);
    }

    useEffect(() =>{
        const interval = setInterval(() => {
            setCount(prevTime => prevTime + 1);
        }, 1000);
        
        return () => clearInterval(interval);
    },[]);

    return (
        <div>
            <h1>Counter + Timer: {count}</h1>
            <button onClick={increment}>Incremtn</button>
            <button onClick={decrement}>Decremnt</button>
        </div>
    )
}

export default Combo;