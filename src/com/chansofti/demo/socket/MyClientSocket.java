package com.chansofti.demo.socket;



import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class MyClientSocket {
	private final static String SERVER_ADDR="127.0.0.1";
	private final static int PORT=8888;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Socket socket=null;
			try {
				socket=new Socket(SERVER_ADDR,PORT);//
				System.out.println("���ӷ������ɹ�");
			} catch (UnknownHostException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("���ӷ���������");
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("���ӷ���������");
			}
			DataOutputStream dataOutputStream=null;
			try {
				dataOutputStream=new DataOutputStream(socket.getOutputStream());
				String string="";
				Scanner scanner=new Scanner(System.in);
				while(!string.equals("quit")){
					string=scanner.next();
					dataOutputStream.writeUTF(string);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("�����������Ϣ����");
				
			}
			//3���ر�soket����
			try {
				socket.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
	}

}
