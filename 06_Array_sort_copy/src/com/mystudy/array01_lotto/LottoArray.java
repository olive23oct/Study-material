package com.mystudy.array01_lotto;

public class LottoArray {

	public static void main(String[] args) {
		//로또 번호 생성기
		//1. int타입의 숫자 45개를 저장할 수 있는 배열타입 변수(balls)
		//2. 초기화 : 1~45까지의 숫자(번호)를 입력
		//3. 많이 섞고
		//4. 6개 번호를 추출
		/////////////////////////////
		
		//1. int타입의 숫자 45개를 저장할 수 있는 배열타입 변수(balls)
		int[] balls = new int[45];
		
		//2. 초기화 : 1~45까지의 숫자(번호)를 입력(공을 넣기)
		balls[0] = 1;
		balls[1] = 2;
		balls[2] = 3;
		
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		System.out.println("--- 초기화 결과 확인 ---");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		System.out.println("---- Math.random() 이용 ---");
		//3. 충분히 많이 섞고
		//첫번째 숫자와 임의의 위치(0~44)에 있는 숫자를 교환
		//Math.random() : 0.00000 ~ 0.9999999999
		//(int)(Math.random() * 45) : 0~44까지의 숫자 랜덤하게 생성
		int rNum = (int)(Math.random() * 45);
		System.out.println("랜덤숫자(0~44) : " + rNum);
		
		System.out.println("변경전 0: " + balls[0] + ", "
                + rNum + ": " + balls[rNum]);
		
		//balls[0] <-> balls[rNum]
		int temp = balls[0];
		balls[0] = balls[rNum];
		balls[rNum] = temp;
		
		System.out.println("변경후 0: " + balls[0] + ", "
		                  + rNum + ": " + balls[rNum]);
		//충분히 많이 섞기
		for (int i = 0; i < 10000; i++) {
			rNum = (int)(Math.random() * 45);
			temp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = temp;
		}
		
		System.out.println("--- 충분히 섞은 결과 확인 ---");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		//4. 6개 번호를 추출(앞에서 6개)
		System.out.print("로또 추첨 결과(1등): ");
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
		
	}

}









