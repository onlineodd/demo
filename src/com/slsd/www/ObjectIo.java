package com.slsd.www;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectIo {

	public static void objectSerialize() throws FileNotFoundException, IOException{
		Student stu1=new Student(1,"����",20);
		Student stu2=new Student(2,"����",21);
		Student stu3=new Student(3,"����",20);
		Student stu4=new Student(4,"����",19);
		Student stu5=new Student(5,"Ǯ��",20);
		List<Student> stus1=new ArrayList<Student>();
		stus1.add(stu1);
		stus1.add(stu2);
		stus1.add(stu3);
		List<Student> stus2=new ArrayList<Student>();
		stus2.add(stu4);
		stus2.add(stu5);
		MyClass myClass=new MyClass("һ��", stus1);
		MyClass myClass2=new MyClass("����", stus2);
		//д���ļ�
	ObjectOutput oosObjectOutput=new ObjectOutputStream(new FileOutputStream("D:\\Temporary\\abc\\abcd.txt")) ;
	oosObjectOutput.writeObject(myClass);
	oosObjectOutput.writeObject(myClass2);
	oosObjectOutput.close();
	System.out.println("д�����");
	}
	public static void antSerialize() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInput ossObjectOutput2=new ObjectInputStream(new FileInputStream("D:\\Temporary\\abc\\abcd.txt"));
		
		try {
			while(true ){
				Object object=ossObjectOutput2.readObject();
				System.out.println(object);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("��ȡ���");
		
		}
		ossObjectOutput2.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			objectSerialize();
			antSerialize();
		} catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
