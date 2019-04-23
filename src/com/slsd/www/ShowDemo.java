package com.slsd.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ShowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="";
		File file=new File("D:\\Temporary\\abc\\abc.txt");
		Reader reader=null;
		try {
			reader=new InputStreamReader(new FileInputStream(file));
			int t;
			while((t=reader.read())!=-1){
//				System.out.println(t);
			
				string+=(char)t;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		System.out.println(string);
		System.out.println(file.getPath());
	}

}
