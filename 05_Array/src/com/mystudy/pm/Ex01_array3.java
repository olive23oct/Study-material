package com.mystudy.pm;

public class Ex01_array3 {

	public static void main(String[] args) {
		/*  ����
		*
		**
		***
		****
		*****
		-------------*/
		//char Ÿ���� ����Ÿ 5���� ������ �� �ִ� �迭 ����� ��(*) ���
		//�迭�� ������ : ch
		//char[] ch = new char[5];
		//char[] ch = {'*', '*', '*', '*', '*'};
		
		//���1 : �迭 ��ü�� '*'�� ä��� ���������� ���
		//�迭�� ***** : 0�� �ε��� ���� ���
		//             0~1�� �ε��� �� ���
		char[] ch = new char[5];
		//�ʱⰪ ���� : 5������ ��� '*' �Է�
		for (int i = 0; i < ch.length; i++) {
			ch[i] = '*';
		}
		
		//����� �� Ȯ��(��ȸ)
		System.out.print("�迭�� ����� �� : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("----");
		
		for (int idx = 0; idx < 1; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		
		for (int idx = 0; idx < 2; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		
		for (int idx = 0; idx < 3; idx++) {
			System.out.print(ch[idx]);
		}
		System.out.println();
		
		System.out.println("-----------------");
		int starCnt = 1;
		for (int line = 1; line <= 5; line++) {
			for (int idx = 0; idx < starCnt; idx++) {
				System.out.print(ch[idx]);
			}
			System.out.println();
			starCnt++;
		}
		
		System.out.println("-----------------");
		for (int line = 1; line <= 5; line++) {
			for (int idx = 0; idx < line; idx++) {
				System.out.print(ch[idx]);
			}
			System.out.println();
		}
		System.out.println("=================");
		//���2 : ���������� '*'�� �����鼭 �迭�� ��ü ���
		//0 : '*' - �迭 ��ü ���
		//1 : '*' - �迭 ��ü ���
		char[] ch2 = new char[5];
		System.out.print("�迭�� ����� ��: -");
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println("-�迭��");
		System.out.println("-----------");
		
		ch2[0] = '*';
//		for (int i = 0; i < ch2.length; i++) {
//			System.out.print(ch2[i]);
//		}
//		System.out.println();
		printArray(ch2);
		
		ch2[1] = '*';
//		for (int i = 0; i < ch2.length; i++) {
//			System.out.print(ch2[i]);
//		}
//		System.out.println();
		printArray(ch2);
		
		ch2[2] = '*';
//		for (int i = 0; i < ch2.length; i++) {
//			System.out.print(ch2[i]);
//		}
//		System.out.println();
		printArray(ch2);
		
		System.out.println("---------------------");
		//�迭�� �ʱ�ȭ
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = ' ';
		}
		
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = '*';
			printArray(ch2);
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

	}
	
	static void printArray(char[] stars) {
		for (int i = 0; i < stars.length; i++) {
			System.out.print(stars[i]);
		}
		System.out.println();
	}

}
















