
public class Ex04_if_sungjuk {

	public static void main(String[] args) {
		//성적처리
		//국어(kor), 영어(eng), 수학(math) 점수
		//총점(tot) = 국어 + 영어 + 수학
		//평균(avg) = 총점 / 3
		//--------------------
		//평균점수 구간에 따라 학점 부여
		//90 ~ 100 : A
		//80 ~ 89 : B
		//70 ~ 79 : C
		//60 ~ 69 : D
		//60 미만(0~59) : F 재수강하세요
		///////////////////////////////////
		/* 출력 형태
		국어 : 100
		영어 : 90
		수학 : 80
		----------
		성적합계 : 270
		평균점수 : 90
		<평가결과>
		A 학점
		***********************/
		int kor = 50;
		int eng = 50;
		int math = 50;
		
		//성적출력
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("----------");
		
		//총점구하기(출력)
		int tot = kor + eng + math;
		System.out.println("성적합계 : " + tot);
		
		//평균구하기(출력)
//		System.out.println("tot * 100 : " + (tot * 100));
//		System.out.println("tot * 100 / 3 : " + (tot * 100 / 3));
		double avg = tot * 100 / 3 / 100.0;
		avg = Math.round(tot * 100 / 3.0) / 100.0; //Math.round() - 소수점이하 첫자리 반올림
		System.out.println("평균점수 : " + avg);
		
		//평균에 대한 학점처리
		System.out.println("<평가결과>");
		String hakjum;
		if (avg >= 90) {
			System.out.println("A 학점");
			hakjum = "A";
		} else if (avg >= 80) {//avg >= 80 && avg < 90
			System.out.println("B 학점");
			hakjum = "B";
		} else if (avg >= 70) {
			System.out.println("C 학점");
			hakjum = "C";
		} else if (avg >= 60) {
			System.out.println("D 학점");
			hakjum = "D";
		} else {
			System.out.println("F 재수강하세요");
			hakjum = "F";
		}
		
		//================================
		System.out.println("=================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("----------");
		System.out.println("성적합계 : " + tot);
		System.out.println("평균점수 : " + avg);
		System.out.println("<평가결과>");
		
		//문자열 비교시에는 == 사용하지 말고 equals() 메소드 사용
		if (hakjum.equals("F")) {
			System.out.println(hakjum + "학점 재수강 하세요");
		} else {
			System.out.println(hakjum + "학점");
		}
		
		//========================================
		System.out.println("=======================");
		int jumsu = 100; //0 ~ 100 범위의 수
		int testNum = jumsu / 10;
		System.out.println(testNum);
		switch (testNum) {
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		}
	}

}



















