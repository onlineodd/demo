package com.chansofti.demo.gui;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFiledDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFiledDemo();
	}
public TextFiledDemo(){
	setTitle("�����");
	setSize(500,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JTextField textField=new JTextField();
	textField.setSize(150,150);
	add(textField);
	//������ڲ���
	setLayout(null);
	//���������λ�úʹ�С������Ϊx,y,w,h
	textField.setBounds(100,150,150,30);
	setVisible(true);
}
}
