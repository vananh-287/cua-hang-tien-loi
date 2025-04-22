package cua_hang_tien_loi.utils;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class MenuUtils {
	public static JMenuItem createItemMenu(String text, String iconPath) {
		JMenuItem item = new JMenuItem(text, new ImageIcon(iconPath));
		item.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		item.setIconTextGap(10);
		item.setBorderPainted(false);
		item.setBackground(Color.decode("#FAFAFA"));
		return item;
	}
}
