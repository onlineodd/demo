package com.slsd.www;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\mark.csv");
		File file2=new File("D:\\Temporary\\abc");
		System.out.println(file.getAbsoluteFile());//绝对路径，相对路径
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getFreeSpace()/1024/1024/1024+"GB");
		System.out.println(file.getPath());
		System.out.println(file.getUsableSpace());
		System.out.println(file.listFiles());
		boolean mkdirs = file2.mkdirs();
		if(mkdirs){
			System.out.println("成功");
		}else{
			System.out.println("失败");
		}
		File file3=new File("D:\\Temporary\\abc\\abc.txt");
		boolean createNewFile = file3.createNewFile();
		System.out.println(createNewFile);
	}

}
