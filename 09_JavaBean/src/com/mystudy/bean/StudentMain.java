package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		//stu.name = "ȫ�浿";
		stu.setName("ȫ�浿2");
		//System.out.println(stu.name);
		System.out.println(stu.getName());
		
		stu.setKor(100);
		stu.setEng(90);
		stu.setMath(81);

		//int tot = stu.getKor() + stu.getEng() + stu.getMath();
		//stu.setTot(tot);
		
		//double avg = stu.getTot() * 100 / 3 / 100.0;
		//stu.setAvg(avg);
		System.out.println("�����Է���: " + stu);
		
		//stu.computeTotAvg();
		
		stu.setMath(71);
		//stu.computeTotAvg();
		
		//stu.setTot(300);
		//stu.setAvg(100);
		System.out.println("�������� ������: " + stu);
		
		System.out.println("----Student(...) ������ ��� ---");
		Student stu2 = new Student("������", 100, 90, 80);
		System.out.println(stu2);

	}

}








