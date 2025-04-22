package cua_hang_tien_loi.entity ;

import java.sql.Date;

public class PhieuNhap {
	private String maPhieuNhap;
    private NhaCungCap maNCC;
    private Date ngayNhap;

    public PhieuNhap(String maPhieuNhap, NhaCungCap maNCC, Date ngayNhap) {
        this.maPhieuNhap = maPhieuNhap;
        this.maNCC = maNCC;
        this.ngayNhap = ngayNhap;
    }

	public String getMaPhieuNhap() {
		return maPhieuNhap;
	}

	public void setMaPhieuNhap(String maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}

	public NhaCungCap getMaNCC() {
		return maNCC;
	}

	public void setMaNCC(NhaCungCap maNCC) {
		this.maNCC = maNCC;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	@Override
	public String toString() {
		return "PhieuNhap [maPhieuNhap=" + maPhieuNhap + ", maNCC=" + maNCC + ", ngayNhap=" + ngayNhap + "]";
	}
    

}
