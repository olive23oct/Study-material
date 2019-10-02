package com.mystudy.array2dim;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		//2차원 배열 선언 및 객체 생성
		//타입[][] 변수명 = new 타입[크기값][크기값];
		//타입 변수명[][] = new 타입[크기값][크기값];
		//타입[][] 변수명 = { {..}, {..}, .., {..}};
		int[][] nums = { {10, 20}, //10: nums[0][0], 20:[0][1]
						 {30, 40}, //30: nums[1][0], 40:[1][1] 
						 {50, 60}, //50: nums[2][0]
						 {70, 80},
						 {90, 100, 200}//90: nums[4][0]
		               }; //[5][??]
		System.out.println("nums : " + nums);
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("nums[0][0]: " + nums[0][0]);
		System.out.println("----------------");
		
		//배열에 있는 값을 모두 출력
		//{10, 20}
		System.out.print(nums[0][0] + " "); //0, 0
		System.out.print(nums[0][1] + " "); //0, 1
		System.out.println();
		//{30, 40}
		System.out.println(nums[1][0]); //1, 0
		System.out.println(nums[1][1]); //1, 1
		//{50, 60}
		System.out.println(nums[2][0]); //2, 0
		System.out.println(nums[2][1]); //2, 1
		
		System.out.println("---- for문으로 출력 ----");
		
		for (int i = 0; i < 2; i++) {
			System.out.print(nums[0][i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			System.out.print(nums[1][i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			System.out.print(nums[2][i] + " ");
		}
		System.out.println();
		
		System.out.println("--- 이중 for문으로 변경 ---");
		System.out.println("nums.length: " + nums.length);
		System.out.println("nums[0].length: " + nums[0].length);
		System.out.println("nums[4].length: " + nums[4].length);
		
		for (int k = 0; k < nums.length; k++) {
			for (int i = 0; i < nums[k].length; i++) {
				System.out.print(nums[k][i] + " ");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}

}











