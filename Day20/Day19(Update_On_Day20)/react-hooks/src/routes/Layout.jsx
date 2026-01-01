import React from 'react'
import { Outlet } from 'react-router-dom'

function Layout() {
    return (
        <>
            <h1>My app</h1>
            <Outlet></Outlet>
        </>
    )
}

export default Layout
