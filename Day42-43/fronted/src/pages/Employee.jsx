import React, { useState } from "react";
import api from "../API/axios";

function Employee() {
    const [employee, setEmployee] = useState({
        name: "",
        email: "",
        phone: "",
        designation: "",
        status: "ACTIVE",
        joiningDate: "",
        salary: 0,
        username: "",
        password: "",
        role: "USER"
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setEmployee({ ...employee, [name]: value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await api.post("/admin/employee", employee);
            alert("Employee created successfully");
            console.log(response.data);
        } catch (error) {
            console.error(error);
            alert(error.response?.data?.message || "Employee creation failed");
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <h2>Create Employee</h2>

            <input
                type="text"
                name="name"
                placeholder="Name"
                value={employee.name}
                onChange={handleChange}
                required
            />

            <input
                type="email"
                name="email"
                placeholder="Email"
                value={employee.email}
                onChange={handleChange}
                required
            />

            <input
                type="text"
                name="phone"
                placeholder="Phone"
                value={employee.phone}
                onChange={handleChange}
            />

            <input
                type="text"
                name="designation"
                placeholder="Designation"
                value={employee.designation}
                onChange={handleChange}
            />

            {/* EmployeeStatus enum */}
            <select name="status" value={employee.status} onChange={handleChange}>
                <option value="ACTIVE">ACTIVE</option>
                <option value="INACTIVE">INACTIVE</option>
                <option value="ON_LEAVE">ON_LEAVE</option>
                <option value="EXITED">EXITED</option>
            </select>

            <input
                type="date"
                name="joiningDate"
                value={employee.joiningDate}
                onChange={handleChange}
            />

            <input
                type="number"
                name="salary"
                placeholder="Salary"
                value={employee.salary}
                onChange={(e) =>
                    setEmployee({ ...employee, salary: Number(e.target.value) })
                }
            />

            <input
                type="text"
                name="username"
                placeholder="Username"
                value={employee.username}
                onChange={handleChange}
                required
            />

            <input
                type="password"
                name="password"
                placeholder="Password"
                value={employee.password}
                onChange={handleChange}
                required
            />

            <select name="role" value={employee.role} onChange={handleChange}>
                <option value="USER">USER</option>
                <option value="ADMIN">ADMIN</option>
                <option value="MANAGER">MANAGER</option>
            </select>

            <button type="submit">Create Employee</button>
        </form>
    );
}

export default Employee;
