package com.mystudy.array04_param;

public class Ex01_parameter {

	public static void main(String[] args) {
		// 파라미터 값을 전달할 때
		//1. 값이 전달되는 경우 : 기본 데이타 타입
		//2. 주소값이 전달되는 경우 : 참조형 데이타 타입
		//   참조형 데이타 타입을 전달 받아 값 변경시 원본 데이타도 값 변경됨
		int num = 100;
		int[] arr = {100, 200, 300};
		System.out.println("정수 num : " + num);
		changeData(num);
		System.out.println("changeData()실행후 num : " + num);
		
		System.out.println("--- 참조형 데이타 전달 ---");
		printData(arr); //원본 데이타 출력
		changeData(arr); //주소값복사 : 파라미터로 전달값 변경후 출력
		
		//원본 데이타 손실없이 데이타 전달 후 조회/입력/수정/삭제 작업
		//changeData(arr.clone()); //복사객체 전달
		printData(arr);
	}
	
	static void changeData(int intValue) {
		System.out.println(">> 전달받은 int : " + intValue);
		intValue = 999;
		System.out.println(">> 변경된 int : " + intValue);
	}
	
	static void changeData(int[] intArr) {
		System.out.print(">>전달받은 intArr[]: ");
		printData(intArr);
		
		//데이타 변경처리
		intArr[0] = 999;
		System.out.print(">>변경후 intArr[]: ");
		printData(intArr);
	}
	
	static void changeDataArray(int[] intArr) {
		System.out.print(">>전달받은 intArr[]: ");
		printData(intArr);
		
		//데이타 변경처리
		intArr[0] = 999;
		System.out.print(">>변경후 intArr[]: ");
		printData(intArr);
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	
	

}






