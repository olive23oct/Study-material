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
			System.out.println("hong/1234 �ֽ��ϴ�");
		} else {
			System.out.println("hong/1234 �ֽ��ϴ�");
		}
		
		System.out.println("--- �������̽� Ÿ�� ��� ---");
		Member member = new MemberImpl();
		list = member.sellectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo);
		}
		
		

	}

}










