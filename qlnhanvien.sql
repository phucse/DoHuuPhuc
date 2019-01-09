-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 09, 2019 lúc 06:32 PM
-- Phiên bản máy phục vụ: 10.1.37-MariaDB
-- Phiên bản PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlnhanvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bangcap`
--

CREATE TABLE `bangcap` (
  `MaBC` int(11) NOT NULL,
  `TenBC` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bangcap`
--

INSERT INTO `bangcap` (`MaBC`, `TenBC`) VALUES
(1, 'Cử nhân'),
(2, 'Kỹ Sư'),
(3, 'Nghề trung cấp'),
(4, 'Thạc sĩ'),
(5, 'Tiến sĩ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bophan`
--

CREATE TABLE `bophan` (
  `MaBP` int(11) NOT NULL,
  `TenBP` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bophan`
--

INSERT INTO `bophan` (`MaBP`, `TenBP`) VALUES
(1, 'Kinh doanh'),
(2, 'Marketing'),
(3, 'Nhân sự'),
(4, 'IT');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucdanh`
--

CREATE TABLE `chucdanh` (
  `MaCD` int(11) NOT NULL,
  `TenCD` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chucdanh`
--

INSERT INTO `chucdanh` (`MaCD`, `TenCD`) VALUES
(1, 'Giám đốc'),
(2, 'Trưởng phòng'),
(3, 'Thư kí'),
(4, 'Nhân viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `MaCV` int(11) NOT NULL,
  `TenCV` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`MaCV`, `TenCV`) VALUES
(1, 'Giám đốc kinh doanh'),
(2, 'Giám đốc marketing'),
(3, 'Trưởng phòng kinh doanh'),
(4, 'Trưởng phòng marketing'),
(5, 'Thư kí giám đốc'),
(6, 'Thư kí trưởng phòng'),
(7, 'Nhân viên công nghệ'),
(8, 'Nhân viên văn phòng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dantoc`
--

CREATE TABLE `dantoc` (
  `MaDT` int(11) NOT NULL,
  `TenDT` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `dantoc`
--

INSERT INTO `dantoc` (`MaDT`, `TenDT`) VALUES
(1, 'Kinh'),
(2, 'Cầm'),
(3, 'Dao'),
(4, 'Thái'),
(5, 'H\'Mong'),
(6, 'Mèo'),
(7, 'Ê-đê');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donvi`
--

CREATE TABLE `donvi` (
  `MaDV` int(11) NOT NULL,
  `TenDV` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `donvi`
--

INSERT INTO `donvi` (`MaDV`, `TenDV`) VALUES
(1, 'Nhà nước'),
(2, 'Hành chính'),
(3, 'Tư nhân');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loainv`
--

CREATE TABLE `loainv` (
  `MaLNV` int(11) NOT NULL,
  `TenLNV` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loainv`
--

INSERT INTO `loainv` (`MaLNV`, `TenLNV`) VALUES
(1, 'Nhân viên làm thêm'),
(2, 'Sinh viên thực tập'),
(3, 'Nhân viên thử việc'),
(4, 'Nhân viên chính thức');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nganhang`
--

CREATE TABLE `nganhang` (
  `MaNH` int(11) NOT NULL,
  `TenNH` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nganhang`
--

INSERT INTO `nganhang` (`MaNH`, `TenNH`) VALUES
(1, 'SaccomBank'),
(2, 'Vietcombank'),
(3, 'APBank'),
(4, 'OceanBank'),
(5, 'Vietinbank');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `SoThe` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenNV` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Phai` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `NamSinh` int(11) NOT NULL,
  `MaNoiSinh` int(11) NOT NULL,
  `CMND` char(15) COLLATE utf8_unicode_ci NOT NULL,
  `NgayCapCM` date NOT NULL,
  `MaNoiCapCM` int(11) NOT NULL,
  `DCThuongTru` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DTThuongTru` int(11) DEFAULT NULL,
  `DCTamTru` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DTDD` int(11) DEFAULT NULL,
  `Email` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgayVaoDoan` date DEFAULT NULL,
  `NgayVaoDang` date DEFAULT NULL,
  `MaDT` int(11) NOT NULL,
  `MaTG` int(11) NOT NULL,
  `QuocTich` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Passport` int(11) DEFAULT NULL,
  `NgayCapPass` date DEFAULT NULL,
  `MaNoiCapPass` int(11) DEFAULT NULL,
  `HonNhan` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `MaSoThue` int(11) DEFAULT NULL,
  `NgayCapMST` date DEFAULT NULL,
  `SoTK` int(11) DEFAULT NULL,
  `MaTK` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaNH` int(11) DEFAULT NULL,
  `MaTD` int(11) NOT NULL,
  `MaBC` int(11) NOT NULL,
  `HocHam` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ChuyenMon` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `KNLVNam` int(11) DEFAULT NULL,
  `KNLVThang` int(11) DEFAULT NULL,
  `MaLNV` int(11) NOT NULL,
  `NgayVao` date NOT NULL,
  `NgayHet` date DEFAULT NULL,
  `NgayChinhThuc` date DEFAULT NULL,
  `MaDV` int(11) NOT NULL,
  `MaPB` int(11) NOT NULL,
  `MaBP` int(11) DEFAULT NULL,
  `MaCD` int(11) NOT NULL,
  `MaCV` int(11) NOT NULL,
  `MaNoiLam` int(11) DEFAULT NULL,
  `LuongTV` float NOT NULL,
  `LuongCB` float NOT NULL,
  `LuongKD` float NOT NULL,
  `Hinh` char(10) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `SoThe`, `TenNV`, `Phai`, `NamSinh`, `MaNoiSinh`, `CMND`, `NgayCapCM`, `MaNoiCapCM`, `DCThuongTru`, `DTThuongTru`, `DCTamTru`, `DTDD`, `Email`, `NgayVaoDoan`, `NgayVaoDang`, `MaDT`, `MaTG`, `QuocTich`, `Passport`, `NgayCapPass`, `MaNoiCapPass`, `HonNhan`, `MaSoThue`, `NgayCapMST`, `SoTK`, `MaTK`, `MaNH`, `MaTD`, `MaBC`, `HocHam`, `ChuyenMon`, `KNLVNam`, `KNLVThang`, `MaLNV`, `NgayVao`, `NgayHet`, `NgayChinhThuc`, `MaDV`, `MaPB`, `MaBP`, `MaCD`, `MaCV`, `MaNoiLam`, `LuongTV`, `LuongCB`, `LuongKD`, `Hinh`) VALUES
('A01', '3298', 'AGENT', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('A020', '3298', 'AGENT', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('A0203', '3298', 'AGENT', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('A236', '3298', 'AGENT', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('A53', '3298', 'AGENT', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('A876', '3298', 'Sen', 'Nam', 1997, 3, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 23012, 19803, 21398, ''),
('A92', '3298', 'eqeqe', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('B02', '3298', 'AGENT', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('B27', '3298', 'Jim', 'Nam', 1997, 1, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 0, 0, 0, ''),
('R43', '3298', '763', 'Nam', 1997, 3, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 23012, 19803, 21398, ''),
('S31', '1234', 'Khang', 'Nam', 1980, 2, '03428974', '1997-07-17', 1, '', 0, '', 0, '', '1997-07-17', '1997-07-17', 1, 1, 'Vi?t Nam', 0, '1997-07-17', 1, '??c thân', 0, '1997-07-17', 0, '', 1, 1, 1, '', '', 0, 0, 1, '1997-07-17', '1997-07-17', '1997-07-17', 1, 1, 1, 1, 1, 1, 23012, 19803, 21398, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `MaPB` int(11) NOT NULL,
  `TenPB` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phongban`
--

INSERT INTO `phongban` (`MaPB`, `TenPB`) VALUES
(1, 'Ban giám đốc'),
(2, 'Phòng thư kí'),
(3, 'Phòng nhân sự'),
(4, 'Phòng IT'),
(5, 'Phòng kinh doanh'),
(6, 'Phòng marketing');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinhthanh`
--

CREATE TABLE `tinhthanh` (
  `MaTT` int(11) NOT NULL,
  `TenTT` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tinhthanh`
--

INSERT INTO `tinhthanh` (`MaTT`, `TenTT`) VALUES
(1, 'Hà Nội'),
(2, 'Đà Nẵng'),
(3, 'Hồ Chí Minh'),
(4, 'Cần Thơ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tongiao`
--

CREATE TABLE `tongiao` (
  `MaTG` int(11) NOT NULL,
  `TenTG` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tongiao`
--

INSERT INTO `tongiao` (`MaTG`, `TenTG`) VALUES
(1, 'Không'),
(2, 'Phật Giáo'),
(3, 'Thiên Chúa Giáo'),
(4, 'Đạo Hồi');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trinhdo`
--

CREATE TABLE `trinhdo` (
  `MaTD` int(11) NOT NULL,
  `TenTD` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `trinhdo`
--

INSERT INTO `trinhdo` (`MaTD`, `TenTD`) VALUES
(1, 'Đại học'),
(2, 'Cao đẳng'),
(3, 'Trung cấp nghề'),
(4, 'Tốt nghiệp cấp 3');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bangcap`
--
ALTER TABLE `bangcap`
  ADD PRIMARY KEY (`MaBC`);

--
-- Chỉ mục cho bảng `bophan`
--
ALTER TABLE `bophan`
  ADD PRIMARY KEY (`MaBP`);

--
-- Chỉ mục cho bảng `chucdanh`
--
ALTER TABLE `chucdanh`
  ADD PRIMARY KEY (`MaCD`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaCV`);

--
-- Chỉ mục cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`MaDT`);

--
-- Chỉ mục cho bảng `donvi`
--
ALTER TABLE `donvi`
  ADD PRIMARY KEY (`MaDV`);

--
-- Chỉ mục cho bảng `loainv`
--
ALTER TABLE `loainv`
  ADD PRIMARY KEY (`MaLNV`);

--
-- Chỉ mục cho bảng `nganhang`
--
ALTER TABLE `nganhang`
  ADD PRIMARY KEY (`MaNH`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `MaTG` (`MaTG`),
  ADD KEY `MaDT` (`MaDT`),
  ADD KEY `MaNoiCapPass` (`MaNoiCapPass`),
  ADD KEY `MaLNV` (`MaLNV`),
  ADD KEY `MaTD` (`MaTD`),
  ADD KEY `MaBC` (`MaBC`),
  ADD KEY `MaDV` (`MaDV`),
  ADD KEY `MaBP` (`MaBP`),
  ADD KEY `MaCD` (`MaCD`),
  ADD KEY `MaCV` (`MaCV`),
  ADD KEY `MaNoiLam` (`MaNoiLam`),
  ADD KEY `MaNH` (`MaNH`),
  ADD KEY `MaNoiSinh` (`MaNoiSinh`),
  ADD KEY `MaNoiCapCM` (`MaNoiCapCM`) USING BTREE,
  ADD KEY `MaPB` (`MaPB`) USING BTREE;

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`MaPB`);

--
-- Chỉ mục cho bảng `tinhthanh`
--
ALTER TABLE `tinhthanh`
  ADD PRIMARY KEY (`MaTT`);

--
-- Chỉ mục cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`MaTG`);

--
-- Chỉ mục cho bảng `trinhdo`
--
ALTER TABLE `trinhdo`
  ADD PRIMARY KEY (`MaTD`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MaNoiCapCM`) REFERENCES `tinhthanh` (`MaTT`),
  ADD CONSTRAINT `nhanvien_ibfk_10` FOREIGN KEY (`MaPB`) REFERENCES `phongban` (`MaPB`),
  ADD CONSTRAINT `nhanvien_ibfk_11` FOREIGN KEY (`MaCV`) REFERENCES `chucvu` (`MaCV`),
  ADD CONSTRAINT `nhanvien_ibfk_12` FOREIGN KEY (`MaCD`) REFERENCES `chucdanh` (`MaCD`),
  ADD CONSTRAINT `nhanvien_ibfk_13` FOREIGN KEY (`MaNH`) REFERENCES `nganhang` (`MaNH`),
  ADD CONSTRAINT `nhanvien_ibfk_14` FOREIGN KEY (`MaNoiSinh`) REFERENCES `tinhthanh` (`MaTT`),
  ADD CONSTRAINT `nhanvien_ibfk_15` FOREIGN KEY (`MaNoiCapPass`) REFERENCES `tinhthanh` (`MaTT`),
  ADD CONSTRAINT `nhanvien_ibfk_16` FOREIGN KEY (`MaNoiLam`) REFERENCES `tinhthanh` (`MaTT`),
  ADD CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`MaTG`) REFERENCES `tongiao` (`MaTG`),
  ADD CONSTRAINT `nhanvien_ibfk_4` FOREIGN KEY (`MaDT`) REFERENCES `dantoc` (`MaDT`),
  ADD CONSTRAINT `nhanvien_ibfk_5` FOREIGN KEY (`MaLNV`) REFERENCES `loainv` (`MaLNV`),
  ADD CONSTRAINT `nhanvien_ibfk_6` FOREIGN KEY (`MaTD`) REFERENCES `trinhdo` (`MaTD`),
  ADD CONSTRAINT `nhanvien_ibfk_7` FOREIGN KEY (`MaBP`) REFERENCES `bophan` (`MaBP`),
  ADD CONSTRAINT `nhanvien_ibfk_8` FOREIGN KEY (`MaBC`) REFERENCES `bangcap` (`MaBC`),
  ADD CONSTRAINT `nhanvien_ibfk_9` FOREIGN KEY (`MaDV`) REFERENCES `donvi` (`MaDV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
