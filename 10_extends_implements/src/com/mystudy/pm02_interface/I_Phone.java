package com.mystudy.pm02_interface;

//�������̽��� �������
// - ������� : public static final ����
// - �߻�޼ҵ� : public abstract �޼ҵ�
//--------------------------
//�ڹ�8(JDK8)���� �߰��� ���
// - public default �޼ҵ� : public default �޼ҵ�() {}
// - public static �޼ҵ� 

public interface I_Phone {
	//���ȭ�� ���� : �������̽��� ����Ǵ� ������ ��� public static final
	public static final boolean SUCCESS_CALL = true;
	boolean FAIL_CALL = true;
	
	//�߻�޼ҵ�� ��� public abstract �޼ҵ�
	public abstract String getType(); 
	abstract String getPhoneNo();
	
	void view(); //0.��ȭ���� Ȯ��(view)
	void call(); //1.��ȭ�ɱ�(call)
	void receiveCall(); //2.��ȭ�ޱ�(receiveCall)
	void sendSMS(); //3.�޽��� ������
	void receiveSMS(); //4.�޽��� �ޱ�
	
	String toString();
	
	//public default �޼ҵ�
	default void changeNo(String phoneNo) {
		//������ �ʿ������ �������ص� ��
	}
	
	//public static �޼ҵ�
	static void staticMethod() {
		System.out.println("I_Phone �������̽��� static �޼ҵ��~~");
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
