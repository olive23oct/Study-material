package com.mystudy.ex04_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// HashSet : Set 인터페이스를 구현한 구현체(클래스)
		HashSet set = new HashSet(); //클래스타입변수 <- 클래스 객체
		
		//인터페이스 타입변수 <- 인터페이스를 구현한 클래스의 객체
		//Set set = new HashSet(); 
		
		set.add("1"); //String
		set.add(new Integer(1)); //Integer
		//set.add(1); //int -> Integer 변환되어서 저장
		set.add("홍길동");
		set.add("홍길동");
		System.out.println(set);
		
		set.remove("1");
		System.out.println(set);
		
		System.out.println("set.contains(1) : " 
				+ set.contains(1));
		System.out.println("set.size() : " + set.size());
		
		set.add("김유신");
		set.add("을지문덕");
		set.add("홍경래");
		System.out.println(set);
		
		System.out.println("--- Set 전체 데이타 조회(Iterator) ----");
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("--- Iterator 객체를 재사용 출력 ---");
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("----");
		
		//수정(변경) : 김유신 -> 강감찬  
		//김유신 삭제 and 강감찬 입력
		//또는 강감찬 입력 and 김유신 삭제
		System.out.println("--- 김유신 ==> 강감찬 (수정 처리) ---");
		set.remove("김유신");
		set.add("강감찬");
		System.out.println(set);
		
	}

}









