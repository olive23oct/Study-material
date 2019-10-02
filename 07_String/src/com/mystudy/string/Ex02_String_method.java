package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		//charAt()
		System.out.println("--- charAt() ---");
		String str = "Java World";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println("str.charAt(0) : " + ch);
		
		//char[] ch2 = {str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3)}
		char[] ch2 = new char[4];
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch2));//[J, a, v, a]
		
		System.out.println("--- compareTo() -----");
		System.out.println("java vs java: " + "java".compareTo("java"));
		System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb"));
		System.out.println("bbb vs aaa : " + "bbb".compareTo("aaa"));
		System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa"));
		
		System.out.println("--- copyValueOf() ---");
		char[] ch3 = {'a', 'b', 'c', 'd'};
		System.out.println("ch3: " + Arrays.toString(ch3));
		String str3 = String.copyValueOf(ch3);
		System.out.println("String.copyValueOf(ch3) : " + str3);
		
		//���� ���ڿ� ���� Ȯ��
		System.out.println("--- startsWith() ---");
		System.out.println(str3.startsWith("abd"));
		
		System.out.println("--- indexOf() ---");
		String str4 = "Java";
		System.out.println(str4.indexOf("a"));
		
		System.out.println("--- isEmpty() ---");
		//str4 = "";
		System.out.println(str4.isEmpty());
		
		System.out.println("--- replace() ---");
		System.out.println("str4: " + str4);
		System.out.println(str4.replace('a', 'b'));
		System.out.println("str4: " + str4); //str4 ����Ÿ�� �״�� ����
		
		System.out.println("--- replaceAll() ---");
		str4 = "java java";
		System.out.println("str4 : " + str4);
		System.out.println("ja -> JA : " + str4.replaceAll("ja", "JA"));
		System.out.println("str4 : " + str4);
		
		System.out.println("ja -> JA : " + str4.replaceFirst("ja", "JA"));
		
		//------------------------------
		System.out.println("--- substring() ---");
		str = "Java World";
		System.out.println("str: " + str);
		System.out.println("str.substring(5) : " + str.substring(5)); //5���ε������� ������
		
		//beginIndex : ������ġ�� ����(����)
		//endIndex : end ��������(������)
		//str.substring(beginIndex, endIndex)
		System.out.println(str.substring(2, 4));
		System.out.println("str.length() : " + str.length());
		System.out.println(str.substring(0, str.length()));
		
		//�ڿ��� 2�� ���� �����ϰ�
		System.out.println(str.substring(0, str.length() - 2));
		
		//-----------------------------
		System.out.println("--- toCharArray() ---");
		char[] ch4 = str.toCharArray();
		System.out.println(ch4);
		System.out.println(ch4[0]);
		System.out.println(ch4[1]);
		
		System.out.println("--- toUpperCase(), toLowerCase(), trim() ---");
		str = "   Java World   ";
		System.out.println("str: -" + str + "-");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println("trim() : -" + str.trim() + "-");
		
		System.out.println("--- String.valueOf() ---");
		int num = 100;
		System.out.println(num + 1);
		System.out.println("" + num + 1);
		System.out.println(String.valueOf(num) + 1);
		String snum = String.valueOf(100); //"100"���ڿ� ����
		
	}

}









