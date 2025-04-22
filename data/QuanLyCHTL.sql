CREATE DATABASE QuanLyCHTL;
USE QuanLyCHTL;

CREATE TABLE TaiKhoan (
    tenTaiKhoan VARCHAR(50) PRIMARY KEY,
    matKhau VARCHAR(50),
    trangThai VARCHAR(20),
    maNV VARCHAR(10),
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE NhanVien (
    maNV VARCHAR(10) PRIMARY KEY,
    tenNV VARCHAR(100),
	tuoi INT,
	gioiTinh VARCHAR(10),
    sdt VARCHAR(15),
    diaChi VARCHAR(255)
);

CREATE TABLE QuanLy (
    maNV VARCHAR(10) PRIMARY KEY,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE CaLamViec (
    maCa VARCHAR(10) PRIMARY KEY,
    loaiCa VARCHAR(50),
    trangThai VARCHAR(20),
    maNV VARCHAR(10),
    ngayLam DATE,
    gioBatDau TIME,
    gioKetThuc TIME,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE Luong (
    maLuong VARCHAR(10) PRIMARY KEY,
    maNV VARCHAR(10),
    thang INT,
    nam INT,
    luongCoBan FLOAT,
    soNgayCong INT,
    phuCap FLOAT,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE KhachHang (
    maKH VARCHAR(10) PRIMARY KEY,
    tenKH VARCHAR(100),
    tuoi INT,
	gioiTinh VARCHAR(10),
    sdt VARCHAR(15),
    diaChi VARCHAR(255)
);

CREATE TABLE HoaDon (
    maHD VARCHAR(10) PRIMARY KEY,
    maNV VARCHAR(10),
    ngayBan DATE,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE ChiTietHoaDon (
    maHD VARCHAR(10),
    maKH VARCHAR(10),
    maSP VARCHAR(10),
    soLuong INT,
    PRIMARY KEY (maHD, maSP),
    FOREIGN KEY (maHD) REFERENCES HoaDon(maHD),
    FOREIGN KEY (maKH) REFERENCES KhachHang(maKH),
    FOREIGN KEY (maSP) REFERENCES SanPham(maSP)
);

CREATE TABLE SanPham (
    maSP VARCHAR(10) PRIMARY KEY,
    tenSP VARCHAR(100),
    maLoai VARCHAR(10),
    donGia FLOAT,
    soLuongMoiDonVi VARCHAR(50),
    soLuongTrongKho INT,
    soLuongDangDatHang INT,
    mucDatHangLai INT,
    ngungKinhDoanh BIT,
    FOREIGN KEY (maLoai) REFERENCES LoaiSanPham(maLoai)
);

CREATE TABLE LoaiSanPham (
    maLoai VARCHAR(10) PRIMARY KEY,
    tenLoai VARCHAR(100)
);

CREATE TABLE KhuyenMai (
	maKhuyenMai VARCHAR(10) PRIMARY KEY,
	moTa NVARCHAR(255)
);

CREATE TABLE ChiTietKhuyenMai (
	maKhuyenMai VARCHAR(10),
	maSP VARCHAR(10),
	phanTramKhuyenMai FLOAT,
	ngayBDKM DATE,
	ngayKTKM DATE
	PRIMARY KEY (maKhuyenMai, maSP),
	FOREIGN KEY (maKhuyenMai) REFERENCES KhuyenMai(maKhuyenMai),
	FOREIGN KEY (maSP) REFERENCES SanPham(maSP)
); 

CREATE TABLE NhaCungCap (
    maNCC VARCHAR(10) PRIMARY KEY,
    tenNCC VARCHAR(100),
    sdt VARCHAR(15),
    emailLienHe VARCHAR(100),
    diaChi VARCHAR(255)
);

CREATE TABLE PhieuNhap (
    maPhieuNhap VARCHAR(10) PRIMARY KEY,
    maNCC VARCHAR(10),
    ngayNhap DATE,
    FOREIGN KEY (maNCC) REFERENCES NhaCungCap(maNCC)
);

CREATE TABLE ChiTietPhieuNhap (
    maPhieuNhap VARCHAR(10),
    maSP VARCHAR(10),
    soLuongNhap INT,
    giaNhap FLOAT,
    PRIMARY KEY (maPhieuNhap, maSP),
    FOREIGN KEY (maPhieuNhap) REFERENCES PhieuNhap(maPhieuNhap),
    FOREIGN KEY (maSP) REFERENCES SanPham(maSP)
);

ALTER TABLE NhaCungCap
ALTER COLUMN tenNCC NVARCHAR(100);
ALTER TABLE NhaCungCap
ALTER COLUMN diaChi NVARCHAR(255);

ALTER TABLE LoaiSanPham
ALTER COLUMN tenLoai NVARCHAR(100);

ALTER TABLE SanPham
ALTER COLUMN tenSP NVARCHAR(100);
ALTER TABLE SanPham
ALTER COLUMN soLuongMoiDonVi NVARCHAR(50);

ALTER TABLE KhachHang
ALTER COLUMN tenKH NVARCHAR(100);
ALTER TABLE KhachHang
ALTER COLUMN diaChi NVARCHAR(255);

ALTER TABLE NhanVien
ALTER COLUMN tenNV NVARCHAR(100);
ALTER TABLE NhanVien
ALTER COLUMN diaChi NVARCHAR(255);

ALTER TABLE CaLamViec
ALTER COLUMN loaiCa NVARCHAR(50);
ALTER TABLE CaLamViec
ALTER COLUMN trangThai NVARCHAR(20);

EXEC sp_help NhaCungCap;
EXEC sp_help LoaiSanPham;
EXEC sp_help SanPham;
EXEC sp_help KhachHang;
EXEC sp_help NhanVien;
EXEC sp_help CaLamViec;
