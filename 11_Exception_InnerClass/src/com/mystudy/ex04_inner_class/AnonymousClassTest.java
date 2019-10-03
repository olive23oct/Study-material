package com.mystudy.ex04_inner_class;

interface TestInter {
	int DATA = 100;
	void printData(); //추상메소드
}
//인터페이스를 구현한 클래스의 이름 TestInterImp
class TestInterImp implements TestInter {
	@Override
	public void printData() {
		System.out.println(">>>구현한 메소드");
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
		
		//익명클래스 : 클래스의 이름이 없는 클래스
		//한번만 사용하는 용도로 만들어 사용하는 클래스
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
				System.out.println("나는 클래스의 이름이 없어~~");
			}
		};
		test2.printData();
	}

}
