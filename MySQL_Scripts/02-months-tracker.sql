CREATE DATABASE  IF NOT EXISTS `evaluator_months`;
USE `evaluator_months`;

--
-- Table structure for table `months`
--

DROP TABLE IF EXISTS `months`;

CREATE TABLE `months` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `month` varchar(45) DEFAULT NULL,
--  `last_name` varchar(45) DEFAULT NULL,
--  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

