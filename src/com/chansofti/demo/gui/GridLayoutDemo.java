package com.chansofti.demo.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}
 public GridLayoutDemo(){
	 	setTitle("表格布局");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(5,4));
		for(int i=0;i<20;i++){
			JButton button=new JButton("Button"+(i+1));
			add(button);
		}
		setVisible(true);
 }
}
