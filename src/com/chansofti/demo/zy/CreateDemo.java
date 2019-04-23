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
         
	        //һ��ʼ������һ���Ѿ����ڵ����ݿ�  
	        Connection conn = DriverManager.getConnection(URL, USER, password);  
	        Statement stat = conn.createStatement();  
	           
	        //�������ݿ�hello  
	        stat.executeUpdate("create database hello");  
	           
	        //�򿪴��������ݿ�  
	        stat.close();  
	        conn.close();  
	        URL = "jdbc:mysql://localhost:3306/hello?useUnicode=true&characterEncoding=utf-8";  
	        conn = DriverManager.getConnection(URL, USER, password);  
	        stat = conn.createStatement();  
	           
	        //������tuser 
	        stat.executeUpdate("create table tuser(id int,username varchar(80),realname varchar(80))");  
	           
	        //�������  
	        stat.executeUpdate("insert into tuser value(1, 'zs','tom')");  
	        stat.executeUpdate("insert into tuser value(2, 'ls','body')");  
	           
	        //��ѯ����  
	        ResultSet result = stat.executeQuery("select * from tuser");  
	        while (result.next())  
	        {  
	            System.out.println(result.getInt("id") + " " + result.getString("username")+result.getString("realname"));  
	        }  
	           
	        //�ر����ݿ�  
	        result.close();  
	        stat.close();  
	        conn.close();  

	}
}
