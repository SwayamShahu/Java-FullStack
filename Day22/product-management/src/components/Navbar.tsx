import '../assets/navbarCss.css'
import { Link } from 'react-router-dom'

function Navbar() {
    return (
        <div className="navbar">
            <h3>Manage Your Product</h3>
            <h5><Link className='navLink' to={'/home'}>Home</Link></h5>
            <h5><Link className='navLink' to={'/addproduct'}>Add Product</Link></h5>
            <h5><Link className='navLink' to={'/editproduct'}>Edit Product</Link></h5>
        </div>
    )
}

export default Navbar

