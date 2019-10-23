package com.mystudy.jdbc_impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO, Dao : Data Access Object / Database Access Object
//데이타베이스(DB)와 연동해서 CRUD를 구현하는 클래스
public class MemberDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "mystudy";
	private static final String PASSWORD ="mystudypw";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버 로딩 처리
	//static 초기화 구문
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> 오라클 JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!");
		}
	}
	
	/*
	//SELECT : 테이블 전체 데이타 조회 - selectAll : ArrayList<MemberVO>
	//SELECT : 하나의 데이타 조회(ID) - selectOne : MemberVO
	//SELECT : 하나의 데이타 조회(VO) - selectOne : MemberVO
	//INSERT : VO 객체를 받아서 입력 - insertOne : int
	//UPDATE : VO 객체를 받아서 수정 - updateOne : int
	//DELETE : VO 객체를 받아서 삭제 - deleteOne : int
	//DELETE : 키값(ID) 받아서 삭제 - deleteOne : int
	
	//로그인처리 : ID, PASSWORD 값을 받아서 동일한 데이타가 있으면 true,
	//         없으면 false 리턴
	//  boolean checkIdPassword(id, password)
	*/

	//SELECT : 테이블 전체 데이타 조회 - selectAll : ArrayList<MemberVO>
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> list = null;
		
		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" ORDER BY ID ");
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			//SQL문 실행 결과에 대한 처리
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
	
	//SELECT : 하나의 데이타 조회(ID) - selectOne : MemberVO
	public MemberVO selectOne(String id) {
		MemberVO mvo = null;
		
		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//SQL문 실행 결과에 대한 처리
			if (rs.next()) {
				//MemberVO에 데이타 저장
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
	
	//SELECT : 하나의 데이타 조회(VO) - selectOne : MemberVO
	public MemberVO selectOne(MemberVO member) {
		MemberVO mvo = null;
		
		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD, NAME, PHONE, ADDRESS ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, member.getId());
			
			rs = pstmt.executeQuery();
			
			//SQL문 실행 결과에 대한 처리
			if (rs.next()) {
				//MemberVO에 데이타 저장
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
	
	//INSERT : VO 객체를 받아서 입력 - insertOne : int
	public int insertOne(MemberVO member) {
		int result = 0;

		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
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

//          SELECT ===> INSERT : ResultSet 없음(사용안함)          			
//			//SQL문 실행 결과에 대한 처리
//			if (rs.next()) {
//				//MemberVO에 데이타 저장
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
	
	//UPDATE : VO 객체를 받아서 수정 - updateOne : int
	public int updateOne(MemberVO member) {
		int result = 0;

		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE MEMBER ");
			sb.append("   SET PASSWORD = ? "); //1 : 인덱스번호
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
	
	//(실습)DELETE : VO 객체를 받아서 삭제 - deleteOne : int
	public int deleteOne(MemberVO member) {
		int result = 0;

		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
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
	
	//(실습)DELETE : 키값(ID) 받아서 삭제 - deleteOne : int
	public int deleteOne(String id) {
		int result = 0;

		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
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
	
	//로그인처리 : ID, PASSWORD 값을 받아서 동일한 데이타가 있으면 true,
	//         없으면 false 리턴
	//  boolean checkIdPassword(id, password)
	//-----------------
	//방법1 : id, password 값으로 데이타를 조회 있으면 true, 없으면 false
	public boolean checkIdPassword(String id, String password) {
		boolean result = false;
		
		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, PASSWORD ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? AND PASSWORD = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			//SQL문 실행 결과에 대한 처리
			if (rs.next()) { //데이타가 있으면(1건 이상의 데이타가 있다)
				result = true;
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		
		return result;
	}
	
	//방법2 : id, password 값으로 데이타를 조회 갯수확인(count)
	//      (if)결과값이 0보다 크면 true, (else)0이면 false 
	public boolean checkIdPassword2(String id, String password) {
		boolean result = false;
		
		try {
			//DB연결 - Connection 객체 생성(DB와 연결된)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//SQL문 실행
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT COUNT(*) AS CNT ");
			sb.append("  FROM MEMBER ");
			sb.append(" WHERE ID = ? AND PASSWORD = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			//SQL문 실행 결과에 대한 처리
			if (rs.next()) { //count(*) : 0 ~ n 무조건 있음(건수 : 없으면 0, 있으면 n)
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


















