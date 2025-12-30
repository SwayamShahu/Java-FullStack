import React, { useState } from 'react'

function ToDoList() {
    const [tasks, setTasks] = useState([])
    const [taskname, setTaskName] = useState("")

    function addTask() {
        if (taskname.trim() === "") return

        setTasks([
            ...tasks,
            { tn: taskname, isCompleted: false }
        ])

        setTaskName("")
    }

    return (
        <div>
            <div>
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
                    <div key={index}>
                        <h3>{task.tn}</h3>
                        <button>Done</button>
                    </div>
                ))}
            </div>
        </div>
    )
}

export default ToDoList
