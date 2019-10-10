package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClientEcho {

	public static void main(String[] args) {
		Socket socket = null;
		
		//�Է�ó���� ��ü ���� ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//���ó���� ��ü ���� ���� ����
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("---- Ŭ���̾�Ʈ ---");
			//                  IP��ȣ, ��Ʈ��ȣ
			socket = new Socket("localhost", 10000);
			System.out.println(">>> ������ ���ӿϷ�");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//���������� ����(����)
			System.out.println(">>>�޽��� ����(client -> server)");
			pw = new PrintWriter(os);
			
			String msg = "�ȳ��ϼ���~~ �ݰ����ϴ�.";
			pw.println(msg);
			pw.flush();
			
			System.out.println(">>�����޽��� : " + msg);
			
			//------------------
			//�������� ������ �޽��� �ޱ�(����)
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String receiveMsg = br.readLine();
			System.out.println(">>�����޽��� : " + receiveMsg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---- Ŭ���̾�Ʈ ���� -----");
		
	}

}









