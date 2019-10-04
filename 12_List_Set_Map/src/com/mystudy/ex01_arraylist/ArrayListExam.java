package com.mystudy.ex01_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//ArrayList : 배열의 속성과 List 속성을 가짐
		ArrayList list1 = new ArrayList();
		System.out.println("list1.size(): " + list1.size());
		
		list1.add(new Integer(5));
		list1.add(1);//int -> Integer 자동형변환 되어 입력처리됨
		list1.add(new Integer(5)); //값에 대한 중복은 허용
		list1.add(new Integer(6));
		list1.add(new Integer(7));
		System.out.println(list1.toString());
		System.out.println("list1.size(): " + list1.size());
		
		Collections.reverse(list1);
		System.out.println("reverse후 : " + list1);
		
		System.out.println("-------");
		//ArrayList list2 = new ArrayList(list1);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println("list2 : " + list2);
		
		System.out.println("--- Collections.sort() ---");
		System.out.println("list1 : " + list1);
		Collections.sort(list1); //오름차순 정렬
		System.out.println("sort()후 : list1 : " + list1);
		
		Collections.sort(list2);
		System.out.println("list2 : " + list2);
		
		System.out.println("---- Collections.reverse() ---");
		//reverse() : 처음과 끝 위치를 서로 바꾸는 형태로 동작
		Collections.reverse(list1);
		System.out.println("reverse() 후 list1 : " + list1);
		
		System.out.println("========================");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		list2.add("B");
		list2.add("TEST");
		System.out.println("첫 데이타 : " + list2.get(0));
		System.out.println("마지막 데이타 : " + list2.get(list2.size() - 1));
		System.out.println(">> list2 : " + list2);
		
		int list2Cnt = list2.size();
		for (int i = 0; i < list2Cnt; i++) {
			System.out.println(i + " - " + list2.get(i));
		}
		
		System.out.println("----------");
		print(list1, list2);
		
		//데이타 수정(인덱스값 이용)
		System.out.println("list2.set(0, \"A\") : " 
				+ list2.set(0, "A")); //수정(update)
		print(list1, list2);
		
		list2.add(1, "BB"); //추가,삽입(insert)
		print(list1, list2);
		
		System.out.println("-------------");
		printData("list1", list1);
		printData("list2", list2);
		
		//retainAll : 넘겨받은 데이타에 있는 데이타는 남기고 없으면 삭제
		System.out.println("list1.retainAll(list2) : " 
				+ list1.retainAll(list2));
		printData("list1", list1);
		printData("list2", list2);
		
		System.out.println("---------------");
		print(list1, list2);

//		System.out.println(">> list2에서 list1에 포함된 객체 전체삭제");
//		System.out.println("list2.removeAll(list1) : "
//				+ list2.removeAll(list1));
//		print(list1, list2);
		
		//contains() : 데이타가 있는지 확인
		System.out.println(list2.contains(list1.get(0)));
		
		//remove() : 삭제처리
		list2.remove(list1.get(0)); //객체(인스턴스) 전달 삭제
		list2.remove(0); //인덱스번호 전달해서 삭제
		print(list1, list2);
		
		System.out.println("----- list2의 데이타를 전체 삭제 ---");
		printData("list2 삭제전", list2);
		//[실습] 반복문(for)을 사용해서 전체 데이타 삭제
		//List의 특징 요소(element) 삭제시 뒤에 있는 데이타가 앞으로 이동 처리됨
//		int listCnt = list2.size();
//		for (int i = 0; i < listCnt; i++) {
//			System.out.println("i: " + i + ", listCnt : " + listCnt);
//			list2.remove(0);
//		}
		
		//마지막 데이타부터 앞쪽으로 삭제
//		int lastIndex = list2.size() - 1;
//		for (int i = lastIndex; i >= 0; i--) {
//			list2.remove(i);
//		}
		
		list2.clear();
		
		printData("list2 삭제후", list2);
		
		System.out.println("--- main() 끝 ---");
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
	static void printData(List list) {
		//null 여부 확인
		if (list == null) return;
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}
	static void printData(String title, List list) {
		//null 여부 확인
		if (list == null) { 
			System.out.println(title + " - null");
			return;
		}
		if (list.size() == 0) {
			System.out.println(title + " - 데이타건수 0");
			return;
		}
		System.out.print(title + " : " + list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}

}















