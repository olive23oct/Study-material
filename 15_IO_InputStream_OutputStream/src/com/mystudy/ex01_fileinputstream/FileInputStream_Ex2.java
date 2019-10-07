package com.mystudy.ex01_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");

		FileInputStream fis = null;
		
		
		try {
			//1. ����� ��ü ����
			fis = new FileInputStream(file);
			
			
			//2. ��ü ���
			/*
			int readValue = fis.read();
			while (readValue != -1) {
				System.out.print("int��: " + readValue);
				System.out.println(", char: " + (char)readValue);
				
				readValue = fis.read();
			}
			*/
			
			int readValue = -1;
			while ((readValue = fis.read()) != -1) {
				System.out.print("int��: " + readValue);
				System.out.println(", char: " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��ü close
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}








