set FOREIGN_KEY_CHECKS=0;

-- ---------------------------------- --
-- Co so du lieu giao hang tien duong --
-- ---------------------------------- --

drop database if exists giaohangtienduong;
create database if not exists giaohangtienduong;
show databases;

use giaohangtienduong;

-- ---------------------- --
-- Tao bang Quan tri vien --
-- ---------------------- --
create table if not exists QUANTRIVIEN(
	maQTV int unique auto_increment not null,
    tenQTV varchar(255) not null,
    primary key(maQTV)
) engine=InnoDB default charset=utf8;

-- ------------------- --
-- Tao bang Khach hang --
-- ------------------- --
create table if not exists KHACHHANG(
	maKH int unique auto_increment not null,
    tenKH varchar(255) not null,
    SDT int not null,
    CCCD int not null,
    diaChiGuiHang varchar(255) not null,
    ngayThangNamSinh date not null,
    yeuCauDacBiet varchar(255),
    primary key(maKH)
) engine=InnoDB default charset=utf8;

-- ------------------- --
-- Tao bang Nguoi nhan --
-- ------------------- --
create table if not exists NGUOINHAN(
	maNN int unique auto_increment not null,
    tenNN varchar(255) not null,
    SDT int not null,
    CCCD int not null,
    diaChiNhanHang varchar(255) not null,
    primary key(maNN)
) engine=InnoDB default charset=utf8;

-- ---------------------------- --
-- Tao bang Nhan vien giao hang --
-- ---------------------------- --
create table if not exists NHANVIENGIAOHANG(
	maNV int unique auto_increment not null,
    tenNV varchar(255) not null,
    SDT int not null,
    CCCD int not null,
    diaChiThuongTru varchar(255) not null,
    ngayThangNamSinh date not null,
    maQTV int,
    primary key(maNV)
) engine=InnoDB default charset=utf8;

alter table NHANVIENGIAOHANG
add constraint fk_QTV_NV
foreign key(maQTV)
	references QUANTRIVIEN(maQTV)
    on delete set null
    on update cascade;

-- ----------------- --
-- Tao bang Don hang --
-- ----------------- --
create table if not exists DONHANG(
	maDH int unique auto_increment not null,
    diaChiNhan varchar(255) not null,
    diaChiGui varchar(255) not null,
    ngayNhan date not null,
    thoiGianGiao datetime not null,
    loaiHang char not null,
    tenSP varchar(255) not null,
    canNang float,
    phiVanChuyen int,
    tienCOD int,
    trangThaiGuiNhan varchar(20) not null,
    maKH int,
    maNN int,
    maNV int,
    maQTV int,
    primary key(maDH)
) engine=InnoDB default charset=utf8;

-- Tao lien ket Don hang - Khach hang --
alter table DONHANG
add constraint fk_KH_DH
foreign key(maKH)
	references KHACHHANG(maKH)
    on delete set null
    on update cascade;

-- Tao lien ket Don hang - Nguoi nhan --
alter table DONHANG
add constraint fk_KH_NN
foreign key(maNN)
	references NGUOINHAN(maNN)
    on delete set null
    on update cascade;

-- Tao lien ket Don hang - Nhan vien --
alter table DONHANG
add constraint fk_KH_NV
foreign key(maNV)
	references NHANVIENGIAOHANG(maNV)
    on delete set null
    on update cascade;
    
-- Tao lien ket Don hang - Quan tri vien --
alter table DONHANG
add constraint fk_KH_QTV
foreign key(maQTV)
	references QUANTRIVIEN(maQTV)
    on delete set null
    on update cascade;

-- ------------------ --
-- Tao bang Tai khoan --
-- ------------------ --
create table if not exists TAIKHOAN(
	account varchar(50) unique not null,
    password varchar(50) not null,
    maND int not null,
    loaiND varchar(20) not null,
    primary key(maND)
) engine=InnoDB default charset=utf8;
