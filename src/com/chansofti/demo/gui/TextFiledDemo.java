package com.chansofti.demo.gui;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFiledDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFiledDemo();
	}
public TextFiledDemo(){
	setTitle("输入框");
	setSize(500,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JTextField textField=new JTextField();
	textField.setSize(150,150);
	add(textField);
	//清掉窗口布局
	setLayout(null);
	//设置组件的位置和大小，参数为x,y,w,h
	textField.setBounds(100,150,150,30);
	setVisible(true);
}
}
