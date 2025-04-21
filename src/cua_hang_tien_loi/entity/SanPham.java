package cua_hang_tien_loi.entity;

public class SanPham {
	private String maSP;
	private String tenSP;
	private long giaNhap;
	private String hinhAnh;
	private int soLuong;
	private Loai loai;
	private NhaCungCap ncc;

	public SanPham(String maSP, String tenSP, long giaNhap, String hinhAnh, int soLuong, Loai loai, NhaCungCap ncc) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaNhap = giaNhap;
		this.hinhAnh = hinhAnh;
		this.soLuong = soLuong;
		this.loai = loai;
		this.ncc = ncc;
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

	public long getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(long giaNhap) {
		this.giaNhap = giaNhap;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public Loai getLoai() {
		return loai;
	}

	public void setLoai(Loai loai) {
		this.loai = loai;
	}

	public NhaCungCap getNcc() {
		return ncc;
	}

	public void setNcc(NhaCungCap ncc) {
		this.ncc = ncc;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", giaNhap=" + giaNhap + ", hinhAnh=" + hinhAnh
				+ ", soLuong=" + soLuong + ", loai=" + loai + ", ncc=" + ncc + "]";
	}

}
