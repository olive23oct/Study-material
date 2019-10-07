package com.mystudy.ex01_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//����Ʈ(byte) ���� ó��
//����Ÿ �Է�(�б�) : InputStream - �߻�Ŭ����
//FileInputStream : InputStream �� ��ӹ޾�(extends) ���� Ŭ����
//����(file)�� ���� ����Ÿ�� �Է�(Input, read �о�) ó���ϱ� ���� Ŭ����
public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		File file = new File("temp.txt");
		if (!file.exists()) {//������ ������
			try {
				file.createNewFile();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[���ܹ߻�]" + e.getMessage());
			}
		}
		
		
		//���Ϸ� ���� �б� ���� �۾��� ����
		//FileInputStream ��ü ����
		FileInputStream fis = null;
		try {
			//���޹��� ����(file)�� �̿��ؼ� ���Ͽ� �ִ� ����Ÿ�� �о ó��
			//1. ����� ��ü ����
			fis = new FileInputStream(file);
			
			//2. ��ü ���
			int readValue = fis.read();
			System.out.println("read() ��(int) : " + readValue);
			System.out.println("char����ȯ �� : " + (char)readValue);
			
			System.out.println("--- ��ü ����Ÿ �о���� ---");
			while (true) {
				//EOF�� ������(���̻� �������� ������) -1 ���� : EOF(End Of File)
				readValue = fis.read();
				if (readValue == -1) break; //������ ���̸� �б� ����
				System.out.print("read() ��(int) : " + readValue);
				System.out.println(" >> char : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��üȯ�� : ����� �ڿ� �ݳ�(���� close)
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}











