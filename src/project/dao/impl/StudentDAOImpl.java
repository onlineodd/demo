package project.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import project.dao.StudentDAO;
import project.entity.Student;
import project.utils.DBUtil;

public class StudentDAOImpl implements StudentDAO{
	
	private DBUtil dbUtil=new DBUtil();
	private Student student;
	
	@Override
	public int save(Student student) {
		String sql="insert into tab_student(stu_no,stu_name,stu_birthday,stu_phone,stu_address,stu_height)" + "values(?,?,?,?,?,?)";
		int i = dbUtil.update(sql, student.getStuNo(),student.getStuName(),student.getStuBirthday(),student.getStuPhone(),student.getStuAddres(),student.getStuHeight());
		return i;
	}

	@Override
	public int update(Student student) {
		String sql = "update  tab_student set stu_no=?, stu_name=?,stu_birthday=?,stu_phone=?,stu_address=?,stu_height=? where id=?";
		int i = dbUtil.update(sql,student.getStuNo(),student.getStuName(),student.getStuBirthday(),student.getStuPhone(),student.getStuAddres(),student.getStuHeight(),student.getId());
		return i;
		
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from tab_student where id=?";
		int i =dbUtil.update(sql, id);
		return i;
	}

	@Override
	public int deleteBystuNo(String stuNo) {
		String sql="delete from tab_student where stu_no=?";
		int i=dbUtil.update(sql, stuNo);
		return i;
	}

	@Override
	public Student findById(Integer id) {
		ResultSet resultSet = dbUtil.query("select * from tab_student order by id=?",id);
		
		try {
			while (resultSet.next()) {
				 student = handleDate(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public Student findByStuNo(String stuNo) {
		ResultSet resultSet = dbUtil.query("select * from tab_student order by stu_no=?",stuNo);
	
		try {
			while (resultSet.next()) {
				 student = handleDate(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return student;
	}

	@Override
	public List<Student> findAll() {
		List<Student> list = new ArrayList<Student>();
		ResultSet resultSet = dbUtil.query("select * from tab_student");
		try {
			while (resultSet.next()) {
				Student student = handleDate(resultSet);
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}
	

	
	@Override
	public List<Student> findByStuName(String stuName) {
		List<Student> list = new ArrayList<Student>();
		stuName="%"+stuName+"%";
		ResultSet resultSet = dbUtil.query("select * from tab_student where stu_name like ?",stuName);
		try {
			while (resultSet.next()) {
				Student student = handleDate(resultSet);
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}

	private Student handleDate(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String stu_no = resultSet.getString("stu_no");
		String stu_name = resultSet.getString("stu_name");
		String stu_birthday = resultSet.getString("stu_birthday");
		String stu_phone = resultSet.getString("stu_phone");
		String stu_address = resultSet.getString("stu_address");
		double stu_height = resultSet.getDouble("stu_height");
		Student student = new Student(id, stu_no, stu_name, stu_birthday, stu_phone, stu_address, stu_height);
		return student;
	}
	public List<Student> findAllByPage(int pageSize,int page){
		List<Student> list =new ArrayList<Student>();
		String sql="select * from tab_student";
		ResultSet resultSet=dbUtil.querByPage(sql, pageSize, page);
		try {
			while(resultSet.next()){
				Student student=handleDate(resultSet);
				list.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		int allCount=0;
		String sql="select count(*) from tab_student";
		ResultSet resultSet=dbUtil.query(sql);
		try {
			while(resultSet.next()){
				allCount=resultSet.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			dbUtil.close();
		}
		return allCount;
	}

}
