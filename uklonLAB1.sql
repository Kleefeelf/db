-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Uklon
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Uklon
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Uklon` DEFAULT CHARACTER SET utf8 ;
USE `Uklon` ;

-- -----------------------------------------------------
-- Table `Uklon`.`Car`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Uklon`.`Car` (
  `CarID` INT NOT NULL,
  `Driver_DriverID` INT NOT NULL,
  `Category` VARCHAR(20) NOT NULL,
  `Number` VARCHAR(8) NOT NULL,
  `Name` VARCHAR(30) NOT NULL,
  `Availability` TINYINT(1) NOT NULL,
  PRIMARY KEY (`CarID`, `Driver_DriverID`),
  INDEX `fk_Car_Driver_idx` (`Driver_DriverID` ASC) VISIBLE,
  CONSTRAINT `fk_Car_Driver`
    FOREIGN KEY (`Driver_DriverID`)
    REFERENCES `Uklon`.`Driver` (`DriverID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Uklon`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Uklon`.`User` (
  `UserID` INT NOT NULL,
  `Login` VARCHAR(45) NOT NULL,
  `Phone` VARCHAR(15) NOT NULL,
  `Car_CarID` INT NOT NULL,
  `Car_Driver_DriverID` INT NOT NULL,
  PRIMARY KEY (`UserID`),
  INDEX `fk_User_Car1_idx` (`Car_CarID` ASC, `Car_Driver_DriverID` ASC) VISIBLE,
  CONSTRAINT `fk_User_Car1`
    FOREIGN KEY (`Car_CarID` , `Car_Driver_DriverID`)
    REFERENCES `Uklon`.`Car` (`CarID` , `Driver_DriverID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Uklon`.`Driver`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Uklon`.`Driver` (
  `DriverID` INT NOT NULL AUTO_INCREMENT,
  `FirstName` VARCHAR(20) NOT NULL,
  `LastName` VARCHAR(20) NOT NULL,
  `Rating` INT NOT NULL,
  `PhoneNumber` INT NOT NULL,
  `User_UserID` INT NOT NULL,
  PRIMARY KEY (`DriverID`),
  INDEX `fk_Driver_User1_idx` (`User_UserID` ASC) VISIBLE,
  CONSTRAINT `fk_Driver_User1`
    FOREIGN KEY (`User_UserID`)
    REFERENCES `Uklon`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
