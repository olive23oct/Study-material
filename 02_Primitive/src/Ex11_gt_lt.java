
public class Ex11_gt_lt {

	public static void main(String[] args) {
		// �񱳿����� : >, <, >= (ũ�ų� ����), <= (�۰ų� ����)
		//           == (����/�����ϴ�), != (�����ʴ�, �ٸ���)
		// �񱳿������� ��� �� : true, false
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		//num1 > num2 : ??
		System.out.println(num1 > num2);
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		//num2 == num3 : ??
		System.out.println(num2 + " == " + num3 + " : " + (num2 == num3));
		
		System.out.println("----------------------");
		boolean power = true; //������ ����
		System.out.println("power: " + power);
		power = !power; //���� ����� ���� �ƴ� ��
		System.out.println("power: " + power);
		power = !power; //���� ����� ���� �ƴ� ��
		System.out.println("power: " + power);
		
		System.out.println("----------------");
		power = false;
		//power���� true�϶� if�� ����
		if (power) {
			System.out.println("power���� true : ����ON �����Դϴ�");
		}
		//power���� false�϶� if�� ����
		if (!power) {//!false
			System.out.println("power���� false : ����OFF �����Դϴ�");
		}
		
		
		
	}

}














