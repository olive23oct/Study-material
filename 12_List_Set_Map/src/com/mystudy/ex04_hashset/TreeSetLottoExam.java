package com.mystudy.ex04_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLottoExam {

	public static void main(String[] args) {
		// Set을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 Set에 저장
		// 로또번호 6개를 추첨하고, 작은 숫자부터 순서대로 화면 출력
		// Math.random() : (int)(Math.random() * 45 + 1)
		// 출력은 작은숫자부터 큰숫자 형태로
		// 예) 금주의 로또번호 : 5, 8, 10, 25, 33, 41
		Set lottoSet = new TreeSet();
		for (int i = 0; lottoSet.size() < 6; i++) {
			int lottoNo = (int)(Math.random() * 45 + 1); 
			System.out.println("로또번호 " + i + " : " + lottoNo);
			lottoSet.add(lottoNo);
		}
		System.out.println("로또번호 : " + lottoSet);
		
		System.out.println("-----------------");
		lottoSet.clear();
		for (; lottoSet.size() < 6; ) {
			int lottoNo = (int)(Math.random() * 45 + 1); 
			lottoSet.add(lottoNo);
		}
		System.out.println("로또번호 : " + lottoSet);
		
		System.out.println("-----------------");
		lottoSet.clear();
		while (lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("로또번호 : " + lottoSet);
		
		System.out.println("---- 정렬작업 진행 ------");
		//로또번호 발표 : 오름차순 정렬 후
		ArrayList list = new ArrayList(lottoSet);
		System.out.println("로또list : " + list);
		
		Collections.sort(list);
		System.out.println("금주의 로또번호 : " + list);
	}

}
