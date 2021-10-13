CREATE DATABASE IF NOT EXISTS uklon;
USE uklon;

DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS manufacturer;
DROP TABLE IF EXISTS uklon.order;
DROP TABLE IF EXISTS driver;
DROP TABLE IF EXISTS driver_address;
DROP TABLE IF EXISTS cost;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS security;
DROP TABLE IF EXISTS credit_card;

CREATE TABLE uklon.cost (
  id_cost INT NOT NULL AUTO_INCREMENT,
  order_cost INT NOT NULL,
  order_currency VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_cost)
);

CREATE TABLE uklon.manufacturer (
  id_country INT NOT NULL AUTO_INCREMENT,
  country_name VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_country)
);

CREATE TABLE uklon.driver_address (
  id_location INT NOT NULL AUTO_INCREMENT,
  location_name VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_location)
);
  
CREATE TABLE uklon.security (
  id_security INT NOT NULL,
  password VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_security)
);

CREATE TABLE uklon.credit_card (
  id_credit_card INT NOT NULL AUTO_INCREMENT,
  credit_card_number VARCHAR(20) NOT NULL,
  credit_card_cvc VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_credit_card)
);

CREATE TABLE uklon.driver (
  id_driver INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(20) NOT NULL,
  last_name VARCHAR(20) NOT NULL,
  phone_number VARCHAR(15) NOT NULL,
  rating INT NOT NULL,
  driver_address_id_location INT NOT NULL,
  PRIMARY KEY (id_driver),
  CONSTRAINT fk_driver_driver_address1
    FOREIGN KEY (driver_address_id_location)
    REFERENCES uklon.driver_address (id_location),
  INDEX fk_driver_driver_address1_idx (`driver_address_id_location`)
);

CREATE TABLE uklon.car (
  id_car INT NOT NULL AUTO_INCREMENT,
  category VARCHAR(20) NOT NULL,
  number VARCHAR(8) NOT NULL,
  name VARCHAR(30) NOT NULL,
  availability TINYINT(1) NOT NULL,
  manufacturer_id_country INT NOT NULL,
  driver_id_driver INT NOT NULL,
  PRIMARY KEY (id_car),
  CONSTRAINT fk_car_manufacturer
    FOREIGN KEY (manufacturer_id_country)
    REFERENCES uklon.manufacturer (id_country),
  CONSTRAINT fk_car_driver1
    FOREIGN KEY (driver_id_driver)
    REFERENCES uklon.driver (id_driver),
  INDEX fk_car_manufacturer_idx (manufacturer_id_country),
  INDEX fk_car_driver1_idx (driver_id_driver)
);

CREATE TABLE uklon.user (
  user_id INT NOT NULL AUTO_INCREMENT,
  login VARCHAR(45) NOT NULL,
  phone VARCHAR(15) NOT NULL,
  credit_card_id_credit_card INT NOT NULL,
  security_id_security INT NOT NULL,
  PRIMARY KEY (user_id),
  CONSTRAINT fk_user_credit_card1
    FOREIGN KEY (credit_card_id_credit_card)
    REFERENCES uklon.credit_card (id_credit_card),
  CONSTRAINT fk_user_security1
    FOREIGN KEY (security_id_security)
    REFERENCES uklon.security (id_security),
  INDEX fk_user_credit_card1_idx (credit_card_id_credit_card),
  INDEX fk_user_security1_idx (security_id_security)
);

CREATE TABLE uklon.order (
  id_order INT NOT NULL AUTO_INCREMENT,
  user_userID INT NOT NULL,
  cost_id_cost INT NOT NULL,
  user_user_id INT NOT NULL,
  driver_id_driver INT NOT NULL,
  PRIMARY KEY (id_order),
  CONSTRAINT fk_order_cost1
    FOREIGN KEY (cost_id_cost)
    REFERENCES uklon.cost (id_cost),
  CONSTRAINT fk_order_user1
    FOREIGN KEY (user_user_id)
    REFERENCES uklon.user (user_id),
  CONSTRAINT fk_order_driver1
    FOREIGN KEY (driver_id_driver)
    REFERENCES uklon.driver (id_driver),
  INDEX fk_order_cost1_idx (cost_id_cost),
  INDEX fk_order_user1_idx (user_user_id),
  INDEX fk_order_driver1_idx (driver_id_driver)
);
