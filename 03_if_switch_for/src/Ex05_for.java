
public class Ex05_for {

	public static void main(String[] args) {
		//��� - �ݺ���(for, while, do ~ while)
		//for (�ʱⰪ ; ����(����)���� ; ��������) {}
		//����(����)���� true�϶� ���๮ ó��
		//for (; ;) {} //���ѹݺ�
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("----------");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*"); //5�� ����
		}
		
		System.out.println("----------");
		for (int i = 1; i <= 2; i++) {
			System.out.println("*"); 
		}
		
		System.out.println("----------");
		for (int i = 1; i <= 10; i += 2) {//1���� 10���� 2�� �����ϸ鼭
			System.out.println(i); 
		}

		System.out.println("----------");
		//�ݺ��� ���� ���๮���� �ݺ����� ���� �����ϴ� ���� ����(���ض�) 
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); 
			i++; //�ݺ����� ������ �ǵ��� ���� ����
		}
		
		System.out.println("----------");
		for (int i = 1; i <= 5; i++) {//1���� 5���� 1�� �����ϸ鼭
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
		
		//1~1000 ������ ���ڸ� ����Ͻÿ�.
		System.out.println("---");
		int num = 1;
		for (int i = 1; i <= 1000; i++) {
			System.out.println(num++);
		}
		System.out.println("---");
		for (int i2 = 1; i2 <= 1000; i2++) {
			System.out.println("�ݺ����ڰ� ��� : " + i2);
		}
		

	}

}






