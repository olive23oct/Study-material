package com.mystudy.phone;

class Phone {
	/*
	가. 모델명 : name - String
	나. 타입 : type - String
	다. 가로크기 : hsize - int
	라. 세로크기 : vsize - int
	마. LCD유무 : hasLCD - boolean
	*/
	String name; //모델명
	String type; //타입
	int hsize; //가로크기
	int vsize; //세로크기
	static boolean hasLCD; //LCD유무
	
	Phone () {}
	
	Phone (String name, String type) {
		this.name = name; //this 현재객체(인스턴스)
		this.type = type;
	}
	
	Phone(String name, String type, boolean hasLCD) {
		this.name = name; //this 현재객체(인스턴스)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//void : 리턴값이 없을때(사용하지 않을 때)
	void call() {
		System.out.println("전화걸기~");
	}
	void receiveCall() {
		System.out.println("전화받기~");
	}
	
	void sendSms(String msg) {
		System.out.println("[메시지전송]" + msg);
	}
	
	String receiveSms(String msg) {
		//String msg = "하이~~~";
		//System.out.println("[메시지수신]" + msg);
		return "[메시지수신]" + msg;
	}
	
	void view() {
		System.out.println("--- 전화기 정보 ---");
		System.out.println("모델명 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("가로크기 : " + hsize);
		System.out.println("세로크기 : " + vsize);
		System.out.println("LCD유무 : " + hasLCD);
	}
	
	

	@Override
	public String toString() {
		return "Phone [name=" + name + ", type=" + type + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD=" + hasLCD
				+ "]";
	}
	
	

}











