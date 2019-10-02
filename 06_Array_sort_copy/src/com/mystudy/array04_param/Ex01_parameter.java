package com.mystudy.array04_param;

public class Ex01_parameter {

	public static void main(String[] args) {
		// �Ķ���� ���� ������ ��
		//1. ���� ���޵Ǵ� ��� : �⺻ ����Ÿ Ÿ��
		//2. �ּҰ��� ���޵Ǵ� ��� : ������ ����Ÿ Ÿ��
		//   ������ ����Ÿ Ÿ���� ���� �޾� �� ����� ���� ����Ÿ�� �� �����
		int num = 100;
		int[] arr = {100, 200, 300};
		System.out.println("���� num : " + num);
		changeData(num);
		System.out.println("changeData()������ num : " + num);
		
		System.out.println("--- ������ ����Ÿ ���� ---");
		printData(arr); //���� ����Ÿ ���
		changeData(arr); //�ּҰ����� : �Ķ���ͷ� ���ް� ������ ���
		
		//���� ����Ÿ �սǾ��� ����Ÿ ���� �� ��ȸ/�Է�/����/���� �۾�
		//changeData(arr.clone()); //���簴ü ����
		printData(arr);
	}
	
	static void changeData(int intValue) {
		System.out.println(">> ���޹��� int : " + intValue);
		intValue = 999;
		System.out.println(">> ����� int : " + intValue);
	}
	
	static void changeData(int[] intArr) {
		System.out.print(">>���޹��� intArr[]: ");
		printData(intArr);
		
		//����Ÿ ����ó��
		intArr[0] = 999;
		System.out.print(">>������ intArr[]: ");
		printData(intArr);
	}
	
	static void changeDataArray(int[] intArr) {
		System.out.print(">>���޹��� intArr[]: ");
		printData(intArr);
		
		//����Ÿ ����ó��
		intArr[0] = 999;
		System.out.print(">>������ intArr[]: ");
		printData(intArr);
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	
	

}






