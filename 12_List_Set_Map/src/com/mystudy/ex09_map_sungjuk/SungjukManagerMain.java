package com.mystudy.ex09_map_sungjuk;

public class SungjukManagerMain {

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
		SungjukManager manager = new SungjukManager();
		manager.insertData("������", 50);
		
		//manager.inputSampleData();
		//manager.displayData();
		System.out.println("---------");
		manager.printData();
		
		System.out.println("------");
		System.out.println(manager.getAvg());
		
		//manager.updateData("������", 90);
		manager.printData();
		System.out.println("===================");
		SungjukManager manager2 = new SungjukManager();
		manager2.insertData("ȫ�浿", 100);
		manager2.printData();
	}

}











