package com.mystudy.pm02_interface;

public abstract class Animal implements I_Animal {

	@Override
	public void eat() {
		System.out.println(">>먹는다");
	}
	@Override
	public void sleep() {
		System.out.println(">>잠을 잔다");
	}

	@Override
	public abstract void sound(); //선언만 한 추상메소드

	void test() {
		System.out.println("default 범위 test()");
	}
}






