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
	
	//����ƽ����Ŭ����(Inner class �� staticŬ����)
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
		
		//static ����Ŭ������ static �ʵ庯�� ���
		int innerNum = StaticClassTest.Inner.d;
		
		//static ����Ŭ������ ��ü ���� �� non-static �޼ҵ� ���
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		inner.printData(); //������ ��ü�� non-static �޼ҵ� ����
		
		
	}

}





