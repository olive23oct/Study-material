package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
		
		//(�ǽ�)���� : ID '2019001' ����� ����Ÿ ���� ó��
		//�̸�: ȫ�⵿, ����: 99, ����: 88, ����: 77
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB���� - Connection ��ü ���� <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement �� ����(SQL�� ����)
			//3-1. Connetion ��ü�� ���� Statement ��ü ����
			stmt = conn.createStatement();
			
			//3-2. Statement ��ü�� �̿��ؼ� SQL�� ����
			//(�ǽ�)���� : ID '2019001' ����� ����Ÿ ���� ó��
			//�̸�: ȫ�⵿, ����: 99, ����: 88, ����: 77
			String id = "2019001";
			String name = "ȫ�⵿";
			int kor = 99;
			int eng = 88;
			int math = 77;
			String sql = "";
			sql += "UPDATE STUDENT ";
			sql += "   SET NAME = '" + name + "' ";
			sql += "     , KOR = " + kor;
			sql += "     , ENG = " + eng;
			sql += "     , MATH = " + math;
			sql += " WHERE ID = '" + id + "' ";
			System.out.println("sql : " + sql);
			
			int result = stmt.executeUpdate(sql);
			
			//4. SQL ���� ����� ���� ó��
			//   - SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			//   - INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
			System.out.println(">> ó���Ǽ� : " + result);
			
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("[����] ����̹� �ε� ����!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) stmt.close();
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



