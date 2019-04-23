package com.slsd.www;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="D:\\Temporary\\abc\\abc.txt";
		String s2="D:\\read.txt";
		InputStream inputStream=null;
		OutputStream outputStream=null;
		byte []buffer=new byte[1024];
		try {
			inputStream=new FileInputStream(s1);
			outputStream=new FileOutputStream(s2);
			int t=0;
			while((t=inputStream.read(buffer))!=-1){
				outputStream.write(buffer, 0, t);
				if(t==0){
					System.out.println("copy ß∞‹");
				}else {
					System.out.println("copy≥…π¶");
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
