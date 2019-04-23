package com.chansofti.demo.jdbc;
import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtill {
	private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	private final static String URL="jdbc:mysql://localhost:3306/zjweu?useUnicode=true&characterEncoding=utf8&&useSSL=false";
	private final static String  USER="root";
	private final static String password="123456";
	private Connection connection=null;
	private PreparedStatement preparedStatement=null;
	private ResultSet resultSet=null;
	public int update(String sql,Object...params){
		int x=0;
				try{
				getcConnection();
				preparedStatement=connection.prepareStatement(sql);
				// ‹∏√Ãısql
				
				if(params!=null){
				for(int i=0;i<params.length;i++){
					preparedStatement.setObject(i+1, params[i]);
				}
				}
				 x=preparedStatement.executeUpdate();
			} catch (SQLException e) {
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
			return x;	
	}
	public ResultSet query(String sql ,Object...params){
		int r=0;
		try{
			getcConnection();
			preparedStatement=connection.prepareStatement(sql);
			if(params!=null){
			for(int i=0;i<params.length;i++){
				preparedStatement.setObject(i+1, params[i]);
			}
			}
			resultSet=preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resultSet;	
	}
	
	public void close(){
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
	public Connection getcConnection(){
		try {
			Class.forName(JDBC_DRIVER);
			connection=DriverManager.getConnection(URL, USER, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
}
