package com.chansofti.demo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * BorderLayout ����Ļ�ֳ���5�����֣��ֱ��Ƕ����ϱ���
 * Layout֮���ǿ���Ƕ�׵�
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
		//Jpanel��壬����װ������������������Button,Layout,TextFiend
		//JscrollPanel�ɹ������
		setLayout(new BorderLayout());
		JPanel panelNorth=new JPanel();
		panelNorth.setBackground(Color.BLUE);
		//����嶨��һ���߶ȣ����ø߶�Ϊ150��������
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
