
public class Ex08_float {

	public static void main(String[] args) {
		// �Ǽ��� float : 4byte(����: -3.4E38 ~ 3.4E38)
		//�Ҽ��� ���� ����Ÿ ���� ����
		//ǥ������ : ����.���� + f �Ǵ� F
		//��, �Ҽ��� ���� 6�ڸ������� ��Ȯ�� ����
		float f1 = 3.4f;
		float f2 = 3.2f;
		System.out.println("float 3.4f : " + f1);
		System.out.println("float 3.2f : " + f2);
		System.out.println("3.4f + 3.2f : " + (f1 + f2));
		System.out.println("3.4f + 3.2f : " + (3.4f + 3.2f));
		System.out.println("3.4f + 3.1f : " + (3.4f + 3.1f));

	}

}
