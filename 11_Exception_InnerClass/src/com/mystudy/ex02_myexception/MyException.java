package com.mystudy.ex02_myexception;

//���� ����� : Exception Ŭ������ ��ӹ޾� �����
class MyException extends Exception {
	//������
	public MyException() {
		//����(�θ�)Ŭ������ ������ ȣ��(���ܸ޽���)
		super(">>���� ���� Exception");
	}
	
	public MyException(String msg) {
		super(">>���� ���� Exception: " + msg);
	}
}
