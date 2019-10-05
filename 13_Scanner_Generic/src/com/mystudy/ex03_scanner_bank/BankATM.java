package com.mystudy.ex03_scanner_bank;

import java.util.Scanner;

//[�ǽ�] ������ ATM
//1.�Ա�  2.���  3.����Ȯ��  0.����
//------------------------------
//���¸� �ϳ� ����� �Ա�/���/����Ȯ�� �۾��� ó��
public class BankATM {
	private int money; //���� ����(�ݾ�)
	private Scanner scan = new Scanner(System.in);

	public void startBank() {
		System.out.println(">> �������");
		while (true) {
			if (!bankATM()) {
				break;
			}
			System.out.println();
		}
		System.out.println(">> ATM ��踦 �����մϴ�.");
	}

	//ATM�� ���� �޼ҵ�
	private boolean bankATM() {
		boolean jobContinue = true;
		
		showMenu();
		int select = -1;
		try {
			select = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("[���ܹ߻�] �߸��� ���� �ԷµǾ����ϴ�. "
					+ "�޴�(0~3) ���ڸ� �Է��ϼ���.");
			return jobContinue;//�Ʒ� �۾��� �� �ʿ� ����
		}
		
		if (select == 1) {
			//System.out.println("�Ա� �۾�ó��~~~");
			inputMoney();
			showMoney();
		} else if (select == 2) {
			//System.out.println("��� �۾�ó��~~~");
			outputMoney();
			showMoney();
		} else if (select == 3) {
			//System.out.println("����Ȯ�� �۾�ó��~~~");
			showMoney();
		} else if (select == 0) {
			//System.out.println("���� ó��~~~");
			jobContinue = false;
		} else {
			System.out.println("[�ȳ�] �޴�(0~3) ���ڸ� �Է��ϼ���.");
		}
		
		return jobContinue;
	}
	
	//�޴� ǥ�� �޼ҵ�
	private void showMenu() {
		System.out.println("------------------------");
		System.out.println("1.�Ա�  2.���  3.����Ȯ��  0.����");
		System.out.println("------------------------");
		System.out.print(">>�۾����� : ");
	}
	
	//�Ա�ó�� �޼ҵ�
	private void inputMoney() {
		//System.out.println("�Ա� �۾�ó��~~~");
		while (true) {
			System.out.print(">>�Աݾ� : ");
			try {
				money += Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("[���ܹ߻�] �߸��� ���� �ԷµǾ����ϴ�. "
						+ "����(0~9)�� �Է��ϼ���."
						+ "\n�ٽ� �۾��� �����ϼ���");
				continue;
			}
			break; //���� �Է½� �Է� �۾� �ߴ�
		}
	}
	
	//���ó�� �޼ҵ�
	private void outputMoney() {
		//System.out.println("��� �۾�ó��~~~");
		while (true) {
			System.out.print(">>��ݾ� : ");
			try {
				int outMoney = Integer.parseInt(scan.nextLine());
				if (money >= outMoney) {
					money -= outMoney;
				} else {
					System.out.println(">> �ܾ׺������� ����� �ȵ˴ϴ�.");
				}
			} catch (NumberFormatException e) {
				System.out.println("[���ܹ߻�] �߸��� ���� �ԷµǾ����ϴ�. "
						+ "����(0~9)�� �Է��ϼ���."
						+ "\n�ٽ� �۾��� �����ϼ���");
				continue;
			}
			break; //���� �Է½� �Է� �۾� �ߴ�
		}
	}
	
	//����Ȯ�� �޼ҵ�
	private void showMoney() {
		//System.out.println("����Ȯ�� �۾�ó��~~~");
		System.out.println("::����ݾ� : " + money + " ��");
	}
	
}

/* *********************
>> �������
------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 1
>>�Աݾ� : 10000
::����ݾ� : 10000��

------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 2
>>��ݾ� : 5000
::����ݾ� : 5000��

------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 3
::����ݾ� : 5000��

------------------------
1.�Ա�  2.���  3.����Ȯ��  0.����
------------------------
>>�۾����� : 0
>>�۾��� �����߽��ϴ�.
******************************/
