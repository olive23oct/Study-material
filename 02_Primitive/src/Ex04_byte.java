
public class Ex04_byte {

	public static void main(String[] args) {
		//������ byte : ���� ���� ���� 256����(-128 ~ 127)
		byte byte1 = 100;
		byte byte2 = 29;
		byte byte3 = 0;
		
		//sysout Ÿ���� �� ctrl + space �� Ŭ��
		System.out.println("byte1 : " + byte1);
		//ctrl + alt + ȭ��ǥ�Ʒ� Ŭ������ ���� ����
		System.out.println("byte2 : " + byte2);
		
		//������ ���� ǥ�������� ����� ����ġ ���� ������ ���� �� �� ����
		byte3 = (byte)(byte1 + byte2);
		System.out.println("byte1 + byte2 : " + byte3);

		//-----------------------
		System.out.println("--- byte �ּ�, �ִ밪 ---");
		System.out.println("byte �ּҰ�: " + Byte.MIN_VALUE);
		System.out.println("byte �ִ밪: " + Byte.MAX_VALUE);
	}

}









