package com.slsd.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;//����ͳ��
		InputStream inputStream=null;
		try{
			inputStream=new FileInputStream(new File("D:\\mark.csv"));
			while(inputStream.read()!=-1){
				count++;
			}
			System.out.println("�ļ�����"+count);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try{
				inputStream.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
