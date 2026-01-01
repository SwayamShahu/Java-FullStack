import { useState } from 'react'
import './App.css'
import TaskList from './Pages/TaskList'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <TaskList></TaskList>
    </>
  )
}

export default App
