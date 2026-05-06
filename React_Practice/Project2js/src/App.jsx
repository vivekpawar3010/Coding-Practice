import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)


  const increment = () => {
    setCount(count + 1)
  }

  const decrement = () => {
    setCount(count - 1)
  }

  const reset = () => {
    setCount(0)
  }

  useEffect(() => {
    const interval = setInterval(() => {
      setCount(prev => prev + 1);
      console.log('Component mounted')
    }, 1000)

    return () => {
      console.log('Component unmounted')
      clearInterval(interval)
    }
  },[]);
  return (
    <>
    <h1>The Current Count: {count}</h1>
    <br />
    <br />
    <button onClick={increment}>Increment</button>
    <button onClick={decrement}>Decrement</button>
    <button onClick={reset}>Reset</button>
    </>
  )
}

export default App
