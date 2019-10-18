package com.mystudy.jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
public class StudentCRUD {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	StudentCRUD() {
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">>드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Student 테이블에 있는 1개의 데이타 화면에 표시
	//ID값을 전달하면 데이타를 가져와서 화면에 표시
	public void dispData(String id) {
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			//System.out.println(">>DB 연결 성공!!");
			
			//3. Statement 문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			//3-1. PreparedStatment 객체 생성 <- Connection 객체로 부터
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드변수)에 값 설정
			pstmt.setString(1, id);
			
			//3-3. SQL실행
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이타 결과 값에 대한 처리
			//   - INSERT, UPDATE, DELETE : int값(건수) 처리
			if (rs.next()) {
				String str = "";
				str += rs.getString(1) + "\t"; //id
				str += rs.getString(2) + "\t"; //name
				str += rs.getInt(3) + "\t"; //kor
				str += rs.getInt(4) + "\t"; //eng
				str += rs.getInt(5) + "\t"; //math
				str += rs.getInt(6) + "\t"; //tot
				str += rs.getDouble(7); //avg
				System.out.println(str);
			} else {
				System.out.println(id + "-데이타 없음");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납(생성순서와 역순으로)
			try {
				if (rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//end dispData()
	
	//하나의 데이타를 조회해서 VO에 저장해서 리턴
	public StudentVO selectId(String id) {
		StudentVO stu = null;
		//(할일)DB연결하고 SQL문 실행해서 결과값을 가져다가 stu 변수에 저장
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement 문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			//3-1. PreparedStatment 객체 생성 <- Connection 객체로 부터
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드변수) 위치에 값 설정
			pstmt.setString(1, id);
			
			//3-3. SQL문 실행
			rs = pstmt.executeQuery();
			
			//4. SQL 실행결과에 대한 처리
			if (rs.next()) {
				//StudentVO 타입의 stu 변수에 조회 데이타 저장
				stu = new StudentVO(id, 
						rs.getString("NAME"), 
						rs.getInt("KOR"), 
						rs.getInt("ENG"), 
						rs.getInt("MATH"),
						rs.getInt("TOT"),
						rs.getDouble("AVG"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리(자원 반납)
//			try {
//				if (rs != null) rs.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			try {
//				if (pstmt != null) pstmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			try {
//				if (conn != null) conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
			closeConnStmtRs(conn, pstmt, rs);
		}
		
		return stu;
	}
	
	//전체 데이타 조회 : Student 테이블의 전체 데이타를 조회(검색)해서
	//하나의 데이타를 StudentVO에 담고, VO를 ArrayList에 담아서 리턴
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> list = null;
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement문 실행(SQL문 실행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " ORDER BY ID ";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//4. SQL문 실행 결과 처리
			list = new ArrayList<StudentVO>();
			StudentVO vo = null;
			while (rs.next()) {
				//DB 데이타 하나를 StudentVO에 저장 + 리스트에 추가
				vo = new StudentVO(
						rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getInt("KOR"), 
						rs.getInt("ENG"), 
						rs.getInt("MATH"),
						rs.getInt("TOT"),
						rs.getDouble("AVG"));
				//리스트에 추가
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 사용객체 클로즈(close)
			closeConnStmtRs(conn, pstmt, rs);
		}
		
		return list;
	}
	
	private void closeConnStmtRs(Connection conn,
			PreparedStatement pstmt, ResultSet rs) {
		//5. 클로징 처리(자원 반납)
		try {
			if (rs != null) rs.close();
			System.out.println(">> ResultSet close() 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void closeConnStmt(Connection conn,
			PreparedStatement pstmt) {
		//5. 클로징 처리(자원 반납)
		try {
			if (pstmt != null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//DB에 데이타 입력(INSERT)
	public int insertData(String id, String name, 
			int kor, int eng, int math, int tot, double avg) {
		int cnt = 0;
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement 사용 SQL 실행
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += "VALUES (?, ?, ?, ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql); //sql 준비
			
			//? 위치 값 설정
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			pstmt.setInt(6, tot);
			pstmt.setDouble(7, avg);
			
			cnt = pstmt.executeUpdate(); //sql 실행
			
			//4. 결과처리
			System.out.println(">> 처리건수 : " + cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. close
			closeConnStmt(conn, pstmt);
		}
		
		return cnt;
	}
	
	//StudentVO 데이타를 담아서 입력 처리
	public int insertData(StudentVO stu) {
		int result = 0;
		//DB연결하고 전달받은 VO 값을 DB에 입력
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement 사용 SQL 실행
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += "VALUES (?, ?, ?, ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql); //sql 준비
			
			//? 위치 값 설정
			//String id = stu.getId();
			//String name = stu.getName();
			pstmt.setString(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setInt(3, stu.getKor());
			pstmt.setInt(4, stu.getEng());
			pstmt.setInt(5, stu.getMath());
			pstmt.setInt(6, stu.getTot());
			pstmt.setDouble(7, stu.getAvg());
			
			result = pstmt.executeUpdate(); //sql 실행
			
			//4. 결과처리
			System.out.println(">> 처리건수 : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. close
			closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//수정(UPDATE) : StudentVO 데이타를 받아서 수정(ID를 제외한 모든 데이타 수정)
	public int updateData(StudentVO stu) {
		int result = 0;
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			String sql = "";
			sql += "UPDATE STUDENT ";
			sql += "   SET NAME = ? ";
			sql += "     , KOR = ? ";
			sql += "     , ENG = ? ";
			sql += "     , MATH = ? ";
			sql += "     , TOT = ? ";
			sql += "     , AVG = ? ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			//? 값 설정
			int i = 0;
			pstmt.setString(++i, stu.getName()); //1
			pstmt.setInt(++i, stu.getKor());     //2
			pstmt.setInt(++i, stu.getEng());     //3
			pstmt.setInt(++i, stu.getMath());    //4
			pstmt.setInt(++i, stu.getTot());     //5
			pstmt.setDouble(++i, stu.getAvg());  //6
			pstmt.setString(++i, stu.getId());   //7
			
			//SQL실행
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//삭제(DELETE) : ID값을 받아서 삭제 처리
	public int deleteData(String id) {
		int result = 0;
		try {
			//DB연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//SQL 준비
			String sql = "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			//값 설정
			pstmt.setString(1, id);
			
			//SQL 실행
			result = pstmt.executeUpdate();
			
			//결과 처리 : 처리건수 리턴
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//사용객체 CLOSE
			closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//===============================================
	//------ INSERT 실습 -------------
	//(실습) StudentVO 데이타를 전달받아서 입력 처리(TOT, AVG 계산 후 입력)
	
	//------ UPDATE 실습 -------------
	//(실습) ID, NAME 값을 받아서 ID로 조회하고 NAME 수정
	//(실습) ID, KOR, ENG, MATH 값을 받아서 ID로 찾고
	//      KOR, ENG, MATH, TOT, AVG 값 수정(TOT, AVG 계산처리)
	//(실습) ID 받아서 TOT, AVG 수정 처리
	//(실습) 이름 받아서 TOT, AVG 수정 처리
	
	//------ DELETE 실습 -------------
	//(실습) StudentVO 데이타를 받아서 삭제(ID값으로)
	//(실습) 이름 받아서 삭제
	
	//------ SELECT 실습 -------------
	//(실습) 이름으로 조회 - 이름 중복 가능성 있음(List, Set, Map 사용)
	
	public String dispData(StudentVO vo) {
		StringBuilder sb = new StringBuilder();
		sb.append(vo.getId()).append("\t")
				.append(vo.getName()).append("\t")
				.append(vo.getKor()).append("\t")
				.append(vo.getEng()).append("\t")
				.append(vo.getMath()).append("\t")
				.append(vo.getTot()).append("\t")
				.append(vo.getAvg());
		System.out.println(sb.toString());
		return sb.toString();
	}
}//end class

























