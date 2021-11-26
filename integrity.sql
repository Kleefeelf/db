use students;
drop trigger if exists city_update;
drop trigger if exists region_delete;
drop trigger if exists region_update;
drop trigger if exists city_insert;
drop trigger if exists city_delete;
drop trigger if exists secondary_school_insert;
drop trigger if exists secondary_school_update;
drop trigger if exists secondary_school_delete;
drop trigger if exists student_insert;
drop trigger if exists student_update;
drop trigger if exists student_delete;
drop trigger if exists arrears_insert;
drop trigger if exists arrears_update;
drop trigger if exists arrears_delete;
drop trigger if exists group_insert;
drop trigger if exists group_update;
drop trigger if exists group_delete;

delimiter //
create trigger region_delete
before delete on region
for each row
begin
	if (old.region_id in (select region_region_id from city))
		then signal sqlstate "45000" set message_text =
			"Can`t delete region, fk to region still exists";
	end if;
end//
delimiter;

delimiter //
create trigger region_update
before update
on region for each row
begin
	if (old.region_id in (select region_region_id from city))
		then signal sqlstate "45000" set message_text =
			"Can`t update region, fk to region still exists";
	end if;
end//
delimiter;

delimiter //
create trigger city_insert
before insert
on city for each row
begin
	if (new.region_region_id not in (select region_id from region))
		then signal sqlstate "45000" set message_text =
			"Can`t insert, region_id does not exist";
	end if;
end//
delimiter;

delimiter //
create trigger city_update
before update
on city for each row
begin
	if (new.region_region_id not in (select region_id from region))
		then signal sqlstate "45000" set message_text = 
			"Can`t update city, region_id does not exist";
	end if;
    if (old.city_id in (select city_city_id from secondary_school))
		then signal sqlstate "45000" set message_text = 
			"Can`t update city, fk to city still exists in school";
	end if;
    if (old.city_id in (select city_city_id from secondary_school))
		then signal sqlstate "45000" set message_text =
			"Can`t update city, fk to city still exists in student";
	end if;
end//
delimiter;

delimiter //
create trigger city_delete
before delete
on city for each row
begin
    if (old.city_id in (select city_city_id from secondary_school))
		then signal sqlstate "45000" set message_text = 
			"Can`t delete city, fk to city still exists in school";
	end if;
    if (old.city_id in (select city_city_id from secondary_school))
		then signal sqlstate "45000" set message_text =
			"Can`t delete city, fk to city still exists in student";
	end if;
end;//

delimiter //
create trigger secondary_school_insert
before insert
on secondary_school for each row
begin
	if (new.city_id not in (select city_city_id from city))
		then signal sqlstate "45000" set message_text =
			"Can`t insert, city_id does not exist";
	end if;
end;//

delimiter //
create trigger secondary_school_update
before update
on secondary_school for each row
begin
	if (old.secondary_school_id in (select secondary_school_secondary_school_id from student))
		then signal sqlstate "45000" set message_text = 
			"Can`t update secondary school, fk to secondary school still exists in student";
	end if;
    if (new.city_city_id not in (select city_id from city))
		then signal sqlstate "45000" set message_text = 
			"Can`t update secondary school, fk to secondary school still exists in student";
	end if;
end;//

delimiter //
create trigger secondary_school_delete
before delete
on secondary_school for each row
begin
	if (old.secondary_school_id in (select secondary_school_secondary_school_id from student))
		then signal sqlstate "45000" set message_text = 
			"Can`t update secondary school, fk to secondary school still exists in student";
	end if;
end//
delimiter;

delimiter //
create trigger student_insert
before insert
on student for each row
begin
	if (new.student_id not in (select student_student_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Arrear does not exist";
	end if;
    if (new.student_has_arrears.student_student_id not in (select student_student_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Arrear does not exist";
	end if;
    if (new.city_city_id not in (select city_city_id from city))
		then signal sqlstate "45000" set message_text =
			"City does not exist";
	end if;
    if (new.secondary_school_secondary_school_id not in (select secondary_school_id from secondary_school))
		then signal sqlstate "45000" set message_text = 
			"Secondary school does not exist";
	end if;
    if (new.group_group_id not in (select group_id from students.group))
		then signal sqlstate "45000" set message_text = 
			"Group does not exist";
	end if;
end//

delimiter //
create trigger student_update
before update
on student for each row
begin
	if (old.student_id in (select student_student_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Can`t update student, fk to student still exists in arrear";
	end if;
    if (new.student_id not in (select student_student_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Can`t update student, fk to student still exists in arrear";
	end if;
    if (new.city_city_id not in (select city_id from city))
		then signal sqlstate "45000" set message_text =
			"City does not exist";
	end if;
    if (new.secondary_school_secondary_school_id not in (select secondary_school_id from secondary_school))
		then signal sqlstate "45000" set message_text = 
			"Secondary school does not exist";
	end if;
    if (new.group_group_id not in (select group_id from students.group))
		then signal sqlstate "45000" set message_text = 
			"Group does not exist";
	end if;
end//

delimiter //
create trigger student_delete
before delete
on student for each row
begin
	if (old.student_id in (select student_student_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Can`t update student, fk to student still exissts in student_arrears";
	end if;
end//

delimiter //
create trigger arrears_insert
before insert
on arrears for each row
begin
	if (new.arrears_id not in (select arrears_arrears_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Arrear does not exist";
	end if;
end //

delimiter //
create trigger arrears_update
before update
on arrears for each row
begin
	if (old.arrears_id not in (select arrears_arrears_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Arrear does not exist";
	end if;
    if (new.arrears_id not in (select arrears_id from arrears))
		then signal sqlstate "45000" set message_text =
			"Arrear does not exist";
	end if;
end //

delimiter //
create trigger arrears_delete
before delete
on arrears for each row
begin
	if (old.arrears_id not in (select arrears_arrears_id from student_has_arrears))
		then signal sqlstate "45000" set message_text = 
			"Arrear does not exist";
	end if;
end //

delimiter //
create trigger group_update
before update
on students.group for each row
begin
	if (old.group_id not in (select group_group_id from student))
		then signal sqlstate "45000" set message_text =
			"Group does not exist";
	end if;
end//

delimiter //
create trigger group_delete
before delete
on students.group for each row
begin
	if (old.group_id not in (select group_group_id from student))
		then signal sqlstate "45000" set message_text =
			"Group does not exist";
	end if;
end//





