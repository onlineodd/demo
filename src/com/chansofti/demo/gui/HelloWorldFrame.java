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
		//设置标题
		setTitle("HelloWorld");
		//设置窗口
		setSize(500, 400);
		//设置启动位置，在当前屏幕居中
		setLocationRelativeTo(null);
		//设置可显示
		setVisible(true);
		//设置退出按钮的动作
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//新建文本，添加到窗口中
		JLabel jLabel=new JLabel("大家好，我是swing");
		add(jLabel);
		//获得标签中的文本
		String text = jLabel.getText();
		System.out.println(text);
		//设置文本标签
		jLabel.setText("再见，我是swing");
		//设置文本水平居中
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
	}

}
