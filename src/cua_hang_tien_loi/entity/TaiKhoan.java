package cua_hang_tien_loi.entity ;

public class TaiKhoan {
	 private String tenTaiKhoan;
	    private String matKhau;
	    private String trangThai;
	    private NhanVien maNV;

	    public TaiKhoan(String tenTaiKhoan, String matKhau, String trangThai, NhanVien  maNV) {
	        this.tenTaiKhoan = tenTaiKhoan;
	        this.matKhau = matKhau;
	        this.trangThai = trangThai;
	        this.maNV = maNV;
	    }

		public String getTenTaiKhoan() {
			return tenTaiKhoan;
		}

		public void setTenTaiKhoan(String tenTaiKhoan) {
			this.tenTaiKhoan = tenTaiKhoan;
		}

		public String getMatKhau() {
			return matKhau;
		}

		public void setMatKhau(String matKhau) {
			this.matKhau = matKhau;
		}

		public String getTrangThai() {
			return trangThai;
		}

		public void setTrangThai(String trangThai) {
			this.trangThai = trangThai;
		}

		public NhanVien getMaNV() {
			return maNV;
		}

		public void setMaNV(NhanVien maNV) {
			this.maNV = maNV;
		}
		public void datLaiMatKhau() {}
	    public void dangNhap() {}

		@Override
		public String toString() {
			return "TaiKhoan [tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", trangThai=" + trangThai
					+ ", maNV=" + maNV + "]";
		}
	    

}
