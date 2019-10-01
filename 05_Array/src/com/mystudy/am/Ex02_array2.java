package com.mystudy.am;

public class Ex02_array2 {

	public static void main(String[] args) {
		//문제 : 1~10까지의 수를 배열에 저장(반복문사용)하고 
		//      배열에 있는 데이타를 출력
		//출력형태 : 변수명[인덱스번호] : 값
		//num[0] : 1
		//num[1] : 2
		//////////////////////////

		//int 타입 배열 선언(크기 10인)
		int[] num = new int[10];
		
		//배열에 값을 저장(1,2,3,..., 10)
		num[0] = 1; //값 = 인덱스 + 1;
		num[1] = 2;
		num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		//배열 값 출력(변수명[0] : 1)
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i +"] : " + num[i]);
		}
		
		//-------------------------------
		System.out.println("=================");
		//문제 : 1~10 까지의 수 중에서 홀 수의 합 구하기(배열사용)
		//1. 정수값 5개를 저장할 수 있는 저장공간(odd) 만들기(int타입)
		//2. 1~10 까지의 숫자 중 홀수 값만 배열에 저장(반복문사용)
		//3. 배열에 저장된 데이타의 값을 모두 더한 결과 출력(반복문사용)
		/////////////////////////////////////////
		
		//1.변수선언(int타입배열 - odd, 크기 5)
		int[] odd = new int[5];
		
		//2.배열 값 초기화(1~10까지의 숫자 중 홀수값 저장)
		//(저장된 값 출력해서 확인)
		int oddValue = 1;
		for (int i = 0; i < odd.length; i++) {
			odd[i] = oddValue;
			oddValue = oddValue + 2;
		}
		
//		for (int i = 0; i < odd.length; i++) {
//			odd[i] = i * 2 + 1;
//		}
		
		//배열에 저장된 데이타 확인
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
		
		//3.배열의 값을 합산
		int sum = 0;
		for (int i = 0; i < odd.length; i++) {
			sum = sum + odd[i];
		}
		//4.합산결과 출력
		System.out.println("합계(1+3+5+7+9) = " + sum);
		
		//====================================
		//문제 : 1~10까지의 수 중에서 홀수합 구하기(배열사용)
		//     (1~10까지의 숫자를 모두 배열에 저장 - 순서대로)
		//1. 배열선언(nums - int 타입의 값 10개 저장)
		//2. 배열 초기화(1~10까지 숫자를 순서대로 배열에 저장)
		//3. 배열에 저장된 값 중 홀수값 합산
		//4. 홀수 합계값 출력
		
		int[] nums = new int[10];
		
		//데이타 초기화(1~10까지 숫자 저장)
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		//배열 데이타 확인(조회)
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + " : " + nums[i]);
		}
		
		//홀수값 합산
		//nums[0] = 100;
		sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum = sum + nums[i];
			System.out.println("합계되는 값 : " + nums[i]);
		}
		System.out.println("홀수합계 : " + sum);
		
		System.out.println("------");
		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				sum = sum + nums[i];
				System.out.println("합계되는 값 : " + nums[i]);
			}
		}
		System.out.println("홀수합계2 : " + sum);
		
		System.out.println("-------------------");
		//----------------------
		//배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
		//배열에 있는 값 중 홀수는 홀수끼리 합산(oddSum)
		//짝수합계, 홀수합계 출력
		int evenSum = 0; //짝수합
		int oddSum = 0; //홀수합
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) { //짝수
				evenSum += nums[i];
				System.out.println("짝수: " + nums[i]);
			} else { //홀수
				oddSum += nums[i];
				System.out.println("홀수: " + nums[i]);
			}
		}
		System.out.println("홀수합계: " + oddSum + ", "
				         + "짝수합계: " + evenSum);
		
	}

}













