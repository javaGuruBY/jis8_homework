CREATE TABLE myuser
(
    id         SERIAL,
    login      VARCHAR(32) NOT NULL UNIQUE,
    name       VARCHAR(255),
    bio        TEXT,
    image1     bytea,
    birth      DATE,
    registered TIMESTAMP,
    updated    TIMESTAMP,
    gender     CHAR,
    likes      INT,
    credit     DEC(19, 2),
    active     BOOLEAN DEFAULT FALSE
);

ALTER TABLE myuser RENAME TO appuser;
ALTER TABLE appuser ADD email VARCHAR (23);
ALTER TABLE appuser ALTER COLUMN email TYPE TEXT;
ALTER TABLE appuser RENAME COLUMN email TO e_mail;
-- ALTER TABLE appuser MODIFY e_mail VARCHAR(32) AFTER id;  //MYSQL ONLY
-- ALTER TABLE appuser MODIFY e_mail VARCHAR(32) FIRST;     //MYSQL ONLY
ALTER TABLE appuser DROP e_mail;

INSERT INTO appuser (login) VALUES ('maksim');
INSERT INTO "appuser" (login) VALUES ('vaksim');
INSERT INTO appuser ("login") VALUES ('baksim');
INSERT INTO appuser (login) VALUES ('It''s an apple' );
INSERT INTO appuser (login, active, credit) VALUES ('myinfo', true,  45.005);
