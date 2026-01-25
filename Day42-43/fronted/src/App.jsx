import { Route, Routes } from "react-router-dom";
import Login from "./pages/Login";
import Employee from "./pages/Employee";
import ProtectedRoute from "./components/ProtectedRoute";
import EmployeeList from "./pages/EmployeeList";
import Dashboard from "./pages/Dashboard";

function App() {

  return (
    <>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/employee" element={
          <ProtectedRoute>
            <Employee />
          </ProtectedRoute>
        } />
        <Route path="/listemployee" element={<EmployeeList />} />
        <Route path="/dashboard" element={<Dashboard />} />
      </Routes>
    </>
  )
}

export default App
