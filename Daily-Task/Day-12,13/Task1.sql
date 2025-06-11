use employee;

CREATE TABLE employee_raw (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    department_name VARCHAR(100),
    department_location VARCHAR(100),
    salary INT
);

INSERT INTO employee_raw VALUES
(1, 'Alice', 'Sales', 'New York', 60000),
(2, 'Bob', 'Marketing', 'Chicago', 55000),
(3, 'Charlie', 'Sales', 'New York', 70000),
(4, 'David', 'HR', 'Boston', 40000),
(5, 'Eva', 'Sales', 'New York', 52000),
(6, 'Frank', 'IT', 'Austin', 75000),
(7, 'Grace', 'Marketing', 'Chicago', 50000);

SELECT name, department_name, salary
FROM employee_raw
WHERE salary > 50000
ORDER BY name;

SELECT name, department_name, salary
FROM employee_raw
WHERE salary > 50000 AND department_name = 'Sales'
ORDER BY salary DESC;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100),
    department_location VARCHAR(100)
);

INSERT INTO departments VALUES
(1, 'Sales', 'New York'),
(2, 'Marketing', 'Chicago'),
(3, 'HR', 'Boston'),
(4, 'IT', 'Austin');

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    department_id INT,
    salary INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO employees VALUES
(1, 'Alice', 1, 60000),
(2, 'Bob', 2, 55000),
(3, 'Charlie', 1, 70000),
(4, 'David', 3, 40000),
(5, 'Eva', 1, 52000),
(6, 'Frank', 4, 75000),
(7, 'Grace', 2, 50000);

EXPLAIN SELECT name, salary
FROM employees
WHERE salary > 50000
ORDER BY salary DESC;

CREATE INDEX idx_salary ON employees(salary);

EXPLAIN SELECT name, salary
FROM employees
WHERE salary > 50000
ORDER BY salary DESC;

SELECT e.name, d.department_name, e.salary
FROM employees e
JOIN departments d ON e.department_id = d.department_id
WHERE e.salary > 50000 AND d.department_name = 'Sales'
ORDER BY e.salary DESC;
