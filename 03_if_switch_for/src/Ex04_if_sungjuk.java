
public class Ex04_if_sungjuk {

	public static void main(String[] args) {
		//����ó��
		//����(kor), ����(eng), ����(math) ����
		//����(tot) = ���� + ���� + ����
		//���(avg) = ���� / 3
		//--------------------
		//������� ������ ���� ���� �ο�
		//90 ~ 100 : A
		//80 ~ 89 : B
		//70 ~ 79 : C
		//60 ~ 69 : D
		//60 �̸�(0~59) : F ������ϼ���
		///////////////////////////////////
		/* ��� ����
		���� : 100
		���� : 90
		���� : 80
		----------
		�����հ� : 270
		������� : 90
		<�򰡰��>
		A ����
		***********************/
		int kor = 50;
		int eng = 50;
		int math = 50;
		
		//�������
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("----------");
		
		//�������ϱ�(���)
		int tot = kor + eng + math;
		System.out.println("�����հ� : " + tot);
		
		//��ձ��ϱ�(���)
//		System.out.println("tot * 100 : " + (tot * 100));
//		System.out.println("tot * 100 / 3 : " + (tot * 100 / 3));
		double avg = tot * 100 / 3 / 100.0;
		avg = Math.round(tot * 100 / 3.0) / 100.0; //Math.round() - �Ҽ������� ù�ڸ� �ݿø�
		System.out.println("������� : " + avg);
		
		//��տ� ���� ����ó��
		System.out.println("<�򰡰��>");
		String hakjum;
		if (avg >= 90) {
			System.out.println("A ����");
			hakjum = "A";
		} else if (avg >= 80) {//avg >= 80 && avg < 90
			System.out.println("B ����");
			hakjum = "B";
		} else if (avg >= 70) {
			System.out.println("C ����");
			hakjum = "C";
		} else if (avg >= 60) {
			System.out.println("D ����");
			hakjum = "D";
		} else {
			System.out.println("F ������ϼ���");
			hakjum = "F";
		}
		
		//================================
		System.out.println("=================");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("----------");
		System.out.println("�����հ� : " + tot);
		System.out.println("������� : " + avg);
		System.out.println("<�򰡰��>");
		
		//���ڿ� �񱳽ÿ��� == ������� ���� equals() �޼ҵ� ���
		if (hakjum.equals("F")) {
			System.out.println(hakjum + "���� ����� �ϼ���");
		} else {
			System.out.println(hakjum + "����");
		}
		
		//========================================
		System.out.println("=======================");
		int jumsu = 100; //0 ~ 100 ������ ��
		int testNum = jumsu / 10;
		System.out.println(testNum);
		switch (testNum) {
		case 10: case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		}
	}

}



















