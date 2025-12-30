import React from 'react'

const buttonText = "Button"
function Usercard({ data }) {
    return (
        data.map((element) => (
            <>
                <div className="usercard">
                    <p>Name: {element.username}</p>
                    {element.hideAge && <p>Age: {element.age}</p>}
                    <button >{buttonText}</button>
                </div>
            </>
        ))
    )
}

export default Usercard
