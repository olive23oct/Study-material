package com.mystudy.am03_interface;

interface I_Phone {
	//{} ���� : �߻�޼ҵ�(abstract method)
	String getType(); 
	String getPhoneNo();
	
	void view(); //0.��ȭ���� Ȯ��(view)
	void call(); //1.��ȭ�ɱ�(call)
	void receiveCall(); //2.��ȭ�ޱ�(receiveCall)
	void sendSMS(); //3.�޽��� ������
	void receiveSMS(); //4.�޽��� �ޱ�
	
	String toString();
	
}
