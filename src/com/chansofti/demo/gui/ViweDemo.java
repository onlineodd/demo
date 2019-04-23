package com.chansofti.demo.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViweDemo extends JFrame{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViweDemo();
	}
	public ViweDemo(){
		JFrame frame=new JFrame();
		setTitle("Say Hello");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("src/1.gif");//这是背景图片
	  JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
	  frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。
	  imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//设置背景标签的位置
	  Container cp=frame.getContentPane();
	  cp.setLayout(new BorderLayout());
	  ((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。
	  setVisible(true);
	}
	
}
