package com.mystudy.am01;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		//StringBuffer 클래스
		String str = new String("Hello Java!!!");
		System.out.println(str);

		//int num = 100;
		//데이타타입      변수명 = new 생성자;
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		System.out.println(sb.toString());
		String sbValue = sb.toString();
		System.out.println("sb.toString() : " + sbValue);
		
		System.out.println(sb.capacity());
		
		//"Hello Java!!! 반갑습니다" 라는 새로운 데이타 생성됨
		str = str + " 반갑습니다"; 
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str.replace("a", "m"));
		System.out.println(str);
		
		//----------------------
		System.out.println("----- StringBuffer -----");
		sb.append(" 반갑습니다").append(".");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.reverse(); //문자열 뒤집기
		System.out.println(sb);
		System.out.println(sb.reverse()); //데이타 변경 처리
		System.out.println(sb);
		
		System.out.println("--- delete(), insert(), replace() ---");
		//Hello Java!!! 반갑습니다.
		System.out.println("sb.delete(0, 6): " + sb.delete(0, 6));
		System.out.println(sb);
		
		System.out.println("sb.insert(0, \"Hello \") : " 
				+ sb.insert(0, "Hello "));
		System.out.println("sb : " + sb);
		
		System.out.println("sb.replace(0, 5, \"Hi,\") : " 
				+ sb.replace(0, 5, "Hi,"));
		System.out.println("sb : " + sb);
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println("----------------------------");
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("-----");
		sb2.append("안녕하세요").append(" 반갑습니다!!");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("--- trimToSize() 실행후 ---");
		sb2.trimToSize();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> append() 실행 후");
		sb2.append(" 자바공부중~");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> setLength() 실행후 ---");
		sb2.setLength(5); //데이타의 크기 설정(작게 설정하면 delete효과)
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}

}










