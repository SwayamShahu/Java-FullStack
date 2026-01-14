import { use, useState } from "react";
import "./index.css";
const App = () => {
  const choices = ["Rock", "Paper", "Scissors"];

  const [userChoices, setUserChoices] = useState("");
  const [computerChoices, setComputerChoices] = useState("");
  const [result, setResult] = useState("");

  const [userScore, setUserScore] = useState(0);
  const [computerScore, setComputerScore] = useState(0);

  const getComputerChoice = () => {
    const random = Math.floor(Math.random() * choices.length);
    return choices[random];
  };

  const reset = () => {
    setComputerScore(0);
    setUserScore(0);
    setUserChoices("");
    setComputerChoices("");
    setResult("");
  };

  const playGame = (choice) => {
    const computer = getComputerChoice();
    setUserChoices(choice);
    setComputerChoices(computer);

    if (choice === computer) {
      setResult("Its a Draw");
    } else if (
      (choice === "Rock" && computer === "Scissors") ||
      (choice === "Paper" && computer === "Rock") ||
      (choice === "Scissors" && computer === "Paper")
    ) {
      setResult("Your win ");
      setUserScore(userScore + 1);
    } else {
      setResult("You Lose ");
      setComputerScore(computerScore + 1);
    }
  };
  return (
    <div className="playground">
      <h2>Game On</h2>
      <h3>Rock Paper Scissors</h3>
      <div className="buttons">
        <button
          onClick={() => {
            playGame("Rock");
          }}
        >
          Rock
        </button>
        <button
          onClick={() => {
            playGame("Paper");
          }}
        >
          Paper
        </button>
        <button
          onClick={() => {
            playGame("Scissors");
          }}
        >
          Scissors
        </button>
        <button
          onClick={() => {
            reset();
          }}
        >
          Reset
        </button>
      </div>

      {result && (
        <div className="result">
          <p>Your Choice :{userChoices}</p>
          <p>Compter Choice :{computerChoices}</p>
          <h3>{result}</h3>
          <div className="scores">
            <p>User : {userScore}</p>
            <p>Computer : {computerScore}</p>
          </div>
        </div>
      )}
    </div>
  );
};

export default App;
