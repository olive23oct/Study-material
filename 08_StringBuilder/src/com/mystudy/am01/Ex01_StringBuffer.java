package com.mystudy.am01;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		//StringBuffer Ŭ����
		String str = new String("Hello Java!!!");
		System.out.println(str);

		//int num = 100;
		//����ŸŸ��      ������ = new ������;
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		System.out.println(sb.toString());
		String sbValue = sb.toString();
		System.out.println("sb.toString() : " + sbValue);
		
		System.out.println(sb.capacity());
		
		//"Hello Java!!! �ݰ����ϴ�" ��� ���ο� ����Ÿ ������
		str = str + " �ݰ����ϴ�"; 
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str.replace("a", "m"));
		System.out.println(str);
		
		//----------------------
		System.out.println("----- StringBuffer -----");
		sb.append(" �ݰ����ϴ�").append(".");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.reverse(); //���ڿ� ������
		System.out.println(sb);
		System.out.println(sb.reverse()); //����Ÿ ���� ó��
		System.out.println(sb);
		
		System.out.println("--- delete(), insert(), replace() ---");
		//Hello Java!!! �ݰ����ϴ�.
		System.out.println("sb.delete(0, 6): " + sb.delete(0, 6));
		System.out.println(sb);
		
		System.out.println("sb.insert(0, \"Hello \") : " 
				+ sb.insert(0, "Hello "));
		System.out.println("sb : " + sb);
		
		System.out.println("sb.replace(0, 5, \"Hi,\") : " 
				+ sb.replace(0, 5, "Hi,"));
		System.out.println("sb : " + sb);
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println("----------------------------");
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("-----");
		sb2.append("�ȳ��ϼ���").append(" �ݰ����ϴ�!!");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("--- trimToSize() ������ ---");
		sb2.trimToSize();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> append() ���� ��");
		sb2.append(" �ڹٰ�����~");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> setLength() ������ ---");
		sb2.setLength(5); //����Ÿ�� ũ�� ����(�۰� �����ϸ� deleteȿ��)
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}

}










