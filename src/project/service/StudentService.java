package project.service;

import java.util.List;

import project.entity.Student;
/*
 * 
 */
public interface StudentService {
	
	public boolean save(Student student);

	public boolean update(Student student);

	public boolean delete(Integer id);
	
	public List<Student> findAll();
	
	public List<Student> findByName(String stuName);
	
	public int count();
	public Student findById(Integer id);
	


	
	
}
