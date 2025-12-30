import React, { useState } from 'react'


function Text() {

    const [show, setShow] = useState("Show")
    const buttonFunction = () => {
        if (show == "Show") {
            setShow("Hide")
        } else {
            setShow("Show")
        }
    }
    return (
        <div className='textBody'>
            <div>
                <button className='mybutton' onClick={buttonFunction}>{show}</button>
            </div>
            <div>
                {show == "Hide" ? <h1>Text is  shown</h1> : <></>}
            </div>

        </div>
    )
}
export default Text
