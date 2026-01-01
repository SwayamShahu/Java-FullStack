import React, { useState } from 'react';

function TaskList() {
    const [tasks, setTasks] = useState([]);
    const [title, setTitle] = useState('');
    const [description, setDescription] = useState('');

    const addTask = () => {
        if (title.trim().length > 0) {
            const newTask = {
                id: Date.now(),
                title,
                description,
                done: false,
            };
            setTasks([...tasks, newTask]);
            setTitle('');
            setDescription('');
        }
    };

    return (
        <div>
            <div className="inputTask">
                <label htmlFor="taskTitle">Title</label>
                <input
                    type="text"
                    id="taskTitle"
                    value={title}
                    onChange={(e) => setTitle(e.target.value)}
                />
                <label htmlFor="taskDescription">Description</label>
                <input
                    type="text"
                    id="taskDescription"
                    value={description}
                    onChange={(e) => setDescription(e.target.value)}
                />
                <button onClick={addTask}>Add</button>
            </div>
            {tasks.map((task, index) => (
                <div >
                    <h4>Title: {task.title}</h4>
                    <h5>Description: {task.description}</h5>
                    <button onClick={() => setTasks(tasks.map((task, i) => {
                        return index == i ? { ...task, done: !task.done } : task
                    }))}>{task.done ? "Undo" : "Complete"}</button>
                    <button onClick={() => setTasks(tasks.filter((task, i) => i != index))}>Delete</button>
                </div>
            ))}
        </div>
    );
}

export default TaskList;
