package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam2 {

	public static void main(String[] args) {
		// ����,����,����,���� ������ �Է¹޾�
		// ����,����� ���ѵ�
		// ��� ���
		/*
			�̸� : ȫ�浿
			���� : 100
			���� : 90
			���� : 81
			----------
			���� : 271
			��� : 90.33
			�򰡰�� : A����
		*******************/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		//String name = "ȫ�浿";
		String name = scan.next();
		
		System.out.print("���� : ");
		//int kor = 100;
		int kor = scan.nextInt();
		
		System.out.print("���� : ");
		int eng = scan.nextInt();
		
		System.out.print("���� : ");
		int math = Integer.parseInt(scan.nextLine());
		
		int tot = kor + eng + math;
		double avg = tot * 100 / 3 / 100.0;
		
		//�򰡰�� ���(�������)
		String hakjum = "";
		
		//----------------
		//��� ���
		System.out.println("=== ����ó�� ��� ===");
		
	}

}






