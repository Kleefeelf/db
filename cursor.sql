DROP PROCEDURE IF EXISTS `mid_school_inserts`;
DROP PROCEDURE IF EXISTS `create_cities`;

delimiter //
create procedure  `mid_school_inserts` (in name varchar(45), 
						in phone int, in director_full_name varchar(45),
                        in city_id int)
language sql
deterministic
sql security definer
comment 'Inserts in middle school'
begin
	insert into students.secondary_school(name, phone_number, director_full_name, city_city_id) 
		values(name, phone, director_full_name, city_id);
end;//

delimiter //
create procedure `create_cities`()
begin
    declare city_name varchar(45); 
    declare collumns_num int;
    declare idx int;
    declare done int default false;
    
    declare city_cursor cursor 
    for select city from city; 
    
    declare continue handler 
    for not found set done = true;
    
    open city_cursor;
	create_cities: loop
		fetch city_cursor into city_name;
		select city_name as '';
		if done=true then leave create_cities;
		end if;
		set @сollumns_query=concat('create table', city_name);
        prepare query from @collumns_query;
		execute query;
        deallocate prepare query;
		set idx=1;
		set collumns_num = floor(rand() * 10);
		while (idx <= collumns_num) do

			set @collumns_query = concat('alter table', city_name, 'add', idx, 'int');
			set idx = idx + 1; 
			prepare query from @collumns_query;
            execute query;
            deallocate prepare query;
        end while;
        end loop create_cities;
	close city_cursor;
end //

