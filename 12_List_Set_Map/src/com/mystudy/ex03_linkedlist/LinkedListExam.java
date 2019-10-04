package com.mystudy.ex03_linkedlist;

import java.util.Arrays;
import java.util.Collections;
//import 추가 단축키 : ctrl + shift + o
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		//LinkedList : List 속성
		LinkedList list = new LinkedList();
		
		list.add("홍길동");
//		list.add("홍길동");
//		list.add("김유신");
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("---------");
		
		String str = "홍길동,김유신,강감찬,을지문덕,홍경래";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));
		
		//배열에 있는 데이타를 리스트에 추가
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		
		System.out.println("---------------------");
		Collections.reverse(list);
		System.out.println("list : " + list);
		
		Collections.sort(list);
		System.out.println("list : " + list);
		
		//김유신 삭제
		list.remove("김유신");
		System.out.println("김유신 삭제후 list : " + list);
		
		//홍길동 -> 홍길동2 수정 : 홍길동 위치 찾고 해당 위치값 수정처리
		//list.set(홍길동위치값, "홍길동2");
		//[실습] 홍길동 -> 홍길동2 로 바꾸기
		//---------------
		//수정대상 값 위치 찾기
		int dataIdx =  list.indexOf("홍길동");
		System.out.println("홍길동 위치 idx : " + dataIdx);
		
		//해당 위치에 새로운 값 저장
		list.set(dataIdx, "홍길동2");
		
		System.out.println("홍길동 -> 홍길동2 list : " + list);
		
	}//main() end

}//class end










