
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clinicaBd` DEFAULT CHARACTER SET utf8 ;
USE `clinicaBd` ;

-- -----------------------------------------------------
-- Table `mydb`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinicaBd`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinicaBd`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dni` VARCHAR(45) NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `contrasena` VARCHAR(100) NOT NULL,
  `estado` ENUM("0", "1") NOT NULL DEFAULT '1',
  `sexo` ENUM("M", "F") NOT NULL,
  `rol` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuarios_roles1_idx` (`rol` ASC) VISIBLE,
  CONSTRAINT `fk_usuarios_roles1`
    FOREIGN KEY (`rol`)
    REFERENCES `clinicaBd`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
