package project.service.impl;

import java.util.List;

//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import project.entity.Student;
import project.service.StudentService;

public class TestStudentService {
	StudentService studentService;
	@Before
	
	public void init() {
		studentService = new StudentServiceImpl();
		}
	 @Test
	 public void testSave() {
		 Student student=new
				 Student(0,"2016b11033","温一一","1996-02-23","123123123","浙江杭州",1.73);
				 boolean i=studentService.save(student);
//				 Assert.assertEquals(1,i);
	 	}
	 @Test
		public void testUpdate() {
			Student student = new Student(20, "2016b11052", "姚寒东", "1996-02-03", "15355551211", "云南曲靖", 1.70);
			boolean i = studentService.update(student);
//			Assert.assertEquals(1, i);
		}
 @Test
	public void testdelete() {
		boolean i = studentService.delete(5);
//		Assert.assertEquals(1, i);
		}
	@Test
	public void testFindAll() {
		List<Student> list = studentService.findAll();
		for (Student student1 : list) {
			System.out.println(student1);
		}

	}
	@Test
	public void testfindByStuName(){
		List<Student> list=studentService.findByName("姚寒东");
		for (Student student1 : list) {
			System.out.println(student1);
		}
	}
}
