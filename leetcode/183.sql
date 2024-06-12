
# Write your MySQL query statement below

select name as Customers
from Customers as C
where C.id not in (select customerId
from Orders );

/*
# Write your MySQL query statement below

select name as Customers
from Customers
where Customers.id not in (select customerId
from Orders )
*/

