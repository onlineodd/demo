package com.chansofti.demo.zy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UserDemo extends SqlDemo{
	private static Connection conn=null;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	public static void add(User user) throws SQLException{
		String sql = "insert into Book values(?,?,?,?,?)";
		conn=getConnection();
		
		
	}
	private static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
 
}
