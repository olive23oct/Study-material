package com.mystudy.am01;

public class Ex04_Wrapper_class {

	public static void main(String[] args) {
		// Wrapper class : �⺻ ����Ÿ Ÿ���� ���Ȯ�� �� Ŭ���� ��Ī
		// �⺻����Ÿ Ÿ�� : ��ü�ҹ���, char, int ...
		//   boolean, char, byte, short, int, long, float, double
		// Wrapper class : �⺻ ����Ÿ Ÿ���� ù���ڸ� �빮�ڷ� 
		//      ���� : char -> Character, int -> Integer
		//   Boolean, Character, Byte, Short, Integer, Long, Float, Double
		int num = 100;
		//num = "100";
		System.out.println("num : " + num);
		
		Integer intNum = new Integer(100);
		System.out.println("intNum : " + intNum);
		//intNum = "100";
		intNum = new Integer("100");
		System.out.println("intNum : " + intNum);
		
		intNum = 900; //Integer <- int : �ڵ�����ȯ
		num = intNum; //int <- Integer : �ڵ�����ȯ
		
		System.out.println("����int �ִ밪 :" + Integer.MAX_VALUE);
		System.out.println("����int �ּҰ� :" + Integer.MIN_VALUE);
		
		num = Integer.parseInt("999"); //int <- String
		intNum = Integer.valueOf("999"); //Integer <- String
		System.out.println("num : " + (num + 1));
		System.out.println("intNum : " + (intNum + 1));
		
		//------------------------------
		System.out.println("---- Boolean ----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true"); //true : true, TRUE, True, tRue
		System.out.println("bool : " + bool);
		
		bool = new Boolean("true1");
		System.out.println("bool : " + bool);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println("--- String -> Boolean ---");
		bool = Boolean.valueOf("true"); //true
		System.out.println("Boolean.valueOf(\"true\"): " + bool);
		bool = Boolean.valueOf("true1");
		System.out.println("Boolean.valueOf(\"true1\"): " + bool);
		bool = Boolean.valueOf("True");
		System.out.println("Boolean.valueOf(\"True\"): " + bool);
		bool = Boolean.valueOf("TRUE");
		System.out.println("Boolean.valueOf(\"TRUE\"): " + bool);
		
		//------------------------
		System.out.println("--- Float, Double ����---");
		Float f = 10.5f; //Float <- float
		f = new Float(12.5f);
		f = new Float("12.5f");
		
		String str = String.valueOf(f); //String <- Float
		System.out.println("str: " + str);
		
		f = Float.valueOf(str); //Float <- String
		System.out.println("f : " + f);
		
		//----------------
		Double d = 10.5D; //Double <- double
		d = new Double(12.5d);
		d = new Double("12.5D");
		
		str = String.valueOf(d); //String <- Double
		System.out.println("str: " + str);
		
		d = Double.valueOf(str); //Double <- String
		System.out.println("d : " + d);
	}

}









