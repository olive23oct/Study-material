package com.mystudy.string;

public class Ex01_String {

	public static void main(String[] args) {
		// String Ŭ���� : ���ڿ� ����, ó���ϱ� ���� Ŭ����
		//������� 2����
		//String str = "ȫ�浿"; //�⺻ ����Ÿ Ÿ�� ó�� ���
		//String str = new String("ȫ�浿"); //��ü ���� ���
		String str1 = "Java";
		String str2 = "World";
		String strObj1 = new String("Java");
		String strObj2 = new String("World");
		System.out.println("str1 : " + str1);
		System.out.println("strObj1 : " + strObj1);
		
		String str11 = "Java";
		String str22 = "World";
		
		//== : ��ü ��(��ü �ּҰ� ��)
		System.out.println("str1 == str11 : " + (str1 == str11));
		System.out.println("str1 : " + str1);
		System.out.println("str11 : " + str11);
		
		System.out.println("--- str1 vs ��ü���� strObj1 �� --");
		System.out.println("str1 == strObj1 : " + (str1 == strObj1));
		System.out.println("str1 : " + str1);
		System.out.println("strObj1 : " + strObj1);
		
		//equals() : �����ϰ� �ִ� ��(data) ��(���ڿ� ��)
		System.out.println("--- equals() �� ---");
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
		System.out.println("str11.equals(strObj1) : " + str11.equals(strObj1));
		System.out.println("str1.equals(str11) : " + str1.equals(str11));
		
		String str12 = "JAVA";
		System.out.println("str12.equals(strObj1) : " + str12.equals(strObj1));
		System.out.println("str12.equalsIgnoreCase(strObj1) : " + str12.equalsIgnoreCase(strObj1));
		
		//--------------------------
		System.out.println("-------------");
		String strObj21 = new String("Java");
		String strObj22 = new String("Java");
		System.out.println("strObj21 == strObj22 : " 
				+ (strObj21 == strObj22));
		System.out.println("strObj21.equals(strObj22) : " 
				+ (strObj21.equals(strObj22)));
		
		//=======================================
		System.out.println("===================");
		System.out.println("--- concat() ---");
		String a = "Hello ";
		String b = "Java ";
		String c = "World";
		System.out.println("a + b + c : " + (a + b + c)); 
		System.out.println("a.concat(b) : " + a.concat(b));
		
		//chainning ���(ü�̴ױ��)
		String result = a.concat(b).concat(c).concat("!!!");
		System.out.println("a.concat(b).concat(c).concat(\"!!!\") : " 
				+ result);
		
		System.out.println("a : " + a);
		System.out.println("a.toString() : " + a.toString());
		
		//-------------------
	}

}








