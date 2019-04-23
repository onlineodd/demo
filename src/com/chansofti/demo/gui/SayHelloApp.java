package com.chansofti.demo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SayHelloApp extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SayHelloApp();
	}
	public SayHelloApp(){
		//设置窗口
		setTitle("Say Hello");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//初始化
		JTextField textField=new JTextField();
		textField.setBounds(50, 100, 250, 30);
		add(textField);
		
		setLayout(null);
		
		JButton button=new JButton();
		button.setText("确定");
		button.setBounds(300, 100, 250, 30);
		add(button);
		
		JLabel lblInfo=new JLabel("asada");
		lblInfo.setBounds(50, 160, 300, 30);
		add(lblInfo);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setVisible(true);
	}
}
