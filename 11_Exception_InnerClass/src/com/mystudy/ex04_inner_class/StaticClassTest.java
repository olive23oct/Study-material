package com.mystudy.ex04_inner_class;

public class StaticClassTest {
	int a = 10;
	private int b = 100;
	static int c = 200;	
	
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 20;
	static void sum() {
		sum = Inner.d + sNum2;
	}
	
	//스테틱내부클래스(Inner class 중 static클래스)
	static class Inner {
		static int d = 1000;
		int e = 2000;
		void printData() {
			//System.out.println("int a : " + a); //non-static
			//System.out.println("private int b : " + b);//non-static
			System.out.println("static int c : " + c); //static
			System.out.println("static int d : " + d); //static
			System.out.println("Inner int e : " + e);
		}
	}
	
	
	public static void main(String[] args) {
		int num = StaticClassTest.c;
		StaticClassTest.sum();
		
		//System.out.println("int a : " + a);
		
		//static 내부클래스의 static 필드변수 사용
		int innerNum = StaticClassTest.Inner.d;
		
		//static 내부클래스의 객체 생성 후 non-static 메소드 사용
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		inner.printData(); //생성된 객체로 non-static 메소드 실행
		
		
	}

}





