Alter table Branch
rename column Contact_No to Phone_No;


ALTER TABLE BRANCH
    MODIFY Branch_ID NUMBER(10);

-- 1. Add FOREIGN KEY constraint for Branch_ID
ALTER TABLE COURIER
    ADD CONSTRAINT fk_branch_id
        FOREIGN KEY (Branch_ID)
            REFERENCES BRANCH(Branch_ID);

-- 2. Add NOT NULL constraint to To_Address column
ALTER TABLE COURIER
    MODIFY To_Address VARCHAR2(30) NOT NULL;


-- 1. Add UNIQUE constraint on Email column
ALTER TABLE CUSTOMER
    ADD CONSTRAINT uq_customer_email UNIQUE (Email);

-- 2. Add CHECK constraint on Contact_No to allow only 10-digit numbers
ALTER TABLE CUSTOMER
    ADD CONSTRAINT chk_contact_10_digits
        CHECK (LENGTH(TO_CHAR(Contact_No)) = 10);

-- 1. Add Branch_Name column with NOT NULL constraint
ALTER TABLE BRANCH
    ADD Branch_Name VARCHAR2(25) NOT NULL;

-- 2. Drop the Contact_No column from BRANCH table
ALTER TABLE BRANCH
    DROP COLUMN Contact_No;

DROP TABLE COURIER CASCADE CONSTRAINTS;

TRUNCATE TABLE CUSTOMER;

DROP TABLE Subject CASCADE CONSTRAINTS;

INSERT INTO COURIER (Courier_Id, To_Address, Expected_Delivery_Date, Cost)
VALUES ('C001', 'Los Angeles', TO_DATE('05-APR-2020', 'DD-MON-YYYY'), 500);

INSERT INTO COURIER (Courier_Id, To_Address, Expected_Delivery_Date, Cost)
VALUES ('C002', 'Washington', TO_DATE('15-MAR-2020', 'DD-MON-YYYY'), 800);

INSERT INTO COURIER (Courier_Id, To_Address, Expected_Delivery_Date, Cost)
VALUES ('C003', 'Berlin', TO_DATE('01-SEP-2020', 'DD-MON-YYYY'), 1000);

INSERT INTO CUSTOMER (Customer_name, Customer_address, Email, Contact_no)
VALUES ('Andrew', 'Chicago', NULL, 9799874536);

INSERT INTO CUSTOMER (Customer_name, Customer_address, Email, Contact_no)
VALUES ('Holder', 'New York', 'hold@yahoo.com', 9998745318);

INSERT INTO CUSTOMER (Customer_name, Customer_address, Email, Contact_no)
VALUES ('David', 'Los Angeles', 'dav@gmail.com', 9779979979);

INSERT INTO CUSTOMER (Customer_name, Customer_address, Email, Contact_no)
VALUES ('Ronald', 'Chicago', NULL, 7774536287);

INSERT INTO CUSTOMER (Customer_name, Customer_address, Email, Contact_no)
VALUES ('Roy', 'Berlin', 'roy@gmail.com', 7453628745);

INSERT INTO CUSTOMER (Customer_name, Customer_address, Email, Contact_no)
VALUES ('Peter', 'New York', 'peter@yahoo.com', 9853627997);


UPDATE COURIER_STATUS
SET Status = 'Delivered';

UPDATE CUSTOMER
SET Customer_Address = 'Berlin'
WHERE Email IS NULL;

UPDATE COURIER
SET
    Weight = Weight + 30,
    Cost = Cost * 1.5
WHERE Courier_Id IN ('C001', 'C002', 'C003');

DELETE FROM COURIER_STATUS
WHERE Status = 'In Process';

DELETE FROM COURIER_STATUS
WHERE STATUS = 'Delivered' AND Delivered_Branch_ID = 'B008';

SELECT Customer_name, Customer_address, Contact_no
FROM CUSTOMER
ORDER BY Customer_name DESC;

SELECT Courier_id, From_Address, To_Address, Cost
FROM COURIER
ORDER BY Courier_id ASC;

SELECT Customer_Name, Email, Contact_No
FROM CUSTOMER
WHERE Customer_Address = 'Berlin'
ORDER BY Customer_Name DESC;

SELECT Courier_id, Booking_Date, Weight, Cost
FROM COURIER
WHERE To_Address IN ('Mackay', 'Austin')
ORDER BY Weight DESC;

SELECT courier_id, booking_date, weight, cost
FROM courier
WHERE cost BETWEEN 800 AND 1500
ORDER BY courier_id DESC;

SELECT courier_id, to_address, cost
FROM courier
WHERE from_address = 'Sydney'
  AND cost > 500
ORDER BY courier_id DESC;

SELECT customer_name, customer_address, email, contact_no
FROM customer
WHERE (customer_name LIKE 'P%' OR customer_name LIKE 'S%')
  AND email LIKE '%@gmail.%'
ORDER BY customer_name DESC;

