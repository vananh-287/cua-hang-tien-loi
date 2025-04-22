package cua_hang_tien_loi.entity ;

import java.util.Date;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String sdt;
    private String diaChi;
    private String gioiTinh;
    private int tuoi;

    public NhanVien(String maNV, String tenNV, String sdt, String diaChi, String gioiTinh, int tuoi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
    	return maNV; 
    	}
    public void setMaNV(String maNV) {
    	this.maNV = maNV; 
    	}
    public String getTenNV() { 
    	return tenNV;
    }
    public void setTenNV(String tenNV) {
    	this.tenNV = tenNV; 
    	}
    public String getSdt() { 
    	return sdt; 
    	}
    public void setSdt(String sdt) {
    	this.sdt = sdt; 
    	}
    public String getDiaChi() { return diaChi;
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
    public int getTuoi() { 
    	return tuoi; 
    }
    public void setTuoi(int tuoi) { 
    	this.tuoi = tuoi; 
    	}

    @Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", sdt=" + sdt + ", diaChi=" + diaChi + ", gioiTinh="
				+ gioiTinh + ", tuoi=" + tuoi + "]";
	}
}
