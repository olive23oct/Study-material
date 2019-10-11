package com.mystudy.thread01;

class ThreadParent {
	void print() {
		System.out.println("���� ThreadŬ������ Parent Ŭ����");
	}
}

//������� �����ϴ� Ŭ���� �����
//Thread Ŭ������ ���Ȯ��(extends)�ؼ� �����
class ThreadTest extends Thread {
	int num = 10;
	ThreadTest() {}
	ThreadTest(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		// Thread Ŭ������ run() �޼ҵ带 �������̵�(overriding)�ؼ�
		// ������� �Ϸ��� �۾��� �ۼ�
		System.out.println(">>> run() ����");
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> run() ��");
	}
}

public class ThreadExtendsExam {

	public static void main(String[] args) {
		System.out.println("---- main() ���� ---");
		ThreadTest th1 = new ThreadTest();
		
		//th1.run(); //�ܼ� �޼ҵ� ȣ�� �ϻ� ������� �������� ����
		
		//������� ���۽�Ű���� �����尴ü.start()�� ȣ��
		th1.start();
		
		//�����带 �ϳ� �� ����� ����
		ThreadTest th2 = new ThreadTest(20);
		//th2.run();
		th2.start();
		
		
		System.out.println("---- main() �� ---");
	}

}
