package com.mystudy.ex09_map_sungjuk;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSungjukExam {

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
		
		//1. HashMap<String, Integer> 타입의 변수 sungjuk을 선언
		Map<String, Integer> sungjuk = new TreeMap<>();
		
		//2. Map에 이름:점수 형태의 아래의 데이타를 입력
		//   "홍길동:100, 강감찬:90, 을지문덕:95, 계백:87, 김유신:92"
		sungjuk.put("홍길동", 100);
		sungjuk.put("강감찬", 90);
		sungjuk.put("을지문덕", 95);
		sungjuk.put("계백", 87);
		sungjuk.put("김유신", 92);
		
		System.out.println(sungjuk);
		
		//3. 입력된 데이타를 조회해서 점수의 총점을 tot에 저장
		//방법1 : key값으로 value 조회
		int tot = 0;
		for (String key : sungjuk.keySet()) {
			//Integer value = sungjuk.get(key);
			//tot += value;
			tot += sungjuk.get(key);
		}
		System.out.println("총점 : " + tot);
		
		//방법2 : value 값 전체를 추출해서 합계구하기
		tot = 0;
		for (Integer value : sungjuk.values()) {
			tot += value;
		}
		System.out.println("총점 : " + tot);
		
		//4. 총점(tot)의 값을 인원 수로 나눈 평균 값을 avg에 저장
		double avg = tot * 100 / sungjuk.size() / 100.0;
		System.out.println("평균 : " + avg);
		
		System.out.println("--------------------");
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
		System.out.println("성명\t점수");
		System.out.println("----------------");
		for (String name : sungjuk.keySet()) {
			System.out.println(name + "\t" + sungjuk.get(name));
		}
		System.out.println("=================");
		System.out.println("총점\t" + tot);
		System.out.println("평균\t" + avg);
		
		System.out.println("\n======= 한번에 처리 =======");
		tot = 0;
		avg = 0;
		System.out.println("성명\t점수");
		System.out.println("----------------");
		for (String name : sungjuk.keySet()) {
			Integer jumsu = sungjuk.get(name);
			System.out.println(name + "\t" + jumsu);
			tot += jumsu;
		}
		avg = (tot * 100) / sungjuk.size() / 100.0;
		System.out.println("=================");
		System.out.println("총점\t" + tot);
		System.out.println("평균\t" + avg);
		
	}

}

















