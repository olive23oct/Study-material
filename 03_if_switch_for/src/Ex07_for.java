
public class Ex07_for {

	public static void main(String[] args) {
		//���� : 1~10���� ���� �� ¦�����
		//2�� ����� �������� 0�� ���ڴ� 2�� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("¦��(2�� ���): " + i);
			}
		}
		
		//���� : 1~10���� ������ 3�� ����� ���ڸ� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("3�� ���: " + i);
			}
		}
		
		//���� : 900 ~ 1000 ������ ���� �� 17�� ����� ���ڸ� ���
		for (int i = 900; i <= 1000; i++) {
			if (i % 17 == 0) {
				System.out.println("17�� ���: " + i);
			}
		}
				
		//���� : 2000 ~ 3000 ������ ���� �� 19�� ����� ���ڸ� ���
		for (int i = 2000; i <= 3000; i++) {
			if (i % 19 == 0) {
				System.out.println("19�� ���: " + i);
			}
		}
		//=======================================
		System.out.println("==================");
		int startNum = 9000;
		int endNum = 10000;
		int divNum = 27;
		
		for (int i = startNum; i <= endNum; i++) {
			if (i % divNum == 0) {
				System.out.println(divNum +"�� ���: " + i);
			}
		}
	}

}