SELECT customer_name, email, contact_no
FROM customer
WHERE customer_address != 'London'
  AND email NOT LIKE '%@yahoo.%'
ORDER BY customer_name DESC;

SELECT booking_date AS process_date FROM courier
UNION
SELECT expected_delivery_date FROM courier
UNION
SELECT actual_delivered_date FROM courier_status
ORDER BY 1;

SELECT customer_name AS entity_name FROM customer
UNION ALL
SELECT branch_location FROM branch;

SELECT
    courier_id,
    delivered_branch_id,
    actual_delivered_date + 2 AS FEEDBACK_DATE
FROM
    courier_status
WHERE
    status = 'Delivered'
ORDER BY
    FEEDBACK_DATE DESC;

SELECT MAX(weight) AS MAX_WEIGHT, MIN(weight) AS MIN_WEIGHT
FROM courier
WHERE destination = 'Washington';

SELECT
    from_address,
    AVG(weight) AS "AVERAGE_WEIGHT"
FROM
    courier
GROUP BY
    from_address
HAVING
    AVG(weight) > 5
ORDER BY
    from_address DESC;

SELECT
    contact_no,
    COUNT(*) AS "COURIER_COUNT"
FROM
    courier
GROUP BY
    contact_no
HAVING
    COUNT(*) > 1
ORDER BY
    contact_no ASC;

SELECT
    to_address,
    SUM(cost) AS total_cost
FROM
    courier
GROUP BY
    to_address
HAVING
    SUM(cost) > 1000
ORDER BY
    to_address DESC;

SELECT
    branch_id,
    MAX(weight) AS max_weight
FROM
    courier
WHERE
    EXTRACT(MONTH FROM booking_date) < 5
GROUP BY
    branch_id
ORDER BY
    branch_id;

SELECT
    UPPER(customer_name) AS NAME,
    LOWER(customer_address) AS ADDRESS
FROM
    customer
WHERE
    LENGTH(customer_address) = 6
ORDER BY
    NAME;

SELECT
    customer_name,
    SUBSTR(customer_name, 1, 3) || SUBSTR(contact_no, 1, 3) AS CUSTOMER_CODE
FROM
    customer
WHERE
    email LIKE '%@yahoo.%'
ORDER BY
    customer_address ASC;

SELECT
    customer_name,
    customer_address,
    CASE
        WHEN email IS NOT NULL THEN email
        ELSE TO_CHAR(contact_no)
        END AS CONTACT
FROM
    customer
WHERE
    SUBSTR(customer_address, 5, 1) = 'o'
ORDER BY
    customer_name DESC;

SELECT
    customer_name,
    customer_address,
    DECODE(email, NULL, 'Not available', 'Available') AS EMAIL
FROM
    customer
WHERE
    customer_address IN ('Chicago', 'Tokyo')
ORDER BY
    customer_name DESC;

SELECT
    courier_id,
    from_address,
    to_address,
    UPPER(TO_CHAR(booking_date, 'Month')) AS BOOKING_MONTH
FROM
    courier
WHERE
    weight BETWEEN 11 AND 15
ORDER BY
    courier_id DESC;

SELECT
    courier_id,
    from_address,
    to_address,
    CAST(TO_CHAR(expected_delivery_date + INTERVAL '1' MONTH, 'DD-MON-YY') AS VARCHAR2(9)) AS DELAYED_D
FROM
    courier
WHERE
    TO_CHAR(booking_date, 'Month', 'NLS_DATE_LANGUAGE=English') = 'August   '
ORDER BY
    to_address DESC;

SELECT
    courier_id,
    TO_CHAR(booking_date, 'DDMMYYYY') AS FORMATTED_DATE
FROM
    courier
WHERE
    weight < 5
ORDER BY
    courier_id DESC;

SELECT
    courier_id,
    to_address,
    weight,
    cost,
    CASE
        WHEN weight BETWEEN 1 AND 5 THEN 'Less Cost'
        WHEN weight BETWEEN 6 AND 9 THEN 'Average Cost'
        ELSE 'High Cost'
        END AS COMMENTS
FROM courier
WHERE from_address = 'Chicago'
ORDER BY to_address DESC;

SELECT
    c.Customer_Name,
    c.Contact_No,
    cr.Courier_Id
FROM
    CUSTOMER c
        JOIN
    COURIER cr ON c.Contact_No = cr.Contact_No
WHERE
    cr.Expected_Delivery_Date - cr.Booking_Date < 5
ORDER BY
    c.Customer_Name ASC;

SELECT
    cs1.Courier_Id AS COURIERI,
    cs2.Courier_Id AS COURIER2,
    cs1.Actual_Delivered_Date
FROM
    COURIER_STATUS cs1
        JOIN
    COURIER_STATUS cs2
    ON cs1.Actual_Delivered_Date = cs2.Actual_Delivered_Date
        AND cs1.Courier_Id <> cs2.Courier_Id
ORDER BY
    cs1.Actual_Delivered_Date DESC,
    cs1.Courier_Id DESC;

