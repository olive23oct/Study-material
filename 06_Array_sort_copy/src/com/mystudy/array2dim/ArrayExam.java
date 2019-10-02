package com.mystudy.array2dim;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		//�迭 ����
		//����1 : intŸ���� ����Ÿ 3���� ������ �� �ִ� �迭(num1)��
		//  1. 10, 20, 30 ���ڸ� �Է��ϰ�  ȭ�� ��� 
		//  2. ����° ����Ÿ�� 100���� �ٲٰ� ȭ�� ���
		//����2 : num1�� ũ�Ⱑ ���� �迭 num1Copy�� �����
		//  num1Copy�� num1 ����Ÿ�� �����ϰ� ȭ�����
		//(����) �ּҰ� �������� ����Ÿ ���������� Ȯ��
		//----------------------------
		//int[] num1 = new int[3];
		int[] num1 = {10, 20, 30};
		System.out.println(Arrays.toString(num1));
		printData(num1);
		
		//  2. ����° ����Ÿ�� 100���� �ٲٰ� ȭ�� ���
		num1[2] = 100;
		printData(num1);
		
		//����2 : num1�� ũ�Ⱑ ���� �迭 num1Copy�� �����
		int[] num1Copy = new int[num1.length];
		
		//num1Copy�� num1 ����Ÿ�� �����ϰ� ȭ�����
		//num1Copy[0] = num1[0];
		for (int i = 0; i < num1.length; i++) {
			num1Copy[i] = num1[i];
		}
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		num1Copy[0] = 999;
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		
		//-------------------------
		System.out.println("--- System.arraycopy() ---");
		int[] num1Copy2 = new int[num1.length]; 
		//System.arraycopy(������ü, ���������ε���, ���ü, ��������ġ, ������ũ��);
		System.arraycopy(num1, 0, num1Copy2, 0, num1.length);
		printData("num1", num1);
		printData("num1Copy2", num1Copy2);
		
		num1Copy2[0] = 999;
		System.out.println(">> num1Copy2[0] = 999 ó���� ");
		printData("num1", num1);
		printData("num1Copy2", num1Copy2);
		
		System.out.println("----- �迭��ü.clone() ��� ---");
		int[] num1Copy3 = num1.clone(); //�迭��ü�� �����ؼ� ����
		printData("num1", num1);
		printData("num1Copy3", num1Copy3);
		
		num1Copy3[0] = 999;
		System.out.println(">> num1Copy3[0] = 999 ó���� ");
		printData("num1", num1);
		printData("num1Copy3", num1Copy3);
		
		//-----------------------------------
		//����3 : 2���� �迭�� ����Ͽ�
		//int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		//Q1. 2���� �迭�� num2dim�� ���� ȭ�鿡 ��� : 10 20 30...
		//Q2. num2dim�� ����° ���� 30�� 100���� �����ϰ� ȭ�� ���
		//Q3. num2dim�� ũ�⸸ŭ num2Copy �迭������ �����ϰ� num2dim�� ���� �����ϰ�
		//    num2Copy�� ���� ȭ�� ���
		System.out.println("==========================");
		int[][] num2dim = {
							{10,20}, {30,40}, {50,60}
						  };
		
		//Q1. 2���� �迭�� num2dim�� ���� ȭ�鿡 ��� : 10 20 30...
		System.out.println("--- 2���� �迭 ��� ---");
		System.out.println(Arrays.toString(num2dim));
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			System.out.print(Arrays.toString(num2dim[d2]) + " ");
		}
		System.out.println();
		
		System.out.println("----- ����for�� ��� ����Ÿ ��� ----");
		//2���� �迭�� ���� ó��
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			//2���� �迭�� ���(1���� �迭�� ���� ó��)
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("-- ��¸޼ҵ� ��� ---");
		printData2Dim(num2dim);
		printData2Dim("num2dim", num2dim);
		
		//Q2. num2dim�� ����° ���� 30�� 100���� �����ϰ� ȭ�� ���
		System.out.println(num2dim[1][0]);
		num2dim[1][0] = 100;
		System.out.println(">> num2dim[1][0] = 100 ������");
		printData2Dim("num2dim", num2dim);
		
		//Q3. num2dim�� ũ�⸸ŭ num2Copy �迭������ �����ϰ� num2dim�� ���� �����ϰ�
		//    num2Copy�� ���� ȭ�� ���
		//int[][] num2Copy = new int[num2dim.length][num2dim[0].length];
		int[][] num2Copy = new int[num2dim.length][];
