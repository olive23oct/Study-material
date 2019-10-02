package com.mystudy.array04_param;

public class Ex02_MethodOverloading {

	public static void main(String[] args) {
		//메소드(메서드) 오버로딩(Method Overloading)
		//정의: 동일한 메소드명을 사용해서 서로 다른 기능 구현
		//0. 하나의 클래스 내에서(상속과는 무관) 
		//1. 동일한 메소드명으로 정의
		//2. 파라미터(parameter)의 타입, 갯수, 순서를 달리해서 작성
		//   - 메소드의 리턴타입은 무관
		//   - 메소드 오버로딩은 클래스 내에서 메소드 중복 선언
		/////////////////////////////////////////
		String name = "홍길동";
		int kor = 100;
		int eng = 90;
		int math = 80;
		int tot = kor + eng + math;
		double avg = tot * 100 / 3 / 100.0;
		
		Ex02_MethodOverloading mo = new Ex02_MethodOverloading();
		mo.displayData();
		mo.displayData(name);
		//메소드의 파라미터의 갯수, 타입, 순서에 따라 결정
		mo.displayData(name, kor); //String, int
		mo.displayData(name, tot); //String, int
		mo.displayData(name, avg);
		mo.displayData(avg, name);
		mo.displayData(name, tot, avg);
		
	}
	void displayData() {
		System.out.println("--- 데이타를 출력 ---");
	}
	
	void displayData(String name) {
		System.out.println("이름: " + name);
		
	}
//	//이름, 국어 점수 출력
//	void displayData(String name, int kor) {
//		System.out.println("이름: " + name + ", "
//		                 + "국어: " + kor);
//	}
	
	//이름, 총점 출력
	void displayData(String name, int tot) {
		System.out.println("이름: " + name + ", "
		                 + "합계: " + tot);
	}
	
	void displayData(String name, double avg) {
		System.out.println("1. 이름: " + name + ", "
				         + "평균: " + avg);
	}
	void displayData(double avg, String name) {
		System.out.println("2. 이름: " + name + ", "
				         + "평균: " + avg);
	}
	void displayData(String name, int tot, double avg) {
		System.out.println("이름: " + name + ", "
						 + "총점: " + tot + ", "
				         + "평균: " + avg);
	}


}


















