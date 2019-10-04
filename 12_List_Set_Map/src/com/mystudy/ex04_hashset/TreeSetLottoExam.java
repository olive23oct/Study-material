package com.mystudy.ex04_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLottoExam {

	public static void main(String[] args) {
		// Set�� �̿��� �ζ� ����� : 1~45 �������� 6���� Set�� ����
		// �ζǹ�ȣ 6���� ��÷�ϰ�, ���� ���ں��� ������� ȭ�� ���
		// Math.random() : (int)(Math.random() * 45 + 1)
		// ����� �������ں��� ū���� ���·�
		// ��) ������ �ζǹ�ȣ : 5, 8, 10, 25, 33, 41
		Set lottoSet = new TreeSet();
		for (int i = 0; lottoSet.size() < 6; i++) {
			int lottoNo = (int)(Math.random() * 45 + 1); 
			System.out.println("�ζǹ�ȣ " + i + " : " + lottoNo);
			lottoSet.add(lottoNo);
		}
		System.out.println("�ζǹ�ȣ : " + lottoSet);
		
		System.out.println("-----------------");
		lottoSet.clear();
		for (; lottoSet.size() < 6; ) {
			int lottoNo = (int)(Math.random() * 45 + 1); 
			lottoSet.add(lottoNo);
		}
		System.out.println("�ζǹ�ȣ : " + lottoSet);
		
		System.out.println("-----------------");
		lottoSet.clear();
		while (lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("�ζǹ�ȣ : " + lottoSet);
		
		System.out.println("---- �����۾� ���� ------");
		//�ζǹ�ȣ ��ǥ : �������� ���� ��
		ArrayList list = new ArrayList(lottoSet);
		System.out.println("�ζ�list : " + list);
		
		Collections.sort(list);
		System.out.println("������ �ζǹ�ȣ : " + list);
	}

}
