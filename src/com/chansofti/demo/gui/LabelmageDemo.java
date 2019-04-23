package com.chansofti.demo.gui;

import static org.hamcrest.CoreMatchers.nullValue;

import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelmageDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelmageDemo();
	}
	public LabelmageDemo(){
		setTitle("图片");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel labelIcon=new JLabel();
		//新建一个ImageIcon，需要使用src下的图片
		ImageIcon imageIcon=new ImageIcon("src/1.jpg");
		Image image=imageIcon.getImage();
		//对图片进行压缩，根据指定的比例和算法
		Image smallImage=image.getScaledInstance(150, 150, Image.SCALE_FAST);
		//生成新的ImageIcon
		ImageIcon sImageIcon=new ImageIcon(smallImage);
		//设置labelIcon中
		labelIcon.setIcon(sImageIcon);
		//设置对其方式
		labelIcon.setText("hhhhh");
		//设置对齐
		labelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		//添加到窗口
		add(labelIcon);
		//显示窗口
		setVisible(true);
		
		
	}

}
