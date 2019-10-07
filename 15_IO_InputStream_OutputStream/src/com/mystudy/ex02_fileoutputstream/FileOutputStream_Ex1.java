package com.mystudy.ex02_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Ex1 {
	
	public static void main(String[] args) {
		//FileOutputStream : byte 단위로 파일에 저장(출력, 쓰기)
		//- OutputStream 추상클래스를 상속받아(확장해서 extends) 만들어진 클래스
		
		//File에 쓰기 위해 FileOutputStream 타입의 객체 저장을 위한 변수 선언
		FileOutputStream fos = null;
		File file = new File("file/test_out_01.txt");
		
		try {
			//1. 객체 생성
			fos = new FileOutputStream(file); //파일내용 삭제후 작성
			//fos = new FileOutputStream(file, true); //추가하는 형태로 출력
			
			//2. 객체 사용
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write('~');
			
			//String getBytes() : 문자열을 byte[]로 만들어서 리턴
			byte[] bytes = "Hello Java!!".getBytes();
			for (int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}
			
			//write(바이트배열) : 바이트배열 값을 파일에 출력(쓰기)
			fos.write(bytes);
			
			//write(byte[], 시작위치, 크기)
			fos.write(bytes, 6, 6);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}














