package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		// ���� : Ŭ���̾�Ʈ���� ���� �޽����� �ް� �ٽ� �ǵ�����
		ServerSocket server = null;
		
		//����Ÿ�� �б� ���� ��ü�� ������ ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//����Ÿ�� ���� ���� ��ü�� ������ ���� ����
		OutputStream os = null;
		PrintWriter pw = null;

		try {
			System.out.println(">>> ���� ����");
			server = new ServerSocket(10000);
			
			System.out.println(">>> ����� ...");
			Socket socket = server.accept();
			
			//����Ÿ �ް�, ���� ����Ÿ �ǵ����ֱ�
			//����Ÿ �ޱ�
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println(">>> �޽��� �б�");
			String msg = br.readLine();
			System.out.println("�����޽��� : " + msg);
			
			//------------------------
			//Ŭ���̾�Ʈ ������ ������
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			
			pw.println("[�������� ����] " + msg);
			pw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">>> ���� ����");
	}

}













