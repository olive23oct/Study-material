package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam5_guess_number {

	public static void main(String[] args) {
		//��ǻ�Ͱ� 1~100 ������ ���ڸ� ���ϸ� ����� ���ߴ� ����
		//���� ��ȸ 5ȸ
		//---------------------
		//Math.random() : 0 <= random�� < 1 ������ �Ǽ��� 
		//�ļ��� : 70 �� ��� 
		//  ����� ������ ����(80)�� ũ�� : �۴ٴ� �޽��� ���
		//  ����� ������ ����(50)�� ������ : ũ�ٴ� �޽��� ���
		//5�� �̳��� ���߸� : ����!!! n�� ���� ������ϴ�.(ȭ�����)
		//5���� �ѱ�� : ����~~ ���� ������ ���ڴ� 70�Դϴ�.(ȭ�����)
		//-----
		//�ٽ� �����Ͻðڽ��ϱ�?(y,n) 
		//---------------------------
		//////////////////////////////////////////
		int comNo = 0; //��ǻ�Ͱ� ������ ����
		int meNo = 0; //���� ���� ����
		int tryCnt = 0; //�õ� Ƚ��
		Scanner scan = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while (isContinue) {
			tryCnt = 0;
			
			//1. �޽��� ��� �� ��ǻ�Ͱ� 1~100������ ���� �� �ϳ��� �����ϵ��� ó��
			comNo = (int)(Math.random() * 100 + 1);
	
			System.out.println("��) 1~100���� ������ �ϳ��� �����߽��ϴ�."
					+ " ���纸����");
			System.out.println("��ǻ�� ���� ���� : " + comNo);
			
			while (tryCnt < 5) {
				tryCnt++;
				System.out.println("�õ�Ƚ�� : " + tryCnt);
				
				//2. ������� �����ϵ��� �޽��� ���, ���� �Է� �ޱ�
				System.out.print("(" + tryCnt + "��°)���ڸ� ���� : ");
				meNo = Integer.parseInt(scan.nextLine());
				
				if (tryCnt < 5) {
					
					//3. �Է��� ���� ��ǻ���� ���� ��(>, ==, <)
					if (comNo > meNo) {
						System.out.println(">> " + meNo + " ���� Ů�ϴ�.");
					}
					
					if (comNo < meNo) {
						System.out.println(">> " + meNo + " ���� �۽��ϴ�.");
					}
					
					if (comNo == meNo) {//���߸� ���� ����
						System.out.println(">> ������ϴ�. " 
								+ "���� ������ ���ڴ� " + comNo + " �Դϴ�.");
						System.out.println("������ �����մϴ�. �ٽ� �����ϼ���.");
						break;
					}
				} else { //5��° �õ� : ���ߵ� �����ߵ� ������ ���� ����
					if (comNo > meNo) {
						System.out.println(">>����~~ "
								+ "���� ������ ���ڴ� " + comNo + " �Դϴ�.");
					}
					if (comNo < meNo) {
						System.out.println(">>����~~ "
								+ "���� ������ ���ڴ� " + comNo + " �Դϴ�.");
					}
					if (comNo == meNo) {
						System.out.println(">> ������ϴ�. "
								+ "���� ������ ���ڴ� " + comNo + " �Դϴ�.");
						System.out.println("������ �����մϴ�. �ٽ� �����ϼ���.");
					}
					break;
				}
			
			}
			//�� ���� ������ �����
			System.out.println("-------------------");
			//������ �� �Ұ��� ���� üũ
			System.out.print(">> �ٽ� �����Ͻðڽ��ϱ�?(y/n) ");
			String tryYesNo = scan.nextLine();
			if ("n".equalsIgnoreCase(tryYesNo)) {
				System.out.println(">>> ������ ����Ǿ����ϴ�.");
				isContinue = false;
			}
		}
		
		System.out.println("--- main() �� ----");
	}

}









