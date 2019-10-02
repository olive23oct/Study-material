package com.mystudy.am03_interface;

interface I_Phone {
	//{} 없음 : 추상메소드(abstract method)
	String getType(); 
	String getPhoneNo();
	
	void view(); //0.전화정보 확인(view)
	void call(); //1.전화걸기(call)
	void receiveCall(); //2.전화받기(receiveCall)
	void sendSMS(); //3.메시지 보내기
	void receiveSMS(); //4.메시지 받기
	
	String toString();
	
}
