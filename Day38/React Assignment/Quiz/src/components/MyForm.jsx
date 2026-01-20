import React, { useState } from 'react'

function MyForm({ question, index, buttonClick }) {
    const [selectedOption, setSelectedOption] = useState(null)

    const handleNext = () => {
        const isCorrect = selectedOption === question.correctAnswer
        buttonClick(isCorrect)
        setSelectedOption(null)
    }

    return (
        <div>
            <h3>Question {index + 1}</h3>
            <p>{question.question}</p>

            <ul>
                {question.options.map((opt, i) => (
                    <li key={i}>
                        <input
                            type="radio"
                            name="option"
                            checked={selectedOption === i}
                            onChange={() => setSelectedOption(i)}
                        />
                        <label>{opt}</label>
                    </li>
                ))}
            </ul>

            <button
                type="button"
                onClick={handleNext}
                disabled={selectedOption === null}
            >
                Next
            </button>
        </div>
    )
}

export default MyForm
