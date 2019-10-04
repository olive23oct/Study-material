package com.mystudy.ex08_list_set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {
	public static void main(String[] args) {
		//1. List 사용
		//이름등록 : 홍길동, 강감찬, 홍경래, 이순신
		//저장된 데이타를 조회해서 화면에 출력(index:데이타 / 이름오름차순)
		System.out.println("---- List 사용 ------");
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("강감찬");
		list.add("홍경래");
		list.add("이순신");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		//복사본 만들기
		List<String> listClone = new ArrayList(list);
		Collections.sort(listClone);
		System.out.println("list복사본 : " + listClone);
		for (int i = 0; i < listClone.size(); i++) {
			System.out.println(i + ":" + listClone.get(i));
		}
		//수정 : 홍길동 -> 을지문덕
		listClone.set(listClone.indexOf("홍길동"), "을지문덕");
		System.out.println("listClone: " + listClone);
		System.out.println("list: " + list);
		
		////////////////////////
		//2. Set 사용
		//이름등록 : 홍길동, 강감찬, 홍경래, 이순신
		//저장된 데이타를 조회해서 화면에 출력(오름차순으로 출력)
		System.out.println("---- Set 사용 ------");
		Set<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("강감찬");
		set.add("홍경래");
		set.add("이순신");
		System.out.println(set);
		
		Iterator<String> ite = set.iterator(); 
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("------");
		ite = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(ite.next());
		}
		
		////////////////////////
		//3. Map 사용
		//k-v: 1810-홍길동, 1811-강감찬, 1812-홍경래, 1813-이순신
		//저장된 데이타를 조회해서 화면에 출력(key-value형태, key 기준 오름차순으로 출력)	
		System.out.println("---- Map 사용 ------");		
		Map<String, String> map = new TreeMap<>();
		map.put("1813", "이순신");
		map.put("1810", "홍길동");
		map.put("1812", "홍경래");
		map.put("1811", "강감찬");
		map.put("1819", "을지문덕");
		System.out.println(map);
		
		Iterator<String> iteKeys = map.keySet().iterator();
		while (iteKeys.hasNext()) {
			String key = iteKeys.next();
			System.out.println(key + "-" + map.get(key));
		}
		
		
		
		
	}
}
