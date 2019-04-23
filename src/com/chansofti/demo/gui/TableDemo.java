package com.chansofti.demo.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableDemo extends JFrame{
	private JTable table;
	//数据
	private Object [][] dataobObjects;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableDemo();
	}
public TableDemo(){
	setTitle("表格");
	setSize(800, 800);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//设置表格的标题栏
	String [] columuNameStrings={"编号","学号","姓名","出生日期","电话号码","家庭住址","身高"};
	//模拟一下数据
	dataobObjects=new Object[50][columuNameStrings.length];
	
	for(int i=0;i<50;i++){
		dataobObjects[i][0]=i+1;
		dataobObjects[i][1]="学号"+(i+1);
		dataobObjects[i][2]="姓名"+(i+1);
		dataobObjects[i][3]=new Date();
		dataobObjects[i][4]="电话号码"+(i+1);
		dataobObjects[i][5]="家庭住址"+(i+1);
		dataobObjects[i][6]=1.7;	
		
	}
	DefaultTableModel defaultTableModel=new DefaultTableModel(dataobObjects,columuNameStrings){

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}
		
		
	};
	table=new JTable(defaultTableModel);
	//给表格添加监听，相应点击
	table.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
//			System.out.println("鼠标单击了");
			//检测鼠标
			if(e.getClickCount()==2){
				System.out.println("鼠标双击了");
				//获得双击了那行的数据
				int rowNum=table.rowAtPoint(e.getPoint());
				System.out.println("双击了，下标"+rowNum+"数据");
				//通过下标拿数据
				System.out.println("姓名："+dataobObjects[rowNum][2]);
			}
		}
	});
	//表格数据比较多，所以需要一个可以滚动的面板
	JScrollPane jScrollPane=new JScrollPane(table);
//	jScrollPane.setSize(500,400);
	add(jScrollPane);
	setVisible(true);
}
}
