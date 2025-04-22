package cua_hang_tien_loi.entity ;
public class ChiTietHoaDon {
	private HoaDon maHD;
    private KhachHang maKH;
    private int soLuong;
    private double gia;
    private SanPham maSP;

    public ChiTietHoaDon(HoaDon maHD, KhachHang maKH, int soLuong, double gia, SanPham maSP) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.soLuong = soLuong;
        this.gia = gia;
        this.maSP = maSP;
    }

	public HoaDon getMaHD() {
		return maHD;
	}

	public void setMaHD(HoaDon maHD) {
		this.maHD = maHD;
	}

	public KhachHang getMaKH() {
		return maKH;
	}

	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [maHD=" + maHD + ", maKH=" + maKH + ", soLuong=" + soLuong + ", gia=" + gia + ", maSP="
				+ maSP + "]";
	}
    

}
