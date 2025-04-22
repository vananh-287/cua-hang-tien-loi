package cua_hang_tien_loi.entity ;

public class ChiTietPhieuNhap {
	private String maPhieuNhap;
    private SanPham maSP;
    private int soLuongNhap;
    private double giaNhap;

    public ChiTietPhieuNhap(String maPhieuNhap, SanPham maSP, int soLuongNhap, double giaNhap) {
        this.maPhieuNhap = maPhieuNhap;
        this.maSP = maSP;
        this.soLuongNhap = soLuongNhap;
        this.giaNhap = giaNhap;
    }

	public String getMaPhieuNhap() {
		return maPhieuNhap;
	}

	public void setMaPhieuNhap(String maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public int getSoLuongNhap() {
		return soLuongNhap;
	}

	public void setSoLuongNhap(int soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	@Override
	public String toString() {
		return "ChiTietPhieuNhap [maPhieuNhap=" + maPhieuNhap + ", maSP=" + maSP + ", soLuongNhap=" + soLuongNhap
				+ ", giaNhap=" + giaNhap + "]";
	}


}
