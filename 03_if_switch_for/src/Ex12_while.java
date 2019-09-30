
public class Ex12_while {

	public static void main(String[] args) {
		// �ݺ��� : while
		/* while�� ��� ����
		�ݺ������� ���� �� �ʱⰪ ����
		while (�������ǹ�) {
			�ݺ����ڰ� ��������(������);
			���๮(��);
			�ݺ����ڰ� ��������(������);
		}
		*/
		//1~10 ���
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("--------------");
		//while������
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		System.out.println("--------------");
		//while������
		i = 0;
		while (i < 10) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("----- �ݺ��� ���� break�� ---------");
		//break�� : ���� �������� �ݺ����� �����ϰ� ��������
		//while�� ���ѹݺ�
		int num = 1;
		while (true) {
			System.out.println(num + " ");
			if (num == 10) break; //�ݺ����� �ߴ�ó�� break
			num++;
		}
		System.out.println("--- continue -------");
		//continue : �ݺ����� ���� �ݺ����� ����
		//          (continue �� ������ ���๮�� �������� ����)
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; //continue�� ���� ���๮ ó�� ���ϰ� �����ݺ�
			System.out.println(num);
		}
		
		System.out.println("--- continue -------");
		
		num = 0;
		while (num < 10) {
			num++;
			if (num % 2 == 0) continue; //���� �ݺ����� ������ ��� 
			System.out.println(num);
		}
		
		System.out.println("--- for continue -------");
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue; 
			System.out.println(m);
		}
		
		System.out.println("======= do ~ while ========");
		/* do ~ while : ������ �� ���� ����
		
		�ݺ������� ���� �� �ʱⰪ ����;
		do {
			����ġ ����(���๮ ��/�� ������);
			���๮;
		} while (���ǹ�);
		*/
		//1~10���� ���(do~while ������)
		int doNum = 1;
		do {
			System.out.println("do~while: " + doNum);
			doNum++;
		} while (doNum <= 10);
		
		System.out.println("--------------");
		doNum = 0;
		do {
			doNum++;
			System.out.println("do~while: " + doNum);
		} while (doNum < 10);
		
		//======================================
		System.out.println("========================");
		for (int out = 1; out <= 3; out++) {
			for (int in = 1; in <= 5; in++) {
				System.out.println("out: " + out +", in: " + in);
				if (in == 2) break; //���ʿ� �ִ� for���� �ߴ��ϰ� ��������
			}
		}
		
		System.out.println("----------------");
		//��ø �ݺ����� ��� �����ϴ� ���(��ġ������ break������ ���)
		//������
		outFor: for (int out = 1; out <= 3; out++) {
			for (int in = 1; in <= 5; in++) {
				System.out.println("out: " + out +", in: " + in);
				if (out == 2) break outFor; //���ʿ� �ִ� for���� �ߴ��ϰ� ��������
			}
		}
		System.out.println(">>> ���α׷� ��");
		
		
	}

}









