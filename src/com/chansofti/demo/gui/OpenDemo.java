package com.chansofti.demo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpenDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OpenDemo();
	}
public OpenDemo(){
	setTitle("¼ÆËãÆ÷");
	setSize(500,700);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setLayout(new BorderLayout());
	
	JPanel panel1=new JPanel();
	panel1.setPreferredSize(new Dimension(500,200));
	panel1.setBackground(Color.YELLOW);
	panel1.setLayout(new GridLayout(1,1));
	JTextField textField=new JTextField();
	textField.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,120));
	textField.setText("0");
	panel1.add(textField);
	JPanel panel2=new JPanel();
	JLabel label=new JLabel();
	panel2.setPreferredSize(new Dimension(500,500));
	panel2.setLayout(new GridLayout(6,4));
	setLayout(new FlowLayout());
	for(int i=0;i<24;i++){
		JButton button=new JButton("JButton"+(i+1));
		button.setSize(125,70);
		panel2.add(button);
	}
	add(panel1,BorderLayout.NORTH);
	add(panel2,BorderLayout.SOUTH);
	
	setVisible(true);
	
}
}
