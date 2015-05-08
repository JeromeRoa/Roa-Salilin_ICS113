CREATE DATABASE HOTEL_DB;
USE HOTEL_DB;
CREATE TABLE Reserved (username VARCHAR(30), lastname VARCHAR(30), firstname VARCHAR(30), middlename VARCHAR(30),
				email VARCHAR(30), contact VARCHAR(30), floor VARCHAR(30), room VARCHAR(30), 
                cin  VARCHAR(30), cout  VARCHAR(30), guest  VARCHAR(30), adult  VARCHAR(30), children  VARCHAR(30),
                credit  VARCHAR(30), bank  VARCHAR(30));


delimiter $$
CREATE PROCEDURE setUser(IN username1 VARCHAR(30), IN lastname1 VARCHAR(30), IN firstname1 VARCHAR(30), IN middlename1 VARCHAR(30),
				 IN email1 VARCHAR(30),  IN contact1 VARCHAR(30), IN floor1 VARCHAR(30), IN room1 VARCHAR(30), 
                 IN cin1  VARCHAR(30), IN cout1  VARCHAR(30), IN guest1 VARCHAR(30), IN adult1 VARCHAR(30), IN children1 VARCHAR(30),
                 IN credit1 VARCHAR(30), IN bank1 VARCHAR(30))
	BEGIN
		INSERT INTO Reserved VALUES (username1, lastname1, firstname1, middlename1, email1, contact1, floor1, room1, cin1, cout1 , guest1, adult1, children1, credit1, bank1);
	END$$
DELIMITER ;


SELECT * FROM Reserved;
