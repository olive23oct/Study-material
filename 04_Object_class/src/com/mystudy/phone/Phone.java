package com.mystudy.phone;

class Phone {
	/*
	��. �𵨸� : name - String
	��. Ÿ�� : type - String
	��. ����ũ�� : hsize - int
	��. ����ũ�� : vsize - int
	��. LCD���� : hasLCD - boolean
	*/
	String name; //�𵨸�
	String type; //Ÿ��
	int hsize; //����ũ��
	int vsize; //����ũ��
	static boolean hasLCD; //LCD����
	
	Phone () {}
	
	Phone (String name, String type) {
		this.name = name; //this ���簴ü(�ν��Ͻ�)
		this.type = type;
	}
	
	Phone(String name, String type, boolean hasLCD) {
		this.name = name; //this ���簴ü(�ν��Ͻ�)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//void : ���ϰ��� ������(������� ���� ��)
	void call() {
		System.out.println("��ȭ�ɱ�~");
	}
	void receiveCall() {
		System.out.println("��ȭ�ޱ�~");
	}
	
	void sendSms(String msg) {
		System.out.println("[�޽�������]" + msg);
	}
	
	String receiveSms(String msg) {
		//String msg = "����~~~";
		//System.out.println("[�޽�������]" + msg);
		return "[�޽�������]" + msg;
	}
	
	void view() {
		System.out.println("--- ��ȭ�� ���� ---");
		System.out.println("�𵨸� : " + name);
		System.out.println("Ÿ�� : " + type);
		System.out.println("����ũ�� : " + hsize);
		System.out.println("����ũ�� : " + vsize);
		System.out.println("LCD���� : " + hasLCD);
	}
	
	

	@Override
	public String toString() {
		return "Phone [name=" + name + ", type=" + type + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD=" + hasLCD
				+ "]";
	}
	
	

}











