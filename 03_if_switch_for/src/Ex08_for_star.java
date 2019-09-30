
public class Ex08_for_star {

	public static void main(String[] args) {
		// *****
		System.out.println("*****");
		
		System.out.println("------------");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.println(); //줄바꿈(New Line)
		
		System.out.println("------------");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); //*****
		}
		System.out.println(); //줄바꿈
		
		System.out.println("------------");
		
		System.out.println("=====================");
		//문제 : 별 다섯개를 한줄에 찍기를 다섯줄 출력 
		//*****
		//*****
		//*****
		//*****
		//*****
		//-----------------------------
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); 
		}
		System.out.println(); 
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); 
		}
		System.out.println(); 
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); 
		}
		System.out.println(); 
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); 
		}
		System.out.println(); 
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); 
		}
		System.out.println(); 
		
		System.out.println("-----------------------");
		for (int line = 1; line <= 5; line++) {
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
		}
		
		System.out.println("-------------");
		for (int line = 1; line <= 5; line++) {
			for (int i = 1; i <= 5; i++) { //*****
				System.out.print("*"); 
			}
			System.out.println(); //줄바꿈
		}
		//------------------------------------------
		// 해석방법 2
		//*****
		//*****
		//*****
		//*****
		//*****
		System.out.println("===============");
		for (int line = 1; line <= 5; line++) {
			System.out.println("*****");
		}
		
		System.out.println("===============");
		for (int line = 1; line <= 5; line++) {
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("===============");
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= 5; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//----------------------
		//삼각형 그리기
		// *
		// **
		// ***
		// ****
		// *****
		//----------------------
		System.out.println("==================");
		
		//System.out.println("*");
		
		for (int star = 1; star <= 1; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 2; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 3; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 4; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 5; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("====================");
		int cnt = 1;
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= cnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}
		
		System.out.println("====================");
		// *     1라인 : * 1개
		// **    2라인 : * 2개
		// ***   3라인 : * 3개
		// ****  4라인 : * 4개
		// ***** 5라인 : * 5개
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}














