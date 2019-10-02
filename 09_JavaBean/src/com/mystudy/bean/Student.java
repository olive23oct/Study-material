package com.mystudy.bean;

/*
�ڹٺ�(JavaBean)
- �������(property)�� ���������ڴ� private���� ����
- �������(property) ���� get/set �޼ҵ� ����(���������� get�� ����)
- get/set �޼ҵ�� public ���� ����
- get �޼ҵ�� �Ķ���� ����, set �޼ҵ�� �ϳ� �̻��� �Ķ���� ����
- �������(property)�� boolean Ÿ���̸� get �޼ҵ� ��� is �޼ҵ� ��밡��
- �ܺο��� �������(property) ���ٽÿ��� get/set �޼ҵ带 ���� ����
*/
public class Student extends Object {
	private String name; //private �������� �ܺο��� ���ٺҰ�
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private boolean isOK;
	
	public Student() {
		//�θ�(����) Ŭ������ ������� ��ü(�ν��Ͻ�)
		//�������� �� ó���� �ۼ�
		super(); //�����ϸ� �����Ͻ� �ڵ� ���ԵǾ� ó����
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		//���簴ü�� ������ ȣ��(String ����Ÿ �ϳ� ����)
		//������ ����
		this(name); 
		
		//this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	

	public Student(String name, int kor, int eng, int math, int tot, double avg) {
		this(name, kor, eng, math); //������ ����
		this.tot = tot;
		this.avg = avg;
	}

	//�ܺο��� ����(���)�� �� �ֵ��� �޼ҵ� ����(public)
	//��Ī : set�޼ҵ�, setter, get property
	public void setName(String name) {
		this.name = name;
	}
	
	//��Ī : get�޼ҵ�, getter, set property
	public String getName() {
		return this.name;
	}
	
	//kor�� ���� setter/getter
	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		}
		System.out.println("[���� kor] 0~100 ������ �ƴ�");
	}
	
	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			System.out.println("[���� kor] 0~100 ������ �ƴ�");
			return;
		}
		this.eng = eng;
		computeTotAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			computeTotAvg();
		}
		System.out.println("[���� math] 0~100 ������ �ƴ�");
	}

	public int getTot() {
		return tot;
	}

	//��������� ���� �ʴ� �޼ҵ�� ������ ����(setter ��������)
//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	//���� Ŭ���� ���ο����� ����ϴ� �޼ҵ�
	private void computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = tot * 100 / 3 / 100.0;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}

	public boolean isOK() {
		return isOK;
	}

	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}
	
	//-----------------

}















