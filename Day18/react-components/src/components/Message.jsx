import React from 'react'

function Message({ mess = "No Message" }) {
    return (
        <div>
            <p>{mess}</p>
        </div>
    )
}

export default Message
