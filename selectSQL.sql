-- 1
select pc.model, pc.speed from pc where price between 400 and 600 order by pc.hd asc;
-- 2
SELECT date from pass_in_trip WHERE place LIKE '1%';
-- 3
SELECT maker, pc.model, price from pc INNER JOIN product on pc.model=product.model;
-- 4
select maker, model from product where model not in (select pc.model from pc);
-- 5
select * from product 
where 
product.maker in (select maker from product where product.type='printer') 
and 
model in (select model from pc where ram=(select min(ram) from pc));
-- 6
SELECT date_format(date, "%d.%m.%Y") as date from battles;
-- 7
Select count(pass_in_trip.trip_no) as trip_count, pass_in_trip.date
from pass_in_trip inner join trip on pass_in_trip.trip_no=trip.trip_no 
where town_to="London"  group by date;
-- 8
select outcomes.ship, displacement, numGuns from ships
inner join classes on ships.class=classes.class
inner join outcomes on ships.name=outcomes.ship
inner join battles on battles.name=outcomes.battle
where battles.name='Guadalcanal';
-- 9
select income_o.date, income_o.point, inc, outcome_o.out 
from income_o income_o left join outcome_o
on income_o.date=outcome_o.date and income_o.point=outcome_o.point
union
select income_o.date, income_o.point, inc, outcome_o.out 
from income_o income_o right join outcome_o
on income_o.date=outcome_o.date and income_o.point=outcome_o.point;
-- 10
select name from ships where name like '% %';
 
