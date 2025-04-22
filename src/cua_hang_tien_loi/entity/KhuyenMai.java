package cua_hang_tien_loi.entity ;

import java.sql.Date;

public class KhuyenMai {
	private String maKhuyenMai;
    private String moTa;
    private SanPham maSP;
    private double phanTramKhuyenMai;
    private Date ngayBDKM;
    private Date ngayKTKM;
    private boolean coHieuLuc;

    public KhuyenMai(String maKhuyenMai, String moTa, SanPham maSP, double phanTramKhuyenMai, Date ngayBDKM, Date ngayKTKM, boolean coHieuLuc) {
        this.maKhuyenMai = maKhuyenMai;
        this.moTa = moTa;
        this.maSP = maSP;
        this.phanTramKhuyenMai = phanTramKhuyenMai;
        this.ngayBDKM = ngayBDKM;
        this.ngayKTKM = ngayKTKM;
        this.coHieuLuc = coHieuLuc;
    }

	public String getMaKhuyenMai() {
		return maKhuyenMai;
	}

	public void setMaKhuyenMai(String maKhuyenMai) {
		this.maKhuyenMai = maKhuyenMai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public double getPhanTramKhuyenMai() {
		return phanTramKhuyenMai;
	}

	public void setPhanTramKhuyenMai(double phanTramKhuyenMai) {
		this.phanTramKhuyenMai = phanTramKhuyenMai;
	}

	public Date getNgayBDKM() {
		return ngayBDKM;
	}

	public void setNgayBDKM(Date ngayBDKM) {
		this.ngayBDKM = ngayBDKM;
	}

	public Date getNgayKTKM() {
		return ngayKTKM;
	}

	public void setNgayKTKM(Date ngayKTKM) {
		this.ngayKTKM = ngayKTKM;
	}

	public boolean isCoHieuLuc() {
		return coHieuLuc;
	}

	public void setCoHieuLuc(boolean coHieuLuc) {
		this.coHieuLuc = coHieuLuc;
	}

	@Override
	public String toString() {
		return "KhuyenMai [maKhuyenMai=" + maKhuyenMai + ", moTa=" + moTa + ", maSP=" + maSP + ", phanTramKhuyenMai="
				+ phanTramKhuyenMai + ", ngayBDKM=" + ngayBDKM + ", ngayKTKM=" + ngayKTKM + ", coHieuLuc=" + coHieuLuc
				+ "]";
	}
    

}
