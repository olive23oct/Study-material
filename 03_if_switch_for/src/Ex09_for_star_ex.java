
public class Ex09_for_star_ex {

	public static void main(String[] args) {
		//����1 -------------------------
		//***** : * 5��
		//****  : * 4
		//***   : * 3
		//**
		//*
		int lineCnt = 5;
		int starCnt = lineCnt;
		String dispStr = "*";
		for (int line = 1; line <= lineCnt; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispStr);
			}
			System.out.println();
			starCnt--;
		}
		System.out.println("------------");
		
		
		//����2 ---------------------------
		//    * : ��ĭ4 + "*" + �ٹٲ�
		//   **
		//  ***
		// ****
		//*****
		starCnt = 1;
		int spaceCnt = 4;
		
		//���ο� ���� �ݺ�ó����
		for (int line = 1; line <= 5; line++) {
			//��ĭ ��¿� �ݺ���(4, 3, 2, 1..)
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			
			//"*" ��¿� �ݺ���(1, 2, 3, ...)
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println(); //���� �� �ٹٲ�
			starCnt++;
			spaceCnt--;
		}
		
		
		
		//����3 ---------------------------
		//***** : ��ĭ 0, * 5, �ٹٲ�
		// **** : ��ĭ 1, * 4, �ٹٲ�
		//  *** : ��ĭ 2, * 3, �ٹٲ�
		//   **
		//    *
		System.out.println("------------");
		starCnt = 5;
		spaceCnt = 0;
		
		//���ο� ���� �ݺ�ó����
		for (int line = 1; line <= 5; line++) {
			//��ĭ ��¿� �ݺ���(0, 1, 2, 3 ...)
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			
			//"*" ��¿� �ݺ���(5, 4, 3,...)
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println(); //���� �� �ٹٲ�
			starCnt--;
			spaceCnt++;
		}
		
		
		//======================================
		//����4 -------------------------
		//1       : (1 + ��ĭ1) + �ٹٲ�
		//1 2     : (1 + ��ĭ1) + (2 + ��ĭ1) + �ٹٲ�
		//1 2 3   : (1 + ��ĭ1) + (2 + ��ĭ1) + (3 + ��ĭ1) + �ٹٲ�
		//1 2 3 4
		starCnt = 1;
		for (int line = 1; line <= 4; line++) {
			int dispNum = 1;
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispNum + " ");
				dispNum++;
			}
			System.out.println();
			starCnt++;
		}
		
		//����5 -------------------------
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		starCnt = 1;
		int dispNum = 1;
		for (int line = 1; line <= 4; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispNum + " ");
				dispNum++;
			}
			System.out.println();
			starCnt++;
		}
	}
}









