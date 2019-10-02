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
		
		System.out.println("---- sound(Animal) ȣ�� ---");
		sound(cat);
		sound(dog);
		sound(ch);
		sound(pig);
	}
	
	//�޼ҵ��� �������̵�(overriding ���)
	static void sound(Animal animal) {
		animal.sound();
	}
	
//	static void sound(Animal animal) {
//		//instanceof ��� - Ÿ��Ȯ�� �� �ش�Ÿ���� sound() �޼ҵ� ȣ��
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
	
	//�޼ҵ��� �����ε�(method overloading)
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






