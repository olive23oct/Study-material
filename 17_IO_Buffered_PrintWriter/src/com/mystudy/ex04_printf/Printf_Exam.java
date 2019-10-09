package com.mystudy.ex04_printf;

import java.util.Calendar;

public class Printf_Exam {

	public static void main(String[] args) {
		//printf() 메소드
		int a = 20;
		long b = 3000000000L;
		float c = 34.95f;
		double d = 234.234;
		char e = 'A';
		String f = "Hello~~~";
		boolean g = false;

		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF", today);
		System.out.println();
		
		System.out.println(">>" + a +" "+ b + " "
				+ c +" "+ d +" "+ e +" "+ f +" "+ g);
		/* [] 생략 가능
		%[인덱스]$[-][크기]형식문자 : %, 형식문자 필수
		- 기본은 우측정렬
		- 좌측정렬 사용 마이너스 부호사용 예) %-10d
		*/
		System.out.printf("\\ %% %n \n");
		System.out.printf("%d %d %f %f \n", a,b,c,d);
		System.out.printf("%c %s %b %n", e,f,g);
		
		System.out.printf("%d %d %c %s \n", 100, 100, 'A', "Hello~");
		//[인덱스]$ 사용예 --------------
		//[주의] 인덱스 적용하면 데이타 매칭에서 제외됨
		System.out.printf("%1$d %1$d %c %s \n", 66, 'A', "Hello~");
		System.out.printf("%1$d %1$d %2$c %3$s \n", 66, 'A', "Hello~");
		
		System.out.println("--- 실수형 데이타 표시 ---");
		System.out.printf("%f %1$a %1$e %1$g \n", 65.84123412342);
		System.out.printf("%1$10.3f \n", 65.84123412342);//전체 10자리 소수점이하 3자리
		System.out.printf("%1$-10.3f \n", 65.84123412342);//(좌측정렬)전체 10자리 소수점이하 3자리
		
		System.out.println("--- 날짜관련 ---");
		System.out.printf("%1$tY/%1$tm/%1$td %1$tF \n", today);
		//System.out.printf("%1$tB %1$th \n", today);
		//System.out.printf("%1$ty %1$tM %1$tS %1$ta \n", today);
		System.out.printf("%1$tI:%1$tM:%1$tS %1$ta \n", today);
		
		System.out.println("--- 폭(width) 지정 ---");
		System.out.printf("%1$20f \n", 5678.1234567890);
		System.out.printf("%1$-20f \n", 5678.1234567890);
		System.out.printf("%1$-20.10f \n", 5678.1234567890);
		
		System.out.println("----------------");
		System.out.printf("%10s %10d %10d %10d \n", "홍길동", 100, 90, 80);
		System.out.printf("%10s %10d %10d %10d \n", "을지문덕", 100, 90, 80);
	}

}









