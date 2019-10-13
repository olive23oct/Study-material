package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

	public static void main(String[] args) {
		//JDBC를 이용한 DB 연동 프로그래밍 방법
		//0. JDBC 라이브러리를 개발환경에 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - SELECT : 조회(검색) 데이타 결과 값에 대한 처리
		//   - INSERT, UPDATE, DELETE : int값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//////////////////////////////////////////////

		//삭제처리 : 김유신2(2019004) 데이타 삭제(DELETE)
		//----------------------------------
		
		//0. JDBC 라이브러리를 개발환경에 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외] 드라이버 로딩 실패!!!");
			e.printStackTrace();
		}
		
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"mystudy", "mystudypw");
			System.out.println(">> DB 연결 성공");
		} catch (SQLException e) {
			System.out.println("[예외] DB 연결 실패!!!");
			e.printStackTrace();
		}
		
		//3. Statement 문 실행(SQL문 실행)
		Statement stmt = null;
		try {
			//3-1. Connection 객체로 부터 Statement 객체 생성
			stmt = conn.createStatement();
			
			//3-2. Statment문 실행(SQL 문)
			//삭제처리 : 김유신2(2019004) 데이타 삭제(DELETE) 
			String sql = "";
			sql += "DELETE FROM STUDENT ";
			sql += " WHERE NAME = '김유신2' ";
			
			System.out.println("sql : " + sql);
			
			//SELECT 문 : executeQuery()
			//INSERT, UPDATE, DELETE : executeUpdate()
			int result = stmt.executeUpdate(sql);
			
			//4. SQL 실행 결과에 대한 처리
			System.out.println("처리건수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//5. 클로징 처리에 의한 자원 반납(생성순서와 역순)
		try {
			stmt.close();
			System.out.println(">>Statement close 처리완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println(">>Connection close 처리완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}