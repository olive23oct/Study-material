package com.mystudy.pm01_interface;

//�������̽�(interface) ����(implements)�ϴ� ������� Ŭ���� �����
class Phone implements I_Phone {
	//�ʵ�(�Ӽ�) ----------
	private String type; //��ȭŸ��(����)
	private String phoneNo; //��ȭ��ȣ
	
	//public Phone() {}
	
	public Phone(String phoneNo) {
		this.type = "Phone Ÿ��";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	//��� ���� : �������̽��� ���ǵ� �޼ҵ带 ����
	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getPhoneNo() {
		return phoneNo;
	}

	@Override
	public void view() {
		System.out.println("Ÿ��: " + type 
				+ ", ��ȭ��ȣ: " + phoneNo);
	}

	@Override
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}

	@Override
	public void sendSMS() {
		System.out.println(">> �޽��� ����");
	}

	@Override
	public void receiveSMS() {
		System.out.println(">> �޽��� ����");
	}


}
