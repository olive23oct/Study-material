package com.mystudy.pm01_interface;

//전화기 정보확인
//전화 걸고, 받고, 
//문자 주고, 받고
//음악도 플레이 할 수 있는 전화기 만들기(extends, implements)

//public class Mp3Phone implements I_Phone, I_Mp3Phone {

public class Mp3Phone extends Phone implements I_Mp3Phone {

	public Mp3Phone(String phoneNo) {
		super("Mp3Phone타입", phoneNo);
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	@Override
	public void playMusic() {
		System.out.println(">> Mp3Phone - 음악플레이");		
	}



}
