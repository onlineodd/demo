package com.chansofti.demo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BMIDemo extends JFrame {
	public static void main(String[] args) {
		new BMIDemo();
	}

	public BMIDemo() {

		setTitle("Say Hello");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 标签1
		JLabel lblInfo1 = new JLabel("体重：");
		lblInfo1.setBounds(15, 100, 300, 30);
		add(lblInfo1);

		// 输入框1
		JTextField txtName = new JTextField();
		txtName.setBounds(50, 100, 80, 30);
		add(txtName);
		setLayout(null);
		// 标签2
		JLabel lblInfo2 = new JLabel("身高：");
		lblInfo2.setBounds(150, 100, 300, 30);
		add(lblInfo2);
		// 输入框2
		JTextField txtName1 = new JTextField();
		txtName1.setBounds(200, 100, 80, 30);
		add(txtName1);
		setLayout(null);
		// 按钮
		JButton btnOk = new JButton();
		btnOk.setText("确定");
		btnOk.setBounds(290, 100, 70, 30);
		add(btnOk);
		// 标签3
		JLabel lblInfo3 = new JLabel(" ");
		lblInfo3.setBounds(50, 160, 300, 30);
		add(lblInfo3);

		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double weight = Double.parseDouble(txtName.getText());
				double height = Double.parseDouble(txtName1.getText());

				double result = weight / height;
				lblInfo3.setText(result + "");
			}
		});
		// 显示窗口
		setVisible(true);
	}
}
