package cua_hang_tien_loi.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.Accessible;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class DangNhap extends JFrame implements ActionListener {
	private JTextField txtTaiKhoan;
	private JPasswordField txtMatKhau;
	private JButton btnDangNhap;
	private JButton btnThoat;
	private JButton btnQuenMK;
	private JToggleButton btnHienMatKhau;

	public DangNhap() {
		// TODO Auto-generated constructor stub
		this.giaoDienDangNhap();
	}

	// giao dien
	private void giaoDienDangNhap() {
		setTitle("Quản lý cửa hàng tiện lợi - Đăng nhập");
		setSize(600, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// panel main
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());

		// north
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.CYAN);
		pnNorth.setSize(new Dimension(350, 300));
		JLabel lblDangNhap = new JLabel("ĐĂNG NHẬP");
		lblDangNhap.setAlignmentX(CENTER_ALIGNMENT);
		lblDangNhap.setForeground(Color.white);
		lblDangNhap.setFont(new Font("Arial", Font.BOLD, 25));
		pnNorth.add(lblDangNhap);

		// add pnNorth
		pnMain.add(pnNorth, BorderLayout.NORTH);

		// cen
		JPanel pnCen = new JPanel();
		pnCen.setLayout(new BorderLayout());

		// west of cen
		JPanel pnWest = new JPanel();
		ImageIcon iconLogIn = new ImageIcon("src/cua_hang_tien_loi/icon/login.png");
		Image img = iconLogIn.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(img);
		JLabel iconLabel = new JLabel(scaledIcon);
		pnWest.add(iconLabel);

		pnCen.add(pnWest, BorderLayout.WEST);

		// cen of cen
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));

		// tai khoan
		JPanel pnTaiKhoan = new JPanel();
		pnTaiKhoan.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTaiKhoan = new JLabel("Tài khoản: ");
		pnCenter.add(Box.createVerticalStrut(10));
		txtTaiKhoan = new JTextField(20);
		txtTaiKhoan.setPreferredSize(new Dimension(210, 30));
		pnTaiKhoan.add(lblTaiKhoan);
		pnTaiKhoan.add(txtTaiKhoan);
		pnCenter.add(pnTaiKhoan);

		// mat khau
		JPanel pnMatKhau = new JPanel();
		pnMatKhau.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMatKhau = new JLabel("Mật khẩu: ");
		btnHienMatKhau = new JToggleButton(new ImageIcon("src/cua_hang_tien_loi/icon/xem-pass.png"));
		btnHienMatKhau.setPreferredSize(new Dimension(30, 30));
		txtMatKhau = new JPasswordField(20);
		txtMatKhau.setPreferredSize(new Dimension(210, 30));
		txtMatKhau.setEchoChar('*');

		pnMatKhau.add(lblMatKhau);
		pnMatKhau.add(Box.createHorizontalStrut(145));
		pnMatKhau.add(btnHienMatKhau);
		pnMatKhau.add(txtMatKhau);

		pnCenter.add(pnMatKhau);

		// quen mat khau
		JPanel pnQuenMK = new JPanel();
		pnQuenMK.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnQuenMK.add(Box.createHorizontalStrut(110));

		btnQuenMK = new JButton("Quên Mật Khẩu?");
		btnQuenMK.setPreferredSize(new Dimension(140, 32));
		btnQuenMK.setForeground(Color.BLUE);
		pnQuenMK.add(btnQuenMK);
		pnCenter.add(pnQuenMK);

		// dang nhap va thoat
		JPanel pnDangNhapThoat = new JPanel();
		pnDangNhapThoat.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnDangNhap = new JButton("Đăng nhập");
		btnThoat = new JButton("Thoát");

		pnDangNhapThoat.add(Box.createHorizontalStrut(52));
		pnDangNhapThoat.add(btnThoat);
		btnThoat.setPreferredSize(new Dimension(90, 32));
		btnThoat.setBackground(Color.RED);

		pnDangNhapThoat.add(btnDangNhap);
		btnDangNhap.setPreferredSize(new Dimension(100, 32));
		btnDangNhap.setBackground(new Color(0, 153, 76));
		pnCenter.add(pnDangNhapThoat);

		pnCen.add(pnCenter, BorderLayout.CENTER);
		// add pnCen
		pnMain.add(pnCen, BorderLayout.CENTER);

		add(pnMain);

		// set style for btnQuenMK
		btnQuenMK.setForeground(Color.decode("#3399FF"));
		btnQuenMK.setBorderPainted(false);
		btnQuenMK.setFocusPainted(false);
		btnQuenMK.setFont(new Font("Arial", Font.ITALIC, 12));

		// event
		btnDangNhap.addActionListener(this);
		btnQuenMK.addActionListener(this);
		btnThoat.addActionListener(this);
		btnHienMatKhau.addActionListener(this);
	}

	// xu li event
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		if (source.equals(btnQuenMK)) {

		} else if (source.equals(btnDangNhap)) {
			this.dangNhap();
		} else if (source.equals(btnHienMatKhau)) {
			this.anHienMatKhau(btnHienMatKhau);
		} else {
			System.exit(0);
		}

	}

	private void dangNhap() {
		// dang nhap thanh cong mo vao trang moi
		this.setVisible(false);
		new TrangChu().setVisible(true);
	}

	private void anHienMatKhau(JToggleButton btnHienMatKhau) {
		if (btnHienMatKhau.isSelected()) {
			txtMatKhau.setEchoChar((char) 0);
			btnHienMatKhau.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/an-pass.png"));
		} else {
			txtMatKhau.setEchoChar('*');
			btnHienMatKhau.setIcon(new ImageIcon("src/cua_hang_tien_loi/icon/xem-pass.png"));
		}
	}
}
