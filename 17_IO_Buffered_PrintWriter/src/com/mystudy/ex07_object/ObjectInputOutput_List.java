package com.mystudy.ex07_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutput_List {

	public static void main(String[] args) {
		// StudentVO ��ü���� ArrayList�� ��Ƽ� ���Ͽ� �����ϰ�
		// ���Ͽ��� �о���� ArrayList ��ü�� ��� ������ ȭ�鿡 ���
		File file = new File("file/object_io_list.txt");
		
		System.out.println(">>> ������ ����Ÿ");
		StudentVO stu1 = new StudentVO("19001", "ȫ�浿", 100, 90, 81);
		StudentVO stu2 = new StudentVO("19002", "������", 95, 90, 85);
		System.out.println("stu1: " + stu1);
		System.out.println("stu2: " + stu2);
		System.out.println("======================");
		
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		System.out.println("ArrayList<StudentVO> list : ");
		System.out.println(list);
		System.out.println("==============================");
		
		//[�ǽ�] ArrayList Ÿ���� ��ü list�� ���Ͽ� �����ϰ�
		//���Ͽ� ����� ����Ÿ�� �о�鿩 list�� ����� �л������� ȭ�� ���
		//ȭ����½� toString() ������� ���� �ʵ尪 �����ؼ� ȭ�� ���
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			//���Ͽ� ����, �б�
			System.out.println(">>> ���Ͽ� ����");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			
			//���Ͽ��� �б�
			System.out.println("==== ���Ͽ��� �б� =====");
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);	
			ArrayList<StudentVO> list2 
					= (ArrayList<StudentVO>) ois.readObject();
			System.out.println("list2 : " + list2);
			
			for (int i = 0; i < list2.size(); i++) {
				StudentVO vo = list2.get(i);
				System.out.print(vo.getId() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMath() + "\t");
				System.out.print(vo.getTot() + "\t");
				System.out.print(vo.getAvg());
				System.out.println();
			}
			System.out.println("------------");
			for (StudentVO vo : list2) {
				System.out.print(vo.getId() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMath() + "\t");
				System.out.print(vo.getTot() + "\t");
				System.out.print(vo.getAvg());
				System.out.println();
			}
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
















