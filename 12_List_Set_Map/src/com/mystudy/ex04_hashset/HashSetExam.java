package com.mystudy.ex04_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// HashSet : Set �������̽��� ������ ����ü(Ŭ����)
		HashSet set = new HashSet(); //Ŭ����Ÿ�Ժ��� <- Ŭ���� ��ü
		
		//�������̽� Ÿ�Ժ��� <- �������̽��� ������ Ŭ������ ��ü
		//Set set = new HashSet(); 
		
		set.add("1"); //String
		set.add(new Integer(1)); //Integer
		//set.add(1); //int -> Integer ��ȯ�Ǿ ����
		set.add("ȫ�浿");
		set.add("ȫ�浿");
		System.out.println(set);
		
		set.remove("1");
		System.out.println(set);
		
		System.out.println("set.contains(1) : " 
				+ set.contains(1));
		System.out.println("set.size() : " + set.size());
		
		set.add("������");
		set.add("��������");
		set.add("ȫ�淡");
		System.out.println(set);
		
		System.out.println("--- Set ��ü ����Ÿ ��ȸ(Iterator) ----");
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("--- Iterator ��ü�� ���� ��� ---");
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("----");
		
		//����(����) : ������ -> ������  
		//������ ���� and ������ �Է�
		//�Ǵ� ������ �Է� and ������ ����
		System.out.println("--- ������ ==> ������ (���� ó��) ---");
		set.remove("������");
		set.add("������");
		System.out.println(set);
		
	}

}









