package com.chansofti.demo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * BorderLayout 把屏幕分成了5个部分，分别是东西南北中
 * Layout之间是可以嵌套的
 */
public class BorderLayoutDemo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutDemo();
	}
	public BorderLayoutDemo(){
		setTitle("BorderLayout");
		setSize(1440, 900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Jpanel面板，用来装组件的容器，组件就是Button,Layout,TextFiend
		//JscrollPanel可滚动面板
		setLayout(new BorderLayout());
		JPanel panelNorth=new JPanel();
		panelNorth.setBackground(Color.BLUE);
		//给面板定义一个高度，设置高度为150，宽任意
		panelNorth.setPreferredSize(new Dimension(0,150));
		JPanel paneWestJPanel=new JPanel();
		paneWestJPanel.setBackground(Color.WHITE);
		paneWestJPanel.setPreferredSize(new Dimension(300,0));
		JPanel panelCenterJPanel=new JPanel();
		panelCenterJPanel.setBackground(Color.YELLOW);
		JPanel jPanelSouth=new JPanel();
		jPanelSouth.setBackground(Color.GREEN);
		jPanelSouth.setPreferredSize(new Dimension(0,200));
		JPanel panelEast=new JPanel();
		panelEast.setPreferredSize(new Dimension(200,0));
		
		panelEast.setBackground(Color.RED);
		add(panelNorth,BorderLayout.NORTH);
		add(paneWestJPanel,BorderLayout.WEST);
		add(jPanelSouth,BorderLayout.SOUTH);
		add(panelEast,BorderLayout.EAST);
		add(panelCenterJPanel,BorderLayout.CENTER);
		setVisible(true);
	}
}
