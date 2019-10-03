package com.mystudy.ex04_inner_class;

public class InstanceClassTest {
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		sum = a + b;
		
	}

	//����Ŭ���� : �ν��Ͻ� Ŭ����
	class Inner {
		int in = 100;
		void printData() {
			System.out.println("int a : " + a);
			System.out.println("int b : " + b);
			System.out.println("static c : " + c);
			sum();
			System.out.println("sum : " + sum);
			System.out.println("����Ŭ�����ʵ� in : " + in);
		}
	}
	
	
	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("�ʵ庯�� a : " + out.a);
		
		System.out.println("---- �ν��Ͻ� Ŭ���� ��� ---");
		//����Ŭ������ Inner�� �ִ� printData() ����
		//Inner Ŭ������ ��ü ����
		//�ܺ�Ŭ������.����Ŭ���� : ����Ŭ������ Ÿ��
		//new InstanceClassTest().new Inner() 
		//    - �ܺ�Ŭ���� ��ü ���� ��  ����Ŭ���� ��ü ����
		InstanceClassTest.Inner inner 
				= new InstanceClassTest().new Inner();
		inner.printData();
		
		System.out.println("---------");
		System.out.println("Inner Ŭ���� �ʵ庯�� in : " 
				+ inner.in);
	}

}
















