package com.chansofti.demo.socket;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//客户端回显
public class ReceiverServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(8888);
			System.out.println("服务器启动成功");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("服务器启动失败");
		}
		Socket clientsSocket=null;
		try {
			clientsSocket=serverSocket.accept();
			System.out.println("客服端连接成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("客服端连接失败");
		}
		DataInputStream dataInputStream=null;
		DataOutputStream dataOutputStream=null;
		try {
			dataInputStream=new DataInputStream(clientsSocket.getInputStream());
			dataOutputStream=new DataOutputStream(clientsSocket.getOutputStream());
			while(true){
				String string=dataInputStream.readUTF();
				System.out.println("收到客户端"+clientsSocket.getRemoteSocketAddress()+":"+clientsSocket.getPort()+"信息"+string);
				dataOutputStream.writeUTF("echo"+string);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
