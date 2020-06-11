-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 11 Jun 2020 pada 16.20
-- Versi Server: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `form input`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `input`
--

CREATE TABLE IF NOT EXISTS `input` (
  `nomer` int(15) NOT NULL,
  `nama` varchar(15) NOT NULL,
  `telp` int(12) NOT NULL,
  `pemesanan` int(8) NOT NULL,
  `pengambilan` int(8) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `harga` int(100) NOT NULL,
  `total` int(100) NOT NULL,
  `dp` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `input`
--

INSERT INTO `input` (`nomer`, `nama`, `telp`, `pemesanan`, `pengambilan`, `jenis`, `jumlah`, `harga`, `total`, `dp`) VALUES
(7, 'dddddd', 123, 1323, 2133, 'ex', 213, 123, 13, 123),
(123, 'fani', 123123123, 12345, 13213, 'xcsc', 12, 231, 1231, 123),
(123, 'fani', 123243, 1231, 1231, 'dhfcsk', 123, 2131, 213, 324),
(123, 'asdasd', 13123, 1321, 2313, 'asdha', 12312, 213213, 13243, 53242),
(123, 'fani', 123141, 12313, 12313, 'sfdks', 31, 123, 1323, 133),
(123, 'fani', 81234567, 6062020, 11062020, 'undangan', 30, 1500, 45000, 20000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
