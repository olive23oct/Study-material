package com.mystudy.pm01_vo;

public class StudentManager {

	public static void main(String[] args) {
		StudentVO stu = new StudentVO("ȫ�浿", 100, 90, 81);
		stu.setKor(1111);
		System.out.println(stu);
		//stu.printData();
		//ȫ�浿      100     90    81   271    90.33
		
		StudentVO stu2 = new StudentVO("�̼���", 95, 88, 92);
		System.out.println(stu2);
		
		StudentVO stu3 = new StudentVO("������", 90, 87, 77);
		System.out.println(stu3);
		
		stu.printData();
		stu2.printData();
		stu3.printData();
		
		System.out.println("==============================");
		//�迭�� ��Ƽ� ó��
		StudentVO[] students = new StudentVO[3];
		students[0] = stu;
		students[1] = stu2;
		students[2] = stu3;
		
		System.out.println("==== �迭 ����Ÿ ���� ����");
		students[0].printData();
		students[1].printData();
		students[2].printData();
		
		System.out.println("-----------------");
		printData(students);
	}
	
	static void printData(StudentVO[] students) {
		//���� ���� �迭 ����Ÿ�� ȭ�鿡 ���
		for (StudentVO stu : students) {
			stu.printData();
		}
	}

}
















