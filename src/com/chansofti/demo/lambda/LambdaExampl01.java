package com.chansofti.demo.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaExampl01 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LambdaExampl01();
	}
	public LambdaExampl01(){
		setSize(500, 400);
		setLocationRelativeTo(null);
		setTitle("���Դ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JButton jButton=new JButton("���");
		jButton.setSize(100, 50);
		add(jButton);
		jButton.addActionListener((e)->System.out.println("���"));
	jButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���");
		}
	});
	}
}
