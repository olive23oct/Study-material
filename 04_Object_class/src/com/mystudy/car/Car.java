package com.mystudy.car;

public class Car {
	//�ʵ庯��(�Ӽ�)
	String name = "����ī"; //������
	String model; //�𵨸�
	String color; //������
	
	//final ������ : ������ ���� �Ҵ�Ǹ� ���̻� ������ �� ����
	//final�� ���� ���� : ���ȭ�� ����(���)
	final int CAR_LENGTH = 350; //��������
	final int CAR_WIDTH = 200; //������(�ʺ�)
	
	boolean existAirbag; //����� ���翩��

	//������ : ����Ÿ�� ����
	//Ŭ������() {} - �⺻������(default Constructor)
	//Ŭ������(�Ű�����, ...) {}
	//���� : ��������� ������ ����� �⺻������ ����� ���� ����
	public Car () {
		model = "�帲ī";
		color = "��������";
	}
	
	Car (String n, String m, String c) {
		name = n;
		model = m;
		color = c;
	}
	
	//�޼ҵ�(����, ���, �Լ�)
	void run(int speed) {
		System.out.println(">> ������ �̵� " + speed + "�ӵ���");
	}
	
	void stop() {
		System.out.println(">> ����");
	}
	
	void back() {
		System.out.println(">> �ڷ� �̵�");
	}
	
	void dispData() {
		System.out.println("=== �ڵ��� ���� ===");
		System.out.println("�ڵ����̸�: " + name);
		System.out.println("�𵨸�: " + model);
		System.out.println("�����: " + color);
		System.out.println("��������: " + CAR_LENGTH);
		System.out.println("������: " + CAR_WIDTH);
		System.out.println("�����: " + existAirbag);
		System.out.println("================");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", CAR_LENGTH=" + CAR_LENGTH
				+ ", CAR_WIDTH=" + CAR_WIDTH + ", existAirbag=" + existAirbag + "]";
	}
}








	
