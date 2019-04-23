package demo.project.dao;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import project.dao.StudentDAO;
import project.dao.impl.StudentDAOImpl;
import project.entity.Student;

public class TestStudentDAO {
	private StudentDAO studentDAO;

	@Before
	public void init() {
		studentDAO = new StudentDAOImpl();
	}

	
	 @Test
	 public void testSave() {
	 Student student=new
	 Student(0,"2016b11035","xx","1996-02-23","123123123","Õã½­º¼ÖÝ",1.73);
	 int i=studentDAO.save(student);
	 Assert.assertEquals(1, i);
	 }
	@Test
	public void testUpdate() {
		Student student = new Student(8, "2016b11052", "Ò¦º®¶«", "1996-02-03", "15355424838", "ÔÆÄÏÇú¾¸", 1.70);
		int i = studentDAO.update(student);
		Assert.assertEquals(1, i);
	}

	@Test
	public void testdelect() {
		int i = studentDAO.delete(29);
		Assert.assertEquals(1, i);
	}
	@Test
	public void testDeleteBystuNo(){
		int i = studentDAO.deleteBystuNo("2016b11033");
		Assert.assertEquals(1, i);
	}
	@Test
	public void testFindById(){
		Student student= studentDAO.findById(20);
		System.out.println(student.toString());
	}
	@Test
	public void testFindByStuNo(){
		Student student= studentDAO.findByStuNo("2016b11052");
		System.out.println(student.toString());
		
	}
	@Test
	public void testFindAll(){
		
		List<Student> student=studentDAO.findAll();
		student.forEach(System.out::println);
	}
	@Test
	public void testfindByStuName(){
		List<Student> student=studentDAO.findByStuName("ÎÂöÎØß");
		student.forEach(System.out::println);
	}
	@Test
	public void testFindAllByPage(){
		int pageSize=2;
		int page=2;
		List<Student>list=studentDAO.findAllByPage(pageSize, page);
		list.forEach(System.out::println);
	}
}
