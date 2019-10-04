package com.mystudy.ex09_map_sungjuk;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSungjukExam {

	public static void main(String[] args) {
		//1. HashMap<String, Integer> Ÿ���� ���� sungjuk�� �����ϰ�
		//2. Map�� �̸�:���� ������ �Ʒ��� ����Ÿ�� �Է�
		//   "ȫ�浿:100, ������:90, ��������:95, ���:87, ������:92"
		//3. �Էµ� ����Ÿ�� ��ȸ�ؼ� ������ ������ tot�� ����
		//4. ����(tot)�� ���� �ο� ���� ���� ��� ���� avg�� ����
		//5. ����Ͻÿ�.
		//   ����\t ����
		//   -----------
		//   ȫ�浿: 100
		//   ������: 90
		//   ...
		//   ������: 92
		//   ==========
		//   ����: ???
		//   ���: ???
		////////////////////////////////////////////
		
		//1. HashMap<String, Integer> Ÿ���� ���� sungjuk�� ����
		Map<String, Integer> sungjuk = new TreeMap<>();
		
		//2. Map�� �̸�:���� ������ �Ʒ��� ����Ÿ�� �Է�
		//   "ȫ�浿:100, ������:90, ��������:95, ���:87, ������:92"
		sungjuk.put("ȫ�浿", 100);
		sungjuk.put("������", 90);
		sungjuk.put("��������", 95);
		sungjuk.put("���", 87);
		sungjuk.put("������", 92);
		
		System.out.println(sungjuk);
		
		//3. �Էµ� ����Ÿ�� ��ȸ�ؼ� ������ ������ tot�� ����
		//���1 : key������ value ��ȸ
		int tot = 0;
		for (String key : sungjuk.keySet()) {
			//Integer value = sungjuk.get(key);
			//tot += value;
			tot += sungjuk.get(key);
		}
		System.out.println("���� : " + tot);
		
		//���2 : value �� ��ü�� �����ؼ� �հ豸�ϱ�
		tot = 0;
		for (Integer value : sungjuk.values()) {
			tot += value;
		}
		System.out.println("���� : " + tot);
		
		//4. ����(tot)�� ���� �ο� ���� ���� ��� ���� avg�� ����
		double avg = tot * 100 / sungjuk.size() / 100.0;
		System.out.println("��� : " + avg);
		
		System.out.println("--------------------");
		//5. ����Ͻÿ�.
		//   ����\t ����
		//   -----------
		//   ȫ�浿: 100
		//   ������: 90
		//   ...
		//   ������: 92
		//   ==========
		//   ����: ???
		//   ���: ???
		System.out.println("����\t����");
		System.out.println("----------------");
		for (String name : sungjuk.keySet()) {
			System.out.println(name + "\t" + sungjuk.get(name));
		}
		System.out.println("=================");
		System.out.println("����\t" + tot);
		System.out.println("���\t" + avg);
		
		System.out.println("\n======= �ѹ��� ó�� =======");
		tot = 0;
		avg = 0;
		System.out.println("����\t����");
		System.out.println("----------------");
		for (String name : sungjuk.keySet()) {
			Integer jumsu = sungjuk.get(name);
			System.out.println(name + "\t" + jumsu);
			tot += jumsu;
		}
		avg = (tot * 100) / sungjuk.size() / 100.0;
		System.out.println("=================");
		System.out.println("����\t" + tot);
		System.out.println("���\t" + avg);
		
	}

}

















