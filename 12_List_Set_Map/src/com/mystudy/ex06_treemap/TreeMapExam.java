package com.mystudy.ex06_treemap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap : Ű(key) ������ �������� �����ؼ� ����
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("ȫ�浿", 100);
		map.put("������", new Integer(95));
		map.put("������", 88);
		map.put("100", 93);
		map.put("a", 93);
		map.put("A", 93);
		map.put("**", 93);
		
		System.out.println(map);

		//========================
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
