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
	setTitle("流式布局");
	setSize(500, 400);
	setLocationRelativeTo(null);	//设置窗口相对于指定组件的位置
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//设置布局
	setLayout(new FlowLayout());
	for(int i=0;i<20;i++){
		JButton button=new JButton("Button"+(i+1));
		button.setSize(100, 30);
		add(button);
	}

	setVisible(true);
}
}
