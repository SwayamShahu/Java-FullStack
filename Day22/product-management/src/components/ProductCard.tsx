import { Link } from "react-router-dom"
import type Product from "../pages/products/interface/product"

function ProductCard({ id, name, price, category, image }) {

    const deleteProduct = (id: number) => {
        const products: Product[] = JSON.parse(localStorage.getItem('products') || "[]")
        const newProduct: Product[] = products.filter((element, index) => element.id != id);
        localStorage.setItem('products', JSON.stringify(newProduct))
    }

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
