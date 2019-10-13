package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentManager_Update {

	public static void main(String[] args) {
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
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement �� ����(SQL�� ����)
			//3-1. SQL�� ������ ���� �غ�(PreparedStatement ��ü �����)
			String sql = "";
			sql += "UPDATE STUDENT ";
			sql += "   SET NAME = ?";
			sql += "     , KOR = ?";
			sql += "     , ENG = ?";
			sql += "     , MATH = ?";
			sql += " WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			//3-2. SQL ������ ? ��ġ�� �� ��Ī(����)
			String id = "2019111";
			String name = "�׽�Ʈ";
			int kor = 100;
			int eng = 88;
			int math = 66;
			
			int idx = 1;
			pstmt.setString(idx++, name);
			pstmt.setInt(idx++, kor);
			pstmt.setInt(idx++, eng);
			pstmt.setInt(idx++, math);
			pstmt.setString(idx++, id);
			
			//3-3. SQL�� ����
			int result = pstmt.executeUpdate();
			
			//4. SQL ���� ����� ���� ó��
			//   - SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			//   - INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
			System.out.println(">> ó���Ǽ� : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
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
	}

}
