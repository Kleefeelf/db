CREATE DATABASE IF NOT EXISTS uklon;
USE uklon;

DROP TABLE IF EXISTS cost;
DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS country_manufacturer;
DROP TABLE IF EXISTS credit_card;
DROP TABLE IF EXISTS driver;
DROP TABLE IF EXISTS driver_adress;
DROP TABLE IF EXISTS uklon.order;
DROP TABLE IF EXISTS security;
DROP TABLE IF EXISTS user;

CREATE TABLE cost (
  `Id_cost` INT NOT NULL AUTO_INCREMENT,
  `Order_Cost` INT NOT NULL,
  `Order_currency` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Id_cost`)
);


CREATE TABLE IF NOT EXISTS car (
  `CarID` INT NOT NULL AUTO_INCREMENT,
  `Category` VARCHAR(20) NOT NULL,
  `Number` VARCHAR(8) NOT NULL,
  `Name` VARCHAR(30) NOT NULL,
  `Availability` TINYINT(1) NOT NULL,
  `Driver_DriverID` INT NOT NULL,
  `Country_Manufacturer_Country_id` INT NOT NULL,
  PRIMARY KEY (`CarID`),
  INDEX `fk_Car_Driver1_idx` (`Driver_DriverID` ASC),
  INDEX `fk_car_Country_Manufacturer1_idx` (`Country_Manufacturer_Country_id` ASC),
  CONSTRAINT `fk_Car_Driver1`
    FOREIGN KEY (`Driver_DriverID`)
    REFERENCES `uklon`.`driver` (`DriverID`),
  CONSTRAINT `fk_car_Country_Manufacturer1`
    FOREIGN KEY (`Country_Manufacturer_Country_id`)
    REFERENCES `ukloncredit_card`.`Country_Manufacturer` (`Country_id`)
);


CREATE TABLE country_manufacturer (
  `Country_id` INT NOT NULL AUTO_INCREMENT,
  `Country_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Country_id`)
);

CREATE TABLE credit_card (
  `idCredit_Card` INT NOT NULL AUTO_INCREMENT,
  `user_UserID` INT NOT NULL,
  `Credit_Card_Number` INT NOT NULL,
  `Credit_Card_CVC` INT NOT NULL,
  PRIMARY KEY (`idCredit_Card`),
  INDEX `fk_Credit_Card_user_idx` (`user_UserID` ASC),
  CONSTRAINT `fk_Credit_Card_user`
    FOREIGN KEY (`user_UserID`)
    REFERENCES `uklon`.`user` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);
    
CREATE TABLE driver (
  `DriverID` INT NOT NULL AUTO_INCREMENT,
  `FirstName` VARCHAR(20) NOT NULL,
  `LastName` VARCHAR(20) NOT NULL,
  `PhoneNumber` VARCHAR(15) NOT NULL,
  `Rating` INT NOT NULL,
  `Driver_adress_idLocation` INT NOT NULL,
  PRIMARY KEY (`DriverID`),
  INDEX `fk_driver_Driver_adress1_idx` (`Driver_adress_idLocation` ASC),
  CONSTRAINT `fk_driver_Driver_adress1`
    FOREIGN KEY (`Driver_adress_idLocation`)
    REFERENCES `uklon`.`Driver_adress` (`idLocation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE driver_adress (
  `idLocation` INT NOT NULL AUTO_INCREMENT,
  `Location_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idLocation`)
);

CREATE TABLE uklon.order (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `User_UserID` INT NOT NULL,
  `Driver_DriverID` INT NOT NULL,
  `Cost_Id_cost` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Order_User1_idx` (`User_UserID` ASC),
  INDEX `fk_Order_Driver1_idx` (`Driver_DriverID` ASC),
  INDEX `fk_order_Cost1_idx` (`Cost_Id_cost` ASC),
  CONSTRAINT `fk_Order_Driver1`
    FOREIGN KEY (`Driver_DriverID`)
    REFERENCES `uklon`.`driver` (`DriverID`),
  CONSTRAINT `fk_Order_User1`
    FOREIGN KEY (`User_UserID`)
    REFERENCES `uklon`.`user` (`UserID`),
  CONSTRAINT `fk_order_Cost1`
    FOREIGN KEY (`Cost_Id_cost`)
    REFERENCES `uklon`.`Cost` (`Id_cost`)
);

CREATE TABLE security (
  `idSecurity` INT NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idSecurity`)
);

CREATE TABLE user (
  `UserID` INT NOT NULL AUTO_INCREMENT,
  `Login` VARCHAR(45) NOT NULL,
  `Phone` VARCHAR(15) NOT NULL,
  `Security_idSecurity` INT NOT NULL,
  PRIMARY KEY (`UserID`),
  INDEX `fk_user_Security1_idx` (`Security_idSecurity` ASC),
  CONSTRAINT `fk_user_Security1`
    FOREIGN KEY (`Security_idSecurity`)
    REFERENCES `uklon`.`Security` (`idSecurity`)
);





