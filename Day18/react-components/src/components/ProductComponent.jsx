import React from 'react'

function ProductComponent({ products }) {
    return (
        <div className='cards'>
            {products.map(product => (
                <div className='productCard'>
                    <img className='img' src={product.imageUrl} alt="" />
                    <h4 className='productName'>{product.name}</h4>

                    <p className='productPrice'>{product.price}</p>
                </div>
            ))}
        </div>
    )
}

export default ProductComponent
