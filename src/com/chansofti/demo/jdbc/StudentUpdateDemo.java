package com.chansofti.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverName="com.mysql.jdbc.Driver";
		//���ݿ��ַ
		String url="jdbc:mysql://localhost:3306/zjweu?useUnicode=true&characterEncoding=utf8&&useSSL=false";
		//�����û���
		String username="root";
		String password="123456";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			Class.forName(driverName);
			connection=DriverManager.getConnection(url,username,password);
			String sql="update tab_student set stu_phone=18705987671 where id=2";
			preparedStatement=connection.prepareStatement(sql);
//			preparedStatement.setInt(1, 2);
//			preparedStatement.setString(5, "18705987671");
//			preparedStatement.setString(1, "2016b11029");
//			preparedStatement.setString(2, "������");
//			preparedStatement.setString(3, "1997-12-28");
//			preparedStatement.setString(4, "1278269864");
//			preparedStatement.setString(5, "��������");
//			preparedStatement.setDouble(6, 1.7);
			
			//�ܸ���sql
			int i=preparedStatement.executeUpdate();
			if(i==1){
				System.out.println("�޸ĳɹ�");
				
			}else {
				System.out.println("�޸�ʧ��");
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
