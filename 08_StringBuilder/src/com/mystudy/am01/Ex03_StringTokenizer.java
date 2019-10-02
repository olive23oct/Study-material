package com.mystudy.am01;

import java.util.StringTokenizer;
//import java.util.*;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		//String.split() vs StringTokenizer
		System.out.println("--- String.split() ---");
		String str = "���,��,������,,����";
		System.out.println("str: " + str);
		
		String[] strSplit = str.split(",");
		System.out.println("strSplit.length : " 
				+ strSplit.length);
		
		System.out.println("--- str.split(\",\") ��� ---");
		for (int i = 0; i < strSplit.length; i++) {
			//System.out.print(strSplit[i] + "-");
			System.out.println(i + ": -" + strSplit[i] + "-");
		}
		System.out.println();
		
		//������ for��(�ٸ� ��� : forEach��)
		//for (����ŸŸ��   ������  : ���հ�ü) {}
		System.out.println("--- ������ for������ ---");
		for (String str2 : strSplit) {
			System.out.println("-" + str2 + "-");
		}
		System.out.println("-----");
		
		int idx = 0;
		for (String str2 : strSplit) {
			System.out.println(idx + ": -" + str2 + "-");
			idx++;
		}
		System.out.println("====================");
		
		System.out.println("---- StringTokenizer ��� ---");
		System.out.println("str : " + str);
		//java.util.StringTokenizer strToken = new java.util.StringTokenizer(str, ",");
		StringTokenizer strToken = new StringTokenizer(str, ",");
		System.out.println("strToken.countTokens() : " 
				+ strToken.countTokens());
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
		}
		System.out.println("����� ��ū���� : " + strToken.countTokens());
		
		//-------------------------------
		System.out.println("--- for�� ��� ��ū�� ��ȸ ---");
		strToken = new StringTokenizer(str, ",");
		System.out.println("����� ��ū���� : " + strToken.countTokens());
		int tokenCnt = strToken.countTokens();
		for (int i = 0; i < tokenCnt; i++) {
			String token = strToken.nextToken();
			System.out.println((i+1) + ": -" + token + "-");
		}
		
		System.out.println("----- while�� ��� ----");
		//���νǽ� : ���� ����� ������ ���·� ���(while�� ���)
	}

}









