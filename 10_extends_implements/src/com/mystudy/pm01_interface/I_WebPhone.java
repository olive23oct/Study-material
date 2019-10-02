package com.mystudy.pm01_interface;

//인터페이스 끼리는 여러개를 상속확장(extends)해서 사용할 수 있다.
public interface I_WebPhone extends I_Phone, I_Mp3Phone {
//	//{} 없음 : 추상메소드(abstract method)
//	String getType(); 
//	String getPhoneNo();
//	
//	void view(); //0.전화정보 확인(view)
//	void call(); //1.전화걸기(call)
//	void receiveCall(); //2.전화받기(receiveCall)
//	void sendSMS(); //3.메시지 보내기
//	void receiveSMS(); //4.메시지 받기
//	
//	//MP3기능
//	void playMusic();
	
	//web 서치기능
	void webSearch();
}










