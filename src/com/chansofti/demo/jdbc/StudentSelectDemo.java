package com.chansofti.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����������
		String driverName="com.mysql.jdbc.Driver";
		//���ݿ��ַ
		String url="jdbc:mysql://localhost:3306/zjweu?useUnicode=true&characterEncoding=utf8&&useSSL=false";
		//�����û���
		String  username="root";
		String password="123456";
		ResultSet resultSet=null;
		PreparedStatement preparedStatement=null;
		Connection connection=null;
		try {
			//��������
			Class.forName(driverName);
			//��ȡ���ݿ�����
			 connection=DriverManager.getConnection(url,username,password);
			 //sql��䣬����Ϊռλ��
			//String sql="select *from tab_student";
			 //String sql="select *from tab_student where id=?";
			 String sql="select *from tab_student where stu_name like ?";
			 //ͨ��sql�������Ԥ����Ĳ������ 
			preparedStatement=connection.prepareStatement(sql);
			//���ò���(����λ�ã�����ֵ)
			//preparedStatement.setInt(1, 2);
			preparedStatement.setString(1, "%"+"��"+"%");
			//ִ�в�ѯ
			 resultSet = preparedStatement.executeQuery();
			//����������������ݽ��д���
			 //resultSet.next()�Ὣ���ݿ�
			 
			while(resultSet.next()){
				//��ȡ��¼
				int id =resultSet.getInt("id");
				String stu_no=resultSet.getString("stu_no");
				String stu_name=resultSet.getString("stu_name");
				String stu_birthday=resultSet.getString("stu_birthday");
				String stu_phone=resultSet.getString("stu_phone");
				String stu_address=resultSet.getString("stu_address");
				double stu_height=resultSet.getDouble("stu_height");
				//��ӡ��¼
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
