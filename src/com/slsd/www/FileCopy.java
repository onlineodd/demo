package com.slsd.www;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String catFileString="D:\\mark.csv";
		String catFileString2="D:\\mark2.csv";
		InputStream inputStream=null;
		OutputStream outputStream=null;
		byte []buffer=new byte[1024];
		int numReadCount=0;
		try {
			inputStream=new FileInputStream(catFileString);
			outputStream =new FileOutputStream(catFileString2);
			
			while((numReadCount=inputStream.read(buffer))!=-1){
				outputStream.write(buffer,0,numReadCount);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
