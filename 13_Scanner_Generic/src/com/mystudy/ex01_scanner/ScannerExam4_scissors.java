package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam4_scissors {

	public static void main(String[] args) {
		//Scanner�� �̿��� ���� ���� �� ����
		//��ǻ�Ϳ� �Բ��ϴ� ����(1),����(2),��(3) ����
		//0. ��ǻ�Ͱ� ����,����,���� ����(Math.random())
		//1. ����, ����, �� ���� �޴� ���
		//2. ���ð� �Է�
		//3. ��� ���� ����, ���� ����
		//(�ݺ�) ���� �ݺ� ���� - 0���ý� ����
		////////////////////////////////
		Scanner scan = new Scanner(System.in);
		boolean oneMoreGame = true;
		
		while (oneMoreGame) {
			int comSelect = 2; //������ ������ ���� ó��
			comSelect = (int) (Math.random() * 3 + 1);
	//		for (int i = 0; i < 100; i++) {
	//			System.out.print((int) (Math.random() * 3 + 1) + ", ");
	//		}
			//System.out.println("��ǻ�� ���� ���� : " + comSelect);
			
			System.out.println("����, ����, �� �߿� �ϳ��� �����Ͻÿ�.");
			System.out.println("1.����     2.����     3.��");
			System.out.print(">>����� ������(1~3)? ");
			
			int select = 1; //ȭ�鿡�� �Է� ó��
			select = Integer.parseInt(scan.nextLine());
	
			String strComputer = "";
			if (comSelect == 1) {
				strComputer = "����";
			} else if (comSelect == 2) {
				strComputer = "����";
			} else if (comSelect == 3) {
				strComputer = "��";
			} else {
				System.out.println("1~3�߿� �ϳ��� �����ؾ��մϴ�.");
			}
			
			String strPerson = "";
			switch (select) {
			case 1:
				strPerson = "����"; break;
			case 2:
				strPerson = "����"; break;
			case 3:
				strPerson = "��"; break;
			default: 
				System.out.println("1~3�߿� �ϳ��� �����ؾ��մϴ�.");
			}
			System.out.println(">> ���Ǽ��� : " + strPerson);
			System.out.println(">> ��ǻ�ͼ��� : " + strComputer);
			
			//----------------------
			//3. ��� ���� ����, ���� ����
			//����� '����'�� ���
			String result = "";
			if (strPerson.equals("����")) {
				//��ǻ�� : ����, ����, ��
				if (strComputer.equals("����")) {
					result = "���º�";
				}
				if (strComputer.equals("����" )) {
					result = "��ǻ�� ��";
				}
				if (strComputer.equals("��" )) {
					result = "���� �̰��!!!";
				}
			}
			
			//����� "����"�� ���
			if (strPerson.equals("����")) {
				//��ǻ�� : ����, ����, ��
				if (strComputer.equals("����")) {
					result = "���� �̰��!!!";
				}
				if (strComputer.equals("����" )) {
					result = "���º�";
				}
				if (strComputer.equals("��" )) {
					result = "��ǻ�� ��";
				}
			}
			
			//����� "��"�� ���
			if (strPerson.equals("��")) {
				//��ǻ�� : ����, ����, ��
				if (strComputer.equals("����")) {
					result = "��ǻ�� ��";
				}
				if (strComputer.equals("����" )) {
					result = "���� �̰��!!!";
				}
				if (strComputer.equals("��" )) {
					result = "���º�";
				}
			}
			
			//������
			System.out.println("---- ��� -----");
			System.out.println(">>> " + result);
			
			//���ӹݺ� ���� Ȯ��
			System.out.print("�� �� �� �ҷ�(y/n)? ");
			String yn = scan.nextLine();
			if (!"y".equalsIgnoreCase(yn)) {
				System.out.println(">> ������ �����߽��ϴ�.");
				oneMoreGame = false;
			}
		}
	}

}






