package com.mystudy.ex09_map_sungjuk;

public class SungjukManagerMain {

	public static void main(String[] args) {
		//1. HashMap<String, Integer> 타입의 변수 sungjuk을 선언하고
		//2. Map에 이름:점수 형태의 아래의 데이타를 입력
		//   "홍길동:100, 강감찬:90, 을지문덕:95, 계백:87, 김유신:92"
		//3. 입력된 데이타를 조회해서 점수의 총점을 tot에 저장
		//4. 총점(tot)의 값을 인원 수로 나눈 평균 값을 avg에 저장
		//5. 출력하시오.
		//   성명\t 점수
		//   -----------
		//   홍길동: 100
		//   강감찬: 90
		//   ...
		//   김유신: 92
		//   ==========
		//   총점: ???
		//   평균: ???
		////////////////////////////////////////////
		SungjukManager manager = new SungjukManager();
		manager.insertData("일지매", 50);
		
		//manager.inputSampleData();
		//manager.displayData();
		System.out.println("---------");
		manager.printData();
		
		System.out.println("------");
		System.out.println(manager.getAvg());
		
		//manager.updateData("김유산", 90);
		manager.printData();
		System.out.println("===================");
		SungjukManager manager2 = new SungjukManager();
		manager2.insertData("홍길동", 100);
		manager2.printData();
	}

}











