package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		// Ŭ���̾�Ʈ���� ������ �޽����� �ް� ������ �ݺ�ó��
		// ����(input)�Ŀ� ���Ÿ޽����� ȭ����� �� Ŭ���̾�Ʈ�� ����(output)

		ServerSocket server = null;
		
		//����Ÿ�� �б� ���� ��ü�� ������ ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//����Ÿ�� ���� ���� ��ü�� ������ ���� ����
		OutputStream os = null;
		PrintWriter pw = null;
		
		System.out.println(">> ���� ����~~~");
		try {
			server = new ServerSocket(10000);
			System.out.println(">> Ŭ���̾�Ʈ ���� �����...");
			
			Socket socket = server.accept();
			System.out.println(">> Ŭ���̾�Ʈ ���ӵ�");
			
			//����� ���ϰ� ����Ÿ�� �ְ� �ޱ� ���� I/O ��ü ����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//���� �߰� : ����Ʈ(byte) ó�� �迭�� ����(char) ó�� �迭�� ��ȯ
			isr = new InputStreamReader(is);
			
			//�����߰� : ����(buffer) ������� ���ϰ� ���δ��� �����
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			System.out.println(">> ����Ÿ �б�");
			while (true) {
				//�б�
				String msg = br.readLine();
				System.out.println("�����޽���> " + msg);
				
				//Ŭ���̾�Ʈ�� �۾�����(exit)�ϸ� ���� ó��
				if ("exit".equalsIgnoreCase(msg) || msg == null) {
					break;
				}
				
				//����
				pw.println(msg);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">>>> ���� ���� ------------");
	}

}













