package com.slsd.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader=null;
		BufferedReader writer=null;
		String str;
		try {
			reader=new BufferedReader(new FileReader("D:\\Users.txt"));
			writer=new BufferedReader(new FileReader("D:\\Users1.txt"));
			while((str=reader.readLine())!=null){
//				writer.wait();
//				writer.readLine();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
