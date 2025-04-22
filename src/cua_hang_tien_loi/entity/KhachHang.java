package cua_hang_tien_loi.entity ;
public class KhachHang {
	 private String maKH;
	    private String tenKH;
	    private int tuoi;
	    private String sdt;
	    private String diaChi;
	    private String gioiTinh;

	    public KhachHang(String maKH, String tenKH, int tuoi, String sdt, String diaChi, String gioiTinh) {
	        this.maKH = maKH;
	        this.tenKH = tenKH;
	        this.tuoi = tuoi;
	        this.sdt = sdt;
	        this.diaChi = diaChi;
	        this.gioiTinh = gioiTinh;
	    }

	    public String getMaKH() { 
	    	return maKH;
	    	}
	    public void setMaKH(String maKH) {
	    	this.maKH = maKH; 
	    	}
	    public String getTenKH() { 
	    	return tenKH; 
	    	}
	    public void setTenKH(String tenKH) {
	    	this.tenKH = tenKH; 
	    	}
	    public int getTuoi() {
	    	return tuoi; 
	    	}
	    public void setTuoi(int tuoi) {
	    	this.tuoi = tuoi; 
	    	}
	    public String getSdt() {
	    	return sdt; 
	    	}
	    public void setSdt(String sdt) {
	    	this.sdt = sdt; 
	    	}
	    public String getDiaChi() { 
	    	return diaChi; 
	    	}
	    public void setDiaChi(String diaChi) {
	    	this.diaChi = diaChi; 
	    	}
	    public String getGioiTinh() {
	    	return gioiTinh; 
	    	}
	    public void setGioiTinh(String gioiTinh) {
	    	this.gioiTinh = gioiTinh;
	    	}

	    @Override
		public String toString() {
			return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", tuoi=" + tuoi + ", sdt=" + sdt + ", diaChi="
					+ diaChi + ", gioiTinh=" + gioiTinh + "]";
		}
	

}
