package com.mystudy.am02_overriding;

class Cat extends Animal {
	//�޼ҵ� �������̵�(Method Overriding)
	//��Ӱ���(Ȯ��, extends)�� �ִ� Ŭ��������
	//����(�θ�)Ÿ�Կ� �ִ� �޼ҵ带 ����(�ڳ�)Ÿ�� Ŭ�������� ������
	//������ �����ϰ�, ��ɸ� �ٸ��� ����
	//������ ���� : ����Ÿ��, �޼ҵ��, �Ķ���Ͱ� ����(�Ķ���� Ÿ��, ����, ���� ��ġ)
//	@Override //���������̼�
//	void sound() {
//		System.out.println(">>�߿�~ �߿�~");
//	}
	
	@Override
	void sound() {
		//super.sound(); //�θ�Ŭ������ ����� �״�� ���
		System.out.println(">>�߿�~ �߿�~");
	}
}







