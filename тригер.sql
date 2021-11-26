DROP TRIGGER IF EXISTS `ai_data`;
DROP TRIGGER IF EXISTS `au_data`;
DROP TRIGGER IF EXISTS `ad_data`;
DROP TRIGGER IF EXISTS `region_code_convention`;
DROP TRIGGER IF EXISTS `validate_student_card_number`;

DELIMITER //
CREATE TRIGGER ai_data AFTER INSERT ON student
FOR EACH ROW
BEGIN
  INSERT INTO data_log (action, action_time)
  VALUES('insert', NOW());
END//
DELIMITER ;

DELIMITER //
CREATE TRIGGER au_data AFTER UPDATE ON student
FOR EACH ROW
BEGIN
  INSERT INTO data_log (action, action_time)
  VALUES('update', NOW());
END//
DELIMITER ;

DELIMITER //
CREATE TRIGGER ad_data AFTER DELETE ON student
FOR EACH ROW
BEGIN
  INSERT INTO data_log (action, action_time)
  VALUES('delete', NOW());
END//
DELIMITER ;

delimiter //
create trigger `region_code_convention`
before insert
on students.region
for each row
begin
	set new.code = concat(left(new.name, 1), left(new.code, 2)) ;
end
//

delimiter //
create trigger `validate_student_card_number`
before 
insert on students.student
for each row
begin
	if (left(new.student_card_num, 2) = 99) then
    signal sqlstate '45000' set message_text = 'StudentCardNumberError: number shouldn`t start with 99';
    end if;
end//

/*delimiter //
create function `get_students`()
returns varchar(45)
deterministic
begin
    return(select concat(name, ' ', number) from student.group group by student.id);
end;//*/