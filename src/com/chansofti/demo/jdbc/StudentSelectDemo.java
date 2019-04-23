package com.chansofti.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//驱动的名字
		String driverName="com.mysql.jdbc.Driver";
		//数据库地址
		String url="jdbc:mysql://localhost:3306/zjweu?useUnicode=true&characterEncoding=utf8&&useSSL=false";
		//数据用户名
		String  username="root";
		String password="123456";
		ResultSet resultSet=null;
		PreparedStatement preparedStatement=null;
		Connection connection=null;
		try {
			//加载驱动
			Class.forName(driverName);
			//获取数据库连接
			 connection=DriverManager.getConnection(url,username,password);
			 //sql语句，？号为占位符
			//String sql="select *from tab_student";
			 //String sql="select *from tab_student where id=?";
			 String sql="select *from tab_student where stu_name like ?";
			 //通过sql语句生成预编译的操作语句 
			preparedStatement=connection.prepareStatement(sql);
			//设置参数(参数位置，参数值)
			//preparedStatement.setInt(1, 2);
			preparedStatement.setString(1, "%"+"东"+"%");
			//执行查询
			 resultSet = preparedStatement.executeQuery();
			//操作结果集，对数据进行处理
			 //resultSet.next()会将数据库
			 
			while(resultSet.next()){
				//读取记录
				int id =resultSet.getInt("id");
				String stu_no=resultSet.getString("stu_no");
				String stu_name=resultSet.getString("stu_name");
				String stu_birthday=resultSet.getString("stu_birthday");
				String stu_phone=resultSet.getString("stu_phone");
				String stu_address=resultSet.getString("stu_address");
				double stu_height=resultSet.getDouble("stu_height");
				//打印记录
				System.out.printf("%s,%s,%s,%s,%s,%s,%s",id,stu_no,stu_name,stu_birthday,stu_phone,stu_address,stu_height);
				System.out.println("");
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
	
			if(resultSet!=null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if(preparedStatement!=null){
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					if(connection!=null){
						try {
							connection.close();
						} catch (SQLException e) {
							// TODO: handle exception
						e.printStackTrace();
						}
						
					}
				}
			}
		}
	}

}
