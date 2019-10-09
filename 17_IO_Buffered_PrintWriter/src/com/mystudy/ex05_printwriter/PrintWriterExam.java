package com.mystudy.ex05_printwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExam {

	public static void main(String[] args) {
		//File -> FileWriter -> (BufferedWriter) -> PrintWriter 
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(new File("file/pw_out.txt"));
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			//pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("file/pw_out.txt"))));
			
			pw.write("안녕하세요~~");
			pw.write("반갑습니다.\n");
			
			pw.print("지금 자바공부중~~~");
			pw.print("졸리고 피곤하당~~~");
			
			pw.println("빨리 집에 가고싶다.");
			pw.println("---------------");
			
			pw.printf("%10s %10s %10s \n", "이제", "1시간", "남았다");
			
			System.out.printf("%10s %10s %10s \n", "이제", "1시간", "남았다");
			System.out.printf("%-50s", "내일만 나오면 3일 연휴다~~~ ^^");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}










