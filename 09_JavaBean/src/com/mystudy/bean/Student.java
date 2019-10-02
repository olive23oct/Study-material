package com.mystudy.bean;

/*
자바빈(JavaBean)
- 멤버변수(property)의 접근제어자는 private으로 선언
- 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
- get/set 메소드는 public 으로 선언
- get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
- 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
- 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근
*/
public class Student extends Object {
	private String name; //private 선언으로 외부에서 접근불가
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private boolean isOK;
	
	public Student() {
		//부모(조상) 클래스로 만들어진 객체(인스턴스)
		//생성자의 맨 처음에 작성
		super(); //생략하면 컴파일시 자동 삽입되어 처리됨
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		//현재객체의 생성자 호출(String 데이타 하나 전달)
		//생성자 재사용
		this(name); 
		
		//this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	

	public Student(String name, int kor, int eng, int math, int tot, double avg) {
		this(name, kor, eng, math); //생성자 재사용
		this.tot = tot;
		this.avg = avg;
	}

	//외부에서 접근(사용)할 수 있도록 메소드 제공(public)
	//명칭 : set메소드, setter, get property
	public void setName(String name) {
		this.name = name;
	}
	
	//명칭 : get메소드, getter, set property
	public String getName() {
		return this.name;
	}
	
	//kor에 대한 setter/getter
	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		}
		System.out.println("[예외 kor] 0~100 범위가 아님");
	}
	
	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			System.out.println("[예외 kor] 0~100 범위가 아님");
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
		System.out.println("[예외 math] 0~100 범위가 아님");
	}

	public int getTot() {
		return tot;
	}

	//기능제공을 하지 않는 메소드는 만들지 않음(setter 제공안함)
//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	//현재 클래스 내부에서만 사용하는 메소드
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















