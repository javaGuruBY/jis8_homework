CREATE TABLE JIS.user
(
    id         INT AUTO_INCREMENT,
    login      VARCHAR(32) NOT NULL UNIQUE,
    name       VARCHAR(255),
    bio        TEXT,
    image      BLOB,
    birth      DATE,
    registered TIMESTAMP,
    updated    TIMESTAMP,
    gender     CHAR,
    likes      INT,
    credit     DEC(19, 2),
    active     BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (id)
);
