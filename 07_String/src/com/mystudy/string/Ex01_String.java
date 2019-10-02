package com.mystudy.string;

public class Ex01_String {

	public static void main(String[] args) {
		// String 클래스 : 문자열 저장, 처리하기 위한 클래스
		//사용형식 2가지
		//String str = "홍길동"; //기본 데이타 타입 처럼 사용
		//String str = new String("홍길동"); //객체 생성 사용
		String str1 = "Java";
		String str2 = "World";
		String strObj1 = new String("Java");
		String strObj2 = new String("World");
		System.out.println("str1 : " + str1);
		System.out.println("strObj1 : " + strObj1);
		
		String str11 = "Java";
		String str22 = "World";
		
		//== : 객체 비교(객체 주소값 비교)
		System.out.println("str1 == str11 : " + (str1 == str11));
		System.out.println("str1 : " + str1);
		System.out.println("str11 : " + str11);
		
		System.out.println("--- str1 vs 객체생성 strObj1 비교 --");
		System.out.println("str1 == strObj1 : " + (str1 == strObj1));
		System.out.println("str1 : " + str1);
		System.out.println("strObj1 : " + strObj1);
		
		//equals() : 저장하고 있는 값(data) 비교(문자열 비교)
		System.out.println("--- equals() 비교 ---");
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
		System.out.println("str11.equals(strObj1) : " + str11.equals(strObj1));
		System.out.println("str1.equals(str11) : " + str1.equals(str11));
		
		String str12 = "JAVA";
		System.out.println("str12.equals(strObj1) : " + str12.equals(strObj1));
		System.out.println("str12.equalsIgnoreCase(strObj1) : " + str12.equalsIgnoreCase(strObj1));
		
		//--------------------------
		System.out.println("-------------");
		String strObj21 = new String("Java");
		String strObj22 = new String("Java");
		System.out.println("strObj21 == strObj22 : " 
				+ (strObj21 == strObj22));
		System.out.println("strObj21.equals(strObj22) : " 
				+ (strObj21.equals(strObj22)));
		
		//=======================================
		System.out.println("===================");
		System.out.println("--- concat() ---");
		String a = "Hello ";
		String b = "Java ";
		String c = "World";
		System.out.println("a + b + c : " + (a + b + c)); 
		System.out.println("a.concat(b) : " + a.concat(b));
		
		//chainning 기법(체이닝기법)
		String result = a.concat(b).concat(c).concat("!!!");
		System.out.println("a.concat(b).concat(c).concat(\"!!!\") : " 
				+ result);
		
		System.out.println("a : " + a);
		System.out.println("a.toString() : " + a.toString());
		
		//-------------------
	}

}








