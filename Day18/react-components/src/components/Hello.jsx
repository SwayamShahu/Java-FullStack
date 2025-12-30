import React from 'react'


function Hello({ children }) {
  return (

    <div>
      <h5>Hello, React</h5>
      {children}
      {console.log(children)}
    </div>
  )
}

export default Hello
