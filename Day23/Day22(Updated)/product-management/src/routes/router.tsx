import { createBrowserRouter } from 'react-router-dom'
import Home from '../pages/Home'
import AddProduct from '../pages/products/AddProduct'
import EditProduct from '../pages/products/EditProduct'
import Layout from './Layout'
const routes = createBrowserRouter([
    {
        element: <Layout></Layout>,
        children: [
            { path: '/', element: <Home></Home> },
            { path: '/home', element: <Home></Home> },
            { path: '/addproduct', element: <AddProduct></AddProduct> },
            // { path: '/editproduct', element: <EditProduct></EditProduct> },
            { path: '/editproduct/:id', element: <EditProduct></EditProduct> }
        ]
    }
])

export default routes