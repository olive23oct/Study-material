
public class Ex11_gt_lt {

	public static void main(String[] args) {
		// 비교연산자 : >, <, >= (크거나 같다), <= (작거나 같다)
		//           == (같다/동일하다), != (같지않다, 다르다)
		// 비교연산자의 결과 값 : true, false
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		//num1 > num2 : ??
		System.out.println(num1 > num2);
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		//num2 == num3 : ??
		System.out.println(num2 + " == " + num3 + " : " + (num2 == num3));
		
		System.out.println("----------------------");
		boolean power = true; //전원이 켜짐
		System.out.println("power: " + power);
		power = !power; //현재 저장된 값이 아닌 값
		System.out.println("power: " + power);
		power = !power; //현재 저장된 값이 아닌 값
		System.out.println("power: " + power);
		
		System.out.println("----------------");
		power = false;
		//power값이 true일때 if문 실행
		if (power) {
			System.out.println("power값이 true : 전원ON 상태입니다");
		}
		//power값이 false일때 if문 실행
		if (!power) {//!false
			System.out.println("power값이 false : 전원OFF 상태입니다");
		}
		
		
		
	}

}














