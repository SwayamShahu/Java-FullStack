import React from 'react'
import api from '../API/axios';

const getEmployeeList = async () => {
    return await api.get("/getEmployee");
}

function EmployeeList() {
    const employeeData = getEmployeeList();
    return (
        <div>
        </div>
    )
}

export default EmployeeList
