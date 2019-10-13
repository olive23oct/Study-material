package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

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
		
		//(�ǽ�)���� : ȫ�淡 ����Ÿ ����
		//0. JDBC ���̺귯���� ����ȯ�濡 ����(�����ο� ���)
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
			String sql = "";
			String id = "2019006";
			String name = "ȫ�淡";
			sql += "DELETE FROM STUDENT WHERE NAME = '" + name + "' ";
			
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

