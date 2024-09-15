-- Create the database and use it
CREATE DATABASE Khata;
USE Khata;
-- Create the signup table
CREATE TABLE signup (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    password VARCHAR(30),
    email VARCHAR(60),
    DOB DATE,
    balance DECIMAL(10, 2) DEFAULT 0 -- Adding balance column for tracking
);

-- Create the deposit table with a unique constraint on method per user
CREATE TABLE deposit (
    deposit_id INT AUTO_INCREMENT PRIMARY KEY,
    id INT,
    amount DECIMAL(10, 2),
    method VARCHAR(50),
    date_of_deposit DATE,
    user_id int
);


-- Create the withdrawal table without the CHECK constraint
CREATE TABLE withdrawl (
    withdrawal_id INT AUTO_INCREMENT PRIMARY KEY,
    id INT,
    amount DECIMAL(10, 2),
    method VARCHAR(50),
    date_of_withdrawal DATE,
    user_id int
);

-- Create the details table
CREATE TABLE details (
    amount DECIMAL(10, 2),
    date_of_transaction DATE,
    method VARCHAR(50),
    type_of_transaction varchar(50),
    user_id int
);
CREATE TRIGGER insert_deposit_details
AFTER INSERT ON deposit
FOR EACH ROW
INSERT INTO details ( amount, date_of_transaction, method,type_of_transaction,user_id)
VALUES ( NEW.amount, NEW.date_of_deposit, NEW.method,"deposit",NEW.user_id);

CREATE TRIGGER insert_withdrawal_details
AFTER INSERT ON withdrawl
FOR EACH ROW
INSERT INTO details ( amount, date_of_transaction, method,type_of_transaction,user_id)
VALUES ( NEW.amount, NEW.date_of_withdrawal, NEW.method,"withdrawal",NEW.user_id);

create table Admins(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Amount varchar(50),
    Name varchar(50),
    Method varchar(50)
);

select id from signup where name="muskan";
-- Optional: Query the tables to verify their structure
SELECT * FROM signup;
SELECT * FROM withdrawl;
SELECT * FROM deposit;
SELECT * FROM details;