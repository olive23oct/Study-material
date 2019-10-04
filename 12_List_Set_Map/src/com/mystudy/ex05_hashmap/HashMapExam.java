package com.mystudy.ex05_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		// Map(�������̽�) : Ű(key)-��(value) ������ ����Ÿ ����
		// - ������ ����(��, TreeMap�� ��� key�� �������� ���ĵǾ� ����)
		// - Ű(key) : �ߺ���� ����(�ߺ��� ����, ������ ����Ÿ)
		// - ��(value) : �ߺ����
		HashMap map = new HashMap();
		//      key     value
		map.put("ȫ�浿", 100); //100 -> Integer 100
		map.put("������", new Integer(95));
		map.put("������", 88);
		map.put("���", 88);
		map.put("ȫ�浿", 93); //������ key ���� �����ϸ� ����ó����
	
		System.out.println(map);
		
		HashMap map2 = new HashMap();
		map2.put("������", 92);
		map2.put("����ġ", 82);
		System.out.println(map2);
		map2.remove("������");
		System.out.println(map2);
		
		
		System.out.println("map.isEmpty(): " + map.isEmpty());
		System.out.println("map.get(\"ȫ�浿\"): " + map.get("ȫ�浿"));
		System.out.println("map.containsKey(\"��������\") : "  
				+ map.containsKey("��������"));
		System.out.println("map.containsValue(88) : "  
				+ map.containsValue(88));
		
		//==================================
		System.out.println("---- Map ��ü ����Ÿ ��ȸ -----");
		//��ü ����Ÿ ��ȸ : Ű(key)-��(value) ����
		//Map������ Ű(key)�� �̿��ؼ� ����Ÿ(value) ��ȸ
		
		System.out.println("----- Ű(key) ���� : keySet() ��� --- ");
		Set set = map.keySet(); //keySet() �޼ҵ�� Ű(key)�� ��������
		System.out.println("Ű�� : " + set);
		
		Iterator ite = set.iterator(); //Set�� iterator() ���
		while (ite.hasNext()) {
			String key = (String) ite.next(); //key ����
			Integer value = (Integer) map.get(key); //value ����
			System.out.println("key: " + key + ", value: " + value);
		}
		
		System.out.println("----- ��(value) ���� : values() ��� --- ");
		Collection values = map.values();
		System.out.println("��(values): " + values);
		ite = values.iterator();
		int sum = 0;
		while (ite.hasNext()) {
			Integer num = (Integer) ite.next();
			System.out.println("����: " + num);
			sum += num;
		}
		System.out.println("�����հ� : " + sum);
		
		//--------------------------
		System.out.println("--- Ű(key)-��(value) ���� : entrySet() ---");
		set = map.entrySet(); //set : Set<Map.Entry<K,V>>
		System.out.println(set);
		
		ite = set.iterator();
		while (ite.hasNext()) {
			//Map�� �ִ� Entry
			//Map.Entry e = (Map.Entry) ite.next();
			Map.Entry e = (Entry) ite.next(); //Map.Entry import ó����
			System.out.println("key: " + e.getKey() 
					+ ", value: " + e.getValue());
		}
	}
}










