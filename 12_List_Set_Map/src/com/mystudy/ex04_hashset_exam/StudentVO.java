package com.mystudy.ex04_hashset_exam;

//자바빈(JavaBean) 형태의 클래스로 작성
//VO(Value Object) : 값을 저장하기 위한 클래스(객체)
//DTO(Data Transfer Object) : 값을 저장해서 전달하기 위한 클래스(객체)
public class StudentVO {
	//필드 선언 ------------------
	//성명 - name : String
	//국어 - kor : int
	//영어 - eng : int
	//수학 - math : int
	//총점 - tot : int
	//평균 - avg : double
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//생성자 작성 ---------------------------------
	//생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	//    총점, 평균 계산 처리 computeTotAvg() 사용
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

	
	//setter, getter 작성 ------------------
	// 국어, 영어, 수학 점수가 변경되면 총점, 평균 재계산 처리
	// 국어, 영어, 수학점수는 0~100까지 값만 입력처리

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
			System.out.println("[예외발생] 점수가 범위(0~100) 벗어남");
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
			System.out.println("[예외발생] 점수가 범위(0~100) 벗어남");
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
			System.out.println("[예외발생] 점수가 범위(0~100) 벗어남");
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
	
	//computeTotAvg() 메소드 작성 : 과목합계, 평균계산 처리
	private void computeTotAvg() {
		this.tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		
	}

	//toString() 작성 ---------------------------
	@Override //메소드의 오버라이드(override)
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
	
	//화면에 데이타 출력 메소드(printData) 작성
	//성명,국어,영어,수학,총점,평균 값을 화면에 출력하는 메소드
	//(성명\t국어\t...)
	public void printData() {
		System.out.println(name + "\t" 
	                     + kor + "\t" + eng + "\t" + math + "\t"
	                     + tot + "\t" + avg );
	}
	
	
	
}







