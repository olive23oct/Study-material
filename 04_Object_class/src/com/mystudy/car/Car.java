package com.mystudy.car;

public class Car {
	//필드변수(속성)
	String name = "마이카"; //차량명
	String model; //모델명
	String color; //차량색
	
	//final 제한자 : 변수에 값이 할당되면 더이상 변경할 수 없음
	//final이 붙은 변수 : 상수화된 변수(상수)
	final int CAR_LENGTH = 350; //차량길이
	final int CAR_WIDTH = 200; //차량폭(너비)
	
	boolean existAirbag; //에어백 존재여부

	//생성자 : 리터타입 없음
	//클래스명() {} - 기본생성자(default Constructor)
	//클래스명(매개변수, ...) {}
	//주의 : 명시적으로 생성자 선언시 기본생성자 만들어 주지 않음
	public Car () {
		model = "드림카";
		color = "무지개색";
	}
	
	Car (String n, String m, String c) {
		name = n;
		model = m;
		color = c;
	}
	
	//메소드(동작, 기능, 함수)
	void run(int speed) {
		System.out.println(">> 앞으로 이동 " + speed + "속도로");
	}
	
	void stop() {
		System.out.println(">> 멈춤");
	}
	
	void back() {
		System.out.println(">> 뒤로 이동");
	}
	
	void dispData() {
		System.out.println("=== 자동차 정보 ===");
		System.out.println("자동차이름: " + name);
		System.out.println("모델명: " + model);
		System.out.println("색상명: " + color);
		System.out.println("차량길이: " + CAR_LENGTH);
		System.out.println("차량폭: " + CAR_WIDTH);
		System.out.println("에어백: " + existAirbag);
		System.out.println("================");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", CAR_LENGTH=" + CAR_LENGTH
				+ ", CAR_WIDTH=" + CAR_WIDTH + ", existAirbag=" + existAirbag + "]";
	}
}








	