//		num2Copy[0] = new int[num2dim[0].length];
//		num2Copy[1] = new int[num2dim[1].length];
//		num2Copy[2] = new int[num2dim[2].length];
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy[i] = new int[num2dim[i].length];
		}
		
		System.out.println("num2Copy.length : " 
				+ num2Copy.length);
		System.out.println("num2Copy[0].length : " 
				+ num2Copy[0].length);
		System.out.println("num2Copy[1].length : " 
				+ num2Copy[1].length);
		System.out.println("num2Copy[2].length : " 
				+ num2Copy[2].length);

		System.out.println("--- �迭���� num2Copy <- num2dim");
		for (int d2 = 0; d2 < num2Copy.length; d2++) {
			for (int i = 0; i < num2Copy[d2].length; i++) {
				num2Copy[d2][i] = num2dim[d2][i];
			}
		}
		printData2Dim("���� num2dim", num2dim);
		printData2Dim("������ num2Copy", num2Copy);
		System.out.println();
		
		num2Copy[1][0] = 999;
		System.out.println(">> num2Copy[1][0] = 999 ó����");
		printData2Dim("���� num2dim", num2dim);
		printData2Dim("������ num2Copy", num2Copy);
		
		System.out.println("===== System.arraycopy() ��� ===");
		int[][] num2Copy2 = new int[num2dim.length][];
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy2[i] = new int[num2dim[i].length];
		}
		System.out.println("---2�����迭�� System.arraycopy() ������");
		System.arraycopy(num2dim, 0, num2Copy2, 0, num2dim.length);
		printData2Dim("���� num2dim", num2dim);
		printData2Dim("������ num2Copy2", num2Copy2);
		System.out.println("���� num2dim : " + Arrays.toString(num2dim));
		System.out.println("������ num2Copy2 : " + Arrays.toString(num2Copy2));
		System.out.println();
		
		System.out.println(">> num2Copy2[1][0] = 888 ������");
		num2Copy2[1][0] = 888;
		printData2Dim("���� num2dim", num2dim);
		printData2Dim("������ num2Copy2", num2Copy2);
		
		//===========================================
		//1���� �迭�� System.arraycopy() �����ϱ� ���� ���� ��ü ����
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy2[i] = new int[num2dim[i].length];
		}
		System.out.println("���� num2dim : " + Arrays.toString(num2dim));
		System.out.println("���ο� num2Copy2 : " + Arrays.toString(num2Copy2));
		
		System.out.println("--- 1���� �迭�� ���Ͽ� System.arraycopy() ���� ---");
		for (int i = 0; i < num2Copy2.length; i++) {
			System.arraycopy(num2dim[i], 0, num2Copy2[i], 0, num2dim[i].length);
		}
		printData2Dim("���� num2dim", num2dim);
		printData2Dim("������ num2Copy2", num2Copy2);
		System.out.println();
		
		System.out.println(">> num2Copy2[1][0] = 888 ������");
		num2Copy2[1][1] = 777;
		printData2Dim("���� num2dim", num2dim);
		printData2Dim("������ num2Copy2", num2Copy2);
		
		//========================================
		
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	

	//�޼ҵ� �����ε�(method overloading)
	static void printData(String name, int[] num) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	
	
	static void printData2Dim(int[][] num2dim) {
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			//2���� �迭�� ���(1���� �迭�� ���� ó��)
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
	}
	static void printData2Dim(String name, int[][] num2dim) {
		System.out.print(name + " : ");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			//2���� �迭�� ���(1���� �迭�� ���� ó��)
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
	}

}





