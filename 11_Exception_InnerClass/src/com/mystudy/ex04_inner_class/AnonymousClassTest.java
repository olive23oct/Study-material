package com.mystudy.ex04_inner_class;

interface TestInter {
	int DATA = 100;
	void printData(); //�߻�޼ҵ�
}
//�������̽��� ������ Ŭ������ �̸� TestInterImp
class TestInterImp implements TestInter {
	@Override
	public void printData() {
		System.out.println(">>>������ �޼ҵ�");
	}
	
	public static void main(String[] args) {
		TestInter imp = new TestInterImp();
		imp.printData();
		
		TestInter imp2 = new TestInterImp();
	}
}

public class AnonymousClassTest {
	
	void test() {
		(new TestInter() {
			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		}).printData();
	}
	
	public static void main(String[] args) {
		AnonymousClassTest an = new AnonymousClassTest();
		an.test();
		
		//�͸�Ŭ���� : Ŭ������ �̸��� ���� Ŭ����
		//�ѹ��� ����ϴ� �뵵�� ����� ����ϴ� Ŭ����
		TestInter test = new TestInter() {
			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		};
		test.printData();
		
		TestInter test2 = new TestInter() {
			@Override
			public void printData() {
				System.out.println("���� Ŭ������ �̸��� ����~~");
			}
		};
		test2.printData();
	}

}
