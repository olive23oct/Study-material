package com.mystudy.am02_extends;

//Ŭ���� ���(extends) �ǽ�
/* �ǽ�1 : Phone Ŭ���� ��� Ȯ��(extends)
WebPhone Ŭ���� �ۼ�
Phone Ŭ������ ��� Ȯ��(extends)�ؼ� �ۼ�
������ ����
-����ȣ(phoneNo)�� �޾Ƽ� ��ü����
-Ÿ�� ���� "WebPhone"���� �Է�

��� : ��ȭ�ɰ�, �ް�, ��ȭ��������, ���˻� �� �� �ִ� ��ȭ��
���˻� ��� �߰�
- webSearch() : ">>WebPhone - �� �˻�" ���� ȭ�� ���
*/
class WebPhone extends Mp3Phone {
	//�ʵ�(�Ӽ�) ----------
	
	//������
	public WebPhone(String phoneNo) {
		super("WebPhone Ÿ��", phoneNo);
		
	}

	public WebPhone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	//�޼ҵ� ------------------------

	//-------------------------
	public void webSearch() {
		System.out.println(">>WebPhone - �� �˻�");
	}
}















