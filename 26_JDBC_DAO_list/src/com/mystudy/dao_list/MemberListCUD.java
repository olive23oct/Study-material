package com.mystudy.dao_list;

import java.util.ArrayList;

public interface MemberListCUD {
	String DRIVER = "oracle.jdbc.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "mystudy";
	String PASSWORD ="mystudypw";
	
	//����Ÿ ȭ�����
	void printDataAll();
	
	//ȸ������� �޾Ƽ� �ϰ� �Է� ó��
	int insertList(ArrayList<MemberVO> list);
	
	//ȸ������� �޾Ƽ� �ϰ� ���� ó��
	int updateList(ArrayList<MemberVO> list);
	
	//ȸ������� �޾Ƽ� �ϰ� ���� ó��
	int deleteList(ArrayList<MemberVO> list);
}

















