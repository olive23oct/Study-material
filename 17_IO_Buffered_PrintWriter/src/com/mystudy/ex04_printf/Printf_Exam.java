package com.mystudy.ex04_printf;

import java.util.Calendar;

public class Printf_Exam {

	public static void main(String[] args) {
		//printf() �޼ҵ�
		int a = 20;
		long b = 3000000000L;
		float c = 34.95f;
		double d = 234.234;
		char e = 'A';
		String f = "Hello~~~";
		boolean g = false;

		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF", today);
		System.out.println();
		
		System.out.println(">>" + a +" "+ b + " "
				+ c +" "+ d +" "+ e +" "+ f +" "+ g);
		/* [] ���� ����
		%[�ε���]$[-][ũ��]���Ĺ��� : %, ���Ĺ��� �ʼ�
		- �⺻�� ��������
		- �������� ��� ���̳ʽ� ��ȣ��� ��) %-10d
		*/
		System.out.printf("\\ %% %n \n");
		System.out.printf("%d %d %f %f \n", a,b,c,d);
		System.out.printf("%c %s %b %n", e,f,g);
		
		System.out.printf("%d %d %c %s \n", 100, 100, 'A', "Hello~");
		//[�ε���]$ ��뿹 --------------
		//[����] �ε��� �����ϸ� ����Ÿ ��Ī���� ���ܵ�
		System.out.printf("%1$d %1$d %c %s \n", 66, 'A', "Hello~");
		System.out.printf("%1$d %1$d %2$c %3$s \n", 66, 'A', "Hello~");
		
		System.out.println("--- �Ǽ��� ����Ÿ ǥ�� ---");
		System.out.printf("%f %1$a %1$e %1$g \n", 65.84123412342);
		System.out.printf("%1$10.3f \n", 65.84123412342);//��ü 10�ڸ� �Ҽ������� 3�ڸ�
		System.out.printf("%1$-10.3f \n", 65.84123412342);//(��������)��ü 10�ڸ� �Ҽ������� 3�ڸ�
		
		System.out.println("--- ��¥���� ---");
		System.out.printf("%1$tY/%1$tm/%1$td %1$tF \n", today);
		//System.out.printf("%1$tB %1$th \n", today);
		//System.out.printf("%1$ty %1$tM %1$tS %1$ta \n", today);
		System.out.printf("%1$tI:%1$tM:%1$tS %1$ta \n", today);
		
		System.out.println("--- ��(width) ���� ---");
		System.out.printf("%1$20f \n", 5678.1234567890);
		System.out.printf("%1$-20f \n", 5678.1234567890);
		System.out.printf("%1$-20.10f \n", 5678.1234567890);
		
		System.out.println("----------------");
		System.out.printf("%10s %10d %10d %10d \n", "ȫ�浿", 100, 90, 80);
		System.out.printf("%10s %10d %10d %10d \n", "��������", 100, 90, 80);
	}

}









