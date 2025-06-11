use employee;
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department VARCHAR(50),
    salary decimal(10,2),
    hire_date DATE
);

INSERT INTO employees (employee_id, first_name, last_name, department, salary, hire_date) VALUES (101, 'John', 'Smith', 'Sales', 60000.00, '2018-05-10');
INSERT INTO employees (employee_id, first_name, last_name, department, salary, hire_date) VALUES (102, 'Emily', 'Jones', 'HR', 55000.00, '2019-07-15');
INSERT INTO employees (employee_id, first_name, last_name, department, salary, hire_date) VALUES (103, 'Michael', 'Brown', 'IT', 70000.00, '2021-03-22');
INSERT INTO employees (employee_id, first_name, last_name, department, salary, hire_date) VALUES (104, 'Sarah', 'Davis', 'Marketing', 65000.00, '2020-11-30');
INSERT INTO employees (employee_id, first_name, last_name, department, salary, hire_date) VALUES (105, 'James', 'Wilson', 'Sales', 62000.00, '2017-01-05');


select * from employees;

use employee;
CREATE TABLE projects (
    project_id INT PRIMARY KEY,
    employee_id INT,
    project_name VARCHAR(100)
);

INSERT INTO projects VALUES
(101, 1, 'Shop Inventory System'),
(102, 2, 'Billing App');

SELECT e.first_name, p.project_name
FROM employees e
LEFT JOIN projects p ON e.employee_id = p.employee_id;

select * from projects;




INSERT INTO projects (project_id, employee_id, project_name) VALUES
(201, 101, 'Shop Inventory System'),
(202, 102, 'Billing App');

SELECT e.first_name, p.project_name
FROM employees e
LEFT JOIN projects p ON e.employee_id = p.employee_id;

DELETE FROM projects
WHERE project_id IN (101, 102);


CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    hire_date DATE,
    salary DECIMAL(10, 2)
);

INSERT INTO employee (employee_id, name, position, hire_date, salary) VALUES
(1, 'John', 'ADM', '2025-05-10', 85000),
(2, 'Faizan', 'Java-Developer', '2025-01-15', 65000),
(3, 'Pradeep', 'QA-Analyst', '2025-07-20', 60000),
(4, 'Rohit', 'Analyst', '2025-11-01', 62000);


UPDATE employee
SET hire_date = '2018-04-10'
WHERE employee_id = 1;

UPDATE employee
SET hire_date = '2019-09-15'
WHERE employee_id = 2;


UPDATE employee
SET hire_date = '2022-07-20'
WHERE employee_id = 3;

UPDATE employee
SET hire_date = '2024-11-01'
WHERE employee_id = 4;


SET SQL_SAFE_UPDATES = 0;

SET SQL_SAFE_UPDATES = 0;

UPDATE employee
SET salary = salary * 1.10
WHERE DATEDIFF(CURDATE(), hire_date) > 5 * 365;

SET SQL_SAFE_UPDATES = 1;


UPDATE employee
SET salary = salary * 1.10
WHERE DATEDIFF(CURDATE(), hire_date) > 5 * 365;

select * from employee;


