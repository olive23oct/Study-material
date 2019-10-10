package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		//�޽����� �ۼ��ؼ� ������ �����ϰ�, ������ ���� ���޹��� �޽��� ���� �ݺ�
		//�޽��� �ۼ� : Scanner ��ü ����ؼ� �ֿܼ��� �Է�
		Socket socket = null;
		
		//byte ���� ����� ó�� ���� ����
		InputStream is = null;
		OutputStream os = null;
		
		//���� �߰�
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		PrintWriter pw = null;
		
		System.out.println("---- Ŭ���̾�Ʈ ���� ----");
		try {
			socket = new Socket("localhost", 10000);
			
			//���ϰ� ����� I/O ��ü ����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//���� �߰� : ����Ʈ(byte) ó�� �迭�� ����(char) ó�� �迭�� ��ȯ
			isr = new InputStreamReader(is);
			
			//�����߰� : ����(buffer) ������� ���ϰ� ���δ��� �����
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			
			//����, �б� �ݺ� ó��
			Scanner scan = new Scanner(System.in);
			while (true) {
				//�޽��� �ۼ�
				System.out.print("�޽����ۼ�> ");
				String msg = scan.nextLine();
				
				//�ۼ��� �޽��� ������ ����
				pw.println("[Ŭ���̾�Ʈ] " + msg);
				pw.flush();
				
				//�޽��� ���� Ȯ���ؼ� "exit"�� ��� �۾� ����
				if ("exit".equalsIgnoreCase(msg)) {
					break;
				}
				
				//�������� ������ �޽��� ����
				String reMsg = br.readLine();
				System.out.println("from����> " + reMsg);
			}
			
			System.out.println("---- Ŭ���̾�Ʈ ���� ���� ----");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[���ܹ߻�] Ŭ���̾�Ʈ ������ ����" 
					+ " - " + e.getMessage());
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}












