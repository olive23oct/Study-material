package com.mystudy.ex03_list_exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class StudentManager {

	public static void main(String[] args) {
		//1. 3명의 학생데이타(성명,국어,영어,수학)를 
		//   StudentVO 클래스를 이용해서 만들고(저장하고)
		//"홍길동", 100, 90, 81
		//"이순신", 95, 88, 92
		//"김유신", 90, 87, 77
		//---------------------
		//2. ArrayList 타입의 변수(list)에 저장하고
		//3. list에 있는 데이타를 사용해서 화면출력
		//국어   영어  수학    총점     평균
		//--------------------------
		//100  90  81  270  90.33
		//...
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		System.out.println(stu1.getName());
		stu1.printData();
		
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		stu2.printData();
		stu3.printData();
		System.out.println("----------------");
		
		ArrayList list = new ArrayList();
		list.add(stu1); //0 번 인덱스
		list.add(stu2); //1 번 인덱스
		list.add(stu3); //1 번 인덱스
		
//		for (int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
//			vo.pㄴrintData();
//		}
		printData(list);

	}
	
	//ArrayList 타입으로 받아도 되고, 
	//수퍼타입인 List 인터페이스 타입으로 받아도 됨
	static void printData(List list) {
		//전달 받은 배열 데이타를 화면에 출력
		for (int i = 0; i < list.size(); i++) {
			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
			vo.printData();
		}
	}
	
//	static void printData(LinkedList list) {
//		//전달 받은 배열 데이타를 화면에 출력
//		for (int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
//			vo.printData();
//		}
//	}
//	
//	static void printData(Vector list) {
//		//전달 받은 배열 데이타를 화면에 출력
//		for (int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
//			vo.printData();
//		}
//	}

}
