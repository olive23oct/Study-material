package com.mystudy.ex01_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {

	public static void main(String[] args) {
		// ����(Character) ���� �Է� ó��
		// FileReader : ���Ϸ� ���� ���ڴ����� ����Ÿ �б�
		// ���ڴ��� : 1, A, $ - 1 byte����, 
		//         ��,��,�� - 2byte����(�ѱ�, �߱���, �Ϻ���, �±���, �ƶ���...)
		
		//FileReader �� �о�� ��� ����(File)
		File file = new File("file/test_char.txt");
		
		//FileReader ��ü ����� ���� ����
		FileReader fr = null;
		
		try {
			//1. ��ü����
			fr = new FileReader(file);
			
			//2. ��ü ��� �б�
			int readChar = fr.read();
			System.out.println("ù��° ���� : " + readChar
					+ ", char: " + (char)readChar);
			
			readChar = fr.read();
			System.out.println("ù��° ���� : " + readChar
					+ ", char: " + (char)readChar);
			
			readChar = fr.read();
			System.out.println("ù��° ���� : " + readChar
					+ ", char: " + (char)readChar);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3. close ó��
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}






