
public class Ex13_while_ex {

	public static void main(String[] args) {
		// while�� ����ؼ� ó��
		//����1 : 1~10������ ���� ���ϰ� ���
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; //sum += i;
		}
		System.out.println("1~10�հ�: " + sum);
			
		
		
		//����2 -------------------
		//*
		//**
		//***
		//****
		//*****
		System.out.println("--------------");
		int starCnt = 0;
		
		starCnt = 1;
		while (starCnt <= 1) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println(); //�ٹٲ�
		
		starCnt = 1;
		while (starCnt <= 2) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println(); //�ٹٲ�
		
		starCnt = 1;
		while (starCnt <= 3) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println(); //�ٹٲ�

		System.out.println("==============");
		int line = 1;
		while (line <= 5) {
			starCnt = 1;
			while (starCnt <= line) {
				System.out.print("*");
				starCnt++;
			}
			System.out.println(); //�ٹٲ�
			line++;
		}
	}

}




