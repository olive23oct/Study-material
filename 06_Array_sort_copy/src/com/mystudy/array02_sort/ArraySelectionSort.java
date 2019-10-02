package com.mystudy.array02_sort;

public class ArraySelectionSort {

	public static void main(String[] args) {
		//배열에 저장된 숫자 정렬(오름차순: ASC)
		//30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//데이타 확인
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		System.out.print("원본데이타: ");
		printData(num);
		
		System.out.println("---- 정렬 시작 ----");
//		//첫번째 값 기준으로 비교작업(인덱스 0 - 인덱스 1)
//		if (num[0] > num[1]) {
//			int temp = num[0];
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 비교작업(인덱스 0 - 인덱스 2)
//		if (num[0] > num[2]) {
//			int temp = num[0];
//			num[0] = num[2];
//			num[2] = temp;
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 비교작업(인덱스 0 - 인덱스 3)
//		if (num[0] > num[3]) {
//			int temp = num[0];
//			num[0] = num[3];
//			num[3] = temp;
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 비교작업(인덱스 0 - 인덱스 4)
//		if (num[0] > num[4]) {
//			int temp = num[0];
//			num[0] = num[4];
//			num[4] = temp;
//		}
//		printData(num);		
		
//		//첫번째 값을 기준으로 정렬(인덱스: 0)
//		for (int i = 1; i <= 4; i++) {
//			//System.out.print("비교대상(인덱스) " + i + " : " );
//			if (num[0] > num[i]) {
//				int temp = num[0];
//				num[0] = num[i];
//				num[i] = temp;
//			}
//		}
//		printData(num);	
//		
//		//두 번째 값을 기준으로 정렬(인덱스: 1)
//		for (int i = 2; i <= 4; i++) {
//			//System.out.print("비교대상(인덱스) " + i + " : " );
//			if (num[1] > num[i]) {
//				int temp = num[1];
//				num[1] = num[i];
//				num[i] = temp;
//			}
//		}
//		printData(num);	
//		
//		//두 번째 값을 기준으로 정렬(인덱스: 2)
//		for (int i = 3; i <= 4; i++) {
//			//System.out.print("비교대상(인덱스) " + i + " : " );
//			if (num[2] > num[i]) {
//				int temp = num[2];
//				num[2] = num[i];
//				num[i] = temp;
//			}
//		}
//		printData(num);	
//		
//		//두 번째 값을 기준으로 정렬(인덱스: 3)
//		for (int i = 4; i <= 4; i++) {
//			//System.out.print("비교대상(인덱스) " + i + " : " );
//			if (num[3] > num[i]) {
//				int temp = num[3];
//				num[3] = num[i];
//				num[i] = temp;
//			}
//		}
//		printData(num);	
		
//		System.out.println("===== 이중 for문으로 변경 =====");
//		//기준값이 0~3 까지 변하면서
//		for (int gijun = 0; gijun < 4; gijun++) {
//			for (int i = gijun + 1; i <= 4; i++) {
//				//System.out.print("비교대상(인덱스) " + i + " : " );
//				if (num[gijun] > num[i]) {
//					int temp = num[gijun];
//					num[gijun] = num[i];
//					num[i] = temp;
//				}
//			}
//			printData(num);	
//		}
		
		System.out.println("=== 오름차순 정렬 일반화 ==============");
		//배열의 마지막 데이타 인덱스 : 배열크기 - 1
		//기준값 인덱스 : 0 ~ 마지막데이타보다 1 적은 위치까지
		//비교대상값 인덱스 : 기준값 + 1 ~ 마지막데이타
		for (int gijun = 0; gijun < num.length - 1; gijun++) {
			System.out.println("--- 기준인덱스 : " + gijun);
			for (int i = gijun + 1; i < num.length; i++) {
				//System.out.print("비교대상(인덱스) " + i + " : " );
				if (num[gijun] > num[i]) {
					int temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				}
				printData(num);	
			}
		}
		System.out.println(">> 정렬 완료 후");
		printData(num);
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}










