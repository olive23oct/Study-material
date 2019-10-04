package com.mystudy.ex05_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		// Map(인터페이스) : 키(key)-값(value) 쌍으로 데이타 관리
		// - 순서가 없다(단, TreeMap의 경우 key가 오름차순 정렬되어 저장)
		// - 키(key) : 중복허용 안함(중복값 없음, 유일한 데이타)
		// - 값(value) : 중복허용
		HashMap map = new HashMap();
		//      key     value
		map.put("홍길동", 100); //100 -> Integer 100
		map.put("김유신", new Integer(95));
		map.put("강감찬", 88);
		map.put("계백", 88);
		map.put("홍길동", 93); //동일한 key 값이 존재하면 수정처리됨
	
		System.out.println(map);
		
		HashMap map2 = new HashMap();
		map2.put("일지매", 92);
		map2.put("전우치", 82);
		System.out.println(map2);
		map2.remove("일지매");
		System.out.println(map2);
		
		
		System.out.println("map.isEmpty(): " + map.isEmpty());
		System.out.println("map.get(\"홍길동\"): " + map.get("홍길동"));
		System.out.println("map.containsKey(\"을지문덕\") : "  
				+ map.containsKey("을지문덕"));
		System.out.println("map.containsValue(88) : "  
				+ map.containsValue(88));
		
		//==================================
		System.out.println("---- Map 전체 데이타 조회 -----");
		//전체 데이타 조회 : 키(key)-값(value) 추출
		//Map에서는 키(key)를 이용해서 데이타(value) 조회
		
		System.out.println("----- 키(key) 추출 : keySet() 사용 --- ");
		Set set = map.keySet(); //keySet() 메소드로 키(key)값 가져오기
		System.out.println("키값 : " + set);
		
		Iterator ite = set.iterator(); //Set의 iterator() 사용
		while (ite.hasNext()) {
			String key = (String) ite.next(); //key 추출
			Integer value = (Integer) map.get(key); //value 추출
			System.out.println("key: " + key + ", value: " + value);
		}
		
		System.out.println("----- 값(value) 추출 : values() 사용 --- ");
		Collection values = map.values();
		System.out.println("값(values): " + values);
		ite = values.iterator();
		int sum = 0;
		while (ite.hasNext()) {
			Integer num = (Integer) ite.next();
			System.out.println("점수: " + num);
			sum += num;
		}
		System.out.println("점수합계 : " + sum);
		
		//--------------------------
		System.out.println("--- 키(key)-값(value) 추출 : entrySet() ---");
		set = map.entrySet(); //set : Set<Map.Entry<K,V>>
		System.out.println(set);
		
		ite = set.iterator();
		while (ite.hasNext()) {
			//Map에 있는 Entry
			//Map.Entry e = (Map.Entry) ite.next();
			Map.Entry e = (Entry) ite.next(); //Map.Entry import 처리시
			System.out.println("key: " + e.getKey() 
					+ ", value: " + e.getValue());
		}
	}
}










