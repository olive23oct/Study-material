package com.mystudy.jdbc_dao;

import java.util.ArrayList;

public class MemberDAO_Test {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.selectAll();
		for (MemberVO mvo : list) {
			System.out.println(mvo);
		}
		
		System.out.println("---- selectOne(id) ---");
		MemberVO mvo = dao.selectOne("hong");
		System.out.println(mvo);
		System.out.println(mvo.toString());

		System.out.println("---- selectOne(VO) ---");
		MemberVO member = new MemberVO("hong4", "", "", "");
		member = dao.selectOne("hong6");
		mvo = dao.selectOne(member);
		System.out.println(mvo);
		
		mvo = dao.selectOne(dao.selectOne("hong6"));
		System.out.println(mvo);
		
		System.out.println("---- insertOne(VO) ------");
		member = new MemberVO("1111", "������1", "pw1111", "010-1111-1111", "����");
		int cnt = dao.insertOne(member);
		System.out.println("�Է°Ǽ� : " + cnt);
		System.out.println(dao.selectOne(member));
		
		System.out.println("---- updateOne(VO) ------");
		member = new MemberVO("1111", "������1234", "pw1234", "010-1111-1234", "����1234");
		cnt = dao.updateOne(member);
		System.out.println("�����Ǽ� : " + cnt);
		System.out.println(dao.selectOne(member));
		
		System.out.println("---- deleteOne(VO) ------");
		cnt = dao.deleteOne(member);
		System.out.println("�����Ǽ� : " + cnt);
		System.out.println(member.getId() + "-����Ÿ ��ȸ ��� : "
				+ dao.selectOne(member));
		
		System.out.println("---- deleteOne(id) ------");
		dao.insertOne(member);
		System.out.println("���Է� ���: " + dao.selectOne(member));
		
		cnt = dao.deleteOne(member.getId());
		System.out.println(member.getId() + "�����Ǽ� : " + cnt);
		System.out.println(member.getId() + "-����Ÿ ��ȸ ��� : "
				+ dao.selectOne(member));
		
		//=================================
		System.out.println("---- checkIdPassword(id, password) -----");
		String id = "hong";
		String password = "1234";
		boolean loginOk =dao.checkIdPassword(id, password);
		if (loginOk) {
			System.out.println(id + "/" + password 
					+ " >> �α��� ���� " );
		} else {
			System.out.println(id + "/" + password 
					+ " >> �α��� ����!!!");
		}
		
		System.out.println("---- checkIdPassword2(id, password) -----");
		loginOk =dao.checkIdPassword(id, password);
		if (loginOk) {
			System.out.println(id + "/" + password 
					+ " >> �α��� ���� " );
		} else {
			System.out.println(id + "/" + password 
					+ " >> �α��� ����!!!");
		}
	}

}




















