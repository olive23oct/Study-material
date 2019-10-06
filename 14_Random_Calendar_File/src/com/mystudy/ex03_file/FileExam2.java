package com.mystudy.ex03_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) {
		// ���ϸ� : temp.txt (���ϸ�.Ȯ����(��))
		File file1 = new File("temp.txt");
		
		//File ��ü������ ������ ���翩�ο� ������� ���� ����
		System.out.println(file1);
		
		//������ : root ���丮(����)�� ���� ��ü ��θ� ǥ���ؼ� ����
		//   c:\MyStudy\temp\aaa
		//����� : ������ġ�� ���� ã�ư����� �ϴ� ��ġ�� ǥ���ؼ� ����
		//   .\..\..\aaa\a1
		
		//C:\temp\aaa\a1\temp.txt
		File file2 = new File("C:\\temp\\aaa\\a1\\temp.txt");

		//����� ���(. : ������ġ, .. : �������丮(����))
		File file3 = new File("file/temp.txt");
		
		System.out.println("---- File getAbsolutePath() ---");
		System.out.println("������ġ(file1) : " + file1.getAbsolutePath());
		System.out.println("������ġ(file2) : " + file2.getAbsolutePath());
		System.out.println("������ġ(file3) : " + file3.getAbsolutePath());
		
		System.out.println("---- File exists() -----");
		System.out.println("�ֳ�(file1) : " + file1.exists());
		System.out.println("�ֳ�(file2) : " + file2.exists());
		System.out.println("�ֳ�(file3) : " + file3.exists());
		
		//���� �Ӽ� ����
		System.out.println("---- File �Ӽ� ���� ------");
		System.out.println("file1.length() : " + file1.length());
		System.out.println("file1.canRead(): " + file1.canRead());
		System.out.println("file1.canWrite(): " + file1.canWrite());
		System.out.println("file1.canExecute(): " + file1.canExecute());
		
		System.out.println("---- File getPath() ----");
		System.out.println("file1.getPath() : " + file1.getPath());
		System.out.println("file2.getPath() : " + file2.getPath());
		System.out.println("file3.getPath() : " + file3.getPath());
		
		System.out.println("---- File getName() ---");
		System.out.println("file1.getName() : " + file1.getName()); //���ϸ�(Ȯ��������)
		System.out.println("file2.getName() : " + file2.getName());
		System.out.println("file3.getName() : " + file3.getName());
		
		System.out.println("---- isDirectory(), isFile() ---");
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		System.out.println("file1.isFile() : " + file1.isFile());
		
		//���ϻ���, ���� ����
		File file4 = new File("file/temp4.txt");
		try {
			file4.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		file4.delete();
		
	}

}








