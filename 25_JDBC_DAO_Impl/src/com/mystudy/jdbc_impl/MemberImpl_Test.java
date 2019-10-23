package com.mystudy.jdbc_impl;

import java.util.ArrayList;

public class MemberImpl_Test {

	public static void main(String[] args) {
		MemberImpl mi = new MemberImpl();
		ArrayList<MemberVO> list = mi.sellectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo);
		}
		if (mi.checkIdPassword("hong", "1234")) {
			System.out.println("hong/1234 있습니다");
		} else {
			System.out.println("hong/1234 있습니다");
		}
		
		System.out.println("--- 인터페이스 타입 사용 ---");
		Member member = new MemberImpl();
		list = member.sellectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo);
		}
		
		

	}

}










