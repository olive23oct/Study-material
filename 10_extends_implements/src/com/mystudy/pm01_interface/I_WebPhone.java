package com.mystudy.pm01_interface;

//�������̽� ������ �������� ���Ȯ��(extends)�ؼ� ����� �� �ִ�.
public interface I_WebPhone extends I_Phone, I_Mp3Phone {
//	//{} ���� : �߻�޼ҵ�(abstract method)
//	String getType(); 
//	String getPhoneNo();
//	
//	void view(); //0.��ȭ���� Ȯ��(view)
//	void call(); //1.��ȭ�ɱ�(call)
//	void receiveCall(); //2.��ȭ�ޱ�(receiveCall)
//	void sendSMS(); //3.�޽��� ������
//	void receiveSMS(); //4.�޽��� �ޱ�
//	
//	//MP3���
//	void playMusic();
	
	//web ��ġ���
	void webSearch();
}










