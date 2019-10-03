package com.mystudy.ex01_exception;

public class ExceptionThrows {

	public static void main(String[] args) {
		// throws : 예외를 던질 때(위임, 전가) 사용
		// 예외가 발생한 곳에서 처리하지 않고 예외를 던져서 다른 곳에서 처리하도록 함
		// 호출된 곳에서 처리하도록 예외를 던짐
		System.out.println("--- main() 시작 ---");
		int num1 = 100;
		int num2 = 50;
		int result = 0;

		System.out.println(">> 연산처리 시작");
		num2 = 0;
		try {
			result = div(num1, num2);
		} catch(ArithmeticException e) {
			//예외발생안함 : div()에서 예외를 잡아서 처리를 했기 때문에
			//이 문장은 실행될 수 없음(div메소드에서 예외처리하는 동안)
			System.out.println("main() div() 처리시 예외발생~~~");
		}
		System.out.println("div() 연산결과 : " + result);
		
		System.out.println("\n----------------------");
		result = 0;
		try {
			result = divThrows(num1, num2);
		} catch(ArithmeticException e) {
			//전달받은 예외를 잡아서 처리
			System.out.println("main() divThrows() 처리시 예외발생~~~");
		}
		System.out.println("divThrows()연산결과 : " + result);
		
		System.out.println(">> 연산처리 완료");
		System.out.println("--- main() 끝 ---");
	}
	
	static int div(int num1, int num2) {
		System.out.println("--> div() 시작 ");
		int result = -999;
		try {
			result = num1 / num2;
		} catch(ArithmeticException e) {
		//} catch(Exception e) {
			System.out.println("[div예외발생] " + e.getMessage());
		}
		System.out.println("--> div() 끝 ");
		return result;
	}
	
	static int divThrows(int num1, int num2) 
			throws ArithmeticException {
		System.out.println("--> divThrows() 시작 ");
		int result = -1;
		result = num1 / num2;
		
		System.out.println("--> divThrows() 끝 ");
		return result;
	}
}










