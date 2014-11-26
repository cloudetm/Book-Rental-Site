-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 10, 2014 at 06:27 PM
-- Server version: 5.5.38-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `Book`
--

CREATE TABLE IF NOT EXISTS `Book` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `isbn` varchar(15) DEFAULT NULL,
  `rating` decimal(4,2) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `image` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `genre` varchar(20) NOT NULL,
  `publishedOn` varchar(15) DEFAULT NULL,
  `publisher` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `Book`
--

INSERT INTO `Book` (`bookId`, `title`, `isbn`, `rating`, `author`, `status`, `image`, `description`, `genre`, `publishedOn`, `publisher`) VALUES
(1, 'Classical Mythology', '195153448', 4.50, 'Mark P. O. Morford', 1, 'http://images.amazon.com/images/P/0195153448.01.LZZZZZZZ.jpg', 'Lorem Ipsum', 'fantasy', '2002', 'Oxford University Press');

-- --------------------------------------------------------

--
-- Table structure for table `Cart`
--

CREATE TABLE IF NOT EXISTS `Cart` (
  `custEmail` varchar(30) NOT NULL,
  `bookId` int(11) NOT NULL,
  KEY `bookId` (`bookId`),
  KEY `custEmail` (`custEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Customer`
--

CREATE TABLE IF NOT EXISTS `Customer` (
  `custEmail` varchar(30) NOT NULL DEFAULT '',
  `custFirstName` varchar(15) NOT NULL,
  `custMiddleName` varchar(15) DEFAULT NULL,
  `custLastName` varchar(15) DEFAULT NULL,
  `custDOB` date DEFAULT NULL,
  `custAddress` tinytext,
  `custCity` varchar(40) DEFAULT NULL,
  `custState` varchar(40) DEFAULT NULL,
  `custCountry` varchar(45) DEFAULT NULL,
  `custPincode` bigint(20) DEFAULT NULL,
  `custMobileNo` bigint(20) DEFAULT NULL,
  `custLanguage` varchar(20) NOT NULL,
  `custPassword` varchar(50) NOT NULL,
  `custRegDate` bigint(30) NOT NULL,
  `custPasskey` varchar(200) DEFAULT NULL,
  `custIsVerified` tinyint(1) NOT NULL,
  PRIMARY KEY (`custEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Customer`
--

INSERT INTO `Customer` (`custEmail`, `custFirstName`, `custMiddleName`, `custLastName`, `custDOB`, `custAddress`, `custCity`, `custState`, `custCountry`, `custPincode`, `custMobileNo`, `custLanguage`, `custPassword`, `custRegDate`, `custPasskey`, `custIsVerified`) VALUES
('call2sagarverma@gmail.com', 'sagar', NULL, 'verma', '2014-10-07', 'Matri Sadan', 'Raipur', 'CG', 'India', 492008, 8962589772, 'English', 'inverse', 0, '0', 0),
('sagarverma@hdws.in', 'sagar', NULL, 'verma', '2014-10-07', 'Matri Sadan', 'Raipur', 'CG', NULL, 492008, 8962589772, 'English', 'inverse', 1412837148710, 'aaa93b459a6544eeeaae807882c5737e45ae60415bb6056b8c413c8887479982', 0);

-- --------------------------------------------------------

--
-- Table structure for table `Order`
--

CREATE TABLE IF NOT EXISTS `Order` (
  `orderId` int(11) NOT NULL,
  `orderDate` bigint(20) NOT NULL,
  `custEmail` varchar(30) NOT NULL,
  `status` varchar(3) NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `custEmail` (`custEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `OrderedCart`
--

CREATE TABLE IF NOT EXISTS `OrderedCart` (
  `orderId` int(11) NOT NULL,
  `bookId` int(11) NOT NULL,
  KEY `orderId` (`orderId`),
  KEY `bookId` (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `SubscriptionOrder`
--

CREATE TABLE IF NOT EXISTS `SubscriptionOrder` (
  `subsOrderId` int(11) NOT NULL AUTO_INCREMENT,
  `subsOrderStatus` tinyint(1) NOT NULL DEFAULT '1',
  `subsOrderDate` bigint(20) NOT NULL,
  `custEmail` varchar(30) NOT NULL,
  `subsId` int(11) NOT NULL,
  PRIMARY KEY (`subsOrderId`),
  KEY `subsId` (`subsId`),
  KEY `custEmail` (`custEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `SubscriptionPlan`
--

CREATE TABLE IF NOT EXISTS `SubscriptionPlan` (
  `subsId` int(11) NOT NULL AUTO_INCREMENT,
  `subsName` varchar(45) DEFAULT NULL,
  `subsPerDelivery` int(11) DEFAULT NULL,
  `subsDuration` int(11) DEFAULT NULL,
  `subsDeliveries` int(11) DEFAULT NULL,
  `subsTotalBooks` int(11) DEFAULT NULL,
  `subsMembershipFee` int(11) DEFAULT NULL,
  `subsDeliveryCharges` int(11) DEFAULT NULL,
  `subsRefundableSecurity` int(11) DEFAULT NULL,
  `subsSubscriptionFee` decimal(7,2) DEFAULT NULL,
  `subsSuitableFor` varchar(255) DEFAULT NULL,
  `subsMaxMagzines` int(11) DEFAULT NULL,
  PRIMARY KEY (`subsId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=113 ;

--
-- Dumping data for table `SubscriptionPlan`
--

INSERT INTO `SubscriptionPlan` (`subsId`, `subsName`, `subsPerDelivery`, `subsDuration`, `subsDeliveries`, `subsTotalBooks`, `subsMembershipFee`, `subsDeliveryCharges`, `subsRefundableSecurity`, `subsSubscriptionFee`, `subsSuitableFor`, `subsMaxMagzines`) VALUES
(0, 'Free', 0, 0, 0, 0, 0, 0, 0, 0.00, 'Everyone', 0),
(101, 'Occasional Reader', 1, 3, 3, 3, 200, 50, 250, 360.00, '', 1),
(102, 'Occasional Reader', 1, 6, 6, 6, 200, 50, 250, 700.00, '', 2),
(103, 'Occasional Reader', 1, 12, 12, 12, 200, 250, 250, 1260.00, '', 4),
(104, 'Casual Reader', 2, 3, 3, 6, 200, 50, 500, 690.00, '', 1),
(105, 'Casual Reader', 2, 6, 6, 12, 200, 50, 500, 1310.00, '', 2),
(106, 'Casual Reader', 2, 12, 12, 24, 200, 50, 500, 2480.00, '', 4),
(107, 'Regular Reader', 3, 3, 3, 9, 200, 50, 750, 990.00, '', 2),
(108, 'Regular Reader', 3, 6, 6, 18, 200, 50, 750, 1880.00, '', 4),
(109, 'Regular Reader', 3, 12, 12, 36, 200, 50, 750, 3560.00, '', 8),
(110, 'Avid Reader', 6, 3, 3, 18, 200, 100, 1500, 1800.00, '', 4),
(111, 'Avid Reader', 6, 6, 6, 36, 200, 100, 1500, 3420.00, '', 8),
(112, 'Avid Reader', 6, 12, 12, 72, 200, 100, 1500, 6480.00, '', 12);

-- --------------------------------------------------------

--
-- Table structure for table `Wishlist`
--

CREATE TABLE IF NOT EXISTS `Wishlist` (
  `custEmail` varchar(30) DEFAULT NULL,
  `bookId` int(11) DEFAULT NULL,
  KEY `custEmail` (`custEmail`),
  KEY `bookId` (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Cart`
--
ALTER TABLE `Cart`
  ADD CONSTRAINT `Cart_ibfk_1` FOREIGN KEY (`custEmail`) REFERENCES `Customer` (`custEmail`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Cart_ibfk_2` FOREIGN KEY (`bookId`) REFERENCES `Book` (`bookId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Order`
--
ALTER TABLE `Order`
  ADD CONSTRAINT `Order_ibfk_1` FOREIGN KEY (`custEmail`) REFERENCES `Customer` (`custEmail`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `OrderedCart`
--
ALTER TABLE `OrderedCart`
  ADD CONSTRAINT `OrderedCart_ibfk_1` FOREIGN KEY (`bookId`) REFERENCES `Book` (`bookId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `OrderedCart_ibfk_2` FOREIGN KEY (`orderId`) REFERENCES `Order` (`orderId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `SubscriptionOrder`
--
ALTER TABLE `SubscriptionOrder`
  ADD CONSTRAINT `SubscriptionOrder_ibfk_1` FOREIGN KEY (`subsId`) REFERENCES `SubscriptionPlan` (`subsId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `SubscriptionOrder_ibfk_2` FOREIGN KEY (`custEmail`) REFERENCES `Customer` (`custEmail`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Wishlist`
--
ALTER TABLE `Wishlist`
  ADD CONSTRAINT `Wishlist_ibfk_1` FOREIGN KEY (`custEmail`) REFERENCES `Customer` (`custEmail`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Wishlist_ibfk_2` FOREIGN KEY (`bookId`) REFERENCES `Book` (`bookId`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
