package com.mystudy.pm01_interface;

//��ȭ�� ����Ȯ��
//��ȭ �ɰ�, �ް�, 
//���� �ְ�, �ް�
//���ǵ� �÷��� �� �� �ִ� ��ȭ�� �����(extends, implements)

//public class Mp3Phone implements I_Phone, I_Mp3Phone {

public class Mp3Phone extends Phone implements I_Mp3Phone {

	public Mp3Phone(String phoneNo) {
		super("Mp3PhoneŸ��", phoneNo);
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	@Override
	public void playMusic() {
		System.out.println(">> Mp3Phone - �����÷���");		
	}



}
