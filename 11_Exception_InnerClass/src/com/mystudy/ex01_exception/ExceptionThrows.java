package com.mystudy.ex01_exception;

public class ExceptionThrows {

	public static void main(String[] args) {
		// throws : ���ܸ� ���� ��(����, ����) ���
		// ���ܰ� �߻��� ������ ó������ �ʰ� ���ܸ� ������ �ٸ� ������ ó���ϵ��� ��
		// ȣ��� ������ ó���ϵ��� ���ܸ� ����
		System.out.println("--- main() ���� ---");
		int num1 = 100;
		int num2 = 50;
		int result = 0;

		System.out.println(">> ����ó�� ����");
		num2 = 0;
		try {
			result = div(num1, num2);
		} catch(ArithmeticException e) {
			//���ܹ߻����� : div()���� ���ܸ� ��Ƽ� ó���� �߱� ������
			//�� ������ ����� �� ����(div�޼ҵ忡�� ����ó���ϴ� ����)
			System.out.println("main() div() ó���� ���ܹ߻�~~~");
		}
		System.out.println("div() ������ : " + result);
		
		System.out.println("\n----------------------");
		result = 0;
		try {
			result = divThrows(num1, num2);
		} catch(ArithmeticException e) {
			//���޹��� ���ܸ� ��Ƽ� ó��
			System.out.println("main() divThrows() ó���� ���ܹ߻�~~~");
		}
		System.out.println("divThrows()������ : " + result);
		
		System.out.println(">> ����ó�� �Ϸ�");
		System.out.println("--- main() �� ---");
	}
	
	static int div(int num1, int num2) {
		System.out.println("--> div() ���� ");
		int result = -999;
		try {
			result = num1 / num2;
		} catch(ArithmeticException e) {
		//} catch(Exception e) {
			System.out.println("[div���ܹ߻�] " + e.getMessage());
		}
		System.out.println("--> div() �� ");
		return result;
	}
	
	static int divThrows(int num1, int num2) 
			throws ArithmeticException {
		System.out.println("--> divThrows() ���� ");
		int result = -1;
		result = num1 / num2;
		
		System.out.println("--> divThrows() �� ");
		return result;
	}
}










