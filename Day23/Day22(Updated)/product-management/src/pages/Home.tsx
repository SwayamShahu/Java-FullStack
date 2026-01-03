import { useState } from "react";
import ProductCard from "../components/ProductCard"
import type Product from "./products/interface/product"

function Home() {

    const [products, setProducts] = useState(JSON.parse(localStorage.getItem('products') || '[]'));
    const deleteProduct = (id: number) => {
        const products: Product[] = JSON.parse(localStorage.getItem('products') || "[]")
        const newProduct: Product[] = products.filter((element, index) => element.id != id);
        localStorage.setItem('products', JSON.stringify(newProduct))
        setProducts(newProduct);
    }

    return (
        <>
            <h1>Here, are the available products</h1>
            <div className="homeContainer">
                {
                    products.map((element, index) => (
                        <ProductCard id={element.id} name={element.name} price={element.price} category={element.category} image={element.image} deleteProduct={deleteProduct}></ProductCard >
                    ))
                }
            </div>
        </>
    )
}

export default Home
