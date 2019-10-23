package com.mystudy.jdbc_impl;

import java.util.ArrayList;

public class MemberImpl implements Member {
	private MemberDAO dao;
	
	public MemberImpl() {
		dao = new MemberDAO();
	}
	
	@Override
	public ArrayList<MemberVO> sellectAll() {
		//MemberDAO dao = new MemberDAO();
		//ArrayList<MemberVO> list = dao.selectAll();
		//return list;
		
		return dao.selectAll();
	}

	@Override
	public MemberVO selectOne(String id) {
		//MemberDAO dao = new MemberDAO();
		//MemberVO member = dao.selectOne(id);
		//return member;
		return dao.selectOne(id);
	}

	@Override
	public MemberVO selectOne(MemberVO member) {
		return dao.selectOne(member);
	}

	@Override
	public ArrayList<MemberVO> selectName(String name) {
		return null;
	}

	@Override
	public int insertOne(MemberVO member) {
		return dao.insertOne(member);
	}

	@Override
	public int updateOne(MemberVO member) {
		return dao.updateOne(member);
	}

	@Override
	public int deleteOne(MemberVO member) {
		return dao.deleteOne(member);
	}

	@Override
	public int deleteOne(String id) {
		return dao.deleteOne(id);
	}
	
	public boolean checkIdPassword(String id, String password) {
		return dao.checkIdPassword(id, password);
	}

}














