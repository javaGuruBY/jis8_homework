mysqldump -h 127.0.0.1 -u root JIS > jis8.sql -p
mysql -h 127.0.0.1 -u root JIS < jis8.sql -p
mysqldump -h 127.0.0.1 -u root JIS user > jis8.user.sql -p


mysqldump JIS > jis_2020-05-01T23.00.00.sql
mysqldump -h 127.0.0.1 -u userjis jis12 > jis12.sql -p
mysql -h 127.0.0.1 -u userjis jis12 < jis12.sql -p
mysql -h 127.0.0.1 -u userjis --all-databases < jis12.sql -p

mysqldump -u username -ppassword database_name table_name > single_table_dump.sql
mysqldump -u username -ppassword database_name table_name --where="date_created='2013-06-25'" > few_rows_dump.sql