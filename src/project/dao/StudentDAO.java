package project.dao;

import java.util.List;

import project.entity.Student;
/*
 * 数据库接口
 * 可以根据项目的需要新增或删减接口方法
 */
public interface StudentDAO {
	//保存学生
public int save(Student student);
//修改
public int update(Student student);
public int delete(Integer id);
public int deleteBystuNo(String stuNo);
public Student findById(Integer id);
public Student findByStuNo(String stuNo);
public List<Student>findAll();
public List<Student>findByStuName(String stuName);
public List<Student>findAllByPage(int pageSize,int page);
int count();

}
