package com.mystudy.dao_list;

import java.util.ArrayList;

public interface MemberListCUD {
	String DRIVER = "oracle.jdbc.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "mystudy";
	String PASSWORD ="mystudypw";
	
	//데이타 화면출력
	void printDataAll();
	
	//회원목록을 받아서 일괄 입력 처리
	int insertList(ArrayList<MemberVO> list);
	
	//회원목록을 받아서 일괄 수정 처리
	int updateList(ArrayList<MemberVO> list);
	
	//회원목록을 받아서 일괄 삭제 처리
	int deleteList(ArrayList<MemberVO> list);
}

















