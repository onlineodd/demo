package project.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;


import project.entity.Student;
import project.service.StudentService;
import project.service.impl.StudentServiceImpl;
import project.utils.Log4jutil;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		StudentService studentService=new StudentServiceImpl();
		Logger logger=Log4jutil.getInstance(StudentController.class.getName());
		boolean isquit =false;
		while(!isquit){
			System.out.println("1.����   2.�޸�   3.ɾ��   4.�鿴���м�¼   5.������ʦ��Ų鿴��¼   6.�˳� ");
			int ui=scanner.nextInt();
			switch (ui) {
			case 1:
				System.out.println("������ѧ����Ϣ��ѧ����ţ����������գ��绰���룬סַ�����");
				String string=scanner.next();
				String[] params=string.split(",");
				//��װʵ���࣬�����ɣ�ǰ�ڣ���Ҫ�Լ�����
				Student studentAdd=new Student();
				studentAdd.setId(0);
				studentAdd.setStuNo(params[0]);
				studentAdd.setStuName(params[1]);
				studentAdd.setStuBirthday(params[2]);
				studentAdd.setStuPhone(params[3]);
				studentAdd.setStuAddres(params[4]);
				studentAdd.setStuHeight(Double.parseDouble(params[5]));
				boolean iosk=studentService.save(studentAdd);
				if(iosk){
					System.out.println("��ӳɹ���AAA");
					logger.info("����ѧ���ɹ�"+studentAdd);
				}else{
					System.out.println("���ʧ�ܣ�");
					logger.error("����ѧ��ʧ��|ѧ����Ϣ��"+studentAdd);
				}
				break;
				case 2:
					System.out.println("������ѧ����Ϣ(ѧ����ţ����������գ��绰���룬סַ�����)");
					String string1=scanner.next();
					String[] params1=string1.split(",");
					//��װʵ���࣬�����ɣ�ǰ�ڣ���Ҫ�Լ�����
					Student studentAdd1=new Student();
					studentAdd1.setId(Integer.valueOf(params1[0]));
					studentAdd1.setStuNo(params1[1]);
					studentAdd1.setStuName(params1[2]);
					studentAdd1.setStuBirthday(params1[3]);
					studentAdd1.setStuPhone(params1[4]);
					studentAdd1.setStuAddres(params1[5]);
					studentAdd1.setStuHeight(Double.parseDouble(params1[6]));
					boolean iosk1=studentService.update(studentAdd1);
					if(iosk1){
						System.out.println("���³ɹ���");
						logger.info("����ѧ���ɹ�"+studentAdd1);
					}else{
						System.out.println("����ʧ�ܣ�");
						logger.error("����ѧ��ʧ��|ѧ����Ϣ��"+studentAdd1);
					}
					break;
					case 3:
						int id=scanner.nextInt();
						
						boolean iosk2=studentService.delete(id);
						if(iosk2){
							System.out.println("ɾ���ɹ���");
							logger.info("ɾ��ѧ���ɹ�");
						}else{
							System.out.println("ɾ��ʧ�ܣ�");
							logger.error("ɾ��ѧ��ʧ��|ѧ����Ϣ��");
						}
						
						break;
			default:
				break;
			}
		}
	}

}
