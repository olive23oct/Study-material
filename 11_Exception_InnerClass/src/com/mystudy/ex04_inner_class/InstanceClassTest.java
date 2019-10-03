package com.mystudy.ex04_inner_class;

public class InstanceClassTest {
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		sum = a + b;
		
	}

	//내부클래스 : 인스턴스 클래스
	class Inner {
		int in = 100;
		void printData() {
			System.out.println("int a : " + a);
			System.out.println("int b : " + b);
			System.out.println("static c : " + c);
			sum();
			System.out.println("sum : " + sum);
			System.out.println("내부클래스필드 in : " + in);
		}
	}
	
	
	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("필드변수 a : " + out.a);
		
		System.out.println("---- 인스턴스 클래스 사용 ---");
		//내부클래스인 Inner에 있는 printData() 실행
		//Inner 클래스의 객체 생성
		//외부클래스명.내부클래스 : 내부클래스의 타입
		//new InstanceClassTest().new Inner() 
		//    - 외부클래스 객체 생성 후  내부클래스 객체 생성
		InstanceClassTest.Inner inner 
				= new InstanceClassTest().new Inner();
		inner.printData();
		
		System.out.println("---------");
		System.out.println("Inner 클래스 필드변수 in : " 
				+ inner.in);
	}

}
















