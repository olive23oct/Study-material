package com.mystudy.array2dim;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		//배열 문제
		//문제1 : int타입의 데이타 3개를 저장할 수 있는 배열(num1)에
		//  1. 10, 20, 30 숫자를 입력하고  화면 출력 
		//  2. 세번째 데이타를 100으로 바꾸고 화면 출력
		//문제2 : num1과 크기가 같은 배열 num1Copy를 만들고
		//  num1Copy에 num1 데이타를 복사하고 화면출력
		//(번외) 주소값 복사인지 데이타 복사인지도 확인
		//----------------------------
		//int[] num1 = new int[3];
		int[] num1 = {10, 20, 30};
		System.out.println(Arrays.toString(num1));
		printData(num1);
		
		//  2. 세번째 데이타를 100으로 바꾸고 화면 출력
		num1[2] = 100;
		printData(num1);
		
		//문제2 : num1과 크기가 같은 배열 num1Copy를 만들고
		int[] num1Copy = new int[num1.length];
		
		//num1Copy에 num1 데이타를 복사하고 화면출력
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
		//System.arraycopy(원본객체, 원본시작인덱스, 대상객체, 대상시작위치, 복사할크기);
		System.arraycopy(num1, 0, num1Copy2, 0, num1.length);
		printData("num1", num1);
		printData("num1Copy2", num1Copy2);
		
		num1Copy2[0] = 999;
		System.out.println(">> num1Copy2[0] = 999 처리후 ");
		printData("num1", num1);
		printData("num1Copy2", num1Copy2);
		
		System.out.println("----- 배열객체.clone() 사용 ---");
		int[] num1Copy3 = num1.clone(); //배열객체를 복사해서 전달
		printData("num1", num1);
		printData("num1Copy3", num1Copy3);
		
		num1Copy3[0] = 999;
		System.out.println(">> num1Copy3[0] = 999 처리후 ");
		printData("num1", num1);
		printData("num1Copy3", num1Copy3);
		
		//-----------------------------------
		//문제3 : 2차원 배열을 사용하여
		//int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		//Q1. 2차원 배열인 num2dim의 값을 화면에 출력 : 10 20 30...
		//Q2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력
		//Q3. num2dim의 크기만큼 num2Copy 배열변수를 선언하고 num2dim의 값을 복사하고
		//    num2Copy의 값을 화면 출력
		System.out.println("==========================");
		int[][] num2dim = {
							{10,20}, {30,40}, {50,60}
						  };
		
		//Q1. 2차원 배열인 num2dim의 값을 화면에 출력 : 10 20 30...
		System.out.println("--- 2차원 배열 출력 ---");
		System.out.println(Arrays.toString(num2dim));
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			System.out.print(Arrays.toString(num2dim[d2]) + " ");
		}
		System.out.println();
		
		System.out.println("----- 이중for문 사용 데이타 출력 ----");
		//2차원 배열에 대한 처리
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			//2차원 배열의 요소(1차원 배열에 대한 처리)
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("-- 출력메소드 사용 ---");
		printData2Dim(num2dim);
		printData2Dim("num2dim", num2dim);
		
		//Q2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력
		System.out.println(num2dim[1][0]);
		num2dim[1][0] = 100;
		System.out.println(">> num2dim[1][0] = 100 적용후");
		printData2Dim("num2dim", num2dim);
		
		//Q3. num2dim의 크기만큼 num2Copy 배열변수를 선언하고 num2dim의 값을 복사하고
		//    num2Copy의 값을 화면 출력
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

		System.out.println("--- 배열복사 num2Copy <- num2dim");
		for (int d2 = 0; d2 < num2Copy.length; d2++) {
			for (int i = 0; i < num2Copy[d2].length; i++) {
				num2Copy[d2][i] = num2dim[d2][i];
			}
		}
		printData2Dim("원본 num2dim", num2dim);
		printData2Dim("복사후 num2Copy", num2Copy);
		System.out.println();
		
		num2Copy[1][0] = 999;
		System.out.println(">> num2Copy[1][0] = 999 처리후");
		printData2Dim("원본 num2dim", num2dim);
		printData2Dim("수정후 num2Copy", num2Copy);
		
		System.out.println("===== System.arraycopy() 사용 ===");
		int[][] num2Copy2 = new int[num2dim.length][];
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy2[i] = new int[num2dim[i].length];
		}
		System.out.println("---2차원배열에 System.arraycopy() 적용후");
		System.arraycopy(num2dim, 0, num2Copy2, 0, num2dim.length);
		printData2Dim("원본 num2dim", num2dim);
		printData2Dim("복사후 num2Copy2", num2Copy2);
		System.out.println("원본 num2dim : " + Arrays.toString(num2dim));
		System.out.println("복사후 num2Copy2 : " + Arrays.toString(num2Copy2));
		System.out.println();
		
		System.out.println(">> num2Copy2[1][0] = 888 적용후");
		num2Copy2[1][0] = 888;
		printData2Dim("원본 num2dim", num2dim);
		printData2Dim("수정후 num2Copy2", num2Copy2);
		
		//===========================================
		//1차원 배열에 System.arraycopy() 적용하기 위해 새로 객체 생성
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy2[i] = new int[num2dim[i].length];
		}
		System.out.println("원본 num2dim : " + Arrays.toString(num2dim));
		System.out.println("새로운 num2Copy2 : " + Arrays.toString(num2Copy2));
		
		System.out.println("--- 1차원 배열에 대하여 System.arraycopy() 적용 ---");
		for (int i = 0; i < num2Copy2.length; i++) {
			System.arraycopy(num2dim[i], 0, num2Copy2[i], 0, num2dim[i].length);
		}
		printData2Dim("원본 num2dim", num2dim);
		printData2Dim("복사후 num2Copy2", num2Copy2);
		System.out.println();
		
		System.out.println(">> num2Copy2[1][0] = 888 적용후");
		num2Copy2[1][1] = 777;
		printData2Dim("원본 num2dim", num2dim);
		printData2Dim("수정후 num2Copy2", num2Copy2);
		
		//========================================
		
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	

	//메소드 오버로딩(method overloading)
	static void printData(String name, int[] num) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	
	
	static void printData2Dim(int[][] num2dim) {
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			//2차원 배열의 요소(1차원 배열에 대한 처리)
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
	}
	static void printData2Dim(String name, int[][] num2dim) {
		System.out.print(name + " : ");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			//2차원 배열의 요소(1차원 배열에 대한 처리)
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
	}

}





