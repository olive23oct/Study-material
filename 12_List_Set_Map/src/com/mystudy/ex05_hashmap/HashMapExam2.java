package com.mystudy.ex05_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4};
		System.out.println("--- 기본형태 for문 배열값 출력 ---");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- 개선된 for문 배열값 출력 ---");
		//   타입   변수  : 집합객체
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// Map<K,V> 데이타 다루기
		//Map map = new HashMap();
		Map<String, String> map = new HashMap<String, String>();
		map.put("키1", "값1");
		map.put("키2", "값2");
		map.put("키3", "값3");
		map.put("키4", "값4");
		map.put("키5", "값5");
		System.out.println(map);
		
		map.get("키1");
		
		//==================================
		//Map에 있는 전체 데이타 조회해서 key-value 형태로 출력
		//출력예) 키1-값1
		//실습1 : keySet(), iterator() 사용(while문으로)
		System.out.println("--- keySet(), iterator() 사용(while) ---");
		Set<String> set = map.keySet();
		Iterator<String> ite = set.iterator();
		
		//Iterator<String> ite = map.keySet().iterator();
		while (ite.hasNext()) {
			String key = ite.next();
			String value = map.get(key);
			System.out.println(key + "-" + value);
		}
		
		//실습2 : keySet() 사용(개선된 for문으로)
		System.out.println("--- keySet() 사용(개선된 for문) ---");
		Set<String> set2 = map.keySet();
		for (String key : set2) {
			System.out.println(key + ":" + map.get(key));
		}
		
		//-----------------------------------
		System.out.println("--- Map.Entry 타입의 데이타 조회 ----");
		//Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() 
					+ "-" + entry.getValue());
		}
		
		//-----------------------------------
		System.out.println("--- Map.Entry 타입의 데이타 조회(iterator) ---");
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> ites = entrySet.iterator();
		while (ites.hasNext()) {
			Entry<String, String> entry = ites.next();
			System.out.println(entry.getKey() 
					+ "-" + entry.getValue());
		}
	}
}













