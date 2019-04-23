package com.chansofti.demo.zy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {
	private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	private static String URL="jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8";
	private final static String  USER="root";
	private final static String password="123456";
	public static void main(String[] args) throws  SQLException, ClassNotFoundException{
		 Class.forName(JDBC_DRIVER);  
         
	        //一开始必须填一个已经存在的数据库  
	        Connection conn = DriverManager.getConnection(URL, USER, password);  
	        Statement stat = conn.createStatement();  
	           
	        //创建数据库hello  
	        stat.executeUpdate("create database hello");  
	           
	        //打开创建的数据库  
	        stat.close();  
	        conn.close();  
	        URL = "jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf-8";  
	        conn = DriverManager.getConnection(URL, USER, password);  
	        stat = conn.createStatement();  
	           
	        //创建表tuser 
	        stat.executeUpdate("create table tuser(id int,username varchar(80),realname varchar(80))");  
	           
	        //添加数据  
	        stat.executeUpdate("insert into tuser value(1, 'zs','tom')");  
	        stat.executeUpdate("insert into tuser value(2, 'ls','body')");  
	           
	        //查询数据  
	        ResultSet result = stat.executeQuery("select * from tuser");  
	        while (result.next())  
	        {  
	            System.out.println(result.getInt("id") + " " + result.getString("username")+result.getString("realname"));  
	        }  
	           
	        //关闭数据库  
	        result.close();  
	        stat.close();  
	        conn.close();  

	}
}
