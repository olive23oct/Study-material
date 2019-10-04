package com.mystudy.ex09_map_sungjuk;

import java.util.HashMap;

public class SungjukManager {
	//����Ÿ ������ ���� ���� ����
	//private HashMap<String, Integer> sungjuk = new HashMap<>();
	private HashMap<String, Integer> sungjuk; //�ʱⰪ null
	private int tot; //�ʱⰪ 0
	private double avg; //�ʱⰪ 0.0D
	
	public SungjukManager() {
		sungjuk = new HashMap<>();
		//inputSampleData();
	}

	private void inputSampleData() {
		sungjuk.put("ȫ�浿", 100);
		sungjuk.put("������", 90);
		sungjuk.put("��������", 95);
		sungjuk.put("���", 87);
		sungjuk.put("������", 92);
		
		computeAvg();
	}
	public void insertData(String name, int jumsu) {
		sungjuk.put(name, jumsu);
		computeAvg();
	}
	public void updateData(String name, int jumsu) {
		//���� : �ִ��� Ȯ���ϰ� ������ ����, ������ �н�(�޽�������)
		if (sungjuk.containsKey(name)) {
			sungjuk.put(name, jumsu);
			computeAvg();
		} else {
			System.out.println(">>> " + name + "�� �����ϴ�. �̸� Ȯ��");
		}
		
	}
	public void deleteData(String name) {
		//���� : �ִ��� Ȯ���ϰ� ������ ����, ������ �н�(�޽�������)
		sungjuk.remove(name);
		computeAvg();
	}
	public int selectData(String name) {
		return sungjuk.get(name);
	}
	
	public HashMap<String, Integer> getSungjuk() {
		return sungjuk;
	}

	public void setSungjuk(HashMap<String, Integer> sungjuk) {
		this.sungjuk = sungjuk;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	
	public void computeTot() {
		tot = 0;
//		for (String name : sungjuk.keySet()) {
//			tot += sungjuk.get(name);
//		}
		
		for (Integer value : sungjuk.values()) {
			tot += value;
		}
	}
	
	public void computeAvg() {
		computeTot();
		avg = tot * 100 / sungjuk.size() / 100.0;
	}
	
	public void printData() {
		System.out.println("����\t����");
		System.out.println("----------------");
		displayData();
		System.out.println("=================");
		System.out.println("����\t" + tot);
		System.out.println("���\t" + avg);
	}
	
	private void displayData() {
		if (sungjuk.size() == 0) {
			System.out.println("����Ÿ ����");
			return;
		}
		for (String name : sungjuk.keySet()) {
			System.out.println(name + "\t" + sungjuk.get(name));
		}
	}
	
}










