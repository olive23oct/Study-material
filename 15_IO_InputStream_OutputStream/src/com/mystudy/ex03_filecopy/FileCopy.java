package com.mystudy.ex03_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// 파일 복사 : 원본 파일에서 읽고 대상 파일에 쓰기
		//복사할 원본 파일(source file : AS-IS)
		File fileIn	= new File("src/com/mystudy/ex03_filecopy/FileCopy.java");
		//File fileIn	= new File("바이트_InputStream.png");
		
		//쓰기 위한 대상 파일(target file : TO-BE)
		File fileOut = new File("file/FilCopy.java_backup");
		//File fileOut = new File("file/바이트_InputStream_backup.png");
		
		//파일에서 읽고 쓰기 위한 객체를 저장할 변수 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//파일에 읽고 쓰기 위한 객체 생성
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			//1byte 읽고, 1byte 쓰기
			int value = -1;
		
			while (true) {
				value = fis.read();
				if (value == -1) break; //EOF면 반복 종료
				fos.write(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//사용자원 close(생성순서 역순으로)
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
파일 읽고 쓰기는 파일로부터 Input하고 대상파일로 Output 하는 것이다.
*/










