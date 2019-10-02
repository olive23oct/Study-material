package com.mystudy.pm01_interface;

//인터페이스(interface) 구현(implements)하는 방식으로 클래스 만들기
class Phone implements I_Phone {
	//필드(속성) ----------
	private String type; //전화타입(형태)
	private String phoneNo; //전화번호
	
	//public Phone() {}
	
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	//기능 구현 : 인터페이스에 정의된 메소드를 구현
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
		System.out.println("타입: " + type 
				+ ", 전화번호: " + phoneNo);
	}

	@Override
	public void call() {
		System.out.println(">> 전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}

	@Override
	public void sendSMS() {
		System.out.println(">> 메시지 보냄");
	}

	@Override
	public void receiveSMS() {
		System.out.println(">> 메시지 보냄");
	}


}
