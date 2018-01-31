CREATE DATABASE  IF NOT EXISTS `assets-evaluator-db`;
USE `assets-evaluator-db`;

--
-- Table structure for table `months`
--


DROP TABLE IF EXISTS `assets`;

CREATE TABLE `assets` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`date` varchar(10) DEFAULT NULL,
	`asset_name` varchar(50) DEFAULT NULL,
	`amount` DOUBLE PRECISION(24, 2) DEFAULT NULL, 
    `currency` varchar(3) DEFAULT NULL,
	`asset_description` varchar(1000) DEFAULT NULL,
	`user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO assets (id, date,asset_name) VALUES(18, '2029-13-13', 'example of asset name');
