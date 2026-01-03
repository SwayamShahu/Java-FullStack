import { Link } from "react-router-dom"
import type Product from "../pages/products/interface/product"

function ProductCard({ id, name, price, category, image, deleteProduct }) {

    return (
        <div className="productcarddiv">
            <img src={image} alt="image" />
            <h4>ID: {id}</h4>
            <h4>Name: {name}</h4>
            <h4>Price: {price}</h4>
            <h4>Category: {category}</h4>
            <button><Link to={`/editproduct/${id}`}>Edit</Link ></button>
            <button onClick={() => deleteProduct(id)} >Delete</button>

        </div>
    )
}

export default ProductCard
