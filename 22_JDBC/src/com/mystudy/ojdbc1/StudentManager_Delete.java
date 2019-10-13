package com.mystudy.ojdbc1;

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

		//����ó�� : ������2(2019004) ����Ÿ ����(DELETE)
		//----------------------------------
		
		//0. JDBC ���̺귯���� ����ȯ�濡 ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("[����] ����̹� �ε� ����!!!");
			e.printStackTrace();
		}
		
		//2. DB���� - Connection ��ü ���� <- DriverManager
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"mystudy", "mystudypw");
			System.out.println(">> DB ���� ����");
		} catch (SQLException e) {
			System.out.println("[����] DB ���� ����!!!");
			e.printStackTrace();
		}
		
		//3. Statement �� ����(SQL�� ����)
		Statement stmt = null;
		try {
			//3-1. Connection ��ü�� ���� Statement ��ü ����
			stmt = conn.createStatement();
			
			//3-2. Statment�� ����(SQL ��)
			//����ó�� : ������2(2019004) ����Ÿ ����(DELETE) 
			String sql = "";
			sql += "DELETE FROM STUDENT ";
			sql += " WHERE NAME = '������2' ";
			
			System.out.println("sql : " + sql);
			
			//SELECT �� : executeQuery()
			//INSERT, UPDATE, DELETE : executeUpdate()
			int result = stmt.executeUpdate(sql);
			
			//4. SQL ���� ����� ���� ó��
			System.out.println("ó���Ǽ� : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�(���������� ����)
		try {
			stmt.close();
			System.out.println(">>Statement close ó���Ϸ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println(">>Connection close ó���Ϸ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}