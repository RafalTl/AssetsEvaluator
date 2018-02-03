CREATE DATABASE  IF NOT EXISTS `assets-evaluator-db`;
USE `assets-evaluator-db`;

--
-- Table structure for table `assets`
--
DROP TABLE IF EXISTS `assets`;

CREATE TABLE `assets` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`date` date DEFAULT NULL,
	`asset_name` varchar(50) DEFAULT NULL,
	`amount` DOUBLE PRECISION(24, 2) DEFAULT NULL, 
    `currency` varchar(3) DEFAULT NULL,
	`asset_description` varchar(1000) DEFAULT NULL,
	`user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `assets`
--
INSERT INTO assets (id, date, asset_name, amount, currency, asset_description, user_id) 
			VALUES(NULL, '2018-01-02', 'First sample asset name', 999, 'PLN', 'Random description', 7);
            
INSERT INTO assets (id, date, asset_name, amount, currency, asset_description, user_id) 
			VALUES(NULL, '2018-02-01', 'Second sample asset name', 666, 'EUR', 'Random description for second sample', 7);
            
INSERT INTO assets (id, date, asset_name, amount, currency, asset_description, user_id) 
			VALUES(NULL, '2018-02-02', 'Konto mBank', 1000, 'CHF', 'Piniondze', 7);
            
INSERT INTO assets (id, date, asset_name, amount, currency, asset_description, user_id) 
			VALUES(NULL, '2018-01-01', 'Konto mBank II', 2000, 'USD', 'Jeszcze wiecej pieniedzy :P', 7);        

INSERT INTO assets (id, date, asset_name, amount, currency, asset_description, user_id) 
			VALUES(NULL, '2018-01-01', 'Konto na Kajmanach', 5000, 'GBP', 'Na czarna godzine', 7);              