package com.chansofti.demo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonDemo();
	}
	public ButtonDemo(){
		setTitle("��ť");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton button=new JButton();
		button.setText("ȷ��");
		//���ð�ť��С
		button.setBounds(100, 200, 80, 30);
		// button.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.out.println("��ť�������! ");
		// }
		// });
		button.addActionListener((e) -> System.out.println("���"));
		setLayout(null);
		
		add(button);
		
		setVisible(true);
		
	}
		}