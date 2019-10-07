package com.mystudy.ex03_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// ���� ���� : ���� ���Ͽ��� �а� ��� ���Ͽ� ����
		//������ ���� ����(source file : AS-IS)
		File fileIn	= new File("src/com/mystudy/ex03_filecopy/FileCopy.java");
		//File fileIn	= new File("����Ʈ_InputStream.png");
		
		//���� ���� ��� ����(target file : TO-BE)
		File fileOut = new File("file/FilCopy.java_backup");
		//File fileOut = new File("file/����Ʈ_InputStream_backup.png");
		
		//���Ͽ��� �а� ���� ���� ��ü�� ������ ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//���Ͽ� �а� ���� ���� ��ü ����
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			//1byte �а�, 1byte ����
			int value = -1;
		
			while (true) {
				value = fis.read();
				if (value == -1) break; //EOF�� �ݺ� ����
				fos.write(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//����ڿ� close(�������� ��������)
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
/*
���� �а� ����� ���Ϸκ��� Input�ϰ� ������Ϸ� Output �ϴ� ���̴�.
*/










