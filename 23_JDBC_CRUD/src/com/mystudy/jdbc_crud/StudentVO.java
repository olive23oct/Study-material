package com.mystudy.jdbc_crud;
//VO, Vo, DTO, Dto
//DTO(Data Transfer Object) : 데이타를 저장하고 주고 받기 위한 용도
//VO(Value Object) : 데이타를 저장하기 위한 용도로 사용하는 Object(클래스)
public class StudentVO {
	private String id;
	private String name;
	private int kor;
	private int eng; 
	private int math; 
	private int tot;
	private double avg;
	
	//생성자(id,name,kor,eng,math) - computeTotAvg()
	public StudentVO(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}

	//생성자 (전체 필드)
	public StudentVO(String id, String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
		//computeTotAvg();
	}
	
	//coputeTotAvg() : void
	public void computeTotAvg() {
		tot = kor + eng + math;
		//avg = (tot * 100) / 3 / 100.0; // 90.66
		avg = Math.round(tot * 100 / 3.0) / 100.0; //90.67
	}

	//getter, setter - setter(kor,eng,math) : computeTotAvg()
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
		computeTotAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		computeTotAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		computeTotAvg();
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

	//toString(오버라이딩)
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot="
				+ tot + ", avg=" + avg + "]";
	}
}
