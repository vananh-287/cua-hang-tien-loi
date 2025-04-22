package cua_hang_tien_loi.entity ;

import java.sql.Date;

public class HoaDon {
	 private String maHD;
	    private String maNV;
	    private String maKH;
	    private KhuyenMai maKhuyenMai;
	    private Date ngayBan;

	    public HoaDon(String maHD, String maNV, String maKH, KhuyenMai maKhuyenMai, Date ngayBan) {
	        this.maHD = maHD;
	        this.maNV = maNV;
	        this.maKH = maKH;
	        this.maKhuyenMai = maKhuyenMai;
	        this.ngayBan = ngayBan;
	    }

		public String getMaHD() {
			return maHD;
		}

		public void setMaHD(String maHD) {
			this.maHD = maHD;
		}

		public String getMaNV() {
			return maNV;
		}

		public void setMaNV(String maNV) {
			this.maNV = maNV;
		}

		public String getMaKH() {
			return maKH;
		}

		public void setMaKH(String maKH) {
			this.maKH = maKH;
		}

		public KhuyenMai getMaKhuyenMai() {
			return maKhuyenMai;
		}

		public void setMaKhuyenMai(KhuyenMai maKhuyenMai) {
			this.maKhuyenMai = maKhuyenMai;
		}

		public Date getNgayBan() {
			return ngayBan;
		}

		public void setNgayBan(Date ngayBan) {
			this.ngayBan = ngayBan;
		}

		@Override
		public String toString() {
			return "HoaDon [maHD=" + maHD + ", maNV=" + maNV + ", maKH=" + maKH + ", maKhuyenMai=" + maKhuyenMai
					+ ", ngayBan=" + ngayBan + "]";
		}
	    

}
