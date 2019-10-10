package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerByte {

	public static void main(String[] args) {
		//������ : ServerSocket ��ü�� Ŭ���̾�Ʈ ������ ��ٸ���
		ServerSocket server = null;
		try {
			System.out.println("[����] ���� �� Ŭ���̾�Ʈ ���� �����");
			//�����ʿ��� 10000�� ��Ʈ�� ���� �����Ϸ��� ����Ѵ�
			server = new ServerSocket(10000); //��Ʈ����
			
			//�������� �ش� ��Ʈ�� ������ Ŭ���̾�Ʈ�� �������� ����
			Socket socket = server.accept();
			System.out.println("[����] 1�� Ŭ���̾�Ʈ ����");
			
			//���Ͽ��� Input, Output ��Ʈ�� ��ü ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//InputStream ��ü�� �̿��ؼ� �о����
//			int readValue = is.read();
//			System.out.println("[����] Ŭ���̾�Ʈ�� ���� �����޽��� : " 
//					+ (char)readValue);
			
			byte[] buf = new byte[100];
			is.read(buf);
			System.out.println("[����] �����޽��� : " + new String(buf));
			
			os.close();
			is.close();
			
			System.out.println(">>> ���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}














