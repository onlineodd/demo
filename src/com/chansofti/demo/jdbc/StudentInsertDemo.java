package com.chansofti.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverName="com.mysql.jdbc.Driver";
		//数据库地址
		String url="jdbc:mysql://localhost:3306/zjweu?useUnicode=true&characterEncoding=utf8&&useSSL=false";
		//数据用户名
		String username="root";
		String password="123456";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			Class.forName(driverName);
			connection=DriverManager.getConnection(url,username,password);
			String sql="insert into tab_student(stu_no,stu_name,stu_birthday,stu_phone,stu_address,stu_height)"
			+"values(?,?,?,?,?,?)";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "2016b11029");
			preparedStatement.setString(2, "温鑫剡");
			preparedStatement.setString(3, "1997-12-28");
			preparedStatement.setString(4, "18705987671");
			preparedStatement.setString(5, "福建三明");
			preparedStatement.setDouble(6, 1.7);
			//受该条sql
			int i=preparedStatement.executeUpdate();
			if(i==1){
				System.out.println("插入成功");
				
			}else {
				System.out.println("插入失败");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(preparedStatement!=null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(connection!=null){
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
