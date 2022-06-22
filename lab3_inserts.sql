use uklon;
DELETE FROM car;
DELETE FROM manufacturer;
DELETE FROM uklon.order;
DELETE FROM driver;
DELETE FROM driver_address;
DELETE FROM cost;
DELETE FROM user;
DELETE FROM security;
DELETE FROM credit_card;

ALTER TABLE car AUTO_INCREMENT = 1;
ALTER TABLE manufacturer AUTO_INCREMENT = 1;
ALTER TABLE uklon.order AUTO_INCREMENT = 1;
ALTER TABLE driver AUTO_INCREMENT = 1;
ALTER TABLE driver_address AUTO_INCREMENT = 1;
ALTER TABLE cost AUTO_INCREMENT = 1;
ALTER TABLE user AUTO_INCREMENT = 1;
ALTER TABLE security AUTO_INCREMENT = 1;
ALTER TABLE credit_card AUTO_INCREMENT = 1;

INSERT INTO manufacturer(id_country, country_name) VALUES
(1, 'Ukraine'),
(2, 'USA'),
(3, 'England'),
(4, 'France'),
(5, 'Germany'),
(6, 'China'),
(7, 'Japan'),
(8, 'Italy'),
(9, 'Spain'),
(10, 'Ireland');

INSERT INTO driver_address(id_location, location_name) VALUES
(1, 'Kyiv'),
(2, 'Lviv'),
(3, 'Dnipro'),
(4, 'Bila Tserkva'),
(5, 'Kharkiv'),
(6, 'Ternopil'),
(7, 'Odesa'),
(8, 'Kryvyi Rih'),
(9, 'Kherson'),
(10, 'Uzhhorod');

INSERT INTO driver(id_driver, first_name, last_name, phone_number, rating, driver_address_id_location) VALUES
(1, 'Mykola', 'Boyko', '0983632626', 5, '1'),
(2, 'Mykola', 'Boyko', '0985632626', 5, '2'),
(3, 'Vlad', 'Boyko', '0983672626', 5, '3'),
(4, 'Vlad', 'Boyko', '0983622626', 5, '4'),
(5, 'Sergiy', 'Boyko', '0981632626', 2, '5'),
(6, 'Sergiy', 'Boyko', '0983432626', 3, '6'),
(7, 'Ihor', 'Boyko', '0283632626', 4, '7'),
(8, 'Ihor', 'Boyko', '0383632626', 1, '8'),
(9, 'Andriy', 'Boyko', '0483632626', 2, '9'),
(10, 'Andriy', 'Boyko', '0953632626', 1, '10');

INSERT INTO car(id_car, category, number, name, availability, manufacturer_id_country, driver_id_driver) VALUES 
(1, 'Car', 'AC4323DC', 'Mazda', 1, 1, 1),
(2, 'Car', 'AD4323DC', 'Mazda', 2, 2, 2),
(3, 'Car', 'AF4323DC', 'Mazda', 3, 3, 3),
(4, 'Car', 'AG4323DC', 'Mazda', 4, 4, 4),
(5, 'Car', 'AH4323DC', 'Mazda', 5, 5, 5),
(6, 'Car', 'AJ4323DC', 'Mazda', 6, 6, 6),
(7, 'Car', 'AK4323DC', 'Mazda', 7, 7, 7),
(8, 'Car', 'AL4323DC', 'Mazda', 8, 8, 8),
(9, 'Car', 'A:4323DC', 'Mazda', 9, 9, 9),
(10, 'Car', 'AO4323DC', 'Mazda', 10, 10, 10);

INSERT INTO security(id_security, password) VALUES
(1, '357'),
(2, '753'),
(3, '258'),
(4, '852'),
(5, '987'),
(6, '789'),
(7, '654'),
(8, '456'),
(9, '321'),
(10, '123');

INSERT INTO credit_card(id_credit_card, credit_card_number, credit_card_cvc) VALUES
(1, '37286001319982', '357'),
(2, '37724636213386', '753'),
(3, '55844958197459', '258'),
(4, '55649759567892', '852'),
(5, '52246257895709', '987'),
(6, '52246257525709', '789'),
(7, '48198938302158', '654'),
(8, '47161457848240', '456'),
(9, '40007189790222', '321'),
(10, '42923063381743', '123');

INSERT INTO user(user_id, login, phone, credit_card_id_credit_card, security_id_security) VALUES
(1, 'sas', '0983632626', 1, 1),
(2, 'sys', '0983632621', 2, 2),
(3, 'sos', '0983632622', 3, 3),
(4, 'iss', '0983632623', 4, 4),
(5, 'oss', '0983632624', 5, 5),
(6, 'pss', '0983632625', 6, 6),
(7, 'lss', '0983632627', 7, 7),
(8, 'kss', '0983632628', 8, 8),
(9, 'ssr', '0983632629', 9, 9),
(10, 'sss', '0983632612', 10, 10);

INSERT INTO cost(id_cost, order_cost, order_currency) VALUES
(1, 120, 'dollars'),
(2, 20, 'dollars'),
(3, 40, 'dollars'),
(4, 60, 'dollars'),
(5, 300, 'dollars'),
(6, 10, 'dollars'),
(7, 60, 'dollars'),
(8, 90, 'dollars'),
(9, 100, 'dollars'),
(10, 35, 'dollars');

INSERT INTO uklon.order(id_order, user_userID, cost_id_cost, user_user_id, driver_id_driver) VALUES
(1, 1, 1, 1, 1),
(2, 2, 2, 2, 2),
(3, 3, 3, 3, 3),
(4, 4, 4, 4, 4),
(5, 5, 5, 5, 5),
(6, 6, 6, 6, 6),
(7, 7, 7, 7, 7),
(8, 8, 8, 8, 8),
(9, 9, 9, 9, 9),
(10, 10, 10, 10, 10);


Select * from user
