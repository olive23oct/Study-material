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
		//버퍼(buffer) 기능이 구현되어 있는 클래스
		//BufferedReader, BufferedWriter
		//File -> FileReader -> BufferedReader
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			//파일로 부터 읽기 위한 객체 생성 -----------------------
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);//파일에서 읽어 들일 객체 생성
			
			bufferedReader = new BufferedReader(fr); //버퍼사용+파일읽기 기능
			
			//파일에 쓰기 위한 객체 생성 --------------------
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			
			bufferedWriter = new BufferedWriter(fw); //버퍼사용+파일쓰기 기능
			
			//간단히 쓰기
			bufferedWriter.write("안녕하세요. 자바공부중입니다.\n");
			bufferedWriter.write("Hello Java!!!");
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("재미있나요????");
			bufferedWriter.newLine();
			bufferedWriter.write("-------------------");
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			//파일로 부터 읽고 쓰기(버퍼기능 이용해서)
			//파일에서 읽기(한번 읽기)
			String str = bufferedReader.readLine();
			System.out.println("readLine() 처음 읽은 값: " + str);
			
			//파일에 쓰기(한번 쓰기)
			bufferedWriter.write(str);
			bufferedWriter.newLine(); //줄바꿈 처리
			
			//남은 데이타 모두 읽고 쓰기
			str = bufferedReader.readLine();
			while (str != null) {
				bufferedWriter.write(str);
				bufferedWriter.newLine(); //줄바꿈 처리
				str = bufferedReader.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//사용객체 close 처리
			try {
				bufferedWriter.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}








