package com.mystudy.ex01_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//파일을 읽기 위한 객체 생성(File 타입의 객체 입력받음)
			fis = new FileInputStream(file);
			
			//read(byte[] b) : byte[] 배열크기만큼 읽어 b변수에 저장
			byte[] bytes = new byte[10];
			
			int byteCnt = 0;
			/*
			byteCnt = fis.read(bytes);
			System.out.println("읽어온 갯수 : " + byteCnt);
			System.out.println("읽어온 값 : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("int값 : " + bytes[i]
						+ ", char: " + (char)bytes[i]);
			}
			*/
			
			//파일 내용이 끝날 때까지 반복 처리~~~
			while (true) {
				byteCnt = fis.read(bytes);
				if (byteCnt == -1) break;
				
				System.out.println("읽어온 갯수 : " + byteCnt);
				System.out.println("읽어온 값 : " + Arrays.toString(bytes));
				for (int i = 0; i < byteCnt; i++) {
					System.out.println("int값 : " + bytes[i]
							+ ", char: " + (char)bytes[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}












