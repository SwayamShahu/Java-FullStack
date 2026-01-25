import React from 'react'
import { isAuthenticated } from '../api/auth'
import { Navigate } from 'react-router-dom'

export default function ProtectedRoute({ children }) {
    if (!isAuthenticated()) {
        return <Navigate to="/" />
    }
    return children;
}