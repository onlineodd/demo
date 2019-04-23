package com.chansofti.demo.socket;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//�ͻ��˻���
public class ReceiverServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(8888);
			System.out.println("�����������ɹ�");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("����������ʧ��");
		}
		Socket clientsSocket=null;
		try {
			clientsSocket=serverSocket.accept();
			System.out.println("�ͷ������ӳɹ�");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("�ͷ�������ʧ��");
		}
		DataInputStream dataInputStream=null;
		DataOutputStream dataOutputStream=null;
		try {
			dataInputStream=new DataInputStream(clientsSocket.getInputStream());
			dataOutputStream=new DataOutputStream(clientsSocket.getOutputStream());
			while(true){
				String string=dataInputStream.readUTF();
				System.out.println("�յ��ͻ���"+clientsSocket.getRemoteSocketAddress()+":"+clientsSocket.getPort()+"��Ϣ"+string);
				dataOutputStream.writeUTF("echo"+string);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
