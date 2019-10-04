package com.mystudy.ex03_list_exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class StudentManager {

	public static void main(String[] args) {
		//1. 3���� �л�����Ÿ(����,����,����,����)�� 
		//   StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
		//"ȫ�浿", 100, 90, 81
		//"�̼���", 95, 88, 92
		//"������", 90, 87, 77
		//---------------------
		//2. ArrayList Ÿ���� ����(list)�� �����ϰ�
		//3. list�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		//����   ����  ����    ����     ���
		//--------------------------
		//100  90  81  270  90.33
		//...
		StudentVO stu1 = new StudentVO("ȫ�浿", 100, 90, 81);
		System.out.println(stu1.getName());
		stu1.printData();
		
		StudentVO stu2 = new StudentVO("�̼���", 95, 88, 92);
		StudentVO stu3 = new StudentVO("������", 90, 87, 77);
		stu2.printData();
		stu3.printData();
		System.out.println("----------------");
		
		ArrayList list = new ArrayList();
		list.add(stu1); //0 �� �ε���
		list.add(stu2); //1 �� �ε���
		list.add(stu3); //1 �� �ε���
		
//		for (int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
//			vo.p��rintData();
//		}
		printData(list);

	}
	
	//ArrayList Ÿ������ �޾Ƶ� �ǰ�, 
	//����Ÿ���� List �������̽� Ÿ������ �޾Ƶ� ��
	static void printData(List list) {
		//���� ���� �迭 ����Ÿ�� ȭ�鿡 ���
		for (int i = 0; i < list.size(); i++) {
			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
			vo.printData();
		}
	}
	
//	static void printData(LinkedList list) {
//		//���� ���� �迭 ����Ÿ�� ȭ�鿡 ���
//		for (int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
//			vo.printData();
//		}
//	}
//	
//	static void printData(Vector list) {
//		//���� ���� �迭 ����Ÿ�� ȭ�鿡 ���
//		for (int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO) list.get(i); //StudentVO <= (StudentVO)Object
//			vo.printData();
//		}
//	}

}
