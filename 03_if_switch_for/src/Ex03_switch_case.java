public class Ex03_switch_case {

	public static void main(String[] args) {
		//switch case�� : ����񱳱���
		/*
		switch (���ǰ�) {
		case �񱳰� :
			������ ����(��);
			break;
		case �񱳰� :
			������ ����(��);
			break;
		...
		default : 
			������ ����(��);
			break;
		}
		*/
		int month = 2;
		
		switch (month) {
		case 1 :
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break; //�ߴ��ϰ� ��������
		case 2 :
			System.out.println("28�� �Ǵ� 29�ϱ��� �ֽ��ϴ�");
			break;
		case 3 :
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break; 
		case 4 :
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		default : 
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
			break;
		}
		System.out.println(">> swtich ��");

		//-------------------------------
		System.out.println("------------------");
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7: case 8: case 10: case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�");
			break;
		case 2:
			System.out.println(month + "���� 28 �Ǵ� 29�ϱ��� �ֽ��ϴ�");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�");
			break;
		}
		
		//---------------------
		//��÷ ����� ���� ��ǰ ����
		//1��: �����, 2��: ��ġ�����, 3��: ��Ź��, 4��: û�ұ�
		//����ȿ� ���� ���Ѱ��(���ΰ��) : ����
		//��÷���: �����
		String result = "3��"; //��÷���
		String resultMsg = "";
		switch (result) {
			case "1��":
				//System.out.println("��÷���: �����");
				resultMsg = resultMsg + "����� ";
				//break;
			case "2��":
				//System.out.println("��÷���: ��ġ�����");
				resultMsg = resultMsg + "��ġ����� ";
				//break;
			case "3��":
				//System.out.println("��÷���: ��Ź��");
				resultMsg = resultMsg + "��Ź�� ";
				//break;
			case "4��":
				//System.out.println("��÷���: û�ұ�");
				resultMsg = resultMsg + "û�ұ� ";
				//break;
			default:
				//System.out.println("��÷���: ����");
				resultMsg = resultMsg + "���� ";
		}
		System.out.println("��÷��� "+ result + "�� " + resultMsg +" �Դϴ�.");
		

	}

}








