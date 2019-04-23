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
	//����
	private Object [][] dataobObjects;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableDemo();
	}
public TableDemo(){
	setTitle("���");
	setSize(800, 800);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//���ñ��ı�����
	String [] columuNameStrings={"���","ѧ��","����","��������","�绰����","��ͥסַ","���"};
	//ģ��һ������
	dataobObjects=new Object[50][columuNameStrings.length];
	
	for(int i=0;i<50;i++){
		dataobObjects[i][0]=i+1;
		dataobObjects[i][1]="ѧ��"+(i+1);
		dataobObjects[i][2]="����"+(i+1);
		dataobObjects[i][3]=new Date();
		dataobObjects[i][4]="�绰����"+(i+1);
		dataobObjects[i][5]="��ͥסַ"+(i+1);
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
	//�������Ӽ�������Ӧ���
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
//			System.out.println("��굥����");
			//������
			if(e.getClickCount()==2){
				System.out.println("���˫����");
				//���˫�������е�����
				int rowNum=table.rowAtPoint(e.getPoint());
				System.out.println("˫���ˣ��±�"+rowNum+"����");
				//ͨ���±�������
				System.out.println("������"+dataobObjects[rowNum][2]);
			}
		}
	});
	//������ݱȽ϶࣬������Ҫһ�����Թ��������
	JScrollPane jScrollPane=new JScrollPane(table);
//	jScrollPane.setSize(500,400);
	add(jScrollPane);
	setVisible(true);
}
}
