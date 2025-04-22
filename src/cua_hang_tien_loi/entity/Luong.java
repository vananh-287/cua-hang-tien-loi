package cua_hang_tien_loi.entity ;

public class Luong {
	 private String maLuong;
	    private NhanVien  maNV;
	    private int thang;
	    private int nam;
	    private double luongCoBan;
	    private int soNgayCong;
	    private double phuCap;

	    public Luong(String maLuong, NhanVien maNV, int thang, int nam, double luongCoBan, int soNgayCong, double phuCap) {
	        this.maLuong = maLuong;
	        this.maNV = maNV;
	        this.thang = thang;
	        this.nam = nam;
	        this.luongCoBan = luongCoBan;
	        this.soNgayCong = soNgayCong;
	        this.phuCap = phuCap;
	    }

		public String getMaLuong() {
			return maLuong;
		}

		public void setMaLuong(String maLuong) {
			this.maLuong = maLuong;
		}

		public NhanVien getMaNV() {
			return maNV;
		}

		public void setMaNV(NhanVien maNV) {
			this.maNV = maNV;
		}

		public int getThang() {
			return thang;
		}

		public void setThang(int thang) {
			this.thang = thang;
		}

		public int getNam() {
			return nam;
		}

		public void setNam(int nam) {
			this.nam = nam;
		}

		public double getLuongCoBan() {
			return luongCoBan;
		}

		public void setLuongCoBan(double luongCoBan) {
			this.luongCoBan = luongCoBan;
		}

		public int getSoNgayCong() {
			return soNgayCong;
		}

		public void setSoNgayCong(int soNgayCong) {
			this.soNgayCong = soNgayCong;
		}

		public double getPhuCap() {
			return phuCap;
		}

		public void setPhuCap(double phuCap) {
			this.phuCap = phuCap;
		}
		 public double tongLuong() {
		        return luongCoBan + (soNgayCong * 100000) + phuCap;
		    }

		@Override
		public String toString() {
			return "Luong [maLuong=" + maLuong + ", maNV=" + maNV + ", thang=" + thang + ", nam=" + nam
					+ ", luongCoBan=" + luongCoBan + ", soNgayCong=" + soNgayCong + ", phuCap=" + phuCap + "]";
		}

}
