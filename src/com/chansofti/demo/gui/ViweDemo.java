package com.chansofti.demo.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViweDemo extends JFrame{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViweDemo();
	}
	public ViweDemo(){
		JFrame frame=new JFrame();
		setTitle("Say Hello");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("src/1.gif");//���Ǳ���ͼƬ
	  JLabel imgLabel = new JLabel(img);//������ͼ���ڱ�ǩ�
	  frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����
	  imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��
	  Container cp=frame.getContentPane();
	  cp.setLayout(new BorderLayout());
	  ((JPanel)cp).setOpaque(false); //ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������
	  setVisible(true);
	}
	
}
