package cua_hang_tien_loi.ui;

import javax.swing.JFrame;

public class TrangChu extends JFrame{

	public TrangChu() {
		// TODO Auto-generated constructor stub
	}

	//giao diện
	private void initUITrangChu() {
		
	}
	
	
//	private void initComponents() {
//
//        container = new javax.swing.JPanel();
//        left_container = new javax.swing.JPanel();
//        menu_container = new javax.swing.JPanel();
//        lbl_Menu = new javax.swing.JLabel();
//        header_container = new javax.swing.JPanel();
//        txt_Header = new javax.swing.JLabel();
//        sanPham_container = new javax.swing.JPanel();
//        lbl_sanPham = new javax.swing.JLabel();
//        nhanVien_container = new javax.swing.JPanel();
//        lbl_NhanVien = new javax.swing.JLabel();
//        khachHang_container = new javax.swing.JPanel();
//        lbl_KhachHang = new javax.swing.JLabel();
//        TaiKhoan_container = new javax.swing.JPanel();
//        lbl_QuanLyTaiKhoan = new javax.swing.JLabel();
//        hoaDon_container = new javax.swing.JPanel();
//        lbl_hoaDon = new javax.swing.JLabel();
//        nhaCungCap_container = new javax.swing.JPanel();
//        lbl_nhaCungCap = new javax.swing.JLabel();
//        DangXuat_container = new javax.swing.JPanel();
//        lbl_DangXuat = new javax.swing.JLabel();
//        right_container = new javax.swing.JPanel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setMinimumSize(new java.awt.Dimension(1383, 780));
//        setResizable(false);
//        setTitle("Nhóm 14");
//
//        left_container.setBackground(new java.awt.Color(102,204,153));
//        left_container.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(0, 0, 0)));
//        left_container.setMaximumSize(new java.awt.Dimension(230, 768));
//        left_container.setMinimumSize(new java.awt.Dimension(230, 768));
//
//        menu_container.setBackground(new java.awt.Color(102,204,153));
//        menu_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        //menu_container.setForeground(new java.awt.Color(255, 255, 255));
//        menu_container.setAlignmentX(0.0F);
//        menu_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        menu_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_Menu.setFont(new java.awt.Font("Segoe UI", 1, 24));
//        lbl_Menu.setBackground(new java.awt.Color(102,204,153));
//        lbl_Menu.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_Menu.setAlignmentY(0.0F);
//        lbl_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        lbl_Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_Menu.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_Menu.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_Menu.setPreferredSize(new java.awt.Dimension(236, 60));
//        menu_container.add(lbl_Menu);
//
//        header_container.setBackground(new java.awt.Color(102,204,153));
//        header_container.setForeground(new java.awt.Color(255, 255, 255));
//        header_container.setAlignmentX(0.0F);
//        header_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        header_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        // tên nhóm header menu
//        txt_Header.setFont(new java.awt.Font("Dosis", 1, 48));
//        txt_Header.setForeground(new java.awt.Color(255, 255, 255));
//        txt_Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        txt_Header.setText("Nhóm 14");
//        txt_Header.setAlignmentY(0.0F);
//        txt_Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
//        txt_Header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        txt_Header.setMaximumSize(new java.awt.Dimension(204, 60));
//        txt_Header.setMinimumSize(new java.awt.Dimension(204, 60));
//        txt_Header.setPreferredSize(new java.awt.Dimension(204, 60));
//        header_container.add(txt_Header);
//
//        // nhân viên
//        nhanVien_container.setBackground(new java.awt.Color(102,204,153));
//        nhanVien_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        nhanVien_container.setForeground(new java.awt.Color(255, 255, 255));
//        nhanVien_container.setAlignmentX(0.0F);
//        nhanVien_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        nhanVien_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_NhanVien.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        lbl_NhanVien.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_NhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_NhanVien.setText("Nhân Viên");
//        lbl_NhanVien.setAlignmentY(0.0F);
//        lbl_NhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_NhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_NhanVien.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_NhanVien.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_NhanVien.setPreferredSize(new java.awt.Dimension(236, 60));
//        lbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_NhanVienMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_NhanVienMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_NhanVienMouseExited(evt);
//            }
//        });
//        nhanVien_container.add(lbl_NhanVien);
//
//
//        // sản phẩm
//        sanPham_container.setBackground(new java.awt.Color(102,204,153));
//        sanPham_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        sanPham_container.setForeground(new java.awt.Color(255, 255, 255));
//        sanPham_container.setAlignmentX(0.0F);
//        sanPham_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        sanPham_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_sanPham.setFont(new java.awt.Font("Segoe UI", 0, 24));
//        lbl_sanPham.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_sanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_sanPham.setText("sản phẩm");
//        lbl_sanPham.setAlignmentY(0.0F);
//        lbl_sanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_sanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_sanPham.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_sanPham.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_sanPham.setPreferredSize(new java.awt.Dimension(236, 60));
//        lbl_sanPham.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_sanPhamMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_sanPhamMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_sanPhamMouseExited(evt);
//            }
//        });
//        sanPham_container.add(lbl_sanPham);
//
//
//        // khách hàng
//        khachHang_container.setBackground(new java.awt.Color(102,204,153));
//        khachHang_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        khachHang_container.setForeground(new java.awt.Color(255, 255, 255));
//        khachHang_container.setAlignmentX(0.0F);
//        khachHang_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        khachHang_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_KhachHang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        lbl_KhachHang.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_KhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_KhachHang.setText("khách hàng");
//        lbl_KhachHang.setAlignmentY(0.0F);
//        lbl_KhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_KhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_KhachHang.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_KhachHang.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_KhachHang.setPreferredSize(new java.awt.Dimension(236, 60));
//        lbl_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_KhachHangMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_KhachHangMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_KhachHangMouseExited(evt);
//            }
//        });
//        khachHang_container.add(lbl_KhachHang);
//
//
//        // hóa đơn
//        hoaDon_container.setBackground(new java.awt.Color(102,204,153));
//        hoaDon_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        hoaDon_container.setForeground(new java.awt.Color(255, 255, 255));
//        hoaDon_container.setAlignmentX(0.0F);
//        hoaDon_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        hoaDon_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_hoaDon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        lbl_hoaDon.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_hoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_hoaDon.setText("hoá đơn");
//        lbl_hoaDon.setAlignmentY(0.0F);
//        lbl_hoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_hoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_hoaDon.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_hoaDon.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_hoaDon.setPreferredSize(new java.awt.Dimension(236, 60));
//        lbl_hoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_hoaDonMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_hoaDonMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_hoaDonMouseExited(evt);
//            }
//        });
//        hoaDon_container.add(lbl_hoaDon);
//
//        // nhà cung cấp
//        nhaCungCap_container.setBackground(new java.awt.Color(102,204,153));
//        nhaCungCap_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        nhaCungCap_container.setForeground(new java.awt.Color(255, 255, 255));
//        nhaCungCap_container.setAlignmentX(0.0F);
//        nhaCungCap_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        nhaCungCap_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_nhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        lbl_nhaCungCap.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_nhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_nhaCungCap.setText("nhà cung cấp");
//        lbl_nhaCungCap.setAlignmentY(0.0F);
//        lbl_nhaCungCap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_nhaCungCap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_nhaCungCap.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_nhaCungCap.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_nhaCungCap.setPreferredSize(new java.awt.Dimension(236, 60));
//        lbl_nhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_nhaCungCapMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_nhaCungCapMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_nhaCungCapMouseExited(evt);
//            }
//        });
//        nhaCungCap_container.add(lbl_nhaCungCap);
//
//        // tài khoản
//        TaiKhoan_container.setBackground(new java.awt.Color(102,204,153));
//        TaiKhoan_container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
//        TaiKhoan_container.setForeground(new java.awt.Color(255, 255, 255));
//        TaiKhoan_container.setAlignmentX(0.0F);
//        TaiKhoan_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        TaiKhoan_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_QuanLyTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        lbl_QuanLyTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_QuanLyTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_QuanLyTaiKhoan.setText("tài khoản");
//        lbl_QuanLyTaiKhoan.setAlignmentY(0.0F);
//        lbl_QuanLyTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_QuanLyTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_QuanLyTaiKhoan.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_QuanLyTaiKhoan.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_QuanLyTaiKhoan.setPreferredSize(new java.awt.Dimension(236, 60));
//        lbl_QuanLyTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_QuanLyTaiKhoanMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_QuanLyTaiKhoanMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_QuanLyTaiKhoanMouseExited(evt);
//            }
//        });
//        TaiKhoan_container.add(lbl_QuanLyTaiKhoan);
//
//
//        // Button đăng xuất
//        DangXuat_container.setBackground(new java.awt.Color(102,204,153));
//        DangXuat_container.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
//        DangXuat_container.setForeground(new java.awt.Color(255, 255, 255));
//        DangXuat_container.setAlignmentX(0.0F);
//        DangXuat_container.setMaximumSize(new java.awt.Dimension(204, 60));
//        DangXuat_container.setMinimumSize(new java.awt.Dimension(204, 60));
//
//        lbl_DangXuat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        lbl_DangXuat.setForeground(new java.awt.Color(255, 255, 255));
//        lbl_DangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl_DangXuat.setText("Đăng xuất");
//        lbl_DangXuat.setAlignmentY(0.0F);
//        lbl_DangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        lbl_DangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        lbl_DangXuat.setMaximumSize(new java.awt.Dimension(236, 60));
//        lbl_DangXuat.setMinimumSize(new java.awt.Dimension(236, 60));
//        lbl_DangXuat.setPreferredSize(new java.awt.Dimension(236, 45));
//        lbl_DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbl_DangXuatMouseClicked(evt);
//            }
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                lbl_DangXuatMouseEntered(evt);
//            }
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                lbl_DangXuatMouseExited(evt);
//            }
//        });
//        DangXuat_container.add(lbl_DangXuat);
//
//
//        // layout
//        javax.swing.GroupLayout left_containerLayout = new javax.swing.GroupLayout(left_container);
//        left_container.setLayout(left_containerLayout);
//        left_containerLayout.setHorizontalGroup(
//            left_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(menu_container, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
//            .addComponent(sanPham_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(khachHang_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(nhanVien_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(header_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(TaiKhoan_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(hoaDon_container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(nhaCungCap_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(DangXuat_container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//
//        left_containerLayout.setVerticalGroup(
//            left_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(left_containerLayout.createSequentialGroup()
//                .addComponent(header_container, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(menu_container, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(nhanVien_container, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(sanPham_container, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(khachHang_container, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(hoaDon_container, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(nhaCungCap_container, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addComponent(TaiKhoan_container, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
//                .addGap(0, 0, 0)
//                .addComponent(DangXuat_container, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap())
//        );
//
//        right_container.setBackground(new java.awt.Color(255, 255, 255));
//        right_container.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
//        right_container.setAlignmentY(0.0F);
//        right_container.setMaximumSize(new java.awt.Dimension(1130, 768));//kích thước pannel con 
//        right_container.setMinimumSize(new java.awt.Dimension(1130, 768));
//        right_container.setPreferredSize(new java.awt.Dimension(1130, 768));
//        right_container.setLayout(new javax.swing.BoxLayout(right_container, javax.swing.BoxLayout.PAGE_AXIS));
//
//        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
//        container.setLayout(containerLayout);
//        containerLayout.setHorizontalGroup(
//            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(containerLayout.createSequentialGroup()
//                .addComponent(left_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, Short.MAX_VALUE)
//                .addComponent(right_container, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap())
//        );
//        containerLayout.setVerticalGroup(
//            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(left_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            .addComponent(right_container, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, Short.MAX_VALUE))
//        );
//
//        pack();
//        setLocationRelativeTo(null);
//    }
}
