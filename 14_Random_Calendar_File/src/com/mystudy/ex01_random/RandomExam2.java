package com.mystudy.ex01_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExam2 {

	public static void main(String[] args) {
		Random ran = new Random();

		System.out.println("--- nextInt() ---");
		for (int i = 0; i < 10; i++) {
			int ranInt = ran.nextInt();
			System.out.print(ranInt + " ");
		}
		System.out.println();
		
		System.out.println("--- nextInt(5) ---");
		for (int i = 0; i < 10; i++) {
			int ranInt = ran.nextInt(5); //0~4
			System.out.print(ranInt + " ");
		}
		System.out.println();
		
		System.out.println("--- Random nextBytes() ---");
		byte[] arrByte = new byte[10];
		System.out.println(Arrays.toString(arrByte));
		ran.nextBytes(arrByte);
		System.out.println(Arrays.toString(arrByte));
		
		System.out.println("---- Math.random() vs Random nextDouble() ----");
		for (int i = 0; i < 10; i++) {
			double mathRan = Math.random(); //0 <= ran < 1 double타입 실수
			System.out.println(mathRan + " - Math.random()");
			System.out.println(ran.nextDouble() + " - Random nextDouble()");
		}
		
	}

}











