package com.mystudy.ex07_object;

import java.io.Serializable;

//Serializable 인터페이스 : 데이타 전송을 위한 Object 만들때 
//Serializable 인터페이스를 구현해 주어야 전송 할 수 있는 데이타 타입이 됨
public class StudentVO implements Serializable {
	//transient : 데이타 전송시 값 전달 안함
	transient private String id;
	private String name;
	transient private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public StudentVO(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computTotAvg();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		this.kor = kor;
		computTotAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		computTotAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		computTotAvg();
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

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot="
				+ tot + ", avg=" + avg + "]";
	}
	
	public void computTotAvg() {
		tot = kor + eng + math;
		avg = (tot * 100) / 3 / 100.0;
	}
	
}











