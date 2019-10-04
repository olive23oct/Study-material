package com.mystudy.ex02_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector Ŭ���� : List �迭
		Vector v = new Vector(5); //�뷮(capacity) 5
		v.add("1"); //index : 0
		v.add("2"); //index : 1
		v.add("3"); //index : 2
		System.out.println(v);
		String temp = v.toString();
		System.out.println(temp);
		
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		System.out.println("--- v.remove(2) ���� �� ---");
		v.remove(2); //����(delete)
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		System.out.println("--- trimToSize() ó�� �� ---");
		v.trimToSize();
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		v.addElement("4");
		System.out.println(v);
		
		v.add("AA"); //�߰��Է�(�ǵڿ� insert)
		System.out.println(v);
		
		v.remove("2");
		System.out.println(v);
		
		v.add(2, "BB"); //����, Ư�� ��ġ�� �Է�(insert)
		System.out.println(v);
		
		v.set(2, "CCC"); //����(update)
		System.out.println(v);
		
		System.out.println("---- clone() ������ ---");
		Vector v2 = (Vector) v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("---- v2.clear ������ ---");
		v2.clear();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("====== Enumeration ��ü ��� ��ȸ =====");
		//Enumeration Ÿ�� : hasMoreElements(), nextElement()
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println("enu.nextElement() : " 
					+ enu.nextElement());
		}
		System.out.println(v);
		
		System.out.println("====== Iterator Ȱ�� ��ȸ =====");
		Iterator ite = v.iterator();
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			System.out.println("ite.next() : " + ite.next());
		}
		System.out.println("ite.hasNext() : " + ite.hasNext());
		
	}

}














