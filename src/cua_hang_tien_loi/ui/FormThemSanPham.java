package cua_hang_tien_loi.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cua_hang_tien_loi.utils.MenuUtils;

public class FormThemSanPham extends JFrame implements ActionListener {

	private JMenuItem itemTaiKhoan;
	private JMenuItem itemTroGiup;
	private JMenuItem itemDangXuat;
	private JMenuItem itemThemSP;
	private JMenuItem itemTraCuuSP;
	private JMenuItem itemCapNhatSp;
	private JMenuItem itemTraCuuKH;
	private JMenuItem itemThemKH;
	private JMenuItem itemCapNhatKH;
	private JMenuItem itemTraCuuHD;
	private JMenuItem itemThemHD;
	private JMenuItem itemCapNhatHD;
	private JMenuItem itemTraCuuNV;
	private JMenuItem itemThemNV;
	private JMenuItem itemCapNhatNV;
	private JMenuItem itemDoanhThu;
	private JMenuItem itemKhachHang;
	private JMenuItem itemSanPham;
	private JMenuItem itemDTTheoNgay;
	private JMenuItem itemDTTheoThang;
	private JMenuItem itemDTTheoNam;
	private JMenuItem menuQuayLai;
	private JMenuItem itemDTKhachHang;
	private JMenuItem itemDTSanPham;
	private JMenuItem itemQuayLai;
	private JButton btnImg;
	private JTextField txtMaSanPham;
	private JTextField txtTenSanPham;
	private JComboBox cboLoaiSanPham;
	private JComboBox cboTrangThai;
	private JTextField txtChatLieu;
	private JTextField txtKhuyenMai;
	private JTextField txtNgayBatDau;
	private JTextField txtNgayKetThuc;
	private JButton btnLamMoi;
	private JButton btnThem;
	private JTextField txtDonGia;

	public FormThemSanPham() {
		// TODO Auto-generated constructor stub
		this.UIFormThemSanPham();
	}

