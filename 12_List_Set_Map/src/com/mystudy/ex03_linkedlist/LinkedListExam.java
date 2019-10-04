package com.mystudy.ex03_linkedlist;

import java.util.Arrays;
import java.util.Collections;
//import �߰� ����Ű : ctrl + shift + o
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		//LinkedList : List �Ӽ�
		LinkedList list = new LinkedList();
		
		list.add("ȫ�浿");
//		list.add("ȫ�浿");
//		list.add("������");
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("---------");
		
		String str = "ȫ�浿,������,������,��������,ȫ�淡";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));
		
		//�迭�� �ִ� ����Ÿ�� ����Ʈ�� �߰�
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		
		System.out.println("---------------------");
		Collections.reverse(list);
		System.out.println("list : " + list);
		
		Collections.sort(list);
		System.out.println("list : " + list);
		
		//������ ����
		list.remove("������");
		System.out.println("������ ������ list : " + list);
		
		//ȫ�浿 -> ȫ�浿2 ���� : ȫ�浿 ��ġ ã�� �ش� ��ġ�� ����ó��
		//list.set(ȫ�浿��ġ��, "ȫ�浿2");
		//[�ǽ�] ȫ�浿 -> ȫ�浿2 �� �ٲٱ�
		//---------------
		//������� �� ��ġ ã��
		int dataIdx =  list.indexOf("ȫ�浿");
		System.out.println("ȫ�浿 ��ġ idx : " + dataIdx);
		
		//�ش� ��ġ�� ���ο� �� ����
		list.set(dataIdx, "ȫ�浿2");
		
		System.out.println("ȫ�浿 -> ȫ�浿2 list : " + list);
		
	}//main() end

}//class end










