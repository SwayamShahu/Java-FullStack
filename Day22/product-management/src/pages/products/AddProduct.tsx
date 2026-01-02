import { useState } from "react";
import type Product from "./interface/product";
import '../../assets/addproduct.css'

const AddProduct = () => {

    const [product, setProduct] = useState<Omit<Product, "id">>({
        name: "",
        price: 0,
        category: "",
        image: ""
    });

    const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        const { name, value } = e.target;
        setProduct({
            ...product,
            [name]: name === "price" ? Number(value) : value
        });
    };

    const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault()
        const existingProducts: Product[] = JSON.parse(localStorage.getItem('product') || "[]");
        const newProduct: Product = {
            id: Date.now(),
            price: product.price,
            name: product.name,
            image: product.image,
            category: product.category
        }
        localStorage.setItem('products', JSON.stringify([...existingProducts, newProduct]))

        setProduct({
            name: "",
            price: 0,
            category: "",
            image: ""
        })
    }


    return (
        <div className="addProductBlock">
            <h4>Hey, here you can add your products for sell</h4>

            <form id="addProductForm" onSubmit={handleSubmit}>
                <label htmlFor="name">Product Name</label>
                <input
                    type="text"
                    value={product.name}
                    name="name"
                    id="name"
                    placeholder="Product Name"
                    onChange={handleChange}
                />

                <label htmlFor="price">Price</label>
                <input
                    type="number"
                    value={product.price}
                    name="price"
                    id="price"
                    placeholder="Product Price"
                    onChange={handleChange}
                />

                <label htmlFor="category">Category</label>
                <input
                    type="text"
                    value={product.category}
                    name="category"
                    id="category"
                    placeholder="Product Category"
                    onChange={handleChange}
                />

                <label htmlFor="image">Image</label>
                <input
                    type="text"
                    value={product.image}
                    name="image"
                    id="image"
                    placeholder="Product Image Link"
                    onChange={handleChange}
                />
                <button type="submit">Add</button>
            </form>
        </div>
    );
};

export default AddProduct;
