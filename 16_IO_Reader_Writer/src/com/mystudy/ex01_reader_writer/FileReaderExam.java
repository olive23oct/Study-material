package com.mystudy.ex01_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {

	public static void main(String[] args) {
		// 문자(Character) 단위 입력 처리
		// FileReader : 파일로 부터 문자단위로 데이타 읽기
		// 문자단위 : 1, A, $ - 1 byte문자, 
		//         대,한,핡 - 2byte문자(한글, 중국어, 일본어, 태국어, 아랍어...)
		
		//FileReader 로 읽어올 대상 지정(File)
		File file = new File("file/test_char.txt");
		
		//FileReader 객체 저장용 변수 선언
		FileReader fr = null;
		
		try {
			//1. 객체생성
			fr = new FileReader(file);
			
			//2. 객체 사용 읽기
			int readChar = fr.read();
			System.out.println("첫번째 문자 : " + readChar
					+ ", char: " + (char)readChar);
			
			readChar = fr.read();
			System.out.println("첫번째 문자 : " + readChar
					+ ", char: " + (char)readChar);
			
			readChar = fr.read();
			System.out.println("첫번째 문자 : " + readChar
					+ ", char: " + (char)readChar);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3. close 처리
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}






