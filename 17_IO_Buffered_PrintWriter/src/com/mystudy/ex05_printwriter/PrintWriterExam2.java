package com.mystudy.ex05_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterExam2 {

	public static void main(String[] args) {
		// PrintWriter : byte �迭, ���ڰ迭 ��� ��� ����
		FileOutputStream fos = null; //����Ʈ ó�� ���
		PrintWriter pw = null;

		try {
			fos = new FileOutputStream(new File("file/pw_out2.txt"));
			pw = new PrintWriter(fos);
			
			pw.write("�ȳ��ϼ���~~");
			pw.write("�ݰ����ϴ�.\n");
			
			pw.print("���� �ڹٰ�����~~~");
			pw.print("������ �ǰ��ϴ�~~~");
			
			pw.println("���� ���� ����ʹ�.");
			pw.println("---------------");
			
			pw.printf("%10s %10s %10s \n", "����", "1�ð�", "���Ҵ�");
			pw.printf("%-50s", "���ϸ� ������ 3�� ���޴�~~~ ^^");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
	}

}






