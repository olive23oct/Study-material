
public class Ex10_for_gugudan {

	public static void main(String[] args) {
		// ������ �� 2��
		//2*1=2
		//2*2=4
		//2*3=6
		//...
		//2*9=18
//		int num = 1;
//		int dan = 4;
//		
//		System.out.println(dan +"*"+ num +"=" + (dan*num));
//		num++;
//		
//		System.out.println(dan +"*"+ num +"=" + (dan*num));
//		num++;
//		
//		System.out.println(dan +"*"+ num +"=" + (dan*num));
//		num++;
		//-------------------------
		System.out.println("----------------------");
		//2�� ���
		System.out.println("-- 2�� ---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(2 +"*"+ i +"=" + (2*i));
		}
		System.out.println();
		
		System.out.println("-- 3�� ---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(3 +"*"+ i +"=" + (3*i));
		}
		System.out.println();
		
		System.out.println("-- 4�� ---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(4 +"*"+ i +"=" + (4*i));
		}
		System.out.println();
		
		System.out.println("=========================");
		System.out.println("������ 2~9�ܱ��� ���");
		
		for (int dan = 2; dan <= 9; dan++) {
			//System.out.println("-- 4�� ---");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan +"*"+ i +"=" + (dan * i));
			}
			System.out.println();
		}
	}

}
