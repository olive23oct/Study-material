package com.mystudy.pm01_interface;

class PhoneTest {

	public static void main(String[] args) {
		//Phone, Mp3Phone ��ü ���� �� ��� �׽�Ʈ
		System.out.println("=== Phone ====");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();

		Phone ph2 = new Phone("�Ｚ������", "010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		ph2.sendSMS();
		ph2.receiveSMS();
		
		System.out.println("=== Mp3Phone ====");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic();
		System.out.println(mp3ph.toString());
//		
//		System.out.println("=== WebPhone =====");
//		WebPhone webph = new WebPhone("010-4444-4444");
//		webph.view();
//		webph.call();
//		webph.receiveCall();
//		webph.webSearch();
//		
//		WebPhone webph2 = new WebPhone("ũ�Һζ������", "010-4444-4444");
//		webph2.view();
		
		//------------------------
		System.out.println("----------------");
		I_Phone.staticMethod();
		
	}

}
















