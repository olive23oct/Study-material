package com.mystudy.am;

public class Ex01_array {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		System.out.println("num1: " + num1); 
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		//�迭(Array)
		//�迭�� ���� : �ڷ���[] ������
		//������ �� ���� : �迭������[�ε�����ȣ] = ��;
		/* �迭�� ���� �� ����
		1. �ڷ���[] ������ = new �ڷ���[����];
		    �ڷ��� ������[] = new �ڷ���[����];
		2. �ڷ���[] ������ = new �ڷ���[] {��1, ��2, .., ��n};
		3. �ڷ���[] ������ = {��1, ��2, .., ��n}; //n���� ������� ����
		*/
		
		int[] arr = new int[6];
		System.out.println("arr : " + arr);
		arr[0] = 100; //ù��°
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 200; //�ι�°
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600; //������ ����Ÿ(ũ�� - 1)
		//arr[6] = 700;
		//System.out.println("arr[6] : " + arr[6]);
		
		int sum = 0;
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
		System.out.println("sum : " + sum);
		
		System.out.println("-----------");
		//    �ε������۰�     �迭ũ�Ⱚ
		for (int i = 0; i < 6; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		}
		System.out.println("-----");
		
		//�ݺ����� ����Ͽ� �迭�� �հ� ���ϱ�
		sum = 0;
		for (int idx = 0; idx < 6; idx++) {
			sum = sum + arr[idx];
		}
		System.out.println("sum : " + sum);
		
		//--------------------------
		//�迭�� ũ�� �� Ȯ��(��ȸ)
		System.out.println("arr.length : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		//==================================
		System.out.println("=== ���� ���ĺ� ���(A~Z) ===");
		char[] ch = new char[26]; //�迭���� �� ũ�� ����
		ch[0] = 'A';
		System.out.println("ch[0] : " + ch[0]);
		ch[1] = 'B';
		System.out.println("ch[1] : " + ch[1]);
		ch[2] = 'B' + 1;
		System.out.println("ch[2] : " + ch[2]);
		
		System.out.println("----------------");
		//ch �迭������ ���ĺ�('A' ~ 'Z')�� ����
//		ch[0] = 'A' + 0;
//		ch[1] = 'A' + 1;
//		ch[2] = 'A' + 2;
//		ch[3] = 'A' + 3;
				
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A' + i);
		}
		
		//�迭�� ����� �� ���
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		//====================================
		System.out.println("---- �迭�������� 2�� ----");
		//�迭�� ũ��� �ʱⰪ ���� �� ���� ó��
		int[] num = new int[] {100, 101, 102, 103, 104};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("--- �迭�������� 3�� ---");
		int[] arr3 = {10, 11, 12, 13, 14, 15};
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}

}







