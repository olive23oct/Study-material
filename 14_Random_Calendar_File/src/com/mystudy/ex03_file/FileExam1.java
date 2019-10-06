package com.mystudy.ex03_file;

import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		// File Ŭ����
		String separator = File.separator; //���ϰ�� ������
		System.out.println("File.separator : " + File.separator);

		char separatorChar = File.separatorChar;
		System.out.println("File.separatorChar : " + File.separatorChar);
		
		String pathSeparator = File.pathSeparator; //���(path) ������
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		
		File[] listRoots = File.listRoots();
		for (int i = 0; i < listRoots.length; i++) {
			System.out.println(listRoots[i]);
		}
	}

}











