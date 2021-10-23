CREATE TABLE user
(
    id         INT AUTO_INCREMENT,
    login      VARCHAR(32) NOT NULL UNIQUE,
    name       VARCHAR(255),
    bio        TEXT,
    image      BLOB,
    birth      DATE,
    registered DATETIME,
    updated    TIMESTAMP,
    gender     CHAR,
    likes      INT,
    credit     DEC(19, 2),
    active     BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (id)
);

DESCRIBE user;
SHOW CREATE TABLE user;

INSERT INTO user (`login`) VALUES ('maksim');
INSERT INTO `user` (login) VALUES ('vasim');

INSERT INTO user (`login`) VALUES ("It's an apple" );
INSERT INTO `user` (login) VALUES ('vasim');

INSERT INTO user (`login`) VALUES ('maksim');
INSERT INTO `user` (login) VALUES ('vasim');
INSERT INTO `user` (login) VALUES ("It's an apple" );
INSERT INTO `user` (login) VALUES ('He sad "I am ok" he sad');
INSERT INTO `user` (login) VALUES ('He sad "I\'m ok" he sad');

ALTER TABLE user ADD email VARCHAR (23);
ALTER TABLE user MODIFY email TEXT;
ALTER TABLE user CHANGE COLUMN email e_mail VARCHAR(32);
ALTER TABLE user MODIFY e_mail VARCHAR(32) AFTER id;
ALTER TABLE user MODIFY e_mail VARCHAR(32) FIRST;
ALTER TABLE user DROP e_mail;
ALTER TABLE user RENAME TO abuser;

INSERT INTO user (login, birth) VALUES ('v1', '2020-05-29');
INSERT INTO user (login, registered) VALUES ('v2', '2020-05-29');
INSERT INTO user (login, registered) VALUES ('v3', '2020-05-20T23:27:38');
INSERT INTO user (login, registered) VALUES ('v4', '2020-05-20 23:27:38');


INSERT INTO user (login, birth) VALUES ('v1', '2020-05-29');
INSERT INTO user (login, birth) VALUES ('f', '06.06.20');
INSERT INTO user (login, birth) VALUES ('v', '06.06.2020');
INSERT INTO user (login, birth) VALUES ('v1', 2020.05.29); //error
INSERT INTO user (login, birth) VALUES ('v0', '2020.05.29');

INSERT INTO user (login, registered) VALUES ('v5', NOW());
INSERT INTO user (login, registered) VALUES ('v5', NOW() - INTERVAL 1 HOUR);

# To create a random decimal number between two values (range), you can use the following formula:
# SELECT RAND()*(b-a)+a;
# Where a is the smallest number and b is the largest number that you want to generate a random number for.
