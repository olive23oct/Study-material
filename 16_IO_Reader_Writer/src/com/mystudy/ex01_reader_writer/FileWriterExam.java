package com.mystudy.ex01_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) {
		//FileWriter : ���Ͽ� ���ڴ��� ����
		File file = new File("file/test_char_out.txt");

		//��������
		FileWriter fw = null;
		try {
			//����� ��ü ����
			fw = new FileWriter(file);
			
			//��ü ���
			fw.write('��'); //char -> int
			fw.write("��"); //String
			fw.write("�α�");
			
			//buffer�� ä������ �ʾƵ� ������ Output ó��
			//�⺻ buffer ũ�� 1024 char ó��
			fw.flush();
			
			fw.write("Hello Java!!!");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//����� ��ü close
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









