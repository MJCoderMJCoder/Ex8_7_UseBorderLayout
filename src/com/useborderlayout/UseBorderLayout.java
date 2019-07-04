package com.useborderlayout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseBorderLayout {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame("使用边界布局管理器");
		frm.setLayout(new BorderLayout()); //设置该窗体（容器）布局为BorderLayout
		
		JLabel northLabel = new JLabel("容器顶部(NORTH)");
		northLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //设置文本对齐方式
		frm.getContentPane().add(northLabel, BorderLayout.NORTH);
		
		JLabel southLabel = new JLabel("容器底部(SOUTH)");
		southLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		frm.getContentPane().add(southLabel, BorderLayout.SOUTH);
		
		JLabel westLabel = new JLabel("容器左侧(WEST)");
		westLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //设置文本对齐方式
		frm.getContentPane().add(westLabel, BorderLayout.WEST);
		
		JLabel eastLabel = new JLabel("容器右侧(EAST)");
		eastLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //设置文本对齐方式
		frm.getContentPane().add(eastLabel, BorderLayout.EAST);
		
		JLabel centerLabel = new JLabel("容器中心(CENTER)");
		centerLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //设置文本对齐方式
		frm.getContentPane().add(centerLabel, BorderLayout.CENTER);
		
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}

}
