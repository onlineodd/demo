package com.chansofti.demo.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServerSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;//����һ��ServerSocket����
		//1�������񣬽��м��������ü����Ķ˿ں�
		try {
			serverSocket=new ServerSocket(8888);
			System.out.println("�����������ɹ����˿ں�Ϊ8888");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("����������ʧ��");
		}
		
		//2.�ȴ��ͻ��˽���
		Socket clientSocket=null;
		try {
			clientSocket= serverSocket.accept();
			System.out.println("�ͻ������ӳɹ����ͻ���"+clientSocket.getRemoteSocketAddress()+":"+clientSocket.getPort());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("�ͻ������ӳ���");
		}
		//3.���ռ�������
		try {
			DataInputStream dataInputStream=new DataInputStream(clientSocket.getInputStream());
			String string="";
			while(true){
				string=dataInputStream.readUTF();
				System.out.println("�յ��ͻ�����Ϣ��"+string);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
