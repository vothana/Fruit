-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2022 at 10:45 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fruit`
--

-- --------------------------------------------------------

--
-- Table structure for table `fruit`
--

CREATE TABLE `fruit` (
  `FruitID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Price` double NOT NULL,
  `Discription` varchar(255) NOT NULL,
  `DateIn` date NOT NULL,
  `Day` int(11) NOT NULL,
  `Image` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fruit`
--

INSERT INTO `fruit` (`FruitID`, `Name`, `Price`, `Discription`, `DateIn`, `Day`, `Image`) VALUES
(1, 'Apple red', 2, 'Apple red 2 200g each', '2022-12-20', 2, 'Apple red.png'),
(2, 'Apple', 1, 'Fresh apply', '2022-12-21', 3, 'Apple.png'),
(3, 'berries black', 2, 'Fresh berries black ', '2022-12-20', 4, 'berries black.png'),
(4, 'Gavua', 2, 'Gavua from frarm', '2022-12-21', 12, 'Gavua.png'),
(5, 'Grape black ', 6, 'Natural Grape black ', '2022-12-23', 6, 'Grape black .png'),
(6, 'Mango', 2, '300g mango from house', '2022-12-14', 3, 'mango.png'),
(7, 'Passion', 3, 'Fresh passion', '2022-12-20', 12, 'passion.png'),
(8, 'Warter melon', 3, 'Warter melon from mountain', '2022-12-20', 5, 'Warter melon.png'),
(9, 'Grape Blur', 8, 'Fresh Grape Blur', '2022-12-13', 12, 'Grape Blur.png'),
(10, 'Grape red', 3, 'Fresh Grape red 4p', '2022-12-20', 10, 'Grape red.png'),
(11, 'Melon', 4, 'Healthy Melon', '2022-12-22', 6, 'Melon.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fruit`
--
ALTER TABLE `fruit`
  ADD PRIMARY KEY (`FruitID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fruit`
--
ALTER TABLE `fruit`
  MODIFY `FruitID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
