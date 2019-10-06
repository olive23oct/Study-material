package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {

	public static void main(String[] args) {
		//(실습) 오늘 당신의 행운지수 알아보기(0~100)
		// Math.random(), Random 사용해서 행운지수 값 만들기
		//실행결과
		//2019년 2월 26일 당신의 행운지수(0~100)는 77입니다.
		//////////////////////////////////////////
		
		//행운지수 값 만들기
		int result = 0;
		
		System.out.println("오늘 나의 행운지수는 얼마일까요?");
		
		//년,월,일 구하기
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; //(0~11) + 1
		int date = calendar.get(Calendar.DATE);
		System.out.println("year: " + year);
		System.out.println("month: " + month); 
		System.out.println("date: " + date); 
		System.out.println(year +"년 "+ month +"월 "+ date +"일 ");
		String yyyymmdd = year +"년 "+ month +"월 "+ date +"일 ";
		System.out.println("---------------");
		
		//방법1 - Random nextInt(숫자)
		Random ran = new Random();
		result = ran.nextInt(101); //0~100 범위의 정수타입 난수
		System.out.print(year +"년 "+ month +"월 "+ date +"일 ");
		System.out.println("당신의 행운지수(0~100)는 " + result + "입니다.");
		
		//방법2 - Math.random()
		result = (int)(Math.random() * 101);
		System.out.print(yyyymmdd);
		System.out.println("당신의 행운지수(0~100)는 " + result + "입니다.");
		
		//Random nextInt(숫자) 메소드가 없다면 nextInt() 사용
		int su = ran.nextInt();
		result = Math.abs(su) % 101;
		System.out.print(yyyymmdd);
		System.out.println("당신의 행운지수(0~100)는 " + result + "입니다.");
		
		//(나중엣 개인적으로) Random nextDouble() 사용해서
	}

}







