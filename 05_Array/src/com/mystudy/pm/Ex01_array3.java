package com.mystudy.pm;

public class Ex01_array3 {

	public static void main(String[] args) {
		/*  문제
		*
		**
		***
		****
		*****
		-------------*/
		//char 타입의 데이타 5개를 저장할 수 있는 배열 만들고 별(*) 출력
		//배열의 변수명 : ch
		//char[] ch = new char[5];
		//char[] ch = {'*', '*', '*', '*', '*'};
		
		//방법1 : 배열 전체에 '*'로 채우고 선택적으로 출력
		//배열에 ***** : 0번 인덱스 값만 출력
		//             0~1번 인덱스 값 출력
		char[] ch = new char[5];
		//초기값 설정 : 5군데에 모두 '*' 입력
		for (int i = 0; i < ch.length; i++) {
			ch[i] = '*';
		}
		
		//저장된 값 확인(조회)
		System.out.print("배열에 저장된 값 : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("----");
		
		for (int idx = 0; idx < 1; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		
		for (int idx = 0; idx < 2; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		
		for (int idx = 0; idx < 3; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		
		System.out.println("-----------------");
		int starCnt = 1;
		for (int line = 1; line <= 5; line++) {
			for (int idx = 0; idx < starCnt; idx++) {
				System.out.print(ch[idx]);
			}
			System.out.println();
			starCnt++;
		}
		
		System.out.println("-----------------");
		for (int line = 1; line <= 5; line++) {
			for (int idx = 0; idx < line; idx++) {
				System.out.print(ch[idx]);
			}
			System.out.println();
		}
		System.out.println("=================");
		//방법2 : 순차적으로 '*'을 넣으면서 배열값 전체 출력
		//0 : '*' - 배열 전체 출력
		//1 : '*' - 배열 전체 출력
		char[] ch2 = new char[5];
		System.out.print("배열에 저장된 값: -");
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println("-배열끝");
		System.out.println("-----------");
		
		ch2[0] = '*';
//		for (int i = 0; i < ch2.length; i++) {
//			System.out.print(ch2[i]);
//		}
//		System.out.println();
		printArray(ch2);
		
		ch2[1] = '*';
//		for (int i = 0; i < ch2.length; i++) {
//			System.out.print(ch2[i]);
//		}
//		System.out.println();
		printArray(ch2);
		
		ch2[2] = '*';
//		for (int i = 0; i < ch2.length; i++) {
//			System.out.print(ch2[i]);
//		}
//		System.out.println();
		printArray(ch2);
		
		System.out.println("---------------------");
		//배열값 초기화
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = ' ';
		}
		
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = '*';
			printArray(ch2);
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

	}
	
	static void printArray(char[] stars) {
		for (int i = 0; i < stars.length; i++) {
			System.out.print(stars[i]);
		}
		System.out.println();
	}

}
















