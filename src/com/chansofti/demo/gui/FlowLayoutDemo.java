package com.chansofti.demo.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutDemo();
	}
public FlowLayoutDemo(){
	setTitle("��ʽ����");
	setSize(500, 400);
	setLocationRelativeTo(null);	//���ô��������ָ�������λ��
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//���ò���
	setLayout(new FlowLayout());
	for(int i=0;i<20;i++){
		JButton button=new JButton("Button"+(i+1));
		button.setSize(100, 30);
		add(button);
	}

	setVisible(true);
}
}
