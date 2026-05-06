import React from 'react'
import { useState } from 'react'

const Prop = () => {
    const [name, setName] = useState('John Doe');

  return (
    <div>
        <h1>Hello, {name}!</h1>
        <h1>this is Parent</h1>

        <Child name={name} />
    </div>

    
  )
}

function Child({ userName }) {
  return (
    <div>
      <h2>Child Component</h2>
      <p>Hello, {userName} 👋</p>
    </div>
  );
}



export default Prop