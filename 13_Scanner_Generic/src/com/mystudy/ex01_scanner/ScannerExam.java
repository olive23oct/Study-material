package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڿ��Է�1: ");
		String str1 = scan.nextLine();
		System.out.println(">>>" + str1);
		
		System.out.println("----");
		System.out.print("���ڿ��Է�2: ");
		String str2 = scan.nextLine();
		System.out.println(">>>" + str2);

		System.out.println("================");
		System.out.println("������ 2���� �Է��ϸ� ���� ��� ���");
		//int num1 = 20;
		//int num2 = 30;
		System.out.print("���� �Է�: ");
		int num1 = scan.nextInt();
		scan.nextLine(); //�����Է��� ����Ű(�ٹٲ�) ����� �б�
		
		System.out.print("���� �Է�: ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("���ڿ��Է�: ");
		String temp = scan.nextLine();
		
		System.out.println("temp: " + temp);
		System.out.println("�հ� : " + (num1 + num2));
	}

}








