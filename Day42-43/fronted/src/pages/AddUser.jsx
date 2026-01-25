import React, { useState } from 'react'

function AddUser() {
    const [userName, setUserName] = useState("")
    const [password, setpassword] = useState("");
    const [role, setRole] = useState("");
    return (
        <>
            <label>UserName</label>
            <br />
            <input type="text" onChange={e => setUserName(e.target.value)} />
            <br />
            <label>Password</label>
            <br />
            <input type="text" onChange={e => setpassword(e.target.value)} />
            <br />
            <label>Role</label>
            <input type="radio" name="role" id="" />
            <Button>Submit</Button>
        </>
    )
}

export default AddUser
