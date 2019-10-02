package com.mystudy.pm01_vo;

public class StudentManager {

	public static void main(String[] args) {
		StudentVO stu = new StudentVO("홍길동", 100, 90, 81);
		stu.setKor(1111);
		System.out.println(stu);
		//stu.printData();
		//홍길동      100     90    81   271    90.33
		
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		System.out.println(stu2);
		
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		System.out.println(stu3);
		
		stu.printData();
		stu2.printData();
		stu3.printData();
		
		System.out.println("==============================");
		//배열에 담아서 처리
		StudentVO[] students = new StudentVO[3];
		students[0] = stu;
		students[1] = stu2;
		students[2] = stu3;
		
		System.out.println("==== 배열 데이타 꺼내 쓰기");
		students[0].printData();
		students[1].printData();
		students[2].printData();
		
		System.out.println("-----------------");
		printData(students);
	}
	
	static void printData(StudentVO[] students) {
		//전달 받은 배열 데이타를 화면에 출력
		for (StudentVO stu : students) {
			stu.printData();
		}
	}

}
















