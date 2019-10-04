package com.mystudy.ex05_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4};
		System.out.println("--- �⺻���� for�� �迭�� ��� ---");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- ������ for�� �迭�� ��� ---");
		//   Ÿ��   ����  : ���հ�ü
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// Map<K,V> ����Ÿ �ٷ��
		//Map map = new HashMap();
		Map<String, String> map = new HashMap<String, String>();
		map.put("Ű1", "��1");
		map.put("Ű2", "��2");
		map.put("Ű3", "��3");
		map.put("Ű4", "��4");
		map.put("Ű5", "��5");
		System.out.println(map);
		
		map.get("Ű1");
		
		//==================================
		//Map�� �ִ� ��ü ����Ÿ ��ȸ�ؼ� key-value ���·� ���
		//��¿�) Ű1-��1
		//�ǽ�1 : keySet(), iterator() ���(while������)
		System.out.println("--- keySet(), iterator() ���(while) ---");
		Set<String> set = map.keySet();
		Iterator<String> ite = set.iterator();
		
		//Iterator<String> ite = map.keySet().iterator();
		while (ite.hasNext()) {
			String key = ite.next();
			String value = map.get(key);
			System.out.println(key + "-" + value);
		}
		
		//�ǽ�2 : keySet() ���(������ for������)
		System.out.println("--- keySet() ���(������ for��) ---");
		Set<String> set2 = map.keySet();
		for (String key : set2) {
			System.out.println(key + ":" + map.get(key));
		}
		
		//-----------------------------------
		System.out.println("--- Map.Entry Ÿ���� ����Ÿ ��ȸ ----");
		//Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() 
					+ "-" + entry.getValue());
		}
		
		//-----------------------------------
		System.out.println("--- Map.Entry Ÿ���� ����Ÿ ��ȸ(iterator) ---");
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> ites = entrySet.iterator();
		while (ites.hasNext()) {
			Entry<String, String> entry = ites.next();
			System.out.println(entry.getKey() 
					+ "-" + entry.getValue());
		}
	}
}













