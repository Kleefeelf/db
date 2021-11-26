-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema students
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema students
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `students` DEFAULT CHARACTER SET utf8 ;
USE `students` ;

-- -----------------------------------------------------
-- Table `students`.`group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`group` (
  `group_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `number` VARCHAR(45) NOT NULL,
  `entry_date` DATE NOT NULL,
  PRIMARY KEY (`group_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `students`.`region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`region` (
  `region_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `code` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`region_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `students`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`city` (
  `city_id` INT NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(45) NOT NULL,
  `region_region_id` INT NOT NULL,
  PRIMARY KEY (`city_id`),
  INDEX `fk_city_region1_idx` (`region_region_id` ASC) VISIBLE,
  CONSTRAINT `fk_city_region1`
    FOREIGN KEY (`region_region_id`)
    REFERENCES `students`.`region` (`region_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `students`.`secondary_school`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`secondary_school` (
  `secondary_school_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `phone_number` INT NOT NULL,
  `director_full_name` VARCHAR(45) NOT NULL,
  `city_city_id` INT NOT NULL,
  PRIMARY KEY (`secondary_school_id`),
  INDEX `fk_secondary_school_city1_idx` (`city_city_id` ASC) VISIBLE,
  CONSTRAINT `fk_secondary_school_city1`
    FOREIGN KEY (`city_city_id`)
    REFERENCES `students`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `students`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `patronymic` VARCHAR(45) NOT NULL,
  `rating` INT NOT NULL,
  `birth_date` DATE NOT NULL,
  `entry_date` DATE NOT NULL,
  `student_card_num` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `group_group_id` INT NOT NULL,
  `secondary_school_secondary_school_id` INT NOT NULL,
  `city_city_id` INT NOT NULL,
  PRIMARY KEY (`student_id`),
  INDEX `fk_student_group_idx` (`group_group_id` ASC) VISIBLE,
  INDEX `fk_student_secondary_school1_idx` (`secondary_school_secondary_school_id` ASC) VISIBLE,
  INDEX `fk_student_city1_idx` (`city_city_id` ASC) VISIBLE,
  CONSTRAINT `fk_student_group`
    FOREIGN KEY (`group_group_id`)
    REFERENCES `students`.`group` (`group_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_secondary_school1`
    FOREIGN KEY (`secondary_school_secondary_school_id`)
    REFERENCES `students`.`secondary_school` (`secondary_school_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_city1`
    FOREIGN KEY (`city_city_id`)
    REFERENCES `students`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `students`.`arrears`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`arrears` (
  `arrears_id` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`arrears_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `students`.`student_has_arrears`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `students`.`student_has_arrears` (
  `student_student_id` INT NOT NULL,
  `arrears_arrears_id` INT NOT NULL,
  PRIMARY KEY (`student_student_id`, `arrears_arrears_id`),
  INDEX `fk_student_has_arrears_arrears1_idx` (`arrears_arrears_id` ASC) VISIBLE,
  INDEX `fk_student_has_arrears_student1_idx` (`student_student_id` ASC) VISIBLE,
  CONSTRAINT `fk_student_has_arrears_student1`
    FOREIGN KEY (`student_student_id`)
    REFERENCES `students`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_arrears_arrears1`
    FOREIGN KEY (`arrears_arrears_id`)
    REFERENCES `students`.`arrears` (`arrears_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE if not exists students.data_log (
   action VARCHAR(255),
   action_time   TIMESTAMP
);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

