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
				System.out.println("请输入操作: ");
				System.out.println("1.新增   2.修改   3.删除   4.查看所有记录   5.根据老师编号查看记录   6.退出 ");
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
						System.out.println("插入成功");
					}else{
						System.out.println("插入失败");
					}
					break;
				case 2:
					String string1=scanner.next();
					String[] tString1=string1.split(",");
					double tpays1=Double.valueOf(tString1[4]);
					int x=teacherDAO.update(tString1[0], tString1[1], tString1[2],tString1[3], tpays1);
					if(x==1){
						System.out.println("更新成功");
					}else{
						System.out.println("更新失败");
					}
					break;
				case 3:
					System.out.println("请输入要删除的id");
					String id=scanner.next();
					int z=teacherDAO.delete(id);
					if(z==1){
						System.out.println("删除成功");
					}else{
						System.out.println("删除失败");
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
