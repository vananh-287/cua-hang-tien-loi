package cua_hang_tien_loi.entity;

public class NhaCungCap {
	private String maNCC;
	private String tenNCC;
	private String sdt;
	private String emailLienHe;
	private String diaChi;

	public NhaCungCap(String maNCC, String tenNCC, String sdt, String emailLienHe, String diaChi) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.sdt = sdt;
		this.emailLienHe = emailLienHe;
		this.diaChi = diaChi;
	}

	public String getMaNCC() {
		return maNCC;
	}

	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}

	public String getTenNCC() {
		return tenNCC;
	}

	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmailLienHe() {
		return emailLienHe;
	}

	public void setEmailLienHe(String emailLienHe) {
		this.emailLienHe = emailLienHe;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "NhaCungCap [maNCC=" + maNCC + ", tenNCC=" + tenNCC + ", sdt=" + sdt + ", emailLienHe=" + emailLienHe
				+ ", diaChi=" + diaChi + "]";
	}

}
