package com.mystudy.ex04_hashset_exam;

//�ڹٺ�(JavaBean) ������ Ŭ������ �ۼ�
//VO(Value Object) : ���� �����ϱ� ���� Ŭ����(��ü)
//DTO(Data Transfer Object) : ���� �����ؼ� �����ϱ� ���� Ŭ����(��ü)
public class StudentVO {
	//�ʵ� ���� ------------------
	//���� - name : String
	//���� - kor : int
	//���� - eng : int
	//���� - math : int
	//���� - tot : int
	//��� - avg : double
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//������ �ۼ� ---------------------------------
	//������ - ����, ����, ����, ���� ������ �Է¹޴� ������
	//    ����, ��� ��� ó�� computeTotAvg() ���
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		//this.kor = kor;
		//this.eng = eng;
		//this.math = math;
		this.setKor(kor);
		setEng(eng);
		setMath(math);
		computeTotAvg();
	}

	
	//setter, getter �ۼ� ------------------
	// ����, ����, ���� ������ ����Ǹ� ����, ��� ���� ó��
	// ����, ����, ���������� 0~100���� ���� �Է�ó��

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		} else {
			System.out.println("[���ܹ߻�] ������ ����(0~100) ���");
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			computeTotAvg();
		} else {
			System.out.println("[���ܹ߻�] ������ ����(0~100) ���");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			computeTotAvg();
		} else {
			System.out.println("[���ܹ߻�] ������ ����(0~100) ���");
		}
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	//computeTotAvg() �޼ҵ� �ۼ� : �����հ�, ��հ�� ó��
	private void computeTotAvg() {
		this.tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		
	}

	//toString() �ۼ� ---------------------------
	@Override //�޼ҵ��� �������̵�(override)
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
	
	//ȭ�鿡 ����Ÿ ��� �޼ҵ�(printData) �ۼ�
	//����,����,����,����,����,��� ���� ȭ�鿡 ����ϴ� �޼ҵ�
	//(����\t����\t...)
	public void printData() {
		System.out.println(name + "\t" 
	                     + kor + "\t" + eng + "\t" + math + "\t"
	                     + tot + "\t" + avg );
	}
	
	
	
}







