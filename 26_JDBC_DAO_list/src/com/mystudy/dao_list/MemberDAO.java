package com.mystudy.dao_list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common_util.JDBC_Close;

public class MemberDAO implements MemberListCUD{
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public MemberDAO() {
		//����̹� �ε�
		driverLoading();
	}
	private void driverLoading() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] ����̹� �ε� ����!!!");
		}
	}
	
	//DB���� ��ü ���� �޼ҵ�
	private Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("[���ܹ߻�] DB ���� ����!!!");
		}
		return conn;
	}
	
	@Override
	public void printDataAll() {
		//(�ǽ�) Member ���̺� ����Ÿ�� ��� �����ͼ� ȭ�� ���
		
	}
	
	public void printDataList(ArrayList<MemberVO> list) {
		//(�ǽ�) Member ���̺��� list�� �ִ� ����Ÿ �����ͼ� ȭ�� ���
		
	}

	@Override
	public int insertList(ArrayList<MemberVO> list) {
		int result = 0;
		//DB����
		conn = getConnection();
		if (conn == null) {
			return -1;
		}
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO MEMBER ");
		sql.append("       (ID, PASSWORD, NAME, PHONE, ADDRESS) ");
		sql.append("VALUES (?, ?, ?, ?, ?) ");
		try {
			pstmt = conn.prepareStatement(sql.toString());
			
			//��Ͽ��� VO ����Ÿ �����ؼ� �Է�ó��
			for (MemberVO member : list) {
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setString(4, member.getPhone());
				pstmt.setString(5, member.getAddress());
				try {
					result += pstmt.executeUpdate();
				} catch(SQLException e) {
					System.out.println("[���ܹ߻�] �Է½���, ID: " + member.getId() 
							+ ", ���ܸ޽���: " + e.getMessage());
				}
			}
			
		} catch (SQLException e) {
			System.out.println("[���ܹ߻�] Statement ��ü ���� ����");
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//���� ������ ��� ����Ÿ �Է�(commit)
	//�ϳ��� ���� �߻��� ��� �Է� �۾� ���(rollback)
	//�⺻ Autocommit = true ����
	public int insertListCommit(ArrayList<MemberVO> list) {
		int result = 0;
		//DB����
		conn = getConnection();
		if (conn == null) {
			return -1;
		}
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO MEMBER ");
		sql.append("       (ID, PASSWORD, NAME, PHONE, ADDRESS) ");
		sql.append("VALUES (?, ?, ?, ?, ?) ");
		try {
			pstmt = conn.prepareStatement(sql.toString());
			System.out.println("Autocommit����Ȯ�� : " 
					+ conn.getAutoCommit());
			
			//Autocommit ���� false�� ����(Autocommit ����)
			conn.setAutoCommit(false);
			System.out.println("Autocommit����Ȯ��(����) : " 
					+ conn.getAutoCommit());
			
			//��Ͽ��� VO ����Ÿ �����ؼ� �Է�ó��
			for (MemberVO member : list) {
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setString(4, member.getPhone());
				pstmt.setString(5, member.getAddress());
				result += pstmt.executeUpdate();
			}
			//��ü ����Ÿ ó�� �Ϸ�
			conn.commit(); //����� SQL ��� DB�� ���� Ȯ��ó��(DB�� ���������� ����)
			conn.setAutoCommit(true);
			
		} catch (SQLException e) {
			try {
				//����� SQL ��� ��ü�� ���Ͽ� ��� ó��(DB �ݿ� ����)
				conn.rollback();
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			result = -111;
			System.out.println("[���ܹ߻�] �Է��� ���� �߻��Ͽ� ��� �۾� ���");
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		return result;		
	}
	

	@Override
	public int updateList(ArrayList<MemberVO> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteList(ArrayList<MemberVO> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}











