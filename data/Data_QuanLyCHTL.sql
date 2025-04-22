USE QuanLyCHTL;

--Dữ liệu cho bảng NhaCungCap:
INSERT INTO NhaCungCap (maNCC, tenNCC, sdt, emailLienHe, diaChi) 
VALUES ('NCC001', N'Công ty ABC', '0909123456', 'abc@gmail.com', N'123 Đường A, TP.HCM'), ('NCC002', N'Công ty XYZ', '0911222333', 'xyz@gmail.com', N'456 Đường B, Hà Nội');

--Dữ liệu cho bảng PhieuNhap:
INSERT INTO PhieuNhap (maPhieuNhap, maNCC, ngayNhap)
VALUES ('PN001', 'NCC001', '2024-04-01'), ('PN002', 'NCC002', '2024-04-02');

--Dữ liệu cho bảng LoaiSanPham:
INSERT INTO LoaiSanPham (maLoai, tenLoai)
VALUES ('L01', N'Giày Sneaker'), ('L02', N'Dép Sandal');

--Dữ liệu cho bảng SanPham:
INSERT INTO SanPham (maSP, tenSP, maLoai, donGia, soLuongMoiDonVi, soLuongTrongKho, soLuongDangDatHang, mucDatHangLai, ngungKinhDoanh)
VALUES ('SP001', N'Giày Nike Air', 'L01', 1500000, N'1 đôi', 120, 10, 5, 0), ('SP002', N'Dép tổ ong', 'L02', 50000, N'1 đôi', 300, 20, 10, 0); --0=false, 1=true

--Dữ liệu cho bảng ChiTietPhieuNhap:
INSERT INTO ChiTietPhieuNhap (maPhieuNhap, maSP, soLuongNhap, giaNhap)
VALUES ('PN001', 'SP001', 100, 50000), ('PN002', 'SP002', 200, 30000);

--Dữ liệu cho bảng KhuyenMai:
INSERT INTO KhuyenMai (maKhuyenMai, moTa)
VALUES ('KM001', N'Giảm 10% sản phẩm Nike');

--Dữ liệu cho bảng ChiTietKhuyenMai:
INSERT INTO ChiTietKhuyenMai (maKhuyenMai, maSP, phanTramKhuyenMai, ngayBDKM, ngayKTKM)
VALUES ('KM001', 'SP001', 10, '2024-04-01', '2024-04-15');

--Dữ liệu cho bảng KhachHang:
INSERT INTO KhachHang (maKH, tenKH, tuoi, sdt, diaChi, gioiTinh)
VALUES ('KH001', N'Nguyễn Văn A', 25, '0987654321', N'789 Đường C, Đà Nẵng', 'Nam');

--Dữ liệu cho bảng NhanVien:
INSERT INTO NhanVien (maNV, tenNV, tuoi, gioiTinh, sdt, diaChi)
VALUES ('NV001', N'Trần Thị B', 30, N'Nữ', '0912345678', N'111 Đường D, TP.HCM');

--Dữ liệu cho bảng TaiKhoan:
INSERT INTO TaiKhoan (tenTaiKhoan, matKhau, trangThai, maNV)
VALUES ('admin', '123456', 'Active', 'NV001');

--Dữ liệu cho bảng Luong:
INSERT INTO Luong (maLuong, maNV, thang, nam, luongCoBan, soNgayCong, phuCap)
VALUES ('LU001', 'NV001', 4, 2024, 8000000, 22, 1000000);

--Dữ liệu cho bảng CaLamViec:
INSERT INTO CaLamViec (maCa, loaiCa, trangThai, maNV, ngayLam, gioBatDau, gioKetThuc)
VALUES ('CA001', N'Sáng', N'Đang làm', 'NV001', '2024-04-01', '07:00:00', '11:00:00');

--Dữ liệu cho bảng HoaDon:
INSERT INTO HoaDon (maHD, maNV, ngayBan)
VALUES ('HD001', 'NV001', '2024-04-03');

--Dữ liệu cho bảng ChiTietHoaDon:
INSERT INTO ChiTietHoaDon (maHD, maKH, maSP, soLuong)
VALUES ('HD001', 'KH001', 'SP001', 2);

