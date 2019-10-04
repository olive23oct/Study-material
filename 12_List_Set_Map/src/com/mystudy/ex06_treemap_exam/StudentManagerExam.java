package com.mystudy.ex06_treemap_exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import com.mystudy.ex03_list_exam.StudentVO;

public class StudentManagerExam {

	public static void main(String[] args) {
		//1. 3명의 학생데이타(성명,국어,영어,수학)를 
		//   StudentVO 클래스를 이용해서 만들고(저장하고)
		//"홍길동", 100, 90, 81
		//"이순신", 95, 88, 92
		//"김유신", 90, 87, 77
		//---------------------
		//2. TreeMap 타입의 변수(map)에 저장하고
		//3. map에 있는 데이타를 사용해서 화면출력
		//출력예)
		//국어   영어  수학    총점     평균
		//--------------------------
		//100  90  81  270  90.33
		//...
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		Map<String, StudentVO> map = new TreeMap<>();
		map.put(stu1.getName(), stu1); //stu
		
	}	

}
