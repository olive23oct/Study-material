
public class Ex01_if {

	public static void main(String[] args) {
		/* ���-�б⹮(�񱳹�) : if��
		if (���ǹ�) {
			������ ����(������ ���϶�);
		}
		*/
		int num1 = 10;
		int num2 = 20;
		if (num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		System.out.println(">> ���۾� ��");
		
		System.out.println("---------------");
		boolean result = num1 < num2;
		if (result) {
			System.out.println("num1�� num2���� �۴�.");
		}
		
		//----------------------------
		//���� �� ��� ��� : ��, ��, ��, ��, ��
		//100 ~ 90 : ��
		//89 ~ 80 : ��
		//79 ~ 70 : ��
		//69 ~ 60 : ��
		//59 ~ 0 : ��
		System.out.println("---- ����ó�� ----");
		int jumsu = 1000;
		
		System.out.println("���� : " + jumsu);
		//if�� �ۼ��� �پ��� ������ ���ǹ� ��밡��������
		//���� �ڵ� �ۼ��ÿ��� �Ѱ��� �������� �����ؼ� �ۼ�(�ڵ尡����)
		
		if (jumsu <= 100 && jumsu >= 90) {
		//if (100 >= jumsu && 90 <= jumsu) {
		//if (90 <= jumsu && 100 >= jumsu) {
			System.out.println("���� : ��");
		}
		if (jumsu >= 80 && jumsu < 90) {
			System.out.println("���� : ��");
		}
		if (70 <= jumsu && jumsu < 80 ) {
			System.out.println("���� : ��");
		}
		if (60 <= jumsu && jumsu <= 69 ) {
			System.out.println("���� : ��");
		}
		if (0 <= jumsu && jumsu <= 59) {
			System.out.println("���� : ��");
		}
		System.out.println(">>����ó�� ��");
		
		
	}

}












