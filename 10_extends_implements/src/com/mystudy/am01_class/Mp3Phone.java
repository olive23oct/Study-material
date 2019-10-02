package com.mystudy.am01_class;

class Mp3Phone {
	private String type;
	private String phoneNo;
	
	public Mp3Phone(String phoneNo) {
		type = "Mp3Phone Ÿ��";
		this.phoneNo = phoneNo;
	}
	public Mp3Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	//�޼ҵ� ------------------------
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	//��ȭ�ɱ� ���
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	//��ȭ�ޱ� ���
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	//��ȭ���� ����
	public void view() {
		System.out.println("Ÿ��: " + type 
				+ ", ��ȭ��ȣ: " + phoneNo);
	}
	
	//���� �÷��� ��� -------------------
	public void playMusic() {
		System.out.println(">> �����÷���");
	}
	
	@Override
	public String toString() {
		return "Mp3Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}	
	
	
}







