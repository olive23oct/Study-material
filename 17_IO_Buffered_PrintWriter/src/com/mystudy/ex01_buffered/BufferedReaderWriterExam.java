package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {
	
	public static void main(String[] args) {
		//����(buffer) ����� �����Ǿ� �ִ� Ŭ����
		//BufferedReader, BufferedWriter
		//File -> FileReader -> BufferedReader
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			//���Ϸ� ���� �б� ���� ��ü ���� -----------------------
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);//���Ͽ��� �о� ���� ��ü ����
			
			bufferedReader = new BufferedReader(fr); //���ۻ��+�����б� ���
			
			//���Ͽ� ���� ���� ��ü ���� --------------------
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			
			bufferedWriter = new BufferedWriter(fw); //���ۻ��+���Ͼ��� ���
			
			//������ ����
			bufferedWriter.write("�ȳ��ϼ���. �ڹٰ������Դϴ�.\n");
			bufferedWriter.write("Hello Java!!!");
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("����ֳ���????");
			bufferedWriter.newLine();
			bufferedWriter.write("-------------------");
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			//���Ϸ� ���� �а� ����(���۱�� �̿��ؼ�)
			//���Ͽ��� �б�(�ѹ� �б�)
			String str = bufferedReader.readLine();
			System.out.println("readLine() ó�� ���� ��: " + str);
			
			//���Ͽ� ����(�ѹ� ����)
			bufferedWriter.write(str);
			bufferedWriter.newLine(); //�ٹٲ� ó��
			
			//���� ����Ÿ ��� �а� ����
			str = bufferedReader.readLine();
			while (str != null) {
				bufferedWriter.write(str);
				bufferedWriter.newLine(); //�ٹٲ� ó��
				str = bufferedReader.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//��밴ü close ó��
			try {
				bufferedWriter.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}








