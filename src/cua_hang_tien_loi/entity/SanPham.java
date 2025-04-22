package cua_hang_tien_loi.entity ;

public class SanPham {
	private String maSP;
    private String tenSP;
    private Loai maLoai;
    private String donGia;
    private String soLuongMoiDonVi;
    private int soLuongTrongKho;
    private int soLuongDangDatHang;
    private int mucDatHangLai;
    private boolean ngungKinhDoanh;

    public SanPham(String maSP, String tenSP, Loai maLoai, String donGia, String soLuongMoiDonVi, int soLuongTrongKho, int soLuongDangDatHang, int mucDatHangLai, boolean ngungKinhDoanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maLoai = maLoai;
        this.donGia = donGia;
        this.soLuongMoiDonVi = soLuongMoiDonVi;
        this.soLuongTrongKho = soLuongTrongKho;
        this.soLuongDangDatHang = soLuongDangDatHang;
        this.mucDatHangLai = mucDatHangLai;
        this.ngungKinhDoanh = ngungKinhDoanh;
    }

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public Loai getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Loai maLoai) {
		this.maLoai = maLoai;
	}

	public String getDonGia() {
		return donGia;
	}

	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}

	public String getSoLuongMoiDonVi() {
		return soLuongMoiDonVi;
	}

	public void setSoLuongMoiDonVi(String soLuongMoiDonVi) {
		this.soLuongMoiDonVi = soLuongMoiDonVi;
	}

	public int getSoLuongTrongKho() {
		return soLuongTrongKho;
	}

	public void setSoLuongTrongKho(int soLuongTrongKho) {
		this.soLuongTrongKho = soLuongTrongKho;
	}

	public int getSoLuongDangDatHang() {
		return soLuongDangDatHang;
	}

	public void setSoLuongDangDatHang(int soLuongDangDatHang) {
		this.soLuongDangDatHang = soLuongDangDatHang;
	}

	public int getMucDatHangLai() {
		return mucDatHangLai;
	}

	public void setMucDatHangLai(int mucDatHangLai) {
		this.mucDatHangLai = mucDatHangLai;
	}

	public boolean isNgungKinhDoanh() {
		return ngungKinhDoanh;
	}

	public void setNgungKinhDoanh(boolean ngungKinhDoanh) {
		this.ngungKinhDoanh = ngungKinhDoanh;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", maLoai=" + maLoai + ", donGia=" + donGia
				+ ", soLuongMoiDonVi=" + soLuongMoiDonVi + ", soLuongTrongKho=" + soLuongTrongKho
				+ ", soLuongDangDatHang=" + soLuongDangDatHang + ", mucDatHangLai=" + mucDatHangLai
				+ ", ngungKinhDoanh=" + ngungKinhDoanh + "]";
	}
    

}
