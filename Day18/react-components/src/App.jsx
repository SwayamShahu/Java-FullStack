import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import WelcomeComponent from './components/WelcomeComponent'
import Hello from './components/Hello'
import Header from './components/Header'
import Footer from './components/Footer'
import Greating from './components/Greating'
import Usercard from './components/usercard.jsx'
import Card from './components/Card.jsx'
import Status from './components/Status.jsx'
import Button from './components/Button.jsx'
import Message from './components/Message.jsx'
import ProductComponent from './components/ProductComponent.jsx'
import Title from './components/Title.jsx'

var name = "Swayam"
var data = [
  { username: "ABC", age: 18, hideAge: true }, { username: "XYZ", age: 21, hideAge: false }, { username: "PQR", age: 23, hideAge: true }]
var card = "Hey I am a card"

// Product Array
const products = [
  {
    id: 1,
    name: "Wireless Headphones",
    price: 2499,
    imageUrl: "https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcTbIn8N6yoVVtWRp9KyjBWPm3V7AVJguB86oMe9mAKS_9dz5Xa6cwdYyWF804mRo7AMhSuLZ43V2RlsOPPczS1bvHQQX6ZrkdfD6WwRzOMjAsbKFbNWPgL8kQ"
  },
  {
    id: 2,
    name: "Smart Watch",
    price: 3999,
    imageUrl: "https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcTK4-bCxitjzZH4wv70WaPHDWFcjybKryS3gZC2AhdWpMos5nyJv2PYJkknlVA2QWe4938_9Ur4CY_W3yN8qtDkD4A5H8XLSF2N8kqJB-hM"
  },
  {
    id: 3,
    name: "Bluetooth Speaker",
    price: 1999,
    imageUrl: "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcR0l6VoZpUxdPXj3vyEqOBphmTsXhhHY6HjT9kyCMFrmfWvxlRhnkcL2gKEhjnVcBZo20rh6PBhamr3ETIykcAydAHdAKuQiWawpJhz05vZ8bZEUnPnWK1yYg"
  }
];


function App() {
  return (
    <>
      <WelcomeComponent></WelcomeComponent>
      <Hello>
        <Button></Button>
      </Hello>
      <Header></Header>
      <Footer></Footer>
      <Greating name={name} ></Greating>
      <Usercard data={data}></Usercard>
      <Card card={card}></Card>
      <Status isOnline={false}></Status>
      <Message></Message>
      <Message mess="My Message"></Message>
      <ProductComponent products={products}></ProductComponent>
      <Title text="This is  a text" color="bg-red"></Title>
    </>
  )
}

export default App
