select now();
select * from user;
SELECT id, login, active FROM user;

SELECT id, login FROM user ORDER BY id LIMIT 3;
SELECT id, login FROM user ORDER BY id asc LIMIT 9, 3;
SELECT COUNT(*) FROM user;

select id, login from user where id < 10;
select id, login from user where id = 10;
SELECT id, login, birth FROM user WHERE birth BETWEEN '2019-01-01' AND '2020-05-01';
select id, login, birth from user where birth >= '2019-01-01';
SELECT id, login, birth FROM user WHERE dayofweek(birth) = 2; -- DAY(), YEAR(), QUARTER(), MONTH();
SELECT id, login FROM user WHERE id IN (5, 6, 7, 8, 9, 10) order by id asc;
SELECT id, login FROM user WHERE id NOT IN (5, 6, 7, 8, 9, 10) order by id asc;
SELECT id, bio FROM user WHERE bio LIKE '_ava Dev%';

-- union
SELECT id, login, birth FROM user WHERE birth BETWEEN '2019-01-01' AND '2020-05-01';
SELECT id, login, birth FROM user WHERE id IN (2, 4, 3, 5);

SELECT id, login, birth FROM user WHERE birth BETWEEN '2019-01-01' AND '2020-05-01'
UNION
SELECT id, login, birth FROM user WHERE id IN (2, 4, 3, 5)
ORDER BY id;

SELECT id, login, birth FROM user WHERE birth BETWEEN '2019-01-01' AND '2020-05-01'
UNION ALL
SELECT id, login, birth FROM user WHERE id IN (2, 4, 3, 5)
ORDER BY id;

select id, login, image from user where image is null;

select distinct bio from user;
SELECT distinct LENGTH(login) as alias FROM user order by alias asc ;
SELECT bio, avg(LENGTH(login)) as login_length FROM user group by bio;
select bio, count(bio) from user group by bio;