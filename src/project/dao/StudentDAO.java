package project.dao;

import java.util.List;

import project.entity.Student;
/*
 * ���ݿ�ӿ�
 * ���Ը�����Ŀ����Ҫ������ɾ���ӿڷ���
 */
public interface StudentDAO {
	//����ѧ��
public int save(Student student);
//�޸�
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
