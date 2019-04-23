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
			System.out.println("1.新增   2.修改   3.删除   4.查看所有记录   5.根据老师编号查看记录   6.退出 ");
			int ui=scanner.nextInt();
			switch (ui) {
			case 1:
				System.out.println("请输入学生信息（学生编号，姓名，生日，电话号码，住址，身高");
				String string=scanner.next();
				String[] params=string.split(",");
				//封装实体类，框架完成，前期，都要自己做。
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
					System.out.println("添加成功！AAA");
					logger.info("新增学生成功"+studentAdd);
				}else{
					System.out.println("添加失败！");
					logger.error("新增学生失败|学生信息："+studentAdd);
				}
				break;
				case 2:
					System.out.println("请输入学生信息(学生编号，姓名，生日，电话号码，住址，身高)");
					String string1=scanner.next();
					String[] params1=string1.split(",");
					//封装实体类，框架完成，前期，都要自己做。
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
						System.out.println("更新成功！");
						logger.info("更新学生成功"+studentAdd1);
					}else{
						System.out.println("更新失败！");
						logger.error("更新学生失败|学生信息："+studentAdd1);
					}
					break;
					case 3:
						int id=scanner.nextInt();
						
						boolean iosk2=studentService.delete(id);
						if(iosk2){
							System.out.println("删除成功！");
							logger.info("删除学生成功");
						}else{
							System.out.println("删除失败！");
							logger.error("删除学生失败|学生信息：");
						}
						
						break;
			default:
				break;
			}
		}
	}

}
