
//연산자 : 증감연산자
public class Ex10_plusplus {

	public static void main(String[] args) {
		// 증감연산자 : ++, --
		// 사용형태 : ++변수명, 변수명++, --변수명, 변수명--;
		// ++ : 값을 1 증가 시킴
		// -- : 값을 1 감소 시킴
		// ++num -> num = num + 1;
		int num1 = 100;
		num1 = num1 + 1; //101
		System.out.println("num1 = num1 + 1 : " + num1);
		
		num1 = 100;
		++num1; //num1 = num1 + 1;
		System.out.println("++num1 : " + num1);
		
		num1 = 100;
		num1++; //num1 = num1 + 1;
		System.out.println("num1++ : " + num1);

		//-------------
		System.out.println("--------------");
		int sum = 0;
		num1 = 100;
		sum = ++num1 + 1;
		System.out.println("num1 : " + num1);
		System.out.println("sum : " + sum);
		
		System.out.println("---");
		num1 = 100;
		sum = num1++   + 1;
//		sum = num1 + 1;
//		num1++;
		System.out.println("num1 : " + num1);
		System.out.println("sum : " + sum);
		
		System.out.println("---------------");
		num1 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("++num1 : " + ++num1);
		
		num1 = 100;
		System.out.println("num1 : " + num1);
		System.out.println("num1++ : " + num1++);
		System.out.println("num1 : " + num1);
		
		System.out.println("===================");
		num1 = 100;
		--num1; //99
		num1--; //98
		System.out.println("num1 : " + num1);
		
		System.out.println("==================");
		num1 = 100;
		int num2 = 200;
		//    101 + 199
		sum = ++num1 + --num2;
		System.out.println("sum : " + sum);
		
		System.out.println("---------");
		num1 = 100;
		num2 = 200;
		sum = 0;
		//    100    +   201 
		sum = num1++ + ++num2;
		System.out.println("sum : " + sum);
		
		System.out.println("-----");
		num1 = 100;
		num2 = 200;
		sum = 0;
		
		++num2; //201
		sum = num1 + num2; //100 + 201
		num1++; //101
		System.out.println("sum : " + sum);
		
	}

}




































