
public class Ex14_question {

	public static void main(String[] args) {
		// 조건(삼항 Ternary Operator)
		// 조건 ? 실행문 : 실행문;
		// 조건 ? true일때 실행 문장 : false일때 실행문장;
		int num1 = 30;
		int num2 = 20;
		boolean big = true;
		big = num1 > num2;
		
		System.out.println("num1:"+ num1 + ", num2:" + num2);
		System.out.println("big(num1 > num2): " + big);

		String str = (num1 > num2) ? "num1이 크다" : "num1 크지 않다";
		System.out.println("num1 > num2 결과는? " + str);
	}

}


