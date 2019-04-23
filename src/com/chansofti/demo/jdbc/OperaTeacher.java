package com.chansofti.demo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperaTeacher {
private static boolean flag = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TeacherDAO teacherDAO = new TeacherDAO();
			while (flag) {
				System.out.println("���������: ");
				System.out.println("1.����   2.�޸�   3.ɾ��   4.�鿴���м�¼   5.������ʦ��Ų鿴��¼   6.�˳� ");
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				int operaNumber = scanner.nextInt();
				switch (operaNumber) {
				case 1:
					String string=scanner.next();
					String[] tString=string.split(",");
					double tpays=Double.valueOf(tString[4]);
					int i =teacherDAO.save(tString[0], tString[1], tString[2], tString[3], tpays);
					if(i==1){
						System.out.println("����ɹ�");
					}else{
						System.out.println("����ʧ��");
					}
					break;
				case 2:
					String string1=scanner.next();
					String[] tString1=string1.split(",");
					double tpays1=Double.valueOf(tString1[4]);
					int x=teacherDAO.update(tString1[0], tString1[1], tString1[2],tString1[3], tpays1);
					if(x==1){
						System.out.println("���³ɹ�");
					}else{
						System.out.println("����ʧ��");
					}
					break;
				case 3:
					System.out.println("������Ҫɾ����id");
					String id=scanner.next();
					int z=teacherDAO.delete(id);
					if(z==1){
						System.out.println("ɾ���ɹ�");
					}else{
						System.out.println("ɾ��ʧ��");
					}
					break;
				case 4:
				ResultSet resultSet=teacherDAO.findAll();
				try {
					while(resultSet.next()){
						int id1=resultSet.getInt("id");
						String t_name=resultSet.getString("t_name");
						String t_birthday=resultSet.getString("t_birthday");
						String t_phone=resultSet.getString("t_phone");
						double t_wages=resultSet.getDouble("t_wages");
						System.out.printf("%s,%s,%s,%s,%s",id1,t_name,t_birthday,t_phone,t_wages);
						System.out.println("");
					}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						teacherDAO.close();
					}
					
					break;
				case 5:
					String tname=scanner.next();
					ResultSet resultSet1=teacherDAO.findByName(tname);
					try {
						while(resultSet1.next()){
							int id1=resultSet1.getInt("id");
							String t_name=resultSet1.getString("t_name");
							String t_birthday=resultSet1.getString("t_birthday");
							String t_phone=resultSet1.getString("t_phone");
							double t_wages=resultSet1.getDouble("t_wages");
							System.out.printf("%s,%s,%s,%s,%s",id1,t_name,t_birthday,t_phone,t_wages);
							System.out.println("");
						}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}finally {
							teacherDAO.close();
						}
					break;
				case 6:
					flag = false;
					break;
				default:
					break;
				}
			}

		}
	}
