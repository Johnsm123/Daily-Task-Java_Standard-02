use employee;

CREATE TABLE employeescompare (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10, 2)
);

-- Insert sample data
INSERT INTO employeescompare (employee_id, first_name, last_name, department, salary) VALUES
(1, 'John', 'samuel', 'HR', 55000),
(2, 'Faizan', 'Akram', 'HR', 60000),
(3, 'Mukesh', 'Ram', 'IT', 75000),
(4, 'Rahul', 'Reddy', 'IT', 80000),
(5, 'Famiya', 'Tio', 'Finance', 70000),
(6, 'Pradeep', 'ragavan', 'Finance', 65000),
(7, 'Rohit', 'Sharma', 'IT', 72000),
(8, 'Mudit', 'Harris', 'HR', 58000);

-- 1. Subquery to identify employees earning above their department average
SELECT 
    employee_id,
    first_name,
    last_name,
    department,
    salary
FROM 
    employeescompare e
WHERE 
    salary > (
        SELECT AVG(salary)
        FROM employeescompare
        WHERE department = e.department
    );

-- 2. Aggregate functions to compute company expenses
SELECT 
    SUM(salary) AS total_salary_expense,
    AVG(salary) AS average_salary
FROM 
    employeescompare;

-- 3. CASE statement to categorize employees based on salary
SELECT 
    employee_id,
    first_name,
    last_name,
    salary,
    CASE 
        WHEN salary >= 80000 THEN 'High'
        WHEN salary >= 60000 THEN 'Medium'
        ELSE 'Low'
    END AS salary_category
FROM 
    employeescompare;
