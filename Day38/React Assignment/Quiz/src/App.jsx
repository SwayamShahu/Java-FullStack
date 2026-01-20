import { useState } from 'react'
import MyForm from './components/MyForm'


function App() {
  const [questionIndex, setQuestionIndex] = useState(0)
  const [score, setScore] = useState(0)
  const [showResult, setShowResult] = useState(false)

  const questions = [
    {
      question: "What does HTML stand for?",
      options: [
        "Hyper Tool Markup Language",
        "Hyper Text Markup Language",
        "High Text Markup Language",
        "Hyperlinks Text Mark Language"
      ],
      correctAnswer: 1
    },
    {
      question: "Which language is used for styling web pages?",
      options: [
        "HTML",
        "JQuery",
        "CSS",
        "XML"
      ],
      correctAnswer: 2
    },
    {
      question: "Which JavaScript keyword is used to declare a variable?",
      options: [
        "var",
        "int",
        "string",
        "float"
      ],
      correctAnswer: 0
    },
    {
      question: "Which symbol is used for single-line comments in JavaScript?",
      options: [
        "<!-- -->",
        "//",
        "/* */",
        "#"
      ],
      correctAnswer: 1
    },
    {
      question: "Which method is used to print output in JavaScript?",
      options: [
        "console.print()",
        "print()",
        "console.log()",
        "log.console()"
      ],
      correctAnswer: 2
    }
  ];

  const nextQuestion = (isCorrect) => {
    if (isCorrect) {
      setScore(score + 1)
    }

    if (questionIndex < questions.length - 1) {
      setQuestionIndex(questionIndex + 1)
    } else {
      setShowResult(true)
    }
  }

  return (
    <>
      {showResult ? (
        <h2>
          Your Score: {score} / {questions.length}
        </h2>
      ) : (
        <MyForm
          question={questions[questionIndex]}
          index={questionIndex}
          buttonClick={nextQuestion}
        />
      )}
    </>
  )
}

export default App
