package com.mystudy.pm02_interface;

//인터페이스의 구성요소
// - 상수변수 : public static final 변수
// - 추상메소드 : public abstract 메소드
//--------------------------
//자바8(JDK8)에서 추가된 요소
// - public default 메소드 : public default 메소드() {}
// - public static 메소드 

public interface I_Phone {
	//상수화된 변수 : 인터페이스에 선언되는 변수는 모두 public static final
	public static final boolean SUCCESS_CALL = true;
	boolean FAIL_CALL = true;
	
	//추상메소드는 모두 public abstract 메소드
	public abstract String getType(); 
	abstract String getPhoneNo();
	
	void view(); //0.전화정보 확인(view)
	void call(); //1.전화걸기(call)
	void receiveCall(); //2.전화받기(receiveCall)
	void sendSMS(); //3.메시지 보내기
	void receiveSMS(); //4.메시지 받기
	
	String toString();
	
	//public default 메소드
	default void changeNo(String phoneNo) {
		//구현이 필요없으면 구현안해도 됨
	}
	
	//public static 메소드
	static void staticMethod() {
		System.out.println("I_Phone 인터페이스의 static 메소드다~~");
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
