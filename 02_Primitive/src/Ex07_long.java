
public class Ex07_long {

	public static void main(String[] args) {
		// ������ long : 8byte
		// ���� : -9,223,372,036,854,775,808 
		//    ~ 9,223,372,036,854,775,807
		// long Ÿ�԰� ����� ǥ�� : ���� + L �Ǵ� l(���� ��ҹ��� ��)
		
		//���� ����Ÿ Ÿ�� -> ū ����Ÿ Ÿ��(�ڵ�����ȯ)
		long num1 = 200000000000L; //longŸ�� ���̾� ���
		long num2 = 300000000000l;
		long sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("------------------------");
		
		byte numByte = 100;
		short numShort = 3000;
		int numInt = 30000000;
		long numLong = 50000000000000000L;
		
		numByte = (byte) numShort; //�սǹ߻�-�����Ⱚ �߻�
		System.out.println("numByte : " + numByte);
		
		numLong = numInt; //longŸ�� <- intŸ��
		System.out.println("numLong : " + numLong);
		
		System.out.println("--- long Ÿ�� �ּ�/�ִ밪 ---");
		System.out.println("long �ּҰ�: " + Long.MIN_VALUE);
		System.out.println("long �ִ밪: " + Long.MAX_VALUE);
	}

}




