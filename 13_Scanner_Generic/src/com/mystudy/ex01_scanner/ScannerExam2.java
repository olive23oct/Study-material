package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam2 {

	public static void main(String[] args) {
		// 성명,국어,영어,수학 점수를 입력받아
		// 총점,평균을 구한뒤
		// 결과 출력
		/*
			이름 : 홍길동
			국어 : 100
			영어 : 90
			수학 : 81
			----------
			총점 : 271
			평균 : 90.33
			평가결과 : A학점
		*******************/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		//String name = "홍길동";
		String name = scan.next();
		
		System.out.print("국어 : ");
		//int kor = 100;
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(scan.nextLine());
		
		int tot = kor + eng + math;
		double avg = tot * 100 / 3 / 100.0;
		
		//평가결과 계산(학점계산)
		String hakjum = "";
		
		//----------------
		//결과 출력
		System.out.println("=== 성적처리 결과 ===");
		
	}

}






