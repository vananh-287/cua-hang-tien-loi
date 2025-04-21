package cua_hang_tien_loi.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CaLamViec {
	private String maCa;
	private LocalDate ngayLam;
	private LocalDateTime gioBD;
	private LocalDateTime gioKT;
	private NhanVien maNV;

	public CaLamViec(String maCa, LocalDate ngayLam, LocalDateTime gioBD, LocalDateTime gioKT, NhanVien maNV) {
		super();
		this.maCa = maCa;
		this.ngayLam = ngayLam;
		this.gioBD = gioBD;
		this.gioKT = gioKT;
		this.maNV = maNV;
	}

	public String getMaCa() {
		return maCa;
	}

	public void setMaCa(String maCa) {
		this.maCa = maCa;
	}

	public LocalDate getNgayLam() {
		return ngayLam;
	}

	public void setNgayLam(LocalDate ngayLam) {
		this.ngayLam = ngayLam;
	}

	public LocalDateTime getGioBD() {
		return gioBD;
	}

	public void setGioBD(LocalDateTime gioBD) {
		this.gioBD = gioBD;
	}

	public LocalDateTime getGioKT() {
		return gioKT;
	}

	public void setGioKT(LocalDateTime gioKT) {
		this.gioKT = gioKT;
	}

	public NhanVien getMaNV() {
		return maNV;
	}

	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}

	@Override
	public String toString() {
		return "CaLam [maCa=" + maCa + ", ngayLam=" + ngayLam + ", gioBD=" + gioBD + ", gioKT=" + gioKT + ", maNV="
				+ maNV + "]";
	}

}
