use student;
CREATE TABLE STUDENTS (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    marks INT
);

INSERT INTO STUDENTS (id, name, age, marks) VALUES
(1, 'Alice', 20, 82),
(2, 'Bob', 21, 67),
(3, 'Charlie', 19, 90),
(4, 'Diana', 22, 74),
(5, 'Ethan', 20, 78);

SELECT * FROM STUDENTS;

SELECT * FROM STUDENTS
WHERE marks > 75;

SELECT * FROM STUDENTS
ORDER BY age;

