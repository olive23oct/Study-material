package com.mystudy.ex06_treemap_exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import com.mystudy.ex03_list_exam.StudentVO;

public class StudentManagerExam {

	public static void main(String[] args) {
		//1. 3���� �л�����Ÿ(����,����,����,����)�� 
		//   StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
		//"ȫ�浿", 100, 90, 81
		//"�̼���", 95, 88, 92
		//"������", 90, 87, 77
		//---------------------
		//2. TreeMap Ÿ���� ����(map)�� �����ϰ�
		//3. map�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		//��¿�)
		//����   ����  ����    ����     ���
		//--------------------------
		//100  90  81  270  90.33
		//...
		StudentVO stu1 = new StudentVO("ȫ�浿", 100, 90, 81);
		StudentVO stu2 = new StudentVO("�̼���", 95, 88, 92);
		StudentVO stu3 = new StudentVO("������", 90, 87, 77);
		Map<String, StudentVO> map = new TreeMap<>();
		map.put(stu1.getName(), stu1); //stu
		
	}	

}
