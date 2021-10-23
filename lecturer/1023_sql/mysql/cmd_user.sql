CREATE USER jis@'localhost' IDENTIFIED BY '1234';
GRANT ALL ON JIS.* TO jis@'localhost';

CREATE USER jis@'%' IDENTIFIED BY '1234';
GRANT ALL ON JIS.* TO jis@'%';

DROP USER jis@'localhost';
SELECT User FROM mysql.user;