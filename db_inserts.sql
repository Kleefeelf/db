use students;
delete from student;
delete from secondary_school;
delete from students.group;
delete from city;
delete from region;

ALTER TABLE students.group AUTO_INCREMENT = 1;
ALTER TABLE city AUTO_INCREMENT = 1;
ALTER TABLE region AUTO_INCREMENT = 1;
ALTER TABLE student AUTO_INCREMENT = 1;
ALTER TABLE secondary_school AUTO_INCREMENT = 1;
ALTER TABLE arrears AUTO_INCREMENT = 1;
INSERT INTO `students`.`region`
(`name`, `code`) VALUES
('Kyivska', '65'),
('Lvivska', '35'),
('Dniprovska', '67'),
('Bila Tserkvovska', '66'),
('Kharkivska', '20'),
('Ternopilska', '10'),
('Odesska', '43'),
('Kryvyi Rihska', '89'),
('Khersonska', '90'),
('Uzhhorodska', '36');



INSERT INTO STUDENTS.CITY(city_id, city, region_region_id) values
(1, 'Kyiv', 1),
(2, 'Lviv', 2),
(3, 'Dnipro', 3),
(4, 'Bila Tserkva', 4),
(5, 'Kharkiv', 5),
(6, 'Ternopil', 6),
(7, 'Odesa', 7),
(8, 'Kryvyi Rih', 8),
(9, 'Kherson', 9),
(10, 'Uzhhorod', 10);

INSERT INTO `students`.`secondary_school` (`name`, `phone_number`, 
											`director_full_name`, `city_city_id`) 
VALUES ('SOP', 056665887, 'L. O. P', 1);

INSERT INTO `students`.`group` (`name`, `number`, `entry_date`) 
VALUES 	('OR', 21, STR_TO_DATE('17-01-2020', '%d-%m-%Y')),
		('OR', 11, STR_TO_DATE('17-01-2020', '%d-%m-%Y')),
		('OR', 22, STR_TO_DATE('17-01-2020', '%d-%m-%Y'));

INSERT INTO STUDENTS.student(surname, name, patronymic, rating, birth_date,
							entry_date, student_card_num, email, group_group_id, 
                            secondary_school_secondary_school_id, city_city_id) values
('Filatov', 'Vladyslav', 'Igorovych', 5, STR_TO_DATE('17-01-2003', '%d-%m-%Y'),
STR_TO_DATE('1-01-2012', '%d-%m-%Y'), 59953, 'wladfeel@gmail.com', 1, 1, 1),
('Mka', 'Vilat', 'Igorovych', 5, STR_TO_DATE('17-01-2003', '%d-%m-%Y'),
STR_TO_DATE('1-01-2012', '%d-%m-%Y'), 85658, 'wladfeel@gmail.com', 2, 1, 1),
('Ostapoa', 'Maksym', 'Igorovych', 5, STR_TO_DATE('17-01-2003', '%d-%m-%Y'),
STR_TO_DATE('1-01-2012', '%d-%m-%Y'), 85659, 'wladfeel@gmail.com', 3, 1, 1),
('Kirnich', 'Vitaliy', 'Igorovych', 1, STR_TO_DATE('17-01-2003', '%d-%m-%Y'),
STR_TO_DATE('1-01-2012', '%d-%m-%Y'), 85612, 'wladfeel@gmail.com', 1, 1, 1);
