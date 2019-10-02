package com.mystudy.exam_array;

import java.util.Arrays;

public class SungjukManagerExam {
	static final String LINE = "===================================";
	static final String TITLE = "국어\t영어\t수학\t총점\t평균";
	
	public static void main(String[] args) {
		//2차원 배열을 사용한 성적 처리
		//실습문제. 
		//  국어, 영어, 수학 점수 3개를 저장한 2차원 배열(sungjuk) 만들고
		//  성적을 입력하고 개인별 총점과 평균을 계산 하여 화면에 데이터 출력
		/*
			국어\t영어	  수학	  총점	       평균
			--------------------------
			100  90  80  270   90.0
			100  90  81  271   90.33
			100  90  80  270   90.0
			--------------------------
		*/
		int[][] sungjuk = { {100, 90, 80}, 
				            {100, 90, 81}, 
				            {95, 85, 77}};
		//System.out.println(Arrays.toString(sungjuk));
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int tot = 0;
		double avg = 0;
		
		System.out.println("kor : " + kor);
		System.out.println("sungjuk[0][0] : " + sungjuk[0][0]);
		kor = sungjuk[0][0];
		eng = sungjuk[0][1];
		math = sungjuk[0][2];
		//tot = sungjuk[0][0] + sungjuk[0][1] + sungjuk[0][2];
		tot = kor + eng + math;
		System.out.println("tot : " + tot);
		
		avg = tot * 100 / 3 / 100.0;
		System.out.println("avg : " + avg);
		
		dispTitle();
		System.out.print(kor +"\t"+ eng +"\t"+ math +"\t"
				+ tot + "\t" + avg );
		System.out.println();

		//2번째 데이타 처리
		kor = sungjuk[1][0];
		eng = sungjuk[1][1];
		math = sungjuk[1][2];
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		System.out.print(kor +"\t"+ eng +"\t"+ math +"\t"
				+ tot + "\t" + avg );
		System.out.println();
		
		//3번째 데이타 처리
		kor = sungjuk[2][0];
		eng = sungjuk[2][1];
		math = sungjuk[2][2];
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		System.out.print(kor +"\t"+ eng +"\t"+ math +"\t"
				+ tot + "\t" + avg );
		System.out.println();
		
		System.out.println("========================");
		dispTitle();
		int subjectCnt = sungjuk[0].length;
		for (int i = 0; i < sungjuk.length; i++) {
			kor = sungjuk[i][0];
			eng = sungjuk[i][1];
			math = sungjuk[i][2];
			
			tot = kor + eng + math;
			avg = tot * 100 / subjectCnt / 100.0;
			System.out.print(kor +"\t"+ eng +"\t"+ math +"\t"
					+ tot + "\t" + avg );
			System.out.println();
		}
		
		System.out.println("========================");
		dispTitle();
		subjectCnt = sungjuk[0].length;
		int[] subject = new int[subjectCnt];
		for (int i = 0; i < sungjuk.length; i++) {
			tot = 0;
			for (int k = 0; k < subjectCnt; k++) {
				subject[k] = sungjuk[i][k];
				tot = tot + subject[k];
			}
			
			avg = tot * 100 / subjectCnt / 100.0;
			System.out.print(kor +"\t"+ eng +"\t"+ math +"\t"
					+ tot + "\t" + avg );
			System.out.println();
		}
		System.out.println(LINE);
	}
	
	static void dispTitle() {
		System.out.println(LINE);
		System.out.println(TITLE);
		System.out.println(LINE);
	}

}










