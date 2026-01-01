import { useState } from 'react';
import './App.css'
import Text from './assets/components/Text.jsx'
import Task4 from './assets/components/Task4.jsx';
import Task5 from './assets/components/Task5.jsx';
import Login from './assets/components/Login.jsx';
import ToDoList from './assets/components/ToDoList.jsx';

function App() {
  let [count, setCount] = useState(0);
  let numConst = 1;

  const increaseCounter = (num) => {
    numConst = num;
    setCount(count + num)
    console.log(count)
  }

  const decreaseCounter = (num) => {
    numConst = num;
    setCount(count - num)
    console.log(count)
  }

  const resetCounter = () => {
    setCount(0);
  }

  return (
    <>
      <div className="counterblock">
        <h1 className='displayText'>{count}</h1>
        <div className="buttons">
          <button className='increaseCounter' onClick={() => increaseCounter(5)}>Increase</button>
          <button disabled={count - numConst <= 0 ? true : false} className='decreaseCounter' onClick={() => decreaseCounter(5)}>Decrease</button>
          <button className='resetButton' onClick={resetCounter}>Reset</button>
        </div>
      </div>
      <Text></Text>
      <Task4></Task4>
      <Task5></Task5>
      {/* <Login></Login> */}
      <ToDoList></ToDoList>
    </>
  )
}

export default App
