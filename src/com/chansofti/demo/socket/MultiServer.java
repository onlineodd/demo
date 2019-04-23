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
			System.out.println("���������ɹ�! ");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("��������ʧ��! ");
		}

		Socket clientSocket = null;
		while (true) {
			try {
				clientSocket = serverSocket.accept();
				System.out.println(
						"�ͻ������ӳɹ�! �ͻ���: " + clientSocket.getRemoteSocketAddress() + ": " + clientSocket.getPort());
				// ʹ�ö��̱߳��� clientSocket
				
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
			System.out.println("���������������");
		}
		while (true) {
			try {
				String string = dataInputStream.readUTF();
				System.out
						.println("�������Կͻ���" + socket.getRemoteSocketAddress() + ":" + socket.getPort() + "��Ϣ:" + string);
				dataOutputStream.writeUTF("echo" + string);
			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("������Ϣ����");
			}
		}
	}

}
