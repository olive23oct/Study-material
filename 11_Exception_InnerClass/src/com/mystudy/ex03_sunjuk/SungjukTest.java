package com.mystudy.ex03_sunjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ---");
		SungjukVO stu = new SungjukVO("ȫ�浿", 100, 90, 80, 0, 0);
		stu.setKor(999);
		System.out.println(stu.toString());
		
		System.out.println("--- setEng() ó�� ----");
		try {
			stu.setEng(999);
		} catch (JumsuOutOfValueException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage() 
					+ " : 0~100 ������ ������ �ٽ� �Է��ϼ���" );
		}
		System.out.println(stu.toString());
		
		System.out.println("--- main() �� ---");
	}

}
