package com.mystudy.pm02_interface;

public abstract class Animal implements I_Animal {

	@Override
	public void eat() {
		System.out.println(">>�Դ´�");
	}
	@Override
	public void sleep() {
		System.out.println(">>���� �ܴ�");
	}

	@Override
	public abstract void sound(); //���� �� �߻�޼ҵ�

	void test() {
		System.out.println("default ���� test()");
	}
}






