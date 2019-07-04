package com.useborderlayout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseBorderLayout {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame("ʹ�ñ߽粼�ֹ�����");
		frm.setLayout(new BorderLayout()); //���øô��壨����������ΪBorderLayout
		
		JLabel northLabel = new JLabel("��������(NORTH)");
		northLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //�����ı����뷽ʽ
		frm.getContentPane().add(northLabel, BorderLayout.NORTH);
		
		JLabel southLabel = new JLabel("�����ײ�(SOUTH)");
		southLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		frm.getContentPane().add(southLabel, BorderLayout.SOUTH);
		
		JLabel westLabel = new JLabel("�������(WEST)");
		westLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //�����ı����뷽ʽ
		frm.getContentPane().add(westLabel, BorderLayout.WEST);
		
		JLabel eastLabel = new JLabel("�����Ҳ�(EAST)");
		eastLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //�����ı����뷽ʽ
		frm.getContentPane().add(eastLabel, BorderLayout.EAST);
		
		JLabel centerLabel = new JLabel("��������(CENTER)");
		centerLabel.setHorizontalAlignment(JLabel.HORIZONTAL); //�����ı����뷽ʽ
		frm.getContentPane().add(centerLabel, BorderLayout.CENTER);
		
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}

}
