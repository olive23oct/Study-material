package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		//stu.name = "홍길동";
		stu.setName("홍길동2");
		//System.out.println(stu.name);
		System.out.println(stu.getName());
		
		stu.setKor(100);
		stu.setEng(90);
		stu.setMath(81);

		//int tot = stu.getKor() + stu.getEng() + stu.getMath();
		//stu.setTot(tot);
		
		//double avg = stu.getTot() * 100 / 3 / 100.0;
		//stu.setAvg(avg);
		System.out.println("점수입력후: " + stu);
		
		//stu.computeTotAvg();
		
		stu.setMath(71);
		//stu.computeTotAvg();
		
		//stu.setTot(300);
		//stu.setAvg(100);
		System.out.println("수학점수 수정후: " + stu);
		
		System.out.println("----Student(...) 생성자 사용 ---");
		Student stu2 = new Student("김유신", 100, 90, 80);
		System.out.println(stu2);

	}

}








