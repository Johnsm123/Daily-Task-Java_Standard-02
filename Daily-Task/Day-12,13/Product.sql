use shop;
CREATE TABLE shop (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10, 2),
    stock INT
);

INSERT INTO shop (product_id, product_name, category, price, stock) VALUES 
(1, 'Laptop', 'Electronics', 55000.00, 10),
(2, 'Smartphone', 'Electronics', 30000.00, 25),
(3, 'Desk Chair', 'Furniture', 4500.00, 15),
(4, 'Pen Drive', 'Accessories', 700.00, 50),
(5, 'Monitor', 'Electronics', 12000.00, 8);

SELECT * FROM shop
ORDER BY price ASC;

ALTER TABLE shop
ADD customer_name VARCHAR(100);

UPDATE shop SET customer_name = 'John Doe' WHERE product_id = 1;
UPDATE shop SET customer_name = 'Jane Smith' WHERE product_id = 2;
UPDATE shop SET customer_name = 'Alice Brown' WHERE product_id = 3;
UPDATE shop SET customer_name = 'Jack Wilson' WHERE product_id = 4;
UPDATE shop SET customer_name = 'Emily Davis' WHERE product_id = 5;

SELECT * FROM shop
WHERE customer_name LIKE 'J%';

CREATE TABLE customers (
    customer_name VARCHAR(100) PRIMARY KEY,
    customer_city VARCHAR(50)
);

INSERT INTO customers VALUES
('John Doe', 'New York'),
('Jane Smith', 'Los Angeles'),
('Alice Brown', 'Chicago'),
('Jack Wilson', 'Houston'),
('Emily Davis', 'Phoenix');

SELECT s.product_name, s.price, c.customer_name, c.customer_city
FROM shop s
INNER JOIN customers c ON s.customer_name = c.customer_name;

use shop;
CREATE TABLE suppliers (
    supplier_name VARCHAR(100),
    product_name VARCHAR(100)
);

INSERT INTO suppliers VALUES
('Supplier A', 'Laptop'),
('Supplier B', 'Smartphone'),
('Supplier C', 'Tablet');


SELECT s.product_name, s.price, sup.supplier_name
FROM shop s
LEFT JOIN suppliers sup ON s.product_name = sup.product_name

UNION


SELECT s.product_name, s.price, sup.supplier_name
FROM shop s

RIGHT JOIN suppliers sup ON s.product_name = sup.product_name;


CREATE TABLE CustomersInactive (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    last_login DATETIME
);

INSERT INTO CustomersInactive (customer_id, name, last_login) VALUES
(1, 'John Samuel', '2025-06-09 14:15:00'),
(2, 'Rohit', '2024-03-10 09:45:00'),
(3, 'Faizan', '2023-05-25 11:30:00'),
(4, 'harry', '2025-01-18 16:50:00'),
(5, 'Mohit', '2023-12-01 08:00:00'),
(6, 'Deepak', '2022-07-20 10:05:00'),
(7, 'pradeep', '2025-06-01 13:00:00'),
(8, 'Aakash', '2021-10-10 07:30:00'),
(9, 'Famiya', '2025-06-08 18:20:00'),
(10, 'Kassi', '2023-08-15 20:10:00');

DELETE FROM CustomersInactive
WHERE last_login < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);

select * from CustomersInactive;


DELETE FROM customers
WHERE last_login < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);


