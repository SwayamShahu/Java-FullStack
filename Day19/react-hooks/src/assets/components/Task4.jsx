import React, { useState } from 'react';

function Task4() {
    const [color, setColor] = useState("Black");

    function inputChange(event) {
        const userValue = event.target.value;
        setColor(userValue);
    }

    return (
        <div className='task4Block'>
            <div>
                <h1 style={{ backgroundColor: color }} >Hiiiiii</h1>
            </div>
            <div>
                <input type="text" id="userInput" placeholder='Enter color here' onChange={inputChange} />
            </div>
        </div>
    );
}

export default Task4;
