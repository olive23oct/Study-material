package com.mystudy.thread02_runnable;

class ThreadParent {
	void print() {
		System.out.println("���� Thread Ŭ������ ParentŬ����");
	}
}

class ThreadImp extends ThreadParent implements Runnable {

	@Override
	public void run() {
		super.print();
		System.out.println("ThreadImp.run() : Runnable �������̽� ����");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
}

public class ThreadImpRunnable {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ---");
		Thread thMain = Thread.currentThread();
		System.out.println(thMain.toString());
		
		//Runnable �������̽��� ������ ��ü�� ������� ����ϱ� ���ؼ���
		//Thread Ŭ������ �����ڿ� Runnable ���� ��ü�� �����ؼ� ����
		ThreadImp thImp = new ThreadImp();//ThreadImp ��ü����
		//thImp.run();
		
		//ThreadImp ��ü : Runnable Ÿ�� ��ü�� Thread ������ ����
		Thread th = new Thread(thImp); 
		th.start();
		
		System.out.println("--- main() �� ---");

	}

}








