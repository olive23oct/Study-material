package com.mystudy.am;

public class Ex02_array2 {

	public static void main(String[] args) {
		//���� : 1~10������ ���� �迭�� ����(�ݺ������)�ϰ� 
		//      �迭�� �ִ� ����Ÿ�� ���
		//������� : ������[�ε�����ȣ] : ��
		//num[0] : 1
		//num[1] : 2
		//////////////////////////

		//int Ÿ�� �迭 ����(ũ�� 10��)
		int[] num = new int[10];
		
		//�迭�� ���� ����(1,2,3,..., 10)
		num[0] = 1; //�� = �ε��� + 1;
		num[1] = 2;
		num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		//�迭 �� ���(������[0] : 1)
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i +"] : " + num[i]);
		}
		
		//-------------------------------
		System.out.println("=================");
		//���� : 1~10 ������ �� �߿��� Ȧ ���� �� ���ϱ�(�迭���)
		//1. ������ 5���� ������ �� �ִ� �������(odd) �����(intŸ��)
		//2. 1~10 ������ ���� �� Ȧ�� ���� �迭�� ����(�ݺ������)
		//3. �迭�� ����� ����Ÿ�� ���� ��� ���� ��� ���(�ݺ������)
		/////////////////////////////////////////
		
		//1.��������(intŸ�Թ迭 - odd, ũ�� 5)
		int[] odd = new int[5];
		
		//2.�迭 �� �ʱ�ȭ(1~10������ ���� �� Ȧ���� ����)
		//(����� �� ����ؼ� Ȯ��)
		int oddValue = 1;
		for (int i = 0; i < odd.length; i++) {
			odd[i] = oddValue;
			oddValue = oddValue + 2;
		}
		
//		for (int i = 0; i < odd.length; i++) {
//			odd[i] = i * 2 + 1;
//		}
		
		//�迭�� ����� ����Ÿ Ȯ��
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
		
		//3.�迭�� ���� �ջ�
		int sum = 0;
		for (int i = 0; i < odd.length; i++) {
			sum = sum + odd[i];
		}
		//4.�ջ��� ���
		System.out.println("�հ�(1+3+5+7+9) = " + sum);
		
		//====================================
		//���� : 1~10������ �� �߿��� Ȧ���� ���ϱ�(�迭���)
		//     (1~10������ ���ڸ� ��� �迭�� ���� - �������)
		//1. �迭����(nums - int Ÿ���� �� 10�� ����)
		//2. �迭 �ʱ�ȭ(1~10���� ���ڸ� ������� �迭�� ����)
		//3. �迭�� ����� �� �� Ȧ���� �ջ�
		//4. Ȧ�� �հ谪 ���
		
		int[] nums = new int[10];
		
		//����Ÿ �ʱ�ȭ(1~10���� ���� ����)
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		//�迭 ����Ÿ Ȯ��(��ȸ)
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + " : " + nums[i]);
		}
		
		//Ȧ���� �ջ�
		//nums[0] = 100;
		sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum = sum + nums[i];
			System.out.println("�հ�Ǵ� �� : " + nums[i]);
		}
		System.out.println("Ȧ���հ� : " + sum);
		
		System.out.println("------");
		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				sum = sum + nums[i];
				System.out.println("�հ�Ǵ� �� : " + nums[i]);
			}
		}
		System.out.println("Ȧ���հ�2 : " + sum);
		
		System.out.println("-------------------");
		//----------------------
		//�迭�� �ִ� �� �� ¦���� ¦������ �ջ�(evenSum)
		//�迭�� �ִ� �� �� Ȧ���� Ȧ������ �ջ�(oddSum)
		//¦���հ�, Ȧ���հ� ���
		int evenSum = 0; //¦����
		int oddSum = 0; //Ȧ����
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) { //¦��
				evenSum += nums[i];
				System.out.println("¦��: " + nums[i]);
			} else { //Ȧ��
				oddSum += nums[i];
				System.out.println("Ȧ��: " + nums[i]);
			}
		}
		System.out.println("Ȧ���հ�: " + oddSum + ", "
				         + "¦���հ�: " + evenSum);
		
	}

}













