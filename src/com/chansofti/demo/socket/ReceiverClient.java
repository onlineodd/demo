package com.chansofti.demo.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ReceiverClient {
	private final static String SERVER_ADDR="127.0.0.1";
	private final static int PORT=8888;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Socket socket=null;
		try {
			socket=new Socket(SERVER_ADDR,PORT);
			System.out.println("连接服务器成功");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("连接服务器失败");
		}
		DataOutputStream dataOutputStream=null;
		ReceiveFromServerThread receiveFromServerThread=new ReceiveFromServerThread(socket);
		receiveFromServerThread.start();
		try {
			dataOutputStream=new DataOutputStream(socket.getOutputStream());
			String string="";
			Scanner scanner=new Scanner(System.in);
			while(!string.equals("quit")){
				string=scanner.next();
				dataOutputStream.writeUTF(string);
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("发送消息");
		}
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class ReceiveFromServerThread extends Thread{
	private Socket socket;

	public ReceiveFromServerThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInputStream dataInputStream=null;
		try {
			dataInputStream=new DataInputStream(socket.getInputStream());
			String string="";
			while(true){
				string=dataInputStream.readUTF();
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
