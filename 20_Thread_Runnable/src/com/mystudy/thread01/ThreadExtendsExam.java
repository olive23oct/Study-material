package com.mystudy.thread01;

class ThreadParent {
	void print() {
		System.out.println("나는 Thread클래스의 Parent 클래스");
	}
}

//쓰레드로 동작하는 클래스 만들기
//Thread 클래스를 상속확장(extends)해서 만들기
class ThreadTest extends Thread {
	int num = 10;
	ThreadTest() {}
	ThreadTest(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		// Thread 클래스의 run() 메소드를 오버라이딩(overriding)해서
		// 쓰레드로 하려는 작업을 작성
		System.out.println(">>> run() 시작");
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> run() 끝");
	}
}

public class ThreadExtendsExam {

	public static void main(String[] args) {
		System.out.println("---- main() 시작 ---");
		ThreadTest th1 = new ThreadTest();
		
		//th1.run(); //단순 메소드 호출 일뿐 쓰레드로 동작하지 않음
		
		//쓰레드로 동작시키려면 쓰레드객체.start()를 호출
		th1.start();
		
		//쓰레드를 하나 더 만들어 실행
		ThreadTest th2 = new ThreadTest(20);
		//th2.run();
		th2.start();
		
		
		System.out.println("---- main() 끝 ---");
	}

}
