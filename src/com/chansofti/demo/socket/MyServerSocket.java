package com.chansofti.demo.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServerSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;//声明一个ServerSocket对象
		//1启动服务，进行监听，设置监听的端口号
		try {
			serverSocket=new ServerSocket(8888);
			System.out.println("服务器启动成功，端口号为8888");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("服务器启动失败");
		}
		
		//2.等待客户端接入
		Socket clientSocket=null;
		try {
			clientSocket= serverSocket.accept();
			System.out.println("客户端连接成功！客户端"+clientSocket.getRemoteSocketAddress()+":"+clientSocket.getPort());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("客户端连接出错");
		}
		//3.接收及传数据
		try {
			DataInputStream dataInputStream=new DataInputStream(clientSocket.getInputStream());
			String string="";
			while(true){
				string=dataInputStream.readUTF();
				System.out.println("收到客户短消息："+string);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
