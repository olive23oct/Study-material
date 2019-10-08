package com.mystudy.ex01_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) {
		//FileWriter : 파일에 문자단위 쓰기
		File file = new File("file/test_char_out.txt");

		//변수선언
		FileWriter fw = null;
		try {
			//사용할 객체 생성
			fw = new FileWriter(file);
			
			//객체 사용
			fw.write('대'); //char -> int
			fw.write("한"); //String
			fw.write("민국");
			
			//buffer가 채워지지 않아도 강제로 Output 처리
			//기본 buffer 크기 1024 char 처리
			fw.flush();
			
			fw.write("Hello Java!!!");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//사용한 객체 close
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









