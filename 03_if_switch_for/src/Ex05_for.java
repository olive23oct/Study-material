
public class Ex05_for {

	public static void main(String[] args) {
		//제어문 - 반복문(for, while, do ~ while)
		//for (초기값 ; 실행(종결)조건 ; 증감설정) {}
		//실행(종결)조건 true일때 실행문 처리
		//for (; ;) {} //무한반복
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("----------");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*"); //5번 실행
		}
		
		System.out.println("----------");
		for (int i = 1; i <= 2; i++) {
			System.out.println("*"); 
		}
		
		System.out.println("----------");
		for (int i = 1; i <= 10; i += 2) {//1부터 10까지 2씩 증가하면서
			System.out.println(i); 
		}

		System.out.println("----------");
		//반복문 내의 실행문에서 반복인자 값을 변경하는 것은 자제(피해라) 
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); 
			i++; //반복인자 변경은 되도록 하지 말것
		}
		
		System.out.println("----------");
		for (int i = 1; i <= 5; i++) {//1부터 5까지 1씩 증가하면서
			System.out.println("*"); 
		}
		
		System.out.println("-------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("*****");
		}
		
		//===============================
		System.out.println("===================");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println("...");
		System.out.println(10);
		
		//1~1000 까지의 숫자를 출력하시오.
		System.out.println("---");
		int num = 1;
		for (int i = 1; i <= 1000; i++) {
			System.out.println(num++);
		}
		System.out.println("---");
		for (int i2 = 1; i2 <= 1000; i2++) {
			System.out.println("반복인자값 사용 : " + i2);
		}
		

	}

}






