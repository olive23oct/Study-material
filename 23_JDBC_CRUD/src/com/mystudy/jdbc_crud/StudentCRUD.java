package com.mystudy.jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//JDBC�� �̿��� DB ���� ���α׷��� ���
//0. JDBC ���̺귯���� ����ȯ�濡 ����(�����ο� ���)
//1. JDBC ����̹� �ε�
//2. DB���� - Connection ��ü ���� <- DriverManager
//3. Statement �� ����(SQL�� ����)
//4. SQL ���� ����� ���� ó��
//   - SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
//   - INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
//////////////////////////////////////////////
public class StudentCRUD {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	StudentCRUD() {
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">>����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Student ���̺� �ִ� 1���� ����Ÿ ȭ�鿡 ǥ��
	//ID���� �����ϸ� ����Ÿ�� �����ͼ� ȭ�鿡 ǥ��
	public void dispData(String id) {
		try {
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			//System.out.println(">>DB ���� ����!!");
			
			//3. Statement �� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			//3-1. PreparedStatment ��ü ���� <- Connection ��ü�� ����
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��)�� �� ����
			pstmt.setString(1, id);
			
			//3-3. SQL����
			rs = pstmt.executeQuery();
			
			//4. SQL ���� ����� ���� ó��
			//   - SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			//   - INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
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
				System.out.println(id + "-����Ÿ ����");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�(���������� ��������)
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
	
	//�ϳ��� ����Ÿ�� ��ȸ�ؼ� VO�� �����ؼ� ����
	public StudentVO selectId(String id) {
		StudentVO stu = null;
		//(����)DB�����ϰ� SQL�� �����ؼ� ������� �����ٰ� stu ������ ����
		try {
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement �� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " WHERE ID = ? ";
			//3-1. PreparedStatment ��ü ���� <- Connection ��ü�� ����
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��) ��ġ�� �� ����
			pstmt.setString(1, id);
			
			//3-3. SQL�� ����
			rs = pstmt.executeQuery();
			
			//4. SQL �������� ���� ó��
			if (rs.next()) {
				//StudentVO Ÿ���� stu ������ ��ȸ ����Ÿ ����
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
			//5. Ŭ��¡ ó��(�ڿ� �ݳ�)
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
	
	//��ü ����Ÿ ��ȸ : Student ���̺��� ��ü ����Ÿ�� ��ȸ(�˻�)�ؼ�
	//�ϳ��� ����Ÿ�� StudentVO�� ���, VO�� ArrayList�� ��Ƽ� ����
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> list = null;
		try {
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement�� ����(SQL�� ����)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " ORDER BY ID ";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//4. SQL�� ���� ��� ó��
			list = new ArrayList<StudentVO>();
			StudentVO vo = null;
			while (rs.next()) {
				//DB ����Ÿ �ϳ��� StudentVO�� ���� + ����Ʈ�� �߰�
				vo = new StudentVO(
						rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getInt("KOR"), 
						rs.getInt("ENG"), 
						rs.getInt("MATH"),
						rs.getInt("TOT"),
						rs.getDouble("AVG"));
				//����Ʈ�� �߰�
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. ��밴ü Ŭ����(close)
			closeConnStmtRs(conn, pstmt, rs);
		}
		
		return list;
	}
	
	private void closeConnStmtRs(Connection conn,
			PreparedStatement pstmt, ResultSet rs) {
		//5. Ŭ��¡ ó��(�ڿ� �ݳ�)
		try {
			if (rs != null) rs.close();
			System.out.println(">> ResultSet close() ����");
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
		//5. Ŭ��¡ ó��(�ڿ� �ݳ�)
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
	
	//DB�� ����Ÿ �Է�(INSERT)
	public int insertData(String id, String name, 
			int kor, int eng, int math, int tot, double avg) {
		int cnt = 0;
		try {
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement ��� SQL ����
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += "VALUES (?, ?, ?, ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql); //sql �غ�
			
			//? ��ġ �� ����
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			pstmt.setInt(6, tot);
			pstmt.setDouble(7, avg);
			
			cnt = pstmt.executeUpdate(); //sql ����
			
			//4. ���ó��
			System.out.println(">> ó���Ǽ� : " + cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. close
			closeConnStmt(conn, pstmt);
		}
		
		return cnt;
	}
	
	//StudentVO ����Ÿ�� ��Ƽ� �Է� ó��
	public int insertData(StudentVO stu) {
		int result = 0;
		//DB�����ϰ� ���޹��� VO ���� DB�� �Է�
		try {
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement ��� SQL ����
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += "VALUES (?, ?, ?, ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql); //sql �غ�
			
			//? ��ġ �� ����
			//String id = stu.getId();
			//String name = stu.getName();
			pstmt.setString(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setInt(3, stu.getKor());
			pstmt.setInt(4, stu.getEng());
			pstmt.setInt(5, stu.getMath());
			pstmt.setInt(6, stu.getTot());
			pstmt.setDouble(7, stu.getAvg());
			
			result = pstmt.executeUpdate(); //sql ����
			
			//4. ���ó��
			System.out.println(">> ó���Ǽ� : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. close
			closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//����(UPDATE) : StudentVO ����Ÿ�� �޾Ƽ� ����(ID�� ������ ��� ����Ÿ ����)
	public int updateData(StudentVO stu) {
		int result = 0;
		try {
			//2. DB���� - Connection ��ü ���� <- DriverManager
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
			
			//? �� ����
			int i = 0;
			pstmt.setString(++i, stu.getName()); //1
			pstmt.setInt(++i, stu.getKor());     //2
			pstmt.setInt(++i, stu.getEng());     //3
			pstmt.setInt(++i, stu.getMath());    //4
			pstmt.setInt(++i, stu.getTot());     //5
			pstmt.setDouble(++i, stu.getAvg());  //6
			pstmt.setString(++i, stu.getId());   //7
			
			//SQL����
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//����(DELETE) : ID���� �޾Ƽ� ���� ó��
	public int deleteData(String id) {
		int result = 0;
		try {
			//DB����
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//SQL �غ�
			String sql = "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			//�� ����
			pstmt.setString(1, id);
			
			//SQL ����
			result = pstmt.executeUpdate();
			
			//��� ó�� : ó���Ǽ� ����
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//��밴ü CLOSE
			closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	//===============================================
	//------ INSERT �ǽ� -------------
	//(�ǽ�) StudentVO ����Ÿ�� ���޹޾Ƽ� �Է� ó��(TOT, AVG ��� �� �Է�)
	
	//------ UPDATE �ǽ� -------------
	//(�ǽ�) ID, NAME ���� �޾Ƽ� ID�� ��ȸ�ϰ� NAME ����
	//(�ǽ�) ID, KOR, ENG, MATH ���� �޾Ƽ� ID�� ã��
	//      KOR, ENG, MATH, TOT, AVG �� ����(TOT, AVG ���ó��)
	//(�ǽ�) ID �޾Ƽ� TOT, AVG ���� ó��
	//(�ǽ�) �̸� �޾Ƽ� TOT, AVG ���� ó��
	
	//------ DELETE �ǽ� -------------
	//(�ǽ�) StudentVO ����Ÿ�� �޾Ƽ� ����(ID������)
	//(�ǽ�) �̸� �޾Ƽ� ����
	
	//------ SELECT �ǽ� -------------
	//(�ǽ�) �̸����� ��ȸ - �̸� �ߺ� ���ɼ� ����(List, Set, Map ���)
	
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

























