package com.chansofti.demo.zy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
		
			BufferedWriter buf2 = null;
			try {
				buf2 = new BufferedWriter(new FileWriter("D:\\test.txt"));
			System.out.println("����������д��Ļ���");
			Scanner scanner=new Scanner(System.in);
			String string=scanner.next();
			while(!string.equals("q")){
				buf2.write(string);
				buf2.newLine();//��������BufferedWriter
				System.out.println("����밴q�˳�");
				string=buf.readLine();		//���к��ȡBufferedReader
			}
			buf.close();
			buf2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			
					
				
			}

		
	}

}
