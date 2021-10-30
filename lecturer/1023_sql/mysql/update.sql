select id, login, gender, likes from user where id = 10;
UPDATE user SET
 gender = 'F',
 likes = 0
where id = 10;

START TRANSACTION;
    UPDATE user SET
        gender = 'M',
        likes = 9999
    WHERE id=10;
ROLLBACK; -- COMMIT
select id, login, gender, likes from user where id = 10;

