import React, { useState } from 'react'
import { useEffect } from 'react'

function Login() {
    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('')
    const [message, setMessage] = useState('')
    const [isLoggedIn, setLoggedIn] = useState(null)
    const [bgColor, setBgColor] = useState("White")

    const users = [
        {
            username: 'abcd',
            password: 'Admin@123'
        }, {
            username: 'xyz',
            password: 'Admin@123'
        }, {
            username: 'pqr',
            password: 'Admin@123'
        }, {
            username: 'alpha',
            password: 'Admin@123'
        }, {
            username: 'beta',
            password: 'Admin@123'
        }
    ]
    const login = () => {
        let result = users.some(user => {
            return username == user.username && password == user.password
        })
        console.log(result)


        if (result) {
            setMessage("Login Successfully")
            setLoggedIn(true)
        } else {
            setMessage("Login Unsuccessfully")
            setLoggedIn(false)
        }
    }

    useEffect(() => {
        if (isLoggedIn == null) {
            setBgColor('white')
        } else if (isLoggedIn == true) {
            setBgColor('green')
        } else {
            setBgColor('red')
        }
    }, [isLoggedIn])

    return (
        <div style={{ backgroundColor: bgColor }} className='login-form'>
            <label htmlFor="username">User Name: </label>
            <input type="text" name="username" id="username" onChange={(e) => { setUsername(e.target.value) }} />
            <label htmlFor="password">Password: </label>
            <input type="text" name="password" id="password" onChange={(e) => { setPassword(e.target.value) }} />
            <button onClick={login}>Button</button>
            <p>{message}</p>
        </div>
    )
}

export default Login
