
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
		
		System.out.println(); //�ٹٲ�(New Line)
		
		System.out.println("------------");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*"); //*****
		}
		System.out.println(); //�ٹٲ�
		
		System.out.println("------------");
		
		System.out.println("=====================");
		//���� : �� �ټ����� ���ٿ� ��⸦ �ټ��� ��� 
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
			System.out.println(); //�ٹٲ�
		}
		//------------------------------------------
		// �ؼ���� 2
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
		//�ﰢ�� �׸���
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
		// *     1���� : * 1��
		// **    2���� : * 2��
		// ***   3���� : * 3��
		// ****  4���� : * 4��
		// ***** 5���� : * 5��
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}














