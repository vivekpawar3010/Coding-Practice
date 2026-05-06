import React from 'react'

const Child = () => {
  return (
    <>
      <h1>Child</h1>
    </>
  )
}

export default function Parent() {
  return (
    <>
      <h1>Parent</h1>
        <Child />
    </>

  )
}

export default Child;