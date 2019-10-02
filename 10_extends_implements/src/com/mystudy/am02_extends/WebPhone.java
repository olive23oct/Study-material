package com.mystudy.am02_extends;

//클래스 상속(extends) 실습
/* 실습1 : Phone 클래스 상속 확장(extends)
WebPhone 클래스 작성
Phone 클래스를 상속 확장(extends)해서 작성
생성자 정의
-폰번호(phoneNo)만 받아서 객체생성
-타입 값은 "WebPhone"으로 입력

기능 : 전화걸고, 받고, 전화정보보기, 웹검색 할 수 있는 전화기
웹검색 기능 추가
- webSearch() : ">>WebPhone - 웹 검색" 문구 화면 출력
*/
class WebPhone extends Mp3Phone {
	//필드(속성) ----------
	
	//생성자
	public WebPhone(String phoneNo) {
		super("WebPhone 타입", phoneNo);
		
	}

	public WebPhone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	//메소드 ------------------------

	//-------------------------
	public void webSearch() {
		System.out.println(">>WebPhone - 웹 검색");
	}
}















