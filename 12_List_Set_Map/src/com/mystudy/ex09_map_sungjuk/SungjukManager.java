package com.mystudy.ex09_map_sungjuk;

import java.util.HashMap;

public class SungjukManager {
	//데이타 저장을 위한 변수 선언
	//private HashMap<String, Integer> sungjuk = new HashMap<>();
	private HashMap<String, Integer> sungjuk; //초기값 null
	private int tot; //초기값 0
	private double avg; //초기값 0.0D
	
	public SungjukManager() {
		sungjuk = new HashMap<>();
		//inputSampleData();
	}

	private void inputSampleData() {
		sungjuk.put("홍길동", 100);
		sungjuk.put("강감찬", 90);
		sungjuk.put("을지문덕", 95);
		sungjuk.put("계백", 87);
		sungjuk.put("김유신", 92);
		
		computeAvg();
	}
	public void insertData(String name, int jumsu) {
		sungjuk.put(name, jumsu);
		computeAvg();
	}
	public void updateData(String name, int jumsu) {
		//수정 : 있는지 확인하고 있으면 수정, 없으면 패스(메시지전달)
		if (sungjuk.containsKey(name)) {
			sungjuk.put(name, jumsu);
			computeAvg();
		} else {
			System.out.println(">>> " + name + "이 없습니다. 이름 확인");
		}
		
	}
	public void deleteData(String name) {
		//삭제 : 있는지 확인하고 있으면 삭제, 없으면 패스(메시지전달)
		sungjuk.remove(name);
		computeAvg();
	}
	public int selectData(String name) {
		return sungjuk.get(name);
	}
	
	public HashMap<String, Integer> getSungjuk() {
		return sungjuk;
	}

	public void setSungjuk(HashMap<String, Integer> sungjuk) {
		this.sungjuk = sungjuk;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	
	public void computeTot() {
		tot = 0;
//		for (String name : sungjuk.keySet()) {
//			tot += sungjuk.get(name);
//		}
		
		for (Integer value : sungjuk.values()) {
			tot += value;
		}
	}
	
	public void computeAvg() {
		computeTot();
		avg = tot * 100 / sungjuk.size() / 100.0;
	}
	
	public void printData() {
		System.out.println("성명\t점수");
		System.out.println("----------------");
		displayData();
		System.out.println("=================");
		System.out.println("총점\t" + tot);
		System.out.println("평균\t" + avg);
	}
	
	private void displayData() {
		if (sungjuk.size() == 0) {
			System.out.println("데이타 없음");
			return;
		}
		for (String name : sungjuk.keySet()) {
			System.out.println(name + "\t" + sungjuk.get(name));
		}
	}
	
}










