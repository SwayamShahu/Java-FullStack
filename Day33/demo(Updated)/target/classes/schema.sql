-- PRODUCT TABLE
CREATE TABLE IF NOT EXISTS product (
                                       product_id INT PRIMARY KEY,
                                       name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    type VARCHAR(50),
    gst_percentage DOUBLE,
    stock_quantity INT
    );

-- CUSTOMER TABLE
CREATE TABLE IF NOT EXISTS customer (
                                        id INT PRIMARY KEY,
                                        name VARCHAR(20) NOT NULL,
    phone BIGINT,
    email VARCHAR(100),
    address VARCHAR(255)
    );

-- ORDER TABLE
CREATE TABLE IF NOT EXISTS orders (
                                      order_id VARCHAR(36) PRIMARY KEY, -- UUID
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    amount DOUBLE NOT NULL,
    status VARCHAR(20) NOT NULL,
    customer_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_orders_product FOREIGN KEY (product_id) REFERENCES product(product_id),
    CONSTRAINT fk_orders_customer FOREIGN KEY (customer_id) REFERENCES customer(id)
    );

-- INVOICE TABLE
CREATE TABLE IF NOT EXISTS invoice (
                                       invoice_id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                       customer_id INT,
                                       total_amount DOUBLE,
                                       total_tax DOUBLE,
                                       discount DOUBLE,
                                       final_amount DOUBLE,
                                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                       FOREIGN KEY (customer_id) REFERENCES customer(id)
    );

-- INVOICE ITEM TABLE
CREATE TABLE IF NOT EXISTS invoice_item (
                                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                            invoice_id BIGINT,
                                            product_id INT,
                                            quantity INT,
                                            price DOUBLE,
                                            tax_amount DOUBLE,
                                            discount DOUBLE,
                                            total DOUBLE,
                                            FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id)
    );
