package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam5_guess_number {

	public static void main(String[] args) {
		//컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
		//선택 기회 5회
		//---------------------
		//Math.random() : 0 <= random값 < 1 범위의 실수값 
		//컴숫자 : 70 인 경우 
		//  사람이 선택한 숫자(80)가 크면 : 작다는 메시지 출력
		//  사람이 선택한 숫자(50)가 작으면 : 크다는 메시지 출력
		//5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
		//5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
		//-----
		//다시 도전하시겠습니까?(y,n) 
		//---------------------------
		//////////////////////////////////////////
		int comNo = 0; //컴퓨터가 생각한 숫자
		int meNo = 0; //내가 정한 숫자
		int tryCnt = 0; //시도 횟수
		Scanner scan = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while (isContinue) {
			tryCnt = 0;
			
			//1. 메시지 출력 및 컴퓨터가 1~100까지의 숫자 중 하나를 선택하도록 처리
			comNo = (int)(Math.random() * 100 + 1);
	
			System.out.println("컴) 1~100까지 숫자중 하나를 생각했습니다."
					+ " 맞춰보세요");
			System.out.println("컴퓨터 생각 숫자 : " + comNo);
			
			while (tryCnt < 5) {
				tryCnt++;
				System.out.println("시도횟수 : " + tryCnt);
				
				//2. 사람에게 선택하도록 메시지 출력, 값을 입력 받기
				System.out.print("(" + tryCnt + "번째)숫자를 선택 : ");
				meNo = Integer.parseInt(scan.nextLine());
				
				if (tryCnt < 5) {
					
					//3. 입력한 값과 컴퓨터의 숫자 비교(>, ==, <)
					if (comNo > meNo) {
						System.out.println(">> " + meNo + " 보다 큽니다.");
					}
					
					if (comNo < meNo) {
						System.out.println(">> " + meNo + " 보다 작습니다.");
					}
					
					if (comNo == meNo) {//맞추면 게임 종료
						System.out.println(">> 맞췄습니다. " 
								+ "내가 생각한 숫자는 " + comNo + " 입니다.");
						System.out.println("게임을 종료합니다. 다시 시작하세요.");
						break;
					}
				} else { //5번째 시도 : 맞추든 못맞추든 무조건 게임 종료
					if (comNo > meNo) {
						System.out.println(">>실패~~ "
								+ "내가 생각한 숫자는 " + comNo + " 입니다.");
					}
					if (comNo < meNo) {
						System.out.println(">>실패~~ "
								+ "내가 생각한 숫자는 " + comNo + " 입니다.");
					}
					if (comNo == meNo) {
						System.out.println(">> 맞췄습니다. "
								+ "내가 생각한 숫자는 " + comNo + " 입니다.");
						System.out.println("게임을 종료합니다. 다시 시작하세요.");
					}
					break;
				}
			
			}
			//한 번의 게임이 종료됨
			System.out.println("-------------------");
			//게임을 더 할건지 여부 체크
			System.out.print(">> 다시 도전하시겠습니까?(y/n) ");
			String tryYesNo = scan.nextLine();
			if ("n".equalsIgnoreCase(tryYesNo)) {
				System.out.println(">>> 게임이 종료되었습니다.");
				isContinue = false;
			}
		}
		
		System.out.println("--- main() 끝 ----");
	}

}









