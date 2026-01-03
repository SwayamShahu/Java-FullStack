import { useEffect, useState } from "react";
import type Product from "./interface/product";
import { useParams, useNavigate } from "react-router-dom";

function EditProduct() {
    const { id } = useParams();
    const navigate = useNavigate();

    const [product, setProduct] = useState<Product>({
        id: Number(id),
        name: "",
        price: 0,
        category: "",
        image: ""
    });

    useEffect(() => {
        const products: Product[] = JSON.parse(localStorage.getItem("products") || "[]");
        const existingProduct = products.find((element) => element.id === Number(id));
        if (existingProduct) {
            setProduct(existingProduct);
        }
    }, [id]);

    const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        const { name, value } = e.target;
        setProduct({
            ...product,
            [name]: name === "price" ? Number(value) : value
        });
    };

    const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        const products: Product[] = JSON.parse(localStorage.getItem("products") || "[]");

        const updatedProducts = products.map((p) =>
            p.id === product.id ? product : p
        );

        localStorage.setItem("products", JSON.stringify(updatedProducts));
    };

    return (
        <div className="EditProductDiv">
            <h4>Modify your product here</h4>
            <form id="editProductForm" onSubmit={handleSubmit} className="formDiv">
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

                <button type="submit">Update</button>
            </form>
        </div>
    );
}

export default EditProduct;
