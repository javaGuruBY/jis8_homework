create table `ORDER`
(
    id      VARCHAR(36)                         not null,
    created TIMESTAMP default CURRENT_TIMESTAMP not null
);

create table PRODUCT
(
    id    VARCHAR(36)  not null,
    name  VARCHAR(255) null,
    price DECIMAL      null
);

create table ORDER_TO_PRODUCT
(
    order_id   VARCHAR(36) null,
    product_id VARCHAR(36) null,
    quantity   INT         null
);

INSERT INTO `ORDER`
VALUES ('ord1', '2021-03-12 22:23:37'),
       ('ord2', '2021-03-11 22:23:37'),
       ('ord3', '2021-03-12 22:23:37'),
       ('ord4', '2021-03-10 22:23:37'),
       ('ord5', '2021-03-09 22:23:37'),
       ('ord6', '2021-02-12 22:23:37'),
       ('ord7', '2020-12-31 21:00:00'),
       ('ord8', '2021-04-12 22:23:37'),
       ('ord9', '2021-03-20 22:23:37'),
       ('ord10', '2021-03-21 22:23:37'),
       ('ord11', '2021-03-21 22:12:37'),
       ('ord12', '2021-03-22 02:12:37'),
       ('ord13', '2021-03-22 08:12:33');

INSERT INTO `PRODUCT`
VALUES ('prod1', 'java intensive', 999),
       ('prod2', 'java 1', 299),
       ('prod3', 'java 2', 599),
       ('prod4', 'rpa', 0),
       ('prod5', 'pre intensive', 0);

INSERT INTO `ORDER_TO_PRODUCT`
VALUES ('ord1', 'prod1', 1),
       ('ord1', 'prod2', 5),
       ('ord2', 'prod3', 6),
       ('ord4', 'prod4', 33),
       ('ord5', 'prod1', 5),
       ('ord6', 'prod2', 7),
       ('ord7', 'prod3', 3),
       ('ord8', 'prod4', 10),
       ('ord9', 'prod1', 2),
       ('ord10', 'prod2', 5),
       ('ord10', 'prod3', 8),
       ('ord3', 'prod1', 2),
       ('ord11', 'prod1', 1),
       ('ord11', 'prod2', 2),
       ('ord12', 'prod1', 1),
       ('ord12', 'prod2', 1),
       ('ord13', 'prod1', 1),
       ('ord13', 'prod2', 1);
