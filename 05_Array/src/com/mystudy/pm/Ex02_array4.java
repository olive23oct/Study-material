package com.mystudy.pm;

public class Ex02_array4 {

	public static void main(String[] args) {
		//������ ���� ��ȯ�ϱ�
		int a = 100;
		int b = 200;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int temp = 0;
		temp = a; //a �� ���纻 �����
		a = b;
		b = temp;
		
		System.out.println("--- ��ȯ �� ---");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("temp: " + temp);
		System.out.println("======================");
		
		//////////////////////////////////
		//            0    1    2    3    4
		int[] nums = {100, 200, 300, 400, 500, 600};
		System.out.println("�迭�� ũ�� : " + nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("---");
		printArray(nums);
		
		//����� �� ��ȯ�ϱ� ù��°�� ������
		//nums[0] <-> nums[4]
		System.out.println("nums[0] <-> nums[4] ��ȯ�ϱ�");
		temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		printArray(nums);
		
		//nums[1] <-> nums[3]
		System.out.println("nums[1] <-> nums[3] ��ȯ�ϱ�");
		temp = nums[1];
		nums[1] = nums[nums.length - 2];
		nums[nums.length - 2] = temp;
		printArray(nums);
		
		//---------------------
		
		//================================
		//�迭�� ����Ÿ ������ ������� ����Ÿ�� ������ ���� �ۼ�
		
		
		
		
	}
	
	//�޼ҵ� ����� - �迭�� ȭ�� ���
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	

}











