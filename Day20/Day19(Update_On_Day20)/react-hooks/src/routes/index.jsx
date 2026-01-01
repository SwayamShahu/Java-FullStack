import { createBrowserRouter, Outlet } from "react-router-dom";
import Login from "../assets/components/Login";
import ToDoList from "../assets/components/ToDoList";
import Layout from "./Layout";
const router = createBrowserRouter([
    {
        element: <Layout></Layout>,
        children: [
            { path: '/', element: <Login></Login> },
            { path: '/to-do', element: <ToDoList></ToDoList> }
        ]
    }
])

export default router;