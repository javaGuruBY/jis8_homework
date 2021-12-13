CREATE TABLE `boys`
(
    `boy_id` int(2) NOT NULL AUTO_INCREMENT,
    `boy`    varchar(50) DEFAULT NULL,
    PRIMARY KEY (`boy_id`)
);
CREATE TABLE `toys`
(
    `toy_id` int(2) NOT NULL AUTO_INCREMENT,
    `toy`    varchar(50) DEFAULT NULL,
    PRIMARY KEY (`toy_id`)
);
INSERT INTO boys (boy)
VALUES ('David'),
       ('Maks'),
       ('Vlad'),
       ('Anton');
INSERT INTO toys (toy)
VALUES ('hula hoop'),
       ('solder'),
       ('boll'),
       ('bycicle'),
       ('stick');

CREATE TABLE `boysWithToys`
(
    `boy_id` int(2) NOT NULL AUTO_INCREMENT,
    `boy`    varchar(50) DEFAULT NULL,
    `toy_id` int(2)      DEFAULT NULL,
    PRIMARY KEY (`boy_id`)
);
INSERT INTO boysWithToys (boy, toy_id)
VALUES ('David', 2),
       ('Maks', 2),
       ('Vlad', 1),
       ('Anton', NULL);

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         NATURAL JOIN toys;

# In this example I use toy_id as a teamleader id
SELECT developers.boy as developer, teamleaders.boy as teamlead
FROM boysWithToys as developers JOIN
     boysWithToys as teamleaders on developers.toy_id = teamleaders.boy_id;

ALTER TABLE toys
    CHANGE toy_id id int(2) NOT NULL AUTO_INCREMENT;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         INNER JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         CROSS JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         LEFT OUTER JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

-- Записи без подчиненных
SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         LEFT OUTER JOIN
     toys
     ON boysWithToys.toy_id = toys.id
where toys.id is null;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         RIGHT OUTER JOIN
     toys
     ON boysWithToys.toy_id = toys.id
where boysWithToys.boy is null;



SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         RIGHT OUTER JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         LEFT OUTER JOIN
     toys
     ON boysWithToys.toy_id = toys.id
UNION
SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         RIGHT OUTER JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         INNER JOIN
     toys
     ON boysWithToys.toy_id <> toys.id;

CREATE TABLE boysAndToysTable AS
SELECT boysWithToys.boy, toys.toy
FROM boysWithToys
         JOIN
     toys
     ON boysWithToys.toy_id = toys.id;

CREATE TABLE boyToToy AS
SELECT boy_id, toy_id FROM boysWithToys WHERE toy_id IS NOT NULL;

INSERT INTO boyToToy VALUES (1,3), (2,3), (2,1), (1,1);

SELECT boys.boy, toys.toy
FROM boys
         JOIN boyToToy ON (boys.boy_id = boyToToy.boy_id)
         JOIN toys ON (boyToToy.toy_id = toys.id);

# CONSTRAINTS
CREATE TABLE `boysWithToys_RESTRICT`
(
    `boy_id` int(2) NOT NULL AUTO_INCREMENT,
    `boy`    varchar(50) DEFAULT NULL,
    `toy_id` int(2),
    PRIMARY KEY (`boy_id`),
    CONSTRAINT toy_id_equality FOREIGN KEY (toy_id) REFERENCES toys (id)
);

CREATE TABLE `boysToToys_RESTRICT`
(
    `id` int NOT NULL AUTO_INCREMENT,
    `boy_id` int(2),
    `toy_id` int(2),
    PRIMARY KEY (`id`),
    CONSTRAINT toy_id_key FOREIGN KEY (toy_id) REFERENCES toys (id),
    CONSTRAINT boy_id_key FOREIGN KEY (boy_id) REFERENCES boys (boy_id)
);

SELECT boys.boy_id,  boys.boy, toys.id, toys.toy
FROM boys
         JOIN boysToToys_RESTRICT ON (boys.boy_id = boysToToys_RESTRICT.boy_id)
         JOIN toys ON (boysToToys_RESTRICT.toy_id = toys.id);

SELECT boys.boy_id,  boys.boy, toys.id, toys.toy
FROM boys
         NATURAL JOIN boysToToys_RESTRICT
         NATURAL JOIN toys;

ALTER TABLE boysToToys_RESTRICT DROP CONSTRAINT toy_id_key;
ALTER TABLE boysToToys_RESTRICT DROP CONSTRAINT boy_id_key;

ALTER TABLE boysToToys_RESTRICT ADD CONSTRAINT toy_id_key
    FOREIGN KEY (toy_id) REFERENCES toys (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;
ALTER TABLE boysToToys_RESTRICT ADD CONSTRAINT boy_id_key
    FOREIGN KEY (boy_id) REFERENCES boys (boy_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE boysToToys_RESTRICT ADD CONSTRAINT toy_id_key
    FOREIGN KEY (toy_id) REFERENCES toys (id)
        ON UPDATE SET NULL
        ON DELETE SET NULL ;
ALTER TABLE boysToToys_RESTRICT ADD CONSTRAINT boy_id_key
    FOREIGN KEY (boy_id) REFERENCES boys (boy_id)
        ON UPDATE SET NULL
        ON DELETE SET NULL;

SELECT *
FROM boysToToys_RESTRICT
         NATURAL JOIN boys
         NATURAL JOIN toys;

SELECT b.boy_id, boy, toy_id, toy
FROM boysToToys_RESTRICT
         INNER JOIN boys b on boysToToys_RESTRICT.boy_id = b.boy_id
         INNER JOIN toys t on boysToToys_RESTRICT.toy_id = t.id;

CREATE TABLE COMPANY
(
    company_id   INT NOT NULL,
    company_name VARCHAR(50),
    PRIMARY KEY (company_id)
) ENGINE = INNODB;

CREATE TABLE COMPANY_USERS
(
    user_id    INT,
    user_name  VARCHAR(50),
    company_id INT,
    INDEX company_id_idx (company_id),
    FOREIGN KEY (company_id) REFERENCES COMPANY (company_id)
) ENGINE = INNODB;
