import ProductCard from "../components/ProductCard"
import type Product from "./products/interface/product"

// id: number;
//     name: string;
//     price: number;
//     category: string;
//     image: string;

function Home() {
    const products: Product[] = JSON.parse(localStorage.getItem('products') || "[]")
    console.log(products);
    return (
        <>
            <h1>Here, are the available products</h1>
            <div className="homeContainer">
                {
                    products.map((element, index) => (
                        <ProductCard id={element.id} name={element.name} price={element.price} category={element.category} image={element.image}></ProductCard >
                    ))
                }
            </div>
        </>
    )
}

export default Home
