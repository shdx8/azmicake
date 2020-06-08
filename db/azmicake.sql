-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2020 at 04:06 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `azmicake`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis`
--

CREATE TABLE `jenis` (
  `id_jenis` int(5) NOT NULL,
  `nama_jenis` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis`
--

INSERT INTO `jenis` (`id_jenis`, `nama_jenis`) VALUES
(1, 'basah'),
(2, 'kering'),
(3, 'pastri'),
(4, 'bolu');

-- --------------------------------------------------------

--
-- Table structure for table `kue`
--

CREATE TABLE `kue` (
  `id_kue` int(11) NOT NULL,
  `nama_kue` varchar(50) NOT NULL,
  `harga` int(10) NOT NULL,
  `stok` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kue`
--

INSERT INTO `kue` (`id_kue`, `nama_kue`, `harga`, `stok`) VALUES
(1, 'Bolen', 3000, '43'),
(2, 'Bika Ambon', 25000, '25'),
(3, 'Bolu Gulung', 65000, '45'),
(142, 'Cheese John', 10000, '45'),
(143, 'Chicken Pie', 9000, '48'),
(144, 'Soes', 7500, '65'),
(145, 'Croissant', 8500, '82'),
(146, 'Blackforrest', 140000, '3'),
(147, 'Japanese Cheese Cake', 35000, '15'),
(148, 'Rainbow Cake', 230000, '3'),
(149, 'Donut', 8500, '47'),
(150, 'Roti Isi', 9500, '40'),
(151, 'Bagel', 8500, '50');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telepon` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`id_pembeli`, `nama`, `alamat`, `telepon`) VALUES
(1, 'putu', 'jl. jawa', '0821');

-- --------------------------------------------------------

--
-- Table structure for table `trx`
--

CREATE TABLE `trx` (
  `id_trx` varchar(20) NOT NULL,
  `id_kue` int(11) NOT NULL,
  `nama_kue` varchar(50) NOT NULL,
  `harga` int(10) NOT NULL,
  `jumlah` int(5) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trx`
--

INSERT INTO `trx` (`id_trx`, `id_kue`, `nama_kue`, `harga`, `jumlah`, `total`) VALUES
('AC001', 1, 'bolen', 2500, 2, 5000),
('AC002', 142, 'Cheese John', 10000, 3, 30000),
('AC003', 148, 'Rainbow Cake', 250000, 1, 250000),
('AC004', 3, 'Bolu Gulung', 75000, 5, 375000),
('AC005', 142, 'Cheese John', 10000, 1, 10000),
('AC006', 2, 'Bika Ambon Cup', 5000, 2, 10000),
('AC007', 3, 'Bolu Gulung', 75000, 20, 1500000),
('AC008', 148, 'Rainbow Cake', 230000, 6, 1380000),
('AC009', 149, 'Donut', 8500, 1, 8500),
('AC010', 143, 'Chicken Pie', 9000, 2, 18000),
('AC011', 151, 'Bagel', 8500, 5, 42500),
('AC012', 146, 'Blackforrest', 140000, 2, 280000),
('AC013', 149, 'Donut', 8500, 2, 17000);

--
-- Triggers `trx`
--
DELIMITER $$
CREATE TRIGGER `jual` AFTER INSERT ON `trx` FOR EACH ROW BEGIN
UPDATE kue SET stok=stok-new.jumlah
WHERE id_kue=new.id_kue;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `telp` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `nama`, `telp`) VALUES
(1, 'asd', 'asd', 'shdx', '0851');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenis`
--
ALTER TABLE `jenis`
  ADD PRIMARY KEY (`id_jenis`),
  ADD KEY `id_jenis` (`id_jenis`);

--
-- Indexes for table `kue`
--
ALTER TABLE `kue`
  ADD PRIMARY KEY (`id_kue`),
  ADD KEY `nama_kue` (`nama_kue`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indexes for table `trx`
--
ALTER TABLE `trx`
  ADD PRIMARY KEY (`id_trx`),
  ADD KEY `id_kue` (`id_kue`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jenis`
--
ALTER TABLE `jenis`
  MODIFY `id_jenis` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `kue`
--
ALTER TABLE `kue`
  MODIFY `id_kue` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=152;

--
-- AUTO_INCREMENT for table `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `id_pembeli` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
