package com.mystudy.ex02_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// 2���� ������� ���� �����ϸ鼭 �ӵ� ��
		// ���1 : byte ���� ����
		// ���2 : ���۱�� ��� ����
		// BufferedInputStream, BufferedOutputStream

		File file = new File("file/��ȭ.jpg");
		
		//���Ϸ� ���� byte ���� �о� ó���� ��ü�� ������ ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//���ۻ���� ���� ���� ����
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//���� �а� ���� ��ü ����
			fis = new FileInputStream(file);
			fos = new FileOutputStream("file/��ȭ_copy.jpg");
			
			//���Ϻ���(byte ����)
			long startTime = System.currentTimeMillis(); //���� ����Ͻú��� ���� ����
			
			//(�ǽ�)����Ʈ ���� ���� �۾��� �����ϰ� �ð� Ȯ��
			int readValue = fis.read();
			while (readValue != -1) {
				fos.write(readValue);
				readValue = fis.read();
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("byte ����ð�: " 
					+ (endTime - startTime));
			fos.close();
			fis.close();
			
			//-----------------------------------
			//����(buffer) ��� ����
			startTime = System.currentTimeMillis();
			bis = new BufferedInputStream(new FileInputStream(file), 1000);
			bos = new BufferedOutputStream(
					new FileOutputStream("file/��ȭ_copy_bos.jpg"), 1000);
			
			//�а�, ����
			int readBis = bis.read();
			while (readBis != -1) {
				bos.write(readBis);
				readBis = bis.read();
			}
			
			endTime = System.currentTimeMillis();
			System.out.println("buffer ����ð�: " 
					+ (endTime - startTime));
			bos.close();
			bis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









