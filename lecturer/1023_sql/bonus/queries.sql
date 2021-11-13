select count(*), avg(price), sum(price), max(price), min(price)
from PRODUCT;
select count(*)   as 'КОЛИЧЕСТВО',
       avg(price) as 'СРЕДНЯЯ ЦЕНА',
       max(price) as 'МАКСИМАЛЬНАЯ ЦЕНА',
       min(price) as 'МИНИМАЛЬНАЯ ЦЕНА',
       sum(price) as 'СУММА ЦЕН ПРОДУКТОВ'
from PRODUCT;

# Print name of most/least expensive product?
select name, price
from PRODUCT
where price = (select min(price) from PRODUCT);
# or (wrong)
select price, name
from PRODUCT
order by price desc
limit 1;
# or (wrong)
select price, name
from PRODUCT
order by price asc
limit 1;

# Find second/third max value
#1 (this will works only for unique)
select *
from PRODUCT
order by price DESC
LIMIT 1,1;
# 2 (this will works only for unique)
select *, (select count(*) from PRODUCT as right_product where right_product.price < left_rpoduct.price)
from PRODUCT as left_rpoduct;
select *
from PRODUCT as prod_left
WHERE (2) = (
    select count(prod_right.price)
    from PRODUCT as prod_right
    where (prod_right.price <= prod_left.price));
# 3
select *
from PRODUCT
where price > (select min(price) from PRODUCT)
order by price
limit 1;
# third min
create view PRODUCT_SECOND_MIN_PRICE as
select *
from PRODUCT
where price > (select min(price) from PRODUCT)
order by price
limit 1;
select *
from PRODUCT
where price > (select PRODUCT_SECOND_MIN_PRICE.price from PRODUCT_SECOND_MIN_PRICE)
order by price asc
limit 1;
# n min (in ex n = 2)
select *
from PRODUCT
where price = (select distinct price from PRODUCT order by price asc limit 2, 1);

# print orders
SELECT *
FROM PRODUCT
         join ORDER_TO_PRODUCT ON PRODUCT.id = ORDER_TO_PRODUCT.product_id
         join `ORDER` ON `ORDER`.ID = ORDER_TO_PRODUCT.order_id;

SELECT order_id, created, sum(price)
FROM PRODUCT
         join ORDER_TO_PRODUCT ON PRODUCT.id = ORDER_TO_PRODUCT.product_id
         join `ORDER` ON `ORDER`.ID = ORDER_TO_PRODUCT.order_id
group by order_id, created
having sum(price) = 0;

SELECT order_id, created, sum(price)
FROM PRODUCT
         join ORDER_TO_PRODUCT ON PRODUCT.id = ORDER_TO_PRODUCT.product_id
         join `ORDER` ON `ORDER`.ID = ORDER_TO_PRODUCT.order_id
group by created, order_id
with rollup;

CREATE VIEW ORDER_DETAILS AS
SELECT order_id,
       created            as order_date,
       product_id,
       name               as product_name,
       price,
       quantity,
       (price * quantity) as total_for_products
FROM PRODUCT
         join ORDER_TO_PRODUCT ON PRODUCT.id = ORDER_TO_PRODUCT.product_id
         join `ORDER` ON `ORDER`.ID = ORDER_TO_PRODUCT.order_id
order by order_date, order_id;

select order_id, sum(total_for_products) as order_total
from ORDER_DETAILS
group by order_id;

select order_id,
       order_date              as date,
       product_name,
       sum(price)              as price,
       sum(quantity)           as quantity,
       sum(total_for_products) as total
FROM ORDER_DETAILS
GROUP BY order_id, product_name
with rollup;

# Select best sellers by total income for every day.
create view TOTAL_DAILY_PRODUCTS_INCOME as
select date(order_date) as date, product_id, sum(total_for_products) as sum
from ORDER_DETAILS
group by date, product_id
order by date;

select right_total.product_id, right_total.date, max(left_total.sum) as best_sold
from TOTAL_DAILY_PRODUCTS_INCOME as left_total
         join TOTAL_DAILY_PRODUCTS_INCOME as right_total on left_total.sum = right_total.sum
group by date;

select right_total.product_id, name, right_total.date, max(left_total.sum) as best_sold
from TOTAL_DAILY_PRODUCTS_INCOME as left_total
         join TOTAL_DAILY_PRODUCTS_INCOME as right_total on left_total.sum = right_total.sum
         join PRODUCT OD on left_total.product_id = OD.id
group by date
having date = '2020-12-31';

select right_total.product_id, name, right_total.date, max(left_total.sum) as best_sold
from TOTAL_DAILY_PRODUCTS_INCOME as left_total
         join TOTAL_DAILY_PRODUCTS_INCOME as right_total on left_total.sum = right_total.sum
         join PRODUCT OD on left_total.product_id = OD.id
group by date
having quarter(date) = 2
   and year(date) = 2021;

# (in one query, product_id and name is any_value)
select date(created) as date, product_id, name, max(price * OTP.quantity)
from PRODUCT
         join ORDER_TO_PRODUCT OTP on PRODUCT.id = OTP.product_id
         join `ORDER` O on OTP.order_id = O.id
group by date
having date = '2020-12-31';
