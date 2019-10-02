package com.mystudy.pm02_interface;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println(">> 야옹~야옹~");
	}
	
	//메소드오버라이딩하면서 
	//접근제한은 수퍼클래스에 정의된 것과 동일하거나 넓게 적용해야 한다
	@Override
	//private void test() {//수퍼클래스에서 정의한 접근제한보다 좁게 지정하면 안됨
	void test() {//부모클래스에 적용된 접근제한(default)
	//protected void test() {
	//public void test() {
		System.out.println("메소드오버라이드>> 사용범위를 넓게 지정 가능");
	}

}








