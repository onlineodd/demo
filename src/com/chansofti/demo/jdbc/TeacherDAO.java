package com.chansofti.demo.jdbc;

import java.sql.ResultSet;

public class TeacherDAO {
	private DBUtill dbUtil = new DBUtill();

	public ResultSet findAll() {
		String sql = "select * from tab_teacher order by id";
		ResultSet resultSet = dbUtil.query(sql);
		return resultSet;
	}

	public ResultSet findByName(String t_name) {
		t_name = "%" + t_name + "%";
		String sql = "select * from tab_teacher where t_name like ?";
		ResultSet resultSet = dbUtil.query(sql, t_name);
		return resultSet;
	}

	public int save(String id, String t_name, String t_birthday, String t_phone, double t_wages) {
		String sql = "insert into tab_teacher(id,t_name,t_birthday,t_phone,t_wages)" + "values(?,?,?,?,?)";
		int i = dbUtil.update(sql, id, t_name, t_birthday, t_phone, t_wages);
		return i;
	}

	public int update(String id, String t_name, String t_birthday, String t_phone, double t_wages) {
		String sql = "update tab_teacher set t_name=?,t_birthday=?,t_phone=?,t_wages=? where id=?";
		int i = dbUtil.update(sql, t_name, t_birthday, t_phone, t_wages,id);
		return i;
	}

	public int delete(String id) {
		String sql = "delete from tab_teacher where id=?";
		int i = dbUtil.update(sql, id);
		return i;
	}
public void close(){
	dbUtil.close();
}
	
}
