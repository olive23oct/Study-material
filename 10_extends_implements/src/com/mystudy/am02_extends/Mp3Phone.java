package com.mystudy.am02_extends;

//Phone Ŭ������ ��ӹ޾�(extends: Ȯ���ؼ�) Mp3Phone �����
class Mp3Phone extends Phone {

	public Mp3Phone(String phoneNo) {
		super("Mp3Phone Ÿ��", phoneNo);
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}
	
	public void playMusic() {
		System.out.println(">> Mp3Phone - �����÷���");
	}
}
