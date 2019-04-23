package com.slsd.www;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class PrinText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader=null;
		Writer writer=null;
		char[]buffer=new char[512];
		int num=0;
				try {
					reader=new FileReader(new File("D:\\Users.txt"));
					writer=new PrintWriter(System.out);
					while ((num=reader.read(buffer))!=-1) {
						writer.write(buffer,0,num);
						
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
