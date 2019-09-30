
public class Ex01_if {

	public static void main(String[] args) {
		/* 제어문-분기문(비교문) : if문
		if (조건문) {
			실행할 문장(조건이 참일때);
		}
		*/
		int num1 = 10;
		int num2 = 20;
		if (num1 < num2) {
			System.out.println("num1이 num2보다 작다.");
		}
		System.out.println(">> 비교작업 끝");
		
		System.out.println("---------------");
		boolean result = num1 < num2;
		if (result) {
			System.out.println("num1이 num2보다 작다.");
		}
		
		//----------------------------
		//점수 평가 결과 출력 : 수, 우, 미, 양, 가
		//100 ~ 90 : 수
		//89 ~ 80 : 우
		//79 ~ 70 : 미
		//69 ~ 60 : 양
		//59 ~ 0 : 가
		System.out.println("---- 성적처리 ----");
		int jumsu = 1000;
		
		System.out.println("점수 : " + jumsu);
		//if문 작성시 다양한 형태의 조건문 사용가능하지만
		//실제 코드 작성시에는 한가지 패턴으로 통일해서 작성(코드가독성)
		
		if (jumsu <= 100 && jumsu >= 90) {
		//if (100 >= jumsu && 90 <= jumsu) {
		//if (90 <= jumsu && 100 >= jumsu) {
			System.out.println("성적 : 수");
		}
		if (jumsu >= 80 && jumsu < 90) {
			System.out.println("성적 : 우");
		}
		if (70 <= jumsu && jumsu < 80 ) {
			System.out.println("성적 : 미");
		}
		if (60 <= jumsu && jumsu <= 69 ) {
			System.out.println("성적 : 양");
		}
		if (0 <= jumsu && jumsu <= 59) {
			System.out.println("성적 : 가");
		}
		System.out.println(">>성적처리 끝");
		
		
	}

}












