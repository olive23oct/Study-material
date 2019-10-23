package com.mystudy.jdbc_impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO, Dao : Data Access Object / Database Access Object
//����Ÿ���̽�(DB)�� �����ؼ� CRUD�� �����ϴ� Ŭ����
public class MemberDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "mystudy";
	private static final String PASSWORD ="mystudypw";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//����̹� �ε� ó��
	//static �ʱ�ȭ ����
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> ����Ŭ JDBC ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] ����̹� �ε� ����!!!");
		}
	}
	
	/*
	//SELECT : ���̺� ��ü ����Ÿ ��ȸ - selectAll : ArrayList<MemberVO>
	//SELECT : �ϳ��� ����Ÿ ��ȸ(ID) - selectOne : MemberVO
	//SELECT : �ϳ��� ����Ÿ ��ȸ(VO) - selectOne : MemberVO
	//INSERT : VO ��ü�� �޾Ƽ� �Է� - insertOne : int
	//UPDATE : VO ��ü�� �޾Ƽ� ���� - updateOne : int
	//DELETE : VO ��ü�� �޾Ƽ� ���� - deleteOne : int
	//DELETE : Ű��(ID) �޾Ƽ� ���� - deleteOne : int
	
	//�α���ó�� : ID, PASSWORD ���� �޾Ƽ� ������ ����Ÿ�� ������ true,
	//         ������ false ����
	//  boolean checkIdPassword(id, password)
	*/

	//SELECT : ���̺� ��ü ����Ÿ ��ȸ - selectAll : ArrayList<MemberVO>
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> list = null;
		
		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" ORDER BY ID ");
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			//SQL�� ���� ����� ���� ó��
			list = new ArrayList<>();
			while (rs.next()) {
				/*
				MemberVO mvo = new MemberVO(
						rs.getString("id"), 
						rs.getString("name"), 
						rs.getString("password"), 
						rs.getString("phone"), 
						rs.getString("address") );
				list.add(mvo);
				*/
				
				list.add(new MemberVO(rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getString("PASSWORD"), 
						rs.getString("PHONE"), 
						rs.getString("address") ));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}
		
		return list;
	}
	
	//SELECT : �ϳ��� ����Ÿ ��ȸ(ID) - selectOne : MemberVO
	public MemberVO selectOne(String id) {
		MemberVO mvo = null;
		
		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//SQL�� ���� ����� ���� ó��
			if (rs.next()) {
				//MemberVO�� ����Ÿ ����
				mvo = new MemberVO(rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getString("PASSWORD"), 
						rs.getString("PHONE"), 
						rs.getString("address") );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		
		return mvo;
	}
	
	//SELECT : �ϳ��� ����Ÿ ��ȸ(VO) - selectOne : MemberVO
	public MemberVO selectOne(MemberVO member) {
		MemberVO mvo = null;
		
		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, member.getId());
			
			rs = pstmt.executeQuery();
			
			//SQL�� ���� ����� ���� ó��
			if (rs.next()) {
				//MemberVO�� ����Ÿ ����
				mvo = new MemberVO(rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getString("PASSWORD"), 
						rs.getString("PHONE"), 
						rs.getString("address") );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		
		return mvo;
	}
	
	//INSERT : VO ��ü�� �޾Ƽ� �Է� - insertOne : int
	public int insertOne(MemberVO member) {
		int result = 0;

		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
//			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
//			sb.append("  FROM MEMBER ");
//			sb.append(" WHERE ID = ? ");
//          SELECT ===> INSERT			
			sb.append("INSERT INTO MEMBER ");
			sb.append("       (ID, PASSWORD, NAME, PHONE, ADDRESS) ");
			sb.append("VALUES (?, ?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sb.toString());
			
//			pstmt.setString(1, member.getId());
//          SELECT ===> INSERT
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getAddress());
			
//			rs = pstmt.executeQuery(); //SELECT
//          SELECT ===> INSERT
			result = pstmt.executeUpdate(); //INSERT, UPDATE, DELETE

//          SELECT ===> INSERT : ResultSet ����(������)          			
//			//SQL�� ���� ����� ���� ó��
//			if (rs.next()) {
//				//MemberVO�� ����Ÿ ����
//				mvo = new MemberVO(rs.getString("ID"), 
//						rs.getString("NAME"), 
//						rs.getString("PASSWORD"), 
//						rs.getString("PHONE"), 
//						rs.getString("address") );
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
//          SELECT ===> INSERT
			JDBC_Close.closeConnStmt(conn, pstmt);
		}	
		
		return result;
	}
	
	//UPDATE : VO ��ü�� �޾Ƽ� ���� - updateOne : int
	public int updateOne(MemberVO member) {
		int result = 0;

		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE MEMBER ");
			sb.append("   SET PASSWORD = ? "); //1 : �ε�����ȣ
			sb.append("     , NAME = ? ");     //2
			sb.append("     , PHONE = ? ");    //3
			sb.append("     , ADDRESS = ? ");  //4
			sb.append(" WHERE ID = ? ");       //5
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, member.getPassword());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getAddress());
			pstmt.setString(5, member.getId());
			
			result = pstmt.executeUpdate(); //INSERT, UPDATE, DELETE

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}	
		
		return result;		
	}
	
	//(�ǽ�)DELETE : VO ��ü�� �޾Ƽ� ���� - deleteOne : int
	public int deleteOne(MemberVO member) {
		int result = 0;

		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("DELETE FROM MEMBER WHERE ID = ?");
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, member.getId());
			
			result = pstmt.executeUpdate(); //INSERT, UPDATE, DELETE

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}	
		
		return result;		
	}
	
	//(�ǽ�)DELETE : Ű��(ID) �޾Ƽ� ���� - deleteOne : int
	public int deleteOne(String id) {
		int result = 0;

		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("DELETE FROM MEMBER WHERE ID = ?");
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate(); //INSERT, UPDATE, DELETE

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}	
		
		return result;		
	}
	
	//�α���ó�� : ID, PASSWORD ���� �޾Ƽ� ������ ����Ÿ�� ������ true,
	//         ������ false ����
	//  boolean checkIdPassword(id, password)
	//-----------------
	//���1 : id, password ������ ����Ÿ�� ��ȸ ������ true, ������ false
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		
		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? AND PASSWORD = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			//SQL�� ���� ����� ���� ó��
			if (rs.next()) { //����Ÿ�� ������(1�� �̻��� ����Ÿ�� �ִ�)
				result = true;
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		
		return result;
	}
	
	//���2 : id, password ������ ����Ÿ�� ��ȸ ����Ȯ��(count)
	//      (if)������� 0���� ũ�� true, (else)0�̸� false 
	public boolean checkIdPassword2(String id, String password) {
		boolean result = false;
		
		try {
			//DB���� - Connection ��ü ����(DB�� �����)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL�� ����
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT COUNT(*) AS CNT ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? AND PASSWORD = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			//SQL�� ���� ����� ���� ó��
			if (rs.next()) { //count(*) : 0 ~ n ������ ����(�Ǽ� : ������ 0, ������ n)
				if (rs.getInt(1) > 0) {
					result = true;
				}
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		
		return result;
	}	
}


















