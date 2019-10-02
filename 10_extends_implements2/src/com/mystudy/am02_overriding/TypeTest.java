package com.mystudy.am02_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Chicken ch = new Chicken();
		Pig pig = new Pig();
		
		cat.sound();
		dog.sound();
		ch.sound();
		pig.sound();
		
		System.out.println("---- sound(Animal) 호출 ---");
		sound(cat);
		sound(dog);
		sound(ch);
		sound(pig);
	}
	
	//메소드의 오버라이딩(overriding 사용)
	static void sound(Animal animal) {
		animal.sound();
	}
	
//	static void sound(Animal animal) {
//		//instanceof 사용 - 타입확인 후 해당타입의 sound() 메소드 호출
//		if (animal instanceof Cat) {
//			((Cat) animal).sound();
//		} else if (animal instanceof Dog) {
//			((Dog)animal).sound();
//		} else if (animal instanceof Chicken) {
//			((Chicken) animal).sound();
//		} else if (animal instanceof Pig) {
//			((Pig) animal).sound();
//		}
//	}
	
	//메소드의 오버로딩(method overloading)
//	static void sound(Cat animal) {
//		animal.sound();
//	}
//	static void sound(Dog animal) {
//		animal.sound();
//	}
//	static void sound(Chicken animal) {
//		animal.sound();
//	}
	
	

}






