package com.mystudy.dao_list;

import java.util.ArrayList;

public class MemberListCUD_Test {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("6666", "김유신1", "pw1111", "010-2222-1111", "서울"));
		list.add(new MemberVO("7777", "김유신2", "pw2222", "010-2222-2222", "서울"));
		list.add(new MemberVO("8888", "김유신3", "pw3333", "010-2222-3333", "서울"));
		
		int cnt = dao.insertListCommit(list);
		System.out.println("입력건수 : " + cnt);
	}

}
