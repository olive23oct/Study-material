package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열입력1: ");
		String str1 = scan.nextLine();
		System.out.println(">>>" + str1);
		
		System.out.println("----");
		System.out.print("문자열입력2: ");
		String str2 = scan.nextLine();
		System.out.println(">>>" + str2);

		System.out.println("================");
		System.out.println("정수값 2개를 입력하면 더한 결과 출력");
		//int num1 = 20;
		//int num2 = 30;
		System.out.print("숫자 입력: ");
		int num1 = scan.nextInt();
		scan.nextLine(); //숫자입력후 엔터키(줄바꿈) 제어문자 읽기
		
		System.out.print("숫자 입력: ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("문자열입력: ");
		String temp = scan.nextLine();
		
		System.out.println("temp: " + temp);
		System.out.println("합계 : " + (num1 + num2));
	}

}