	private void UIFormThemSanPham() {
		setTitle("Quản lý cửa hàng tiện lợi - Thêm sản phẩm");
		setSize(1000, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// main
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());

		// north
		JPanel pnNorth = new JPanel();
		pnNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnNorth.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
		pnNorth.setPreferredSize(new Dimension(750, 40));

		// Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null
				 

		// he thong
		JMenu menuHeThong = new JMenu("Hệ thống");
		menuHeThong.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/hethong.png"));
		menuHeThong.setBorderPainted(false);
		itemTaiKhoan = MenuUtils.createItemMenu("Tài khoản", "src/cua_hang_tien_loi/icon/account.png");
		itemTroGiup = MenuUtils.createItemMenu("Trợ giúp", "src/cua_hang_tien_loi/icon/helpdesk.png");
		itemDangXuat = MenuUtils.createItemMenu("Đăng xuất", "src/cua_hang_tien_loi/icon/logout.png");

		menuHeThong.add(itemTaiKhoan);
		menuHeThong.addSeparator();
		menuHeThong.add(itemTroGiup);
		menuHeThong.addSeparator();
		menuHeThong.add(itemDangXuat);
		menuBar.add(menuHeThong);
		menuBar.add(Box.createHorizontalStrut(25));

		// san pham
		JMenu menuSanPham = new JMenu("Sản phẩm");
		menuSanPham.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/product.png"));
		itemThemSP = MenuUtils.createItemMenu("Thêm", "src/cua_hang_tien_loi/icon/add.png");
		itemCapNhatSp = MenuUtils.createItemMenu("Cập nhật", "src/cua_hang_tien_loi/icon/edit.png");

		menuSanPham.add(itemThemSP);
		menuSanPham.addSeparator();
		menuSanPham.add(itemCapNhatSp);
		menuBar.add(menuSanPham);
		menuBar.add(Box.createHorizontalStrut(25));

		// khach hang
		JMenu menuKhachHang = new JMenu("Khách hàng");
		menuKhachHang.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/customer.png"));
		itemTraCuuKH = MenuUtils.createItemMenu("Tra cứu", "src/cua_hang_tien_loi/icon/search.png");
		itemThemKH = MenuUtils.createItemMenu("Thêm", "src/cua_hang_tien_loi/icon/add.png");
		itemCapNhatKH = MenuUtils.createItemMenu("Cập nhật", "src/cua_hang_tien_loi/icon/edit.png");

		menuKhachHang.add(itemTraCuuKH);
		menuKhachHang.addSeparator();
		menuKhachHang.add(itemThemKH);
		menuKhachHang.addSeparator();
		menuKhachHang.add(itemCapNhatKH);
		menuBar.add(menuKhachHang);
		menuBar.add(Box.createHorizontalStrut(25));

		// hoa don
		JMenu menuHoaDon = new JMenu("Hoá đơn");
		menuHoaDon.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/invoice.png"));
		itemTraCuuHD = MenuUtils.createItemMenu("Tra cứu", "src/cua_hang_tien_loi/icon/search.png");
		itemThemHD = MenuUtils.createItemMenu("Thêm", "src/cua_hang_tien_loi/icon/add.png");
		itemCapNhatHD = MenuUtils.createItemMenu("Cập nhật", "src/cua_hang_tien_loi/icon/edit.png");

		menuHoaDon.add(itemTraCuuHD);
		menuHoaDon.addSeparator();
		menuHoaDon.add(itemThemHD);
		menuHoaDon.addSeparator();
		menuHoaDon.add(itemCapNhatHD);
		menuBar.add(menuHoaDon);
		menuBar.add(Box.createHorizontalStrut(25));

		// nhan vien
		JMenu menuNhanVien = new JMenu("Nhân viên");
		menuNhanVien.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/employee.png"));
		itemTraCuuNV = MenuUtils.createItemMenu("Tra cứu", "src/cua_hang_tien_loi/icon/search.png");
		itemThemNV = MenuUtils.createItemMenu("Thêm", "src/cua_hang_tien_loi/icon/add.png");
		itemCapNhatNV = MenuUtils.createItemMenu("Cập nhật", "src/cua_hang_tien_loi/icon/edit.png");

		menuNhanVien.add(itemTraCuuNV);
		menuNhanVien.addSeparator();
		menuNhanVien.add(itemThemNV);
		menuNhanVien.addSeparator();
		menuNhanVien.add(itemCapNhatNV);
		menuBar.add(menuNhanVien);
		menuBar.add(Box.createHorizontalStrut(25));

		// thong ke
		JMenu menuThongKe = new JMenu("Thống kê");
		menuThongKe.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/thongke.png"));

		JMenu itemDoanhThu = new JMenu("Doanh thu");
		itemDoanhThu.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/doanhthu.png"));

		itemDTTheoNgay = MenuUtils.createItemMenu("Theo ngày", "src/cua_hang_tien_loi/icon/day.png");
		itemDTTheoThang = MenuUtils.createItemMenu("Theo tháng", "src/cua_hang_tien_loi/icon/month.png");
		itemDTTheoNam = MenuUtils.createItemMenu("Theo năm", "src/cua_hang_tien_loi/icon/year.png");

		itemDoanhThu.add(itemDTTheoNgay);
		itemDoanhThu.addSeparator();
		itemDoanhThu.add(itemDTTheoThang);
		itemDoanhThu.addSeparator();
		itemDoanhThu.add(itemDTTheoNam);

		itemDTKhachHang = MenuUtils.createItemMenu("Khách hàng", "src/cua_hang_tien_loi/icon/customer.png");
		itemDTSanPham = MenuUtils.createItemMenu("Sản phẩm", "src/cua_hang_tien_loi/icon/product.png");

		menuThongKe.add(itemDoanhThu);
		menuThongKe.addSeparator();
		menuThongKe.add(itemDTKhachHang);
		menuThongKe.addSeparator();
		menuThongKe.add(itemDTSanPham);

		menuBar.add(menuThongKe);
		menuBar.add(Box.createHorizontalStrut(25));

		// quay lai
		menuBar.add(Box.createVerticalStrut(10));
		itemQuayLai = MenuUtils.createItemMenu("Quay lại (F1)", "src/cua_hang_tien_loi/icon/quaylai.png");
		menuBar.add(itemQuayLai);

		pnNorth.add(menuBar);
		pnNorth.add(Box.createVerticalStrut(5));

		pnMain.add(pnNorth, BorderLayout.NORTH);

		// cen
		JPanel pnCen = new JPanel();

		pnCen.setLayout(new BoxLayout(pnCen, BoxLayout.X_AXIS));

		// left of cen
		JPanel pnLeftOfCen = new JPanel();
		pnLeftOfCen.setLayout(new BorderLayout());
		pnLeftOfCen.setPreferredSize(new Dimension(200, 200));

		JLabel lblImage = new JLabel("Ảnh chưa chọn", JLabel.CENTER);
		lblImage.setPreferredSize(new Dimension(100, 100));
		lblImage.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnLeftOfCen.add(lblImage, BorderLayout.CENTER);

		btnImg = new JButton("Chọn ảnh");
		pnLeftOfCen.add(btnImg, BorderLayout.SOUTH);

		pnCen.add(pnLeftOfCen);

		// center of cen

		JPanel pnCenterOfCen = new JPanel();
		pnCenterOfCen.setLayout(new BoxLayout(pnCenterOfCen, BoxLayout.Y_AXIS));
		pnCenterOfCen.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		// ma sp
		JPanel pnMaSanPham = new JPanel();
		pnMaSanPham.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMaSanPham = new JLabel("Mã sản phẩm:");
		txtMaSanPham = new JTextField(20);
		pnMaSanPham.add(lblMaSanPham);
		pnMaSanPham.add(txtMaSanPham);

		// ten sp
		JPanel pnTenSanPham = new JPanel();
		pnTenSanPham.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTenSanPham = new JLabel("Tên sản phẩm:");
		txtTenSanPham = new JTextField(19);
		pnTenSanPham.add(lblTenSanPham);
		pnTenSanPham.add(txtTenSanPham);

		// loai sp
		JPanel pnLoaiSanPham = new JPanel();
		pnLoaiSanPham.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblLoaiSanPham = new JLabel("Loại sản phẩm:");
		String[] loaiSanPham = { "Điện thoại", "Máy tính", "Tivi", "Máy ảnh" };
		cboLoaiSanPham = new JComboBox<>(loaiSanPham);
		pnLoaiSanPham.add(lblLoaiSanPham);
		pnLoaiSanPham.add(cboLoaiSanPham);

		// trang thai kinh doanh
		JPanel pnTrangThai = new JPanel();
		pnTrangThai.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTrangThai = new JLabel("TTKD:");
		String[] trangThai = { "Còn hàng", "Hết hàng", "Sắp ra mắt" };
		cboTrangThai = new JComboBox<>(trangThai);
		pnTrangThai.add(lblTrangThai);
		pnTrangThai.add(cboTrangThai);

		// don gia
		JPanel pnDonGia = new JPanel();
		pnDonGia.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblDonGia = new JLabel("Đơn giá:");
		txtDonGia = new JTextField(20);
		pnDonGia.add(lblDonGia);
		pnDonGia.add(txtDonGia);

		// add vo pn
		pnCenterOfCen.add(pnMaSanPham);
		pnCenterOfCen.add(pnTenSanPham);
		pnCenterOfCen.add(pnLoaiSanPham);
		pnCenterOfCen.add(pnTrangThai);
		pnCenterOfCen.add(pnDonGia);

		pnCen.add(pnCenterOfCen);

		// right of cen

		JPanel pnRightOfCen = new JPanel();
		pnRightOfCen.setLayout(new BoxLayout(pnRightOfCen, BoxLayout.Y_AXIS));
		pnRightOfCen.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		// chat lieu
		JPanel pnChatLieu = new JPanel();
		pnChatLieu.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblChatLieu = new JLabel("Chất liệu:");
		txtChatLieu = new JTextField(20);
		pnChatLieu.add(lblChatLieu);
		pnChatLieu.add(txtChatLieu);

		// % km
		JPanel pnKhuyenMai = new JPanel();
		pnKhuyenMai.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblKhuyenMai = new JLabel("% Khuyến mãi:");
		txtKhuyenMai = new JTextField(20);
		pnKhuyenMai.add(lblKhuyenMai);
		pnKhuyenMai.add(txtKhuyenMai);

		// ngay bd km
		JPanel pnNgayBatDau = new JPanel();
		pnNgayBatDau.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNgayBatDau = new JLabel("Ngày bắt đầu KM:");
		txtNgayBatDau = new JTextField(20);
		pnNgayBatDau.add(lblNgayBatDau);
		pnNgayBatDau.add(txtNgayBatDau);

		// ngay ket thuc km
		JPanel pnNgayKetThuc = new JPanel();
		pnNgayKetThuc.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNgayKetThuc = new JLabel("Ngày kết thúc KM:");
		txtNgayKetThuc = new JTextField(20);
		pnNgayKetThuc.add(lblNgayKetThuc);
		pnNgayKetThuc.add(txtNgayKetThuc);

		// button
		JPanel pnBtn = new JPanel();
		pnBtn.setLayout(new FlowLayout(FlowLayout.LEFT));

		btnLamMoi = new JButton("Làm mới", new ImageIcon("src/cua_hang_tien_loi/icon/lammoi.png"));
		btnThem = new JButton("Thêm", new ImageIcon("src/cua_hang_tien_loi/icon/add.png"));

		pnBtn.add(btnLamMoi);
		pnBtn.add(btnThem);
		// 
		Dimension txtSize = new Dimension(120, 25);  

		txtMaSanPham.setPreferredSize(txtSize);
		txtTenSanPham.setPreferredSize(txtSize);
		txtChatLieu.setPreferredSize(txtSize);
		txtKhuyenMai.setPreferredSize(txtSize);
		txtNgayBatDau.setPreferredSize(txtSize);
		txtNgayKetThuc.setPreferredSize(txtSize);
		txtDonGia.setPreferredSize(txtSize);
		cboLoaiSanPham.setPreferredSize(new Dimension(185, 25));
		cboTrangThai.setPreferredSize(new Dimension(185, 25));
		Dimension lblSize = new Dimension(120, 25);

		lblMaSanPham.setPreferredSize(lblSize);
		lblTenSanPham.setPreferredSize(lblSize);
		lblChatLieu.setPreferredSize(lblSize);
		lblKhuyenMai.setPreferredSize(lblSize);
		lblNgayBatDau.setPreferredSize(lblSize);
		lblNgayKetThuc.setPreferredSize(lblSize);
		lblDonGia.setPreferredSize(lblSize);
		lblTrangThai.setPreferredSize(lblSize);
		lblLoaiSanPham.setPreferredSize(lblSize);

		// add vo pnRight
		pnRightOfCen.add(pnChatLieu);
		pnRightOfCen.add(pnKhuyenMai);
		pnRightOfCen.add(pnNgayBatDau);
		pnRightOfCen.add(pnNgayKetThuc);
		pnRightOfCen.add(pnBtn);

		pnCen.add(pnRightOfCen);

		pnMain.add(pnCen, BorderLayout.CENTER);

		add(pnMain);

		// event

		// he thong
		itemTaiKhoan.addActionListener(this);
		itemTroGiup.addActionListener(this);
		itemDangXuat.addActionListener(this);

		// san pham
		itemCapNhatSp.addActionListener(this);
		itemThemSP.addActionListener(this);

		// khach hang
		itemTraCuuKH.addActionListener(this);
		itemCapNhatKH.addActionListener(this);
		itemThemKH.addActionListener(this);

		// hoa don
		itemTraCuuHD.addActionListener(this);
		itemThemHD.addActionListener(this);

		// nhan vien
		itemTraCuuNV.addActionListener(this);
		itemCapNhatNV.addActionListener(this);
		itemThemNV.addActionListener(this);

		// thong ke
		itemDTTheoNgay.addActionListener(this);
		itemDTTheoThang.addActionListener(this);
		itemDTTheoNam.addActionListener(this);
		itemDTKhachHang.addActionListener(this);
		itemDTSanPham.addActionListener(this);

		// quay lai
		itemQuayLai.addActionListener(this);

		// btn
		btnThem.addActionListener(this);
		btnLamMoi.addActionListener(this);
	}

	public static void main(String[] args) {
		new FormThemSanPham().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	// btn lam moi
	private void clearTxtField() {
		txtMaSanPham.setText("");
		txtTenSanPham.setText("");
		txtDonGia.setText("");
		txtChatLieu.setText("");
		txtKhuyenMai.setText("");
		txtNgayBatDau.setText("");
		txtNgayKetThuc.setText("");
	}
}
