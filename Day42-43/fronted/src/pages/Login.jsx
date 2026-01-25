import React, { useState } from 'react'
import { loginBasicAuth } from '../api/auth';
import { useNavigate } from 'react-router-dom';
import api from '../API/axios';

function Login() {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const navigate = useNavigate();

    const login = async () => {
        const authHeader = "Basic " + btoa(username + ":" + password);

        try {
            const res =
                await api.post("/auth/login", {
                    username, password
                });

            loginBasicAuth(res.data);
            navigate("/dashboard");
        } catch (error) {
            console.log(error)
            alert("Invalid Credentials");
        }
    };

    return (
        <>
            <label>Enter username:</label>
            <input type="text" onChange={e => setUsername(e.target.value)} />

            <label>Enter password:</label>
            <input type="password" onChange={e => setPassword(e.target.value)} />

            <button onClick={login}>Submit</button>
        </>
    );
}

export default Login;
