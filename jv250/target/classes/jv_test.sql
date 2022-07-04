CREATE TABLE Customer (
	no			INT(10)		NOT NULL,
	name 		ARCHAR(20) 	NOT NULL,
	ssn			VARCHAR(14) NOT NULL,
	regDate   	TIMESTAMP	NOT NULL   DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Customer(name,ssn)
VALUES('James Bond', '900101-1234567');

UPDATE Customer SET name='Jason Bourne' WHERE CID = 1002;
DELETE FROM Customer WHERE cid = 1002;

CREATE TABLE Account (
	aid 			bigint 		PRIMARY KEY auto_increment, 
	accType			CHAR(1)		NOT NULL 	DEFAULT 's',
	balance 		DOUBLE		NOT NULL 	DEFAULT 0.0,
	interestRate	DOUBLE		NOT NULL 	DEFAULT 0.0,
	overdftAmount   DOUBLE		NOT NULL 	DEFAULT 0.0,
	customerId		bigint 	 	NOT NULL,
	regDate			TIMESTAMP	NOT NULL   	DEFAULT CURRENT_TIMESTAMP,
);

INSERT INTO Account(accType,balance,interestRate,overdraft,cutomerId) 
VALUES ('C', '2000.0','0.03', '0.0', '1001');
SELECT accType,balance FROM Account WHERE aid =3001;