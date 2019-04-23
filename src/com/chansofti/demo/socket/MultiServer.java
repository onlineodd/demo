package com.chansofti.demo.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class MultiServer {
//	private List<Map<String, Socket>> allConnectdList;
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("服务启动成功! ");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("服务启动失败! ");
		}

		Socket clientSocket = null;
		while (true) {
			try {
				clientSocket = serverSocket.accept();
				System.out.println(
						"客户端连接成功! 客户端: " + clientSocket.getRemoteSocketAddress() + ": " + clientSocket.getPort());
				// 使用多线程保留 clientSocket
				
				MultiFromServerThread multiFromServerThread = new MultiFromServerThread(clientSocket);
				multiFromServerThread.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class MultiFromServerThread extends Thread {
	private Socket socket;

	public MultiFromServerThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		DataInputStream dataInputStream = null;
		DataOutputStream dataOutputStream = null;

		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("创建输入输出错误！");
		}
		while (true) {
			try {
				String string = dataInputStream.readUTF();
				System.out
						.println("接受来自客户端" + socket.getRemoteSocketAddress() + ":" + socket.getPort() + "消息:" + string);
				dataOutputStream.writeUTF("echo" + string);
			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("接收消息错误！");
			}
		}
	}

}
