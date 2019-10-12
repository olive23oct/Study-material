package com.mystudy.net_multi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientMulti {

	public static void main(String[] args) {
		System.out.println("---- Ŭ���̾�Ʈ ���� ----");
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		
		PrintWriter pw = null;
		Scanner scan = new Scanner(System.in);

		try {
			socket = new Socket("localhost", 10000);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			pw = new PrintWriter(os);
			
			//�޽��� ����
			while (true) {
				System.out.print("�޽����Է�> ");
				String msg = scan.nextLine();
				
				//���������� ����
				pw.println(msg);
				pw.flush();
				
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println(">>> �����մϴ�");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				is.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}








