package com.chansofti.demo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonDemo();
	}
	public ButtonDemo(){
		setTitle("按钮");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton button=new JButton();
		button.setText("确定");
		//设置按钮大小
		button.setBounds(100, 200, 80, 30);
		// button.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.out.println("按钮被点击了! ");
		// }
		// });
		button.addActionListener((e) -> System.out.println("你好"));
		setLayout(null);
		
		add(button);
		
		setVisible(true);
		
	}
		}