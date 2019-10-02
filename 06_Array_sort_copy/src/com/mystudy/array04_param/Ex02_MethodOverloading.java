package com.mystudy.array04_param;

public class Ex02_MethodOverloading {

	public static void main(String[] args) {
		//�޼ҵ�(�޼���) �����ε�(Method Overloading)
		//����: ������ �޼ҵ���� ����ؼ� ���� �ٸ� ��� ����
		//0. �ϳ��� Ŭ���� ������(��Ӱ��� ����) 
		//1. ������ �޼ҵ������ ����
		//2. �Ķ����(parameter)�� Ÿ��, ����, ������ �޸��ؼ� �ۼ�
		//   - �޼ҵ��� ����Ÿ���� ����
		//   - �޼ҵ� �����ε��� Ŭ���� ������ �޼ҵ� �ߺ� ����
		/////////////////////////////////////////
		String name = "ȫ�浿";
		int kor = 100;
		int eng = 90;
		int math = 80;
		int tot = kor + eng + math;
		double avg = tot * 100 / 3 / 100.0;
		
		Ex02_MethodOverloading mo = new Ex02_MethodOverloading();
		mo.displayData();
		mo.displayData(name);
		//�޼ҵ��� �Ķ������ ����, Ÿ��, ������ ���� ����
		mo.displayData(name, kor); //String, int
		mo.displayData(name, tot); //String, int
		mo.displayData(name, avg);
		mo.displayData(avg, name);
		mo.displayData(name, tot, avg);
		
	}
	void displayData() {
		System.out.println("--- ����Ÿ�� ��� ---");
	}
	
	void displayData(String name) {
		System.out.println("�̸�: " + name);
		
	}
//	//�̸�, ���� ���� ���
//	void displayData(String name, int kor) {
//		System.out.println("�̸�: " + name + ", "
//		                 + "����: " + kor);
//	}
	
	//�̸�, ���� ���
	void displayData(String name, int tot) {
		System.out.println("�̸�: " + name + ", "
		                 + "�հ�: " + tot);
	}
	
	void displayData(String name, double avg) {
		System.out.println("1. �̸�: " + name + ", "
				         + "���: " + avg);
	}
	void displayData(double avg, String name) {
		System.out.println("2. �̸�: " + name + ", "
				         + "���: " + avg);
	}
	void displayData(String name, int tot, double avg) {
		System.out.println("�̸�: " + name + ", "
						 + "����: " + tot + ", "
				         + "���: " + avg);
	}


}


















