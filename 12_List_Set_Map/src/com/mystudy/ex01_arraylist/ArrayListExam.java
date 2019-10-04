package com.mystudy.ex01_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//ArrayList : �迭�� �Ӽ��� List �Ӽ��� ����
		ArrayList list1 = new ArrayList();
		System.out.println("list1.size(): " + list1.size());
		
		list1.add(new Integer(5));
		list1.add(1);//int -> Integer �ڵ�����ȯ �Ǿ� �Է�ó����
		list1.add(new Integer(5)); //���� ���� �ߺ��� ���
		list1.add(new Integer(6));
		list1.add(new Integer(7));
		System.out.println(list1.toString());
		System.out.println("list1.size(): " + list1.size());
		
		Collections.reverse(list1);
		System.out.println("reverse�� : " + list1);
		
		System.out.println("-------");
		//ArrayList list2 = new ArrayList(list1);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println("list2 : " + list2);
		
		System.out.println("--- Collections.sort() ---");
		System.out.println("list1 : " + list1);
		Collections.sort(list1); //�������� ����
		System.out.println("sort()�� : list1 : " + list1);
		
		Collections.sort(list2);
		System.out.println("list2 : " + list2);
		
		System.out.println("---- Collections.reverse() ---");
		//reverse() : ó���� �� ��ġ�� ���� �ٲٴ� ���·� ����
		Collections.reverse(list1);
		System.out.println("reverse() �� list1 : " + list1);
		
		System.out.println("========================");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		list2.add("B");
		list2.add("TEST");
		System.out.println("ù ����Ÿ : " + list2.get(0));
		System.out.println("������ ����Ÿ : " + list2.get(list2.size() - 1));
		System.out.println(">> list2 : " + list2);
		
		int list2Cnt = list2.size();
		for (int i = 0; i < list2Cnt; i++) {
			System.out.println(i + " - " + list2.get(i));
		}
		
		System.out.println("----------");
		print(list1, list2);
		
		//����Ÿ ����(�ε����� �̿�)
		System.out.println("list2.set(0, \"A\") : " 
				+ list2.set(0, "A")); //����(update)
		print(list1, list2);
		
		list2.add(1, "BB"); //�߰�,����(insert)
		print(list1, list2);
		
		System.out.println("-------------");
		printData("list1", list1);
		printData("list2", list2);
		
		//retainAll : �Ѱܹ��� ����Ÿ�� �ִ� ����Ÿ�� ����� ������ ����
		System.out.println("list1.retainAll(list2) : " 
				+ list1.retainAll(list2));
		printData("list1", list1);
		printData("list2", list2);
		
		System.out.println("---------------");
		print(list1, list2);

//		System.out.println(">> list2���� list1�� ���Ե� ��ü ��ü����");
//		System.out.println("list2.removeAll(list1) : "
//				+ list2.removeAll(list1));
//		print(list1, list2);
		
		//contains() : ����Ÿ�� �ִ��� Ȯ��
		System.out.println(list2.contains(list1.get(0)));
		
		//remove() : ����ó��
		list2.remove(list1.get(0)); //��ü(�ν��Ͻ�) ���� ����
		list2.remove(0); //�ε�����ȣ �����ؼ� ����
		print(list1, list2);
		
		System.out.println("----- list2�� ����Ÿ�� ��ü ���� ---");
		printData("list2 ������", list2);
		//[�ǽ�] �ݺ���(for)�� ����ؼ� ��ü ����Ÿ ����
		//List�� Ư¡ ���(element) ������ �ڿ� �ִ� ����Ÿ�� ������ �̵� ó����
//		int listCnt = list2.size();
//		for (int i = 0; i < listCnt; i++) {
//			System.out.println("i: " + i + ", listCnt : " + listCnt);
//			list2.remove(0);
//		}
		
		//������ ����Ÿ���� �������� ����
//		int lastIndex = list2.size() - 1;
//		for (int i = lastIndex; i >= 0; i--) {
//			list2.remove(i);
//		}
		
		list2.clear();
		
		printData("list2 ������", list2);
		
		System.out.println("--- main() �� ---");
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
	static void printData(List list) {
		//null ���� Ȯ��
		if (list == null) return;
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}
	static void printData(String title, List list) {
		//null ���� Ȯ��
		if (list == null) { 
			System.out.println(title + " - null");
			return;
		}
		if (list.size() == 0) {
			System.out.println(title + " - ����Ÿ�Ǽ� 0");
			return;
		}
		System.out.print(title + " : " + list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}

}















