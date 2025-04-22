package cua_hang_tien_loi.entity ;

public class Loai {
	private String maLoai;
    private String tenLoai;

    public Loai(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	@Override
	public String toString() {
		return "Loai [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
    

}
