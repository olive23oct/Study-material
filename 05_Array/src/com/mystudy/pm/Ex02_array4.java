package com.mystudy.pm;

public class Ex02_array4 {

	public static void main(String[] args) {
		//변수값 서로 교환하기
		int a = 100;
		int b = 200;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int temp = 0;
		temp = a; //a 값 복사본 만들기
		a = b;
		b = temp;
		
		System.out.println("--- 교환 후 ---");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("temp: " + temp);
		System.out.println("======================");
		
		//////////////////////////////////
		//            0    1    2    3    4
		int[] nums = {100, 200, 300, 400, 500, 600};
		System.out.println("배열의 크기 : " + nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("---");
		printArray(nums);
		
		//저장된 값 교환하기 첫번째와 마지막
		//nums[0] <-> nums[4]
		System.out.println("nums[0] <-> nums[4] 교환하기");
		temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		printArray(nums);
		
		//nums[1] <-> nums[3]
		System.out.println("nums[1] <-> nums[3] 교환하기");
		temp = nums[1];
		nums[1] = nums[nums.length - 2];
		nums[nums.length - 2] = temp;
		printArray(nums);
		
		//---------------------
		
		//================================
		//배열의 데이타 갯수와 관계없이 데이타를 뒤집는 로직 작성
		
		
		
		
	}
	
	//메소드 만들기 - 배열값 화면 출력
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	

}











