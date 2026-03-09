SET SQL_SAFE_UPDATES = 0;

-- UC1: Create AddressBookService Database
CREATE DATABASE AddressBookService;
USE AddressBookService;

-- UC2: Create AddressBook Table
CREATE TABLE AddressBook (
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    address VARCHAR(200),
    city VARCHAR(50),
    state VARCHAR(50),
    zip VARCHAR(10),
    phone VARCHAR(15),
    email VARCHAR(100)
);

-- UC3: Insert Contacts
INSERT INTO AddressBook VALUES
('John','Doe','12 Street','Chennai','Tamil Nadu','600001','9876543210','john@gmail.com'),
('Jane','Smith','45 Road','Bangalore','Karnataka','560001','8765432109','jane@gmail.com'),
('Rahul','Sharma','78 Avenue','Chennai','Tamil Nadu','600002','7654321098','rahul@gmail.com');

-- UC4: Edit Contact
UPDATE AddressBook
SET phone='9999999999'
WHERE first_name='John' AND last_name='Doe';

-- UC5: Delete Person
DELETE FROM AddressBook
WHERE first_name='Jane' AND last_name='Smith';

-- UC6: Retrieve by City
SELECT * FROM AddressBook
WHERE city='Chennai';

-- UC7: Count by City
SELECT city, COUNT(*) as size
FROM AddressBook
GROUP BY city;

-- UC8: Sort Alphabetically
SELECT * FROM AddressBook
WHERE city='Chennai'
ORDER BY first_name;

-- UC9: Add Type Column
ALTER TABLE AddressBook
ADD type VARCHAR(50);

-- Update Types
UPDATE AddressBook SET type='Family' WHERE first_name='John';
UPDATE AddressBook SET type='Friends' WHERE first_name='Rahul';

-- UC10: Count by Type
SELECT type, COUNT(*) as count
FROM AddressBook
GROUP BY type;

-- UC11: Normalize for Multiple Types

CREATE TABLE Type (
    type_id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50)
);

INSERT INTO Type(type_name)
VALUES ('Family'), ('Friends'), ('Profession');

CREATE TABLE ContactType (
    contact_id INT,
    type_id INT,
    PRIMARY KEY(contact_id,type_id)
);

-- UC13 Example Query using JOIN
SELECT t.type_name, COUNT(ct.contact_id)
FROM Type t
JOIN ContactType ct
ON t.type_id = ct.type_id
GROUP BY t.type_name;