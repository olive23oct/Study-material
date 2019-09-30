
public class Ex07_long {

	public static void main(String[] args) {
		// 정수형 long : 8byte
		// 범위 : -9,223,372,036,854,775,808 
		//    ~ 9,223,372,036,854,775,807
		// long 타입값 명시적 표현 : 숫자 + L 또는 l(영문 대소문자 엘)
		
		//작은 데이타 타입 -> 큰 데이타 타입(자동형변환)
		long num1 = 200000000000L; //long타입 접미어 사용
		long num2 = 300000000000l;
		long sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("------------------------");
		
		byte numByte = 100;
		short numShort = 3000;
		int numInt = 30000000;
		long numLong = 50000000000000000L;
		
		numByte = (byte) numShort; //손실발생-쓰레기값 발생
		System.out.println("numByte : " + numByte);
		
		numLong = numInt; //long타입 <- int타입
		System.out.println("numLong : " + numLong);
		
		System.out.println("--- long 타입 최소/최대값 ---");
		System.out.println("long 최소값: " + Long.MIN_VALUE);
		System.out.println("long 최대값: " + Long.MAX_VALUE);
	}

}




