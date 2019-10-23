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
		//드라이버 로딩
		driverLoading();
	}
	private void driverLoading() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!");
		}
	}
	
	//DB연결 객체 생성 메소드
	private Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("[예외발생] DB 연결 실패!!!");
		}
		return conn;
	}
	
	@Override
	public void printDataAll() {
		//(실습) Member 테이블 데이타를 모두 가져와서 화면 출력
		
	}
	
	public void printDataList(ArrayList<MemberVO> list) {
		//(실습) Member 테이블에서 list에 있는 데이타 가져와서 화면 출력
		
	}

	@Override
	public int insertList(ArrayList<MemberVO> list) {
		int result = 0;
		//DB연결
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
			
			//목록에서 VO 데이타 추출해서 입력처리
			for (MemberVO member : list) {
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setString(4, member.getPhone());
				pstmt.setString(5, member.getAddress());
				try {
					result += pstmt.executeUpdate();
				} catch(SQLException e) {
					System.out.println("[예외발생] 입력실패, ID: " + member.getId() 
							+ ", 예외메시지: " + e.getMessage());
				}
			}
			
		} catch (SQLException e) {
			System.out.println("[예외발생] Statement 객체 생성 실패");
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//예외 없으면 모든 데이타 입력(commit)
	//하나라도 예외 발생시 모든 입력 작업 취소(rollback)
	//기본 Autocommit = true 상태
	public int insertListCommit(ArrayList<MemberVO> list) {
		int result = 0;
		//DB연결
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
			System.out.println("Autocommit상태확인 : " 
					+ conn.getAutoCommit());
			
			//Autocommit 값을 false로 설정(Autocommit 해제)
			conn.setAutoCommit(false);
			System.out.println("Autocommit상태확인(해제) : " 
					+ conn.getAutoCommit());
			
			//목록에서 VO 데이타 추출해서 입력처리
			for (MemberVO member : list) {
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setString(4, member.getPhone());
				pstmt.setString(5, member.getAddress());
				result += pstmt.executeUpdate();
			}
			//전체 데이타 처리 완료
			conn.commit(); //실행된 SQL 결과 DB에 최종 확정처리(DB에 물리적으로 저장)
			conn.setAutoCommit(true);
			
		} catch (SQLException e) {
			try {
				//실행된 SQL 결과 전체에 대하여 취소 처리(DB 반영 안함)
				conn.rollback();
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			result = -111;
			System.out.println("[예외발생] 입력중 예외 발생하여 모든 작업 취소");
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











