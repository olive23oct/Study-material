package com.mystudy.ex04_inner_class;

public class LocalClassTest {
	int a = 100;
	
	void innerTest(int k) {
		int b = 200; //지역변수(local variable)
		int c = k;
		
		//메소드내에 선언된 클래스(지역클래스 - local class)
		//선언된 메소드 내부에서만 사용 가능
		class Inner {
			void printData() {
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("int c : " + c);
			}
		}
		Inner in = new Inner();
		in.printData();
	}
	
	
	public static void main(String[] args) {
		LocalClassTest outer = new LocalClassTest();
		outer.innerTest(999);

	}

}








