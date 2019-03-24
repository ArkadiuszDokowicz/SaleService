-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 24 Mar 2019, 13:42
-- Wersja serwera: 10.1.25-MariaDB
-- Wersja PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `supermarket`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `products`
--

CREATE TABLE `products` (
  `ID` int(11) NOT NULL,
  `Name` varchar(64) NOT NULL,
  `Price` float NOT NULL,
  `barcode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `products`
--

INSERT INTO `products` (`ID`, `Name`, `Price`, `barcode`) VALUES
(1, 'CocaCola 330ml', 1, 449000),
(2, 'Cisowianka 1.5L', 0.99, 883233),
(3, 'Bread 500g', 3.99, 434004),
(4, 'Cheese 240g', 4.55, 772212),
(5, 'tomato sauce 250g', 1.99, 443322),
(6, 'Shrimps 500g', 19.99, 996553),
(7, 'Garlic ', 0.99, 339245),
(8, 'Cumin 50g', 1.99, 333912),
(9, 'olive oil 1L', 29.99, 111555),
(10, 'coconut milk 500ml', 5.99, 554443),
(11, 'Scallops 1Pound', 29.99, 987654),
(12, 'Red Wine 750ml', 16.99, 555440);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `products`
--
ALTER TABLE `products`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
