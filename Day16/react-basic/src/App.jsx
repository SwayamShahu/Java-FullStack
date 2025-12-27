import { useState } from 'react'
import './App.css'
import Card from './assets/components/ui/Card'

function App() {
    const user1 = {
    detail: { name: 'ABC', age: 12, id: 1 },
    address: { city: 'Nagpur', zipcode: 441501, state: 'Maharashtra', country: 'India' },
    contact: { email: "abc@gmail.com", phone: 7212345678 }
  };

  const user2 = {
    detail: { name: 'XYZ', age: 25, id: 2 },
    address: { city: 'Pune', zipcode: 411001, state: 'Maharashtra', country: 'India' },
    contact: { email: "xyz@gmail.com", phone: 9876543210 }
  };
  const users = [user1, user2]
  return (
    <>
    <div className='cardComponent'>
      <Card users={users} heading={"Details"}></Card>
    </div>

    </>
  )
}

export default App
