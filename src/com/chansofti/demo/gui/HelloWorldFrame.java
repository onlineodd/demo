package com.chansofti.demo.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWorldFrame extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorldFrame(); 
	}
	public HelloWorldFrame(){
		//���ñ���
		setTitle("HelloWorld");
		//���ô���
		setSize(500, 400);
		//��������λ�ã��ڵ�ǰ��Ļ����
		setLocationRelativeTo(null);
		//���ÿ���ʾ
		setVisible(true);
		//�����˳���ť�Ķ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�½��ı�����ӵ�������
		JLabel jLabel=new JLabel("��Һã�����swing");
		add(jLabel);
		//��ñ�ǩ�е��ı�
		String text = jLabel.getText();
		System.out.println(text);
		//�����ı���ǩ
		jLabel.setText("�ټ�������swing");
		//�����ı�ˮƽ����
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
	}

}
