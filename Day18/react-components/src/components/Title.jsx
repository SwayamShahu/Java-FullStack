import React from 'react'

function Title({ text, color }) {
    return (
        <div>
            <h1 className={color} >{text}</h1>
        </div>
    )
}

export default Title
