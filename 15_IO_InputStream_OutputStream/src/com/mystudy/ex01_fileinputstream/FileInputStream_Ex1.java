package com.mystudy.ex01_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//바이트(byte) 단위 처리
//데이타 입력(읽기) : InputStream - 추상클래스
//FileInputStream : InputStream 을 상속받아(extends) 만든 클래스
//파일(file)로 부터 데이타를 입력(Input, read 읽어) 처리하기 위한 클래스
public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		File file = new File("temp.txt");
		if (!file.exists()) {//파일이 없으면
			try {
				file.createNewFile();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[예외발생]" + e.getMessage());
			}
		}
		
		
		//파일로 부터 읽기 위한 작업을 위해
		//FileInputStream 객체 생성
		FileInputStream fis = null;
		try {
			//전달받은 파일(file)을 이용해서 파일에 있는 데이타를 읽어서 처리
			//1. 사용할 객체 생성
			fis = new FileInputStream(file);
			
			//2. 객체 사용
			int readValue = fis.read();
			System.out.println("read() 값(int) : " + readValue);
			System.out.println("char형변환 후 : " + (char)readValue);
			
			System.out.println("--- 전체 데이타 읽어오기 ---");
			while (true) {
				//EOF를 만나면(더이상 읽을것이 없으면) -1 리턴 : EOF(End Of File)
				readValue = fis.read();
				if (readValue == -1) break; //파일의 끝이면 읽기 종료
				System.out.print("read() 값(int) : " + readValue);
				System.out.println(" >> char : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체환원 : 사용한 자원 반납(파일 close)
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}











