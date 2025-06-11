use books;

CREATE TABLE Authors (
    AuthorID INT PRIMARY KEY,
    AuthorName VARCHAR(100),
    Country VARCHAR(50)
);


CREATE TABLE Publishers (
    PublisherID INT PRIMARY KEY,
    PublisherName VARCHAR(100),
    City VARCHAR(50)
);


CREATE TABLE Books (
    BookID INT PRIMARY KEY,
    Title VARCHAR(150),
    AuthorID INT,
    PublisherID INT,
    Genre VARCHAR(50),
    PublicationYear INT,
    FOREIGN KEY (AuthorID) REFERENCES Authors(AuthorID),
    FOREIGN KEY (PublisherID) REFERENCES Publishers(PublisherID)
);


INSERT INTO Authors (AuthorID, AuthorName, Country) VALUES
(1, 'Jane Austen', 'United Kingdom'),
(2, 'Gabriel Garcia Marquez', 'Colombia'),
(3, 'Haruki Murakami', 'Japan'),
(4, 'Toni Morrison', 'United States'),
(5, 'Chimamanda Ngozi Adichie', 'Nigeria');


INSERT INTO Publishers (PublisherID, PublisherName, City) VALUES
(1, 'Penguin Books', 'London'),
(2, 'Random House', 'New York'),
(3, 'Vintage Books', 'New York'),
(4, 'Bloomsbury', 'London');


INSERT INTO Books (BookID, Title, AuthorID, PublisherID, Genre, PublicationYear) VALUES
(1, 'Pride and Prejudice', 1, 1, 'Romance', 1813),
(2, 'One Hundred Years of Solitude', 2, 2, 'Magical Realism', 1967),
(3, 'Norwegian Wood', 3, 3, 'Literary Fiction', 1987),
(4, 'Beloved', 4, 2, 'Historical Fiction', 1987),
(5, 'Half of a Yellow Sun', 5, 4, 'Historical Fiction', 2006),
(6, 'Sense and Sensibility', 1, 1, 'Romance', 1811),
(7, 'Kafka on the Shore', 3, 3, 'Magical Realism', 2002);

SELECT b.Title, b.Genre, b.PublicationYear, a.AuthorName, a.Country
FROM Books b
JOIN Authors a ON b.AuthorID = a.AuthorID
ORDER BY b.PublicationYear;

SELECT a.AuthorName, COUNT(b.BookID) AS BookCount
FROM Authors a
LEFT JOIN Books b ON a.AuthorID = b.AuthorID
GROUP BY a.AuthorName
HAVING COUNT(b.BookID) > 0
ORDER BY BookCount DESC, a.AuthorName;

SELECT b.Title, a.AuthorName, b.PublicationYear
FROM Books b
JOIN Authors a ON b.AuthorID = a.AuthorID
WHERE b.Genre = 'Magical Realism'
ORDER BY b.Title;

SELECT b.Title, a.AuthorName, p.PublisherName, b.PublicationYear
FROM Books b
JOIN Authors a ON b.AuthorID = a.AuthorID
JOIN Publishers p ON b.PublisherID = p.PublisherID
WHERE b.PublicationYear > 1980
ORDER BY b.PublicationYear DESC;