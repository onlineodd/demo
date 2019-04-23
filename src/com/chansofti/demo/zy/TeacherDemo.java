package com.chansofti.demo.zy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TeacherDemo {
	String driverName="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/zjweu?useUnicode=true&characterEncoding=utf8&&useSSL=false";
	String username="root";
	String password="123456";
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	Statement statement=null;	
	ResultSet resultSet=null;
	//添加
	public void Insert(int id ,String t_name,String t_birthday,String t_phone,Double t_wages){
		try {
				Class.forName(driverName);
				connection=DriverManager.getConnection(url,username,password);
				String sql="insert into tab_teacher(id,t_name,t_birthday,t_phone,t_wages)"
				+"values(?,?,?,?,?)";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, t_name);
				preparedStatement.setString(3, t_birthday);
				preparedStatement.setString(4, t_phone);
				preparedStatement.setDouble(5, t_wages);
				//受该条sql
				int x=preparedStatement.executeUpdate();
				if(x==1){
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
	//查询全部
	public void Select() {
		try {
			Class.forName(driverName);
			connection=DriverManager.getConnection(url, username, password);
			String sql="select * from tab_teacher";
			preparedStatement=connection.prepareStatement(sql);
			 resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				int id=resultSet.getInt("id");
				String t_name=resultSet.getString("t_name");
				String t_birthday=resultSet.getString("t_birthday");
				String t_phone=resultSet.getString("t_phone");
				double t_wages=resultSet.getDouble("t_wages");
				System.out.printf("%s,%s,%s,%s,%s",id,t_name,t_birthday,t_phone,t_wages);
				System.out.println("");
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(resultSet==null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if(preparedStatement==null){
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					if (connection==null) {
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
	//根据老师编号查看老师记录
	public void Select1(int x){
		try{

		Class.forName(driverName);
		connection=DriverManager.getConnection(url, username, password);
		String sql="select * from tab_teacher where id=? ";
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, x);
		 resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			int id=resultSet.getInt("id");
			String t_name=resultSet.getString("t_name");
			String t_birthday=resultSet.getString("t_birthday");
			String t_phone=resultSet.getString("t_phone");
			double t_wages=resultSet.getDouble("t_wages");
			System.out.printf("%s,%s,%s,%s,%s",id,t_name,t_birthday,t_phone,t_wages);
			System.out.println("");
			
		}
		
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if(resultSet==null){
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			if(preparedStatement==null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if (connection==null) {
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
	//删除
	public void Delecta(int x){
		try {
			Class.forName(driverName);
			connection=DriverManager.getConnection(url, username, password);
	        String sql="delete from tab_teacher where id="+x+""; 
	        statement=connection.createStatement();  
	       statement.executeUpdate(sql);     
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
	        
	}
	//更新
	public void Update(int id, String name,String birthday,String phone,double wages) {
		try {
			Class.forName(driverName);
			connection=DriverManager.getConnection(url, username, password);
	      
	        String sql="update tab_teacher set t_wages="+wages+", t_name='"+name+"',t_birthday='"+birthday+"',t_phone='"+phone+"' where id="+id+"" ; 
	        preparedStatement= connection.prepareStatement(sql)  ;
	        statement=connection.createStatement();  
		       statement.executeUpdate(sql);  
	        int i=preparedStatement.executeUpdate();
	        if(i==1){
	        	System.out.println("修改成功");
	        }else {
				System.out.println("修改失败");
			}
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入1、增加     2、删     3、更新    4、查看所有记录    5、根据老师编号查看老师记录      6、退出");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		TeacherDemo teacherDemo=new TeacherDemo();
		while(true){
		int i=scanner.nextInt();
		if(i==1){
			System.out.println("id");
			int id =scanner.nextInt();
			System.out.println("t_name");
			String t_name=scanner.next();
			System.out.println("t_birthday");
			String t_birthday=scanner.next();
			System.out.println("t_phone");
			String t_phone=scanner.next();
			System.out.println("t_wages");
			double t_wages=scanner.nextDouble();
		teacherDemo.Insert(id, t_name, t_birthday, t_phone, t_wages);
			
			
		}else if(i==2){
			System.out.println("请输入需要删除的id号：");
			int x=scanner.nextInt();
			System.out.println("输入yes确定删除");
			String string=scanner.next();
			if(string.equals("yes")){
			teacherDemo.Delecta(x);
			}
		}else if (i==3) {
			System.out.println("输入要修改的id号");
			int id =scanner.nextInt();
			System.out.println("更新t_name");
			String name=scanner.next();
			System.out.println("更新t_birthdy号");
			String birthday=scanner.next();
			System.out.println("更新t_phone号");
			String phone=scanner.next();
			System.out.println("更新t_wages号");
			double wages=scanner.nextDouble();
			teacherDemo.Update(id,name,birthday,phone,wages);
		}else if (i==4) {
			teacherDemo.Select();
		}else if (i==5) {
			System.out.println("输入老师的id进行查询");
			int x=scanner.nextInt();
			teacherDemo.Select1(x); 
		}else if(i==6) {
			
			break;
		}
		}
	}
	
}
