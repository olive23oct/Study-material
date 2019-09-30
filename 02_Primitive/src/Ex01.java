
/** 문서작성용 주석
 * 
 * @author HB04-23
 *
 */
/* 주석문(여러줄 주석처리)
명명규칙(반드시 지킬 것)
 - 영문대소문자, 숫자, 특수문자(_, $) 사용
 - 대소문자 구분사용, 길이제한 없음
 - 예약어 사용 안됨
 - 숫자로 시작 안됨 (Ex01 허용, 01EX 안됨)
 
명명규칙(개발자들의 약속)
 - 클래스(인터페이스)명의 첫글자는 대문자로 시작 한다.
 - 복합단어인 경우 첫글자를 대문자로 시작한다.(HelloWorld)
 - 변수명, 메소드명의 시작은 소문자로 한다.
 - 상수명은 전체 대문자로 작성하고 복합어 구분은 언더바(_) 사용
   (PI, MAX_NUMBER)
*/
public class Ex01 {//클래스 선언부

	public static void main(String[] aaa) {
		System.out.println("계산결과: " + 1 + 2);
		System.out.println("계산결과: " + (1 + 2));
		System.out.println("계산결과: " + 1 * 2);
		System.out.println("계산결과: " + (1 - 2));
		
		System.out.println("\"안녕하세요~~\"");// "안녕하세요~~"
		System.out.println("홍길동님!");
		System.out.println("반갑습니다.");
		System.out.println("---------");
		System.out.println("홍길동님!\n반갑습니다.");//n: new line
		System.out.println("홍길동님!\t반갑습니다.");
		System.out.println("12345678901234567890");
		System.out.println("123456789\t홍길동"); //t: tab
		
		//---------------------------------
		//sysout 작성후 ctrl + space 
		System.out.println("==================");
		
		//변수의 선언
		//데이타타입 변수명;
		//데이타타입 변수명 = 초기값;
		String str1 = "홍길동님!";
		String str2 = "반갑습니다";
		System.out.println(str1 + str2);
		
	}
}









