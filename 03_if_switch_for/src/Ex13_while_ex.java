
public class Ex13_while_ex {

	public static void main(String[] args) {
		// while문 사용해서 처리
		//문제1 : 1~10까지의 합을 구하고 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; //sum += i;
		}
		System.out.println("1~10합계: " + sum);
			
		
		
		//문제2 -------------------
		//*
		//**
		//***
		//****
		//*****
		System.out.println("--------------");
		int starCnt = 0;
		
		starCnt = 1;
		while (starCnt <= 1) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println(); //줄바꿈
		
		starCnt = 1;
		while (starCnt <= 2) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println(); //줄바꿈
		
		starCnt = 1;
		while (starCnt <= 3) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println(); //줄바꿈

		System.out.println("==============");
		int line = 1;
		while (line <= 5) {
			starCnt = 1;
			while (starCnt <= line) {
				System.out.print("*");
				starCnt++;
			}
			System.out.println(); //줄바꿈
			line++;
		}
	}

}




