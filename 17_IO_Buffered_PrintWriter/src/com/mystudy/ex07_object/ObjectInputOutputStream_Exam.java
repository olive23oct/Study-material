package com.mystudy.ex07_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream_Exam {

	public static void main(String[] args) {
		// ObjectInputStream, ObjectOutputStream
		// Object Ÿ���� ����Ÿ�� ����ؼ� �����(I/O)
		// Object Ÿ���� ����Ÿ�� ���Ͽ� �����ϰ� �о����
		// StudentVO Ÿ���� ����Ÿ ���
		
		File file = new File("file/object_io.txt");
		//���Ͽ� ���� ���� �뵵
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		//���Ͽ� �б� ���� �뵵
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		//���Ͽ� ������ ����Ÿ
		System.out.println("--- ������ ����Ÿ �غ� ---");
		StudentVO stu1 = new StudentVO("19001", "ȫ�浿", 100, 90, 81);
		StudentVO stu2 = new StudentVO("19002", "������", 95, 90, 85);
		System.out.println("stu1: " + stu1);
		System.out.println("stu2: " + stu2);
		System.out.println("======================");
		
		//���Ͽ� ����
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			System.out.println(">>> ���Ͽ� ����(ObjectOutputStream) ���");
			oos.writeObject(stu1); //StudentVO Ÿ���� ��ü�� ���Ͽ� ����
			oos.writeObject(stu2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//���Ϸ� ���� �б�
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			System.out.println("--- ���Ͽ��� �о ȭ����� ---");
//			Object obj = ois.readObject();
//			StudentVO stuIn1 = null;
//			if (obj instanceof StudentVO) {
//				stuIn1 = (StudentVO) obj;
//			}
			StudentVO stuIn1 = (StudentVO) ois.readObject();
			StudentVO stuIn2 = (StudentVO) ois.readObject();
			System.out.println("stuIn1 : " + stuIn1);
			System.out.println("stuIn2 : " + stuIn2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}












