package com.mystudy.jdbc_crud;

import java.util.ArrayList;

public class StudentCRUD_Test {

	public static void main(String[] args) {
		StudentCRUD crud = new StudentCRUD();
		crud.dispData("2019001");
		
		System.out.println("----------");
		String id = "2019004";
		StudentVO stu = crud.selectId(id);
		//System.out.println("이름 : " + stu.getName());
		
		//존재하지 않는 데이타(null) 처리
		if (stu == null) {
			System.out.println(id + " : 데이타 없음");
		} else {
			System.out.println(stu);
		}
		
		System.out.println("===== selectAll() 테스트 ====");
		ArrayList<StudentVO> list = crud.selectAll();
		for (StudentVO vo : list) {
			//System.out.println(vo); //리스트에 담겨져 있는 VO의 데이타 표시
			//crud.dispData(vo.getId()); //리스트에 담겨져 있는 데이타의 DB정보조회
			crud.dispData(vo);
		}
		
		System.out.println("------ 입력 테스트 -----");
		id = "2019004";
		int cnt = crud.insertData(id, "홍길동4", 100, 90, 81, 0, 0);
		System.out.println(">> 입력건수 : " + cnt);
		crud.dispData(id);
		
		System.out.println("---- 입력 테스트(VO) ----");
		crud.insertData(new StudentVO("2019005", "홍길동", 100, 90, 80, 0, 0));
		crud.dispData("2019005");
		
		crud.insertData(new StudentVO("2019006", "홍길동", 100, 90, 81));
		crud.dispData("2019006");
		
		System.out.println("===== 수정 테스트(VO) ====");
		stu = crud.selectId("2019005");
		stu.setName("홍오동");
		stu.setKor(95);
		stu.setEng(88);
		stu.setMath(77);
		crud.updateData(stu);
		crud.dispData(stu.getId());
		

	}

}





















