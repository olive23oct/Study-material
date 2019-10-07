package com.mystudy.ex02_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Ex1 {
	
	public static void main(String[] args) {
		//FileOutputStream : byte ������ ���Ͽ� ����(���, ����)
		//- OutputStream �߻�Ŭ������ ��ӹ޾�(Ȯ���ؼ� extends) ������� Ŭ����
		
		//File�� ���� ���� FileOutputStream Ÿ���� ��ü ������ ���� ���� ����
		FileOutputStream fos = null;
		File file = new File("file/test_out_01.txt");
		
		try {
			//1. ��ü ����
			fos = new FileOutputStream(file); //���ϳ��� ������ �ۼ�
			//fos = new FileOutputStream(file, true); //�߰��ϴ� ���·� ���
			
			//2. ��ü ���
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write('~');
			
			//String getBytes() : ���ڿ��� byte[]�� ���� ����
			byte[] bytes = "Hello Java!!".getBytes();
			for (int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}
			
			//write(����Ʈ�迭) : ����Ʈ�迭 ���� ���Ͽ� ���(����)
			fos.write(bytes);
			
			//write(byte[], ������ġ, ũ��)
			fos.write(bytes, 6, 6);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}














