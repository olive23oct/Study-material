//패키지구문 : java 파일의 맨 첫줄에 위치하며 한 번만 작성
//자바(class) 파일의 위치를 나타냄
//일반적으로 회사의 도메인명을 반대로 사용
//작성예) com.bitcamp.mystudy
package com.mystudy; 

//클래스의 접근제한 : public, (default) 
class Ex01_class {
	//필드(멤버변수, 인스턴스변수, 속성-property, attribute) 선언
	int num = 111; //초기값 생략가능
	
	//클래스변수, 스테틱(static)변수, 인스턴스(객체)공통 변수
	static int staticNum = 222; 
	
	
	public static void main(String[] args) {
		//로컬변수(지역변수)
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 + num2;
		System.out.println("result: " + result);
		System.out.println("---------------------");
		
		//메소드사용(호출) : 메소드명(인수값1, 인수값2,..., 인수값n)
		result = add(num1, num2);
		System.out.println("result(add 연산결과) : "+ result);
		
		System.out.println("staticNum: " + staticNum);
		
		//System.out.println("num: " + num);
		//result = sub(num1, num2);
		
		///////////////////////////////////
		//객체생성(인스턴스 생성, 인스턴스화 한다)
		//클래스타입명 변수명;
		//변수명 = new 클래스명();
		//클래스타입명 변수명 = new 클래스명();
		
		//Ex01_class ex01;
		//ex01 = new Ex01_class();
		Ex01_class ex01 = new Ex01_class(); //기본생성자로 객체생성
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		result = ex01.add(num1, num2);
		System.out.println("result(add) : " + result);
		
		//static 메소드에서 non-static 메소드 또는 필드 사용
		//생성된 객체를 통해서만 사용 가능
		System.out.println("num: " + ex01.num);
		result = ex01.sub(num1, num2);
		System.out.println("ex01.sub(num1, num2) : " + result);
		
		System.out.println("ex01 : " + ex01);
	}
	
	//메소드(method) 형태
	//void 메소드명() {}
	//리턴(데이타)타입 메소드명() {}
	//리턴(데이타)타입 메소드명(파라미터타입 파라미터명, ...) {}
	
	//2개의 정수값을 전달받아 2개의 정수값을 더한 결과를 되돌려줌
	public static int add(int a, int b) {
		return a + b;
	}
	
	//2개의 정수값을 전달받아 첫번째 값에서 두번째 값을 뺀 결과를 되돌려줌
	public int sub(int a, int b) {
		return a - b;
	}

}





