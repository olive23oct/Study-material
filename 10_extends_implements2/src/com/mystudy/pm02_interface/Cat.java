package com.mystudy.pm02_interface;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println(">> �߿�~�߿�~");
	}
	
	//�޼ҵ�������̵��ϸ鼭 
	//���������� ����Ŭ������ ���ǵ� �Ͱ� �����ϰų� �а� �����ؾ� �Ѵ�
	@Override
	//private void test() {//����Ŭ�������� ������ �������Ѻ��� ���� �����ϸ� �ȵ�
	void test() {//�θ�Ŭ������ ����� ��������(default)
	//protected void test() {
	//public void test() {
		System.out.println("�޼ҵ�������̵�>> �������� �а� ���� ����");
	}

}








