
public class Ex14_question {

	public static void main(String[] args) {
		// ����(���� Ternary Operator)
		// ���� ? ���๮ : ���๮;
		// ���� ? true�϶� ���� ���� : false�϶� ���๮��;
		int num1 = 30;
		int num2 = 20;
		boolean big = true;
		big = num1 > num2;
		
		System.out.println("num1:"+ num1 + ", num2:" + num2);
		System.out.println("big(num1 > num2): " + big);

		String str = (num1 > num2) ? "num1�� ũ��" : "num1 ũ�� �ʴ�";
		System.out.println("num1 > num2 �����? " + str);
	}

}


