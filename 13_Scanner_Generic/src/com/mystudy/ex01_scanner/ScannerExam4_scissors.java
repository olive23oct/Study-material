package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam4_scissors {

	public static void main(String[] args) {
		//Scanner를 이용한 가위 바위 보 게임
		//컴퓨터와 함께하는 가위(1),바위(2),보(3) 게임
		//0. 컴퓨터가 가위,바위,보를 선택(Math.random())
		//1. 가위, 바위, 보 선택 메뉴 출력
		//2. 선택값 입력
		//3. 결과 비교후 승자, 패자 결정
		//(반복) 게임 반복 진행 - 0선택시 종료
		////////////////////////////////
		Scanner scan = new Scanner(System.in);
		boolean oneMoreGame = true;
		
		while (oneMoreGame) {
			int comSelect = 2; //랜덤한 값으로 변경 처리
			comSelect = (int) (Math.random() * 3 + 1);
	//		for (int i = 0; i < 100; i++) {
	//			System.out.print((int) (Math.random() * 3 + 1) + ", ");
	//		}
			//System.out.println("컴퓨터 선택 숫자 : " + comSelect);
			
			System.out.println("가위, 바위, 보 중에 하나를 선택하시오.");
			System.out.println("1.가위     2.바위     3.보");
			System.out.print(">>당신의 선택은(1~3)? ");
			
			int select = 1; //화면에서 입력 처리
			select = Integer.parseInt(scan.nextLine());
	
			String strComputer = "";
			if (comSelect == 1) {
				strComputer = "가위";
			} else if (comSelect == 2) {
				strComputer = "바위";
			} else if (comSelect == 3) {
				strComputer = "보";
			} else {
				System.out.println("1~3중에 하나를 선택해야합니다.");
			}
			
			String strPerson = "";
			switch (select) {
			case 1:
				strPerson = "가위"; break;
			case 2:
				strPerson = "바위"; break;
			case 3:
				strPerson = "보"; break;
			default: 
				System.out.println("1~3중에 하나를 선택해야합니다.");
			}
			System.out.println(">> 나의선택 : " + strPerson);
			System.out.println(">> 컴퓨터선택 : " + strComputer);
			
			//----------------------
			//3. 결과 비교후 승자, 패자 결정
			//사람이 '가위'인 경우
			String result = "";
			if (strPerson.equals("가위")) {
				//컴퓨터 : 가위, 바위, 보
				if (strComputer.equals("가위")) {
					result = "무승부";
				}
				if (strComputer.equals("바위" )) {
					result = "컴퓨터 승";
				}
				if (strComputer.equals("보" )) {
					result = "내가 이겼다!!!";
				}
			}
			
			//사람이 "바위"인 경우
			if (strPerson.equals("바위")) {
				//컴퓨터 : 가위, 바위, 보
				if (strComputer.equals("가위")) {
					result = "내가 이겼다!!!";
				}
				if (strComputer.equals("바위" )) {
					result = "무승부";
				}
				if (strComputer.equals("보" )) {
					result = "컴퓨터 승";
				}
			}
			
			//사람이 "보"인 경우
			if (strPerson.equals("보")) {
				//컴퓨터 : 가위, 바위, 보
				if (strComputer.equals("가위")) {
					result = "컴퓨터 승";
				}
				if (strComputer.equals("바위" )) {
					result = "내가 이겼다!!!";
				}
				if (strComputer.equals("보" )) {
					result = "무승부";
				}
			}
			
			//결과출력
			System.out.println("---- 결과 -----");
			System.out.println(">>> " + result);
			
			//게임반복 여부 확인
			System.out.print("한 번 더 할래(y/n)? ");
			String yn = scan.nextLine();
			if (!"y".equalsIgnoreCase(yn)) {
				System.out.println(">> 게임을 종료했습니다.");
				oneMoreGame = false;
			}
		}
	}

}






