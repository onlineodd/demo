package com.chansofti.demo.gui;

import static org.hamcrest.CoreMatchers.nullValue;

import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelmageDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelmageDemo();
	}
	public LabelmageDemo(){
		setTitle("ͼƬ");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel labelIcon=new JLabel();
		//�½�һ��ImageIcon����Ҫʹ��src�µ�ͼƬ
		ImageIcon imageIcon=new ImageIcon("src/1.jpg");
		Image image=imageIcon.getImage();
		//��ͼƬ����ѹ��������ָ���ı������㷨
		Image smallImage=image.getScaledInstance(150, 150, Image.SCALE_FAST);
		//�����µ�ImageIcon
		ImageIcon sImageIcon=new ImageIcon(smallImage);
		//����labelIcon��
		labelIcon.setIcon(sImageIcon);
		//���ö��䷽ʽ
		labelIcon.setText("hhhhh");
		//���ö���
		labelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		//��ӵ�����
		add(labelIcon);
		//��ʾ����
		setVisible(true);
		
		
	}

}
