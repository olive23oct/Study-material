package com.mystudy.pm01_interface;

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
	
	
	//default 메소드
	default void changeNo(String phoneNo) {
		//구현이 필요없으면 구현안해도 됨
	}
	
	//static 메소드
	static void staticMethod() {
		System.out.println("I_Phone 인터페이스의 static 메소드다~~");
	}
	
}
