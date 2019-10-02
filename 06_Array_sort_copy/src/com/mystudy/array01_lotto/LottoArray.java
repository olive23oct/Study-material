package com.mystudy.array01_lotto;

public class LottoArray {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		//1. intŸ���� ���� 45���� ������ �� �ִ� �迭Ÿ�� ����(balls)
		//2. �ʱ�ȭ : 1~45������ ����(��ȣ)�� �Է�
		//3. ���� ����
		//4. 6�� ��ȣ�� ����
		/////////////////////////////
		
		//1. intŸ���� ���� 45���� ������ �� �ִ� �迭Ÿ�� ����(balls)
		int[] balls = new int[45];
		
		//2. �ʱ�ȭ : 1~45������ ����(��ȣ)�� �Է�(���� �ֱ�)
		balls[0] = 1;
		balls[1] = 2;
		balls[2] = 3;
		
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		System.out.println("--- �ʱ�ȭ ��� Ȯ�� ---");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		System.out.println("---- Math.random() �̿� ---");
		//3. ����� ���� ����
		//ù��° ���ڿ� ������ ��ġ(0~44)�� �ִ� ���ڸ� ��ȯ
		//Math.random() : 0.00000 ~ 0.9999999999
		//(int)(Math.random() * 45) : 0~44������ ���� �����ϰ� ����
		int rNum = (int)(Math.random() * 45);
		System.out.println("��������(0~44) : " + rNum);
		
		System.out.println("������ 0: " + balls[0] + ", "
                + rNum + ": " + balls[rNum]);
		
		//balls[0] <-> balls[rNum]
		int temp = balls[0];
		balls[0] = balls[rNum];
		balls[rNum] = temp;
		
		System.out.println("������ 0: " + balls[0] + ", "
		                  + rNum + ": " + balls[rNum]);
		//����� ���� ����
		for (int i = 0; i < 10000; i++) {
			rNum = (int)(Math.random() * 45);
			temp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = temp;
		}
		
		System.out.println("--- ����� ���� ��� Ȯ�� ---");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		//4. 6�� ��ȣ�� ����(�տ��� 6��)
		System.out.print("�ζ� ��÷ ���(1��): ");
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
		
	}

}









