package com.chansofti.demo.zy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDemo {
		private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
		private final static String URL="jdbc:mysql://localhost:3306/RUNOOB";
		private final static String  USER="root";
		private final static String password="123456";
		@SuppressWarnings({ "unused", "null" })
		public static Connection main(String[] args) throws SQLException, ClassNotFoundException {
			Connection connection=null;
			Statement statement=null;
			
				//ע��JDBC����
				Class.forName(JDBC_DRIVER);
				System.out.println("�������ݿ�");
				//������
				connection=DriverManager.getConnection(URL,USER,password);
				//ִ�в�ѯ
				statement=connection.createStatement();
				String sql;
				sql="SELECT id,username,realname";
				ResultSet rs=statement.executeQuery(sql);
				//չ����������ݿ�
				while(rs.next()){
					System.out.print(rs.getInt("id")+",");
					System.out.print(rs.getString("username")+",");
					System.out.print(rs.getString("realname")+",");
					System.out.print("\n");
					
				}
				try {
					if(rs==null){
					rs.close();
					}
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally {
					try {
						if(statement==null){
						statement.close();
						}
					} catch (SQLException e) {
						// TODO: handle exception
						e.printStackTrace();
					}finally {
						connection.close();
					}
					
					
					
				}
				
			return connection;
			
		}
}