SELECT
    cs1.Courier_Id AS COURIERI,
    cs2.Courier_Id AS COURIER2,
    cs1.Actual_Delivered_Date
FROM
    COURIER_STATUS cs1
        JOIN
    COURIER_STATUS cs2
    ON cs1.Actual_Delivered_Date = cs2.Actual_Delivered_Date
        AND cs1.Courier_Id <> cs2.Courier_Id
ORDER BY
    cs1.Actual_Delivered_Date DESC,
    cs1.Courier_Id DESC;

SELECT
    Courier_Id,
    From_Address,
    To_Address,
    Contact_No
FROM
    Courier
WHERE
    Weight = (
        SELECT MIN(Weight) FROM Courier
    )
ORDER BY
    From_Address ASC;

SELECT
    c.Courier_Id,
    b1.Contact_No AS CONTACT_FROM_BRANCH,
    b2.Contact_No AS CONTACT_TO_BRANCH
FROM
    COURIER c
        JOIN
    COURIER_STATUS cs ON c.Courier_Id = cs.Courier_Id
        JOIN
    BRANCH b1 ON c.Branch_ID = b1.Branch_ID
        JOIN
    BRANCH b2 ON cs.Delivered_Branch_ID = b2.Branch_ID
ORDER BY
    c.Courier_Id DESC;

SELECT
    b.Branch_ID,
    b.Branch_Location,
    b.Contact_No
FROM
    BRANCH b
WHERE
    b.Branch_ID NOT IN (
        SELECT DISTINCT Delivered_Branch_ID
        FROM COURIER_STATUS
        WHERE Delivered_Branch_ID IS NOT NULL
    )
ORDER BY
    b.Branch_Location DESC;

SELECT
    b.Branch_ID,
    b.Branch_Location,
    b.Contact_No
FROM
    BRANCH b
WHERE
    b.Branch_ID NOT IN (
        SELECT DISTINCT Delivered_Branch_ID
        FROM COURIER_STATUS
        WHERE Delivered_Branch_ID IS NOT NULL
    )
ORDER BY
    b.Branch_Location DESC;


SELECT
    staff_name
FROM
    Staff
WHERE
    staff_id NOT IN (
        SELECT DISTINCT staff_id
        FROM Subject
        WHERE staff_id IS NOT NULL
    )
ORDER BY
    staff_name ASC;

SELECT
    c.customer_name,
    c.contact_no,
    cs.courier_id
FROM
    customer c
        JOIN
    courier cr ON cr.contact_no = c.contact_no
        JOIN
    courier_status cs ON cs.courier_id = cr.courier_id
WHERE
    cs.status != 'Delivered'
ORDER BY
    c.customer_name;

SELECT
    b.branch_id,
    b.branch_location,
    b.contact_no
FROM
    branch b
        JOIN
    courier c ON b.branch_id = c.branch_id
GROUP BY
    b.branch_id, b.branch_location, b.contact_no
HAVING
    COUNT(*) = (
        SELECT MAX(courier_count)
        FROM (
                 SELECT COUNT(*) AS courier_count
                 FROM courier
                 GROUP BY branch_id
             )
    )
ORDER BY
    b.branch_id ASC;

SELECT
    s.student_name
FROM
    student s
        JOIN
    mark m ON s.student_id = m.student_id
        JOIN
    subject sub ON m.subject_id = sub.subject_id
WHERE
    sub.subject_name = 'Software Engineering'
  AND m.value = (
    SELECT
        MAX(m1.value)
    FROM
        mark m1
            JOIN
        subject sub1 ON m1.subject_id = sub1.subject_id
    WHERE
        sub1.subject_name = 'Software Engineering'
)
ORDER BY
    s.student_name;

SELECT
    s.student_name
FROM
    student s
WHERE
    NOT EXISTS (
        SELECT 1
        FROM mark m
        WHERE m.student_id = s.student_id
          AND m.value <= 50
    )
ORDER BY
    s.student_name;

SELECT
    d.department_name
FROM
    department d
        JOIN
    student s ON d.department_id = s.department_id
GROUP BY
    d.department_name
HAVING
    COUNT(*) = (
        SELECT MIN(student_count)
        FROM (
                 SELECT COUNT(*) AS student_count
                 FROM student
                 GROUP BY department_id
             )
    )
ORDER BY
    d.department_name;

SELECT
    s.student_name,
    d.department_name,
    m.value AS marks
FROM
    student s
        JOIN
    department d ON s.department_id = d.department_id
        JOIN
    mark m ON s.student_id = m.student_id
        JOIN
    subject sub ON m.subject_id = sub.subject_id
WHERE
    sub.subject_name = 'Software Engineering'
  AND m.value = (
    SELECT
        MAX(m1.value)
    FROM
        mark m1
            JOIN
        subject sub1 ON m1.subject_id = sub1.subject_id
    WHERE
        sub1.subject_name = 'Software Engineering'
)
ORDER BY
    s.student_name;