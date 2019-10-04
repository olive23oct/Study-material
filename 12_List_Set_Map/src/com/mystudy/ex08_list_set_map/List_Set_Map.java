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
		//1. List ���
		//�̸���� : ȫ�浿, ������, ȫ�淡, �̼���
		//����� ����Ÿ�� ��ȸ�ؼ� ȭ�鿡 ���(index:����Ÿ / �̸���������)
		System.out.println("---- List ��� ------");
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("������");
		list.add("ȫ�淡");
		list.add("�̼���");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		//���纻 �����
		List<String> listClone = new ArrayList(list);
		Collections.sort(listClone);
		System.out.println("list���纻 : " + listClone);
		for (int i = 0; i < listClone.size(); i++) {
			System.out.println(i + ":" + listClone.get(i));
		}
		//���� : ȫ�浿 -> ��������
		listClone.set(listClone.indexOf("ȫ�浿"), "��������");
		System.out.println("listClone: " + listClone);
		System.out.println("list: " + list);
		
		////////////////////////
		//2. Set ���
		//�̸���� : ȫ�浿, ������, ȫ�淡, �̼���
		//����� ����Ÿ�� ��ȸ�ؼ� ȭ�鿡 ���(������������ ���)
		System.out.println("---- Set ��� ------");
		Set<String> set = new TreeSet<>();
		set.add("ȫ�浿");
		set.add("������");
		set.add("ȫ�淡");
		set.add("�̼���");
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
		//3. Map ���
		//k-v: 1810-ȫ�浿, 1811-������, 1812-ȫ�淡, 1813-�̼���
		//����� ����Ÿ�� ��ȸ�ؼ� ȭ�鿡 ���(key-value����, key ���� ������������ ���)	
		System.out.println("---- Map ��� ------");		
		Map<String, String> map = new TreeMap<>();
		map.put("1813", "�̼���");
		map.put("1810", "ȫ�浿");
		map.put("1812", "ȫ�淡");
		map.put("1811", "������");
		map.put("1819", "��������");
		System.out.println(map);
		
		Iterator<String> iteKeys = map.keySet().iterator();
		while (iteKeys.hasNext()) {
			String key = iteKeys.next();
			System.out.println(key + "-" + map.get(key));
		}
		
		
		
		
	}
}
