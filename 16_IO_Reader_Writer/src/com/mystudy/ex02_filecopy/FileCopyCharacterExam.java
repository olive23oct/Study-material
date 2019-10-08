package com.mystudy.ex02_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		//(실습) FileReader, FileWriter 사용해서 파일 복사
		//원본파일 : file/test_char.txt
		//대상파일 : file/test_char_copy.txt
		//처리 : 원본파일을 읽어서 대상파일에 쓰기/저장(문자단위 처리)
		//////////////////////////////////////////
		
		//0. 사용할 파일 객체 생성
		File fileIn = new File("file/test_char.txt");
		File fileOut = new File("file/test_char_copy.txt");
		
		//1. 파일로 부터 읽어들이고, 쓸 객체를 저장할 변수 선언
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			//2. 읽기 위한 객체 생성, 쓰기 위한 객체 생성
			//fr = new FileReader(new File("file/test_char.txt"));
			fr = new FileReader(fileIn);
			fw = new FileWriter(fileOut);
			
			//3. 반복 작업(원본 파일의 끝을 만날때까지)
			//3-1. 읽기 객체로 원본파일에서 문자 하나를 읽고
			//3-2.쓰기 객체로 대상파일에 쓰기
			int readValue = fr.read();
			while (readValue != -1) {
				//System.out.println((char)readValue); //화면에 출력
				fw.write(readValue); //파일에 출력(버퍼에 저장)
				readValue = fr.read();
			}
			
			fw.flush(); //버퍼에 있는 데이타 출력
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. 사용한 객체 close
			try {
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("--- main() 끝 -------");
	}

}










