package com.mystudy.ex03_scanner_bank;

import java.util.Scanner;

//[실습] 은행의 ATM
//1.입금  2.출금  3.통장확인  0.종료
//------------------------------
//계좌를 하나 만들고 입금/출금/통장확인 작업을 처리
public class BankATM {
	private int money; //통장 계좌(금액)
	private Scanner scan = new Scanner(System.in);

	public void startBank() {
		System.out.println(">> 어서오세요");
		while (true) {
			if (!bankATM()) {
				break;
			}
			System.out.println();
		}
		System.out.println(">> ATM 기계를 종료합니다.");
	}

	//ATM기 동작 메소드
	private boolean bankATM() {
		boolean jobContinue = true;
		
		showMenu();
		int select = -1;
		try {
			select = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
					+ "메뉴(0~3) 숫자만 입력하세요.");
			return jobContinue;//아래 작업을 할 필요 없음
		}
		
		if (select == 1) {
			//System.out.println("입금 작업처리~~~");
			inputMoney();
			showMoney();
		} else if (select == 2) {
			//System.out.println("출금 작업처리~~~");
			outputMoney();
			showMoney();
		} else if (select == 3) {
			//System.out.println("통장확인 작업처리~~~");
			showMoney();
		} else if (select == 0) {
			//System.out.println("종료 처리~~~");
			jobContinue = false;
		} else {
			System.out.println("[안내] 메뉴(0~3) 숫자만 입력하세요.");
		}
		
		return jobContinue;
	}
	
	//메뉴 표시 메소드
	private void showMenu() {
		System.out.println("------------------------");
		System.out.println("1.입금  2.출금  3.통장확인  0.종료");
		System.out.println("------------------------");
		System.out.print(">>작업선택 : ");
	}
	
	//입금처리 메소드
	private void inputMoney() {
		//System.out.println("입금 작업처리~~~");
		while (true) {
			System.out.print(">>입금액 : ");
			try {
				money += Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
						+ "숫자(0~9)만 입력하세요."
						+ "\n다시 작업을 선택하세요");
				continue;
			}
			break; //정상값 입력시 입력 작업 중단
		}
	}
	
	//출금처리 메소드
	private void outputMoney() {
		//System.out.println("출금 작업처리~~~");
		while (true) {
			System.out.print(">>출금액 : ");
			try {
				int outMoney = Integer.parseInt(scan.nextLine());
				if (money >= outMoney) {
					money -= outMoney;
				} else {
					System.out.println(">> 잔액부족으로 출금이 안됩니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
						+ "숫자(0~9)만 입력하세요."
						+ "\n다시 작업을 선택하세요");
				continue;
			}
			break; //정상값 입력시 입력 작업 중단
		}
	}
	
	//통장확인 메소드
	private void showMoney() {
		//System.out.println("통장확인 작업처리~~~");
		System.out.println("::통장금액 : " + money + " 원");
	}
	
}

/* *********************
>> 어서오세요
------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 1
>>입금액 : 10000
::통장금액 : 10000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 2
>>출금액 : 5000
::통장금액 : 5000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 3
::통장금액 : 5000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 0
>>작업을 종료했습니다.
******************************/
