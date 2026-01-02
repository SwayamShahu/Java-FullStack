import type Product from "./interface/product"

function EditProduct() {
    const handleInput = (e: React.ChangeEvent<HTMLFormElement>) => {

    }

    return (
        <div>
            <h4>Product Manager in service !! Modify your product here</h4>
            <div>
                <form action="">
                    <label htmlFor="productId">Product Id</label>
                    <input type="text" name="productId" id="productId" />
                    <label htmlFor="productname">Product Name</label>
                    <input type="text" name="productName" id="productName" />
                    <label htmlFor="productCategory">Product Category</label>
                    <input type="text" name="productCategory" id="productCategory" />
                    <label htmlFor="productImageLink">Product Image Link</label>
                    <input type="text" name="productImageLink" id="productImageLink" />
                </form>
            </div>
        </div>
    )
}

export default EditProduct
