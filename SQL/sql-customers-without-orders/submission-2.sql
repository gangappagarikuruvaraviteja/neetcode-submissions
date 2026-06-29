-- Write your query below
-- select c.name from customers c join orders o on c.id=o.customer_id where customer_id is null;
select name
from customers
where id not in(select customer_id from orders);