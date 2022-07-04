CREATE TABLE Sample10 (
	no 			INT(11)		DEFAULT NULL,
	name 		ARCHAR(20) 	DEFAULT NULL,
	birthday 	DATE		DEFAULT NULL,
	adress 		VARCHAR(40) DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '후니', '1996-08-27', '청천리주민');
INSERT INTO Sample10 VALUES (2, '훈쓰', '1996-08-27', '하양주민');
INSERT INTO Sample10 VALUES (3, '히정', '1999-01-13', '용계동주민');

CREATE TABLE CUSTOMER (
	cid 	  BIGINT 	  PRIMARY KEY AUTO_INCREMENT,
	name 	  VARCHAR(20) NOT NULL,
	ssn		  VARCHAR(14) NOT NULL,
	phone	  VARCHAR(14) NOT NULL,
	id		  VARCHAR(16) NOT NULL,
	password  VARCHAR(20) NOT NULL,
	regDate   TIMESTAMP	  NOT NULL   DEFAULT CURRENT_TIMESTAMP
)  AUTO_INCREMENT = 1001;

ALTER TABLE Customer change Id userId VARCHAR(16) NOT NULL;

SELECT * FROM CUSTOMER;
INSERT INTO CUSTOMER(name,ssn,phone,id,password) 
VALUES ('후니', '960827-1234567', '010-6555-1349','hoon827','1234');
INSERT INTO CUSTOMER(name,ssn,phone,id,password) 
VALUES ('정이', '990113-1234567', '010-12374-1349','phg0675','123456');
INSERT INTO CUSTOMER(name,ssn,phone,id,password) 
VALUES ('준호', '900125-1234567', '010-1990-0125','jh0125','123445');

UPDATE CUSTOMER SET name='박희정', phone='010-7211-0675' where CID = 1003;
UPDATE CUSTOMER SET ssn='990115-1234567' WHERE cid = 1003;

DELETE from customer where cid = 1001;

DROP TABLE Sample10;

create table Account (
	aid      		bigint   		primary key auto_increment, 
	accountNum		varchar(11)		not null,
	balance 		double 			not null 	default 0.0,
	interstRate		double 			not null 	default 0.0,
	overdraft		double 			not null 	default 0.0,
	accountType 	char(1)			not null 	default 's',
	customerId		bigint 			not null,
	regDate   		TIMESTAMP	  	NOT NULL   	DEFAULT CURRENT_TIMESTAMP,
	constraint	Account_customerId_FX foreign key(customerId) references Customer(cid)
)auto_increment = 3001;

select * from account;
insert into account(accountNum,balance,interstRate,customerId)
value ('123-156','300.0','2.5','1002');
/*java.sql.* /javax.sql.* jdbc와 관련됨  */

select * from Account, Customer
where Account,customerId - Customer, cid AND Customer, ssn = '951204-4567897';

select * from Account a inner join Customer c on a.customerId = c.cid;
select * from Account a inner join Customer c on a.customerId = c.cid;
where c.ssn '990113-2567894'