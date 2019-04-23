package com.chansofti.demo.jdbc;

import java.sql.ResultSet;

public class StudentDAO {
	private DBUtill dbUtil = new DBUtill();

	public ResultSet findAll() {
		String sql = "select * from tab_student order by id";
		ResultSet resultSet = dbUtil.query(sql);
		return resultSet;
	}

	public ResultSet findByName(String stu_name) {
		stu_name = "%" + stu_name + "%";
		String sql = "select * from tab_student where tname like ?";
		ResultSet resultSet = dbUtil.query(sql, stu_name);
		return resultSet;
	}

	public int save(String stu_no, String stu_name, String stu_birthday, String stu_phone, String stu_address,double stu_height) {
		String sql = "insert into tab_student(stu_no,stu_name,stu_birthday,stu_phone,stu_address,stu_height)" + "values(?,?,?,?,?,?)";
		int i = dbUtil.update(sql, stu_no, stu_name, stu_birthday, stu_phone,stu_address,stu_height);
		return i;
	}

	public int update(String stu_no, String stu_name, String stu_birthday, String stu_phone, String stu_address,double stu_height) {
		String sql = "update tab_student stu_name=?,stu_birthday=?,stu_phone=?,stu_address=?,stu_height=? where stu_no=?";
		int i = dbUtil.update(sql, stu_name, stu_birthday, stu_phone,stu_address,stu_height);
		return i;
	}

	public int delecte(int id) {
		String sql = "delecte from tab_student where id=?";
		int i = dbUtil.update(sql, id);
		return i;
	}

	
}
