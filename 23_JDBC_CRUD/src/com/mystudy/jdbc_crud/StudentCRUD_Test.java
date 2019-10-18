package com.mystudy.jdbc_crud;

import java.util.ArrayList;

public class StudentCRUD_Test {

	public static void main(String[] args) {
		StudentCRUD crud = new StudentCRUD();
		crud.dispData("2019001");
		
		System.out.println("----------");
		String id = "2019004";
		StudentVO stu = crud.selectId(id);
		//System.out.println("�̸� : " + stu.getName());
		
		//�������� �ʴ� ����Ÿ(null) ó��
		if (stu == null) {
			System.out.println(id + " : ����Ÿ ����");
		} else {
			System.out.println(stu);
		}
		
		System.out.println("===== selectAll() �׽�Ʈ ====");
		ArrayList<StudentVO> list = crud.selectAll();
		for (StudentVO vo : list) {
			//System.out.println(vo); //����Ʈ�� ����� �ִ� VO�� ����Ÿ ǥ��
			//crud.dispData(vo.getId()); //����Ʈ�� ����� �ִ� ����Ÿ�� DB������ȸ
			crud.dispData(vo);
		}
		
		System.out.println("------ �Է� �׽�Ʈ -----");
		id = "2019004";
		int cnt = crud.insertData(id, "ȫ�浿4", 100, 90, 81, 0, 0);
		System.out.println(">> �Է°Ǽ� : " + cnt);
		crud.dispData(id);
		
		System.out.println("---- �Է� �׽�Ʈ(VO) ----");
		crud.insertData(new StudentVO("2019005", "ȫ�浿", 100, 90, 80, 0, 0));
		crud.dispData("2019005");
		
		crud.insertData(new StudentVO("2019006", "ȫ�浿", 100, 90, 81));
		crud.dispData("2019006");
		
		System.out.println("===== ���� �׽�Ʈ(VO) ====");
		stu = crud.selectId("2019005");
		stu.setName("ȫ����");
		stu.setKor(95);
		stu.setEng(88);
		stu.setMath(77);
		crud.updateData(stu);
		crud.dispData(stu.getId());
		

	}

}





















