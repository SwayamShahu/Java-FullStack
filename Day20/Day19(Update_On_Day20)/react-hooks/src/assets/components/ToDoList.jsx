import React, { useState } from 'react';

function ToDoList() {
    const [tasks, setTasks] = useState([]);
    const [taskname, setTaskName] = useState("");

    function addTask() {
        if (taskname.trim() === "") return;

        setTasks(prev => [
            ...prev,
            { tn: taskname, isCompleted: false }
        ]);

        setTaskName("");
    }

    function markAsDone(index) {
        setTasks(prev =>
            prev.map((task, i) =>
                i === index ? { ...task, isCompleted: true } : task
            )
        );
    }

    return (
        <div className='toDoTaskBlock'>
            <div className='toDoTaskBlockInput'>
                <label htmlFor="taskname">Enter your task</label>
                <input
                    type="text"
                    id="taskname"
                    value={taskname}
                    onChange={e => setTaskName(e.target.value)}
                />
                <button onClick={addTask}>Add Task</button>
            </div>

            <div>
                {tasks.map((task, index) => (
                    <div
                        key={index}
                        style={{ backgroundColor: task.isCompleted ? 'green' : 'white' }}
                    >
                        <h3>{task.tn}</h3>
                        {!task.isCompleted && (
                            <button onClick={() => markAsDone(index)}>Done</button>
                        )}
                    </div>
                ))}
            </div>
        </div>
    );
}

export default ToDoList;