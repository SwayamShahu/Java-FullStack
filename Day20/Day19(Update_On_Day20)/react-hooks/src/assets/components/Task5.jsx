import React, { useState } from 'react'

function Task5() {
    let userid;
    let userpassword;
    const [login, setLogin] = useState("");

    function changeUserId(event) {
        userid = event.target.value;
        console.log(userid);
    }

    function changeUserPassword(event) {
        userpassword = event.target.value;
        console.log(userpassword)
    }
    function submitResponse() {
        if (userid == "user" && userpassword == "123") {
            setLogin("Login Succesfull");
        } else {
            setLogin("Unsuccesfull");
        }
    }

    return (
        <div className="task5block">
            <div className='task5InputBlock'>
                <input type="text" name="userid" id="userid" onChange={changeUserId} />
                <input type="text" name="userpassword" id="userpassword" onChange={changeUserPassword} />
            </div>
            <div className='task5OutputBlock'>
                <button onClick={submitResponse}>Submit</button>
                <h6>{login}</h6>
            </div>
        </div>
    )
}

export default Task5
