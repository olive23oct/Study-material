package com.mystudy.pm01_abstract_class;

public class TypeTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); //�߻�Ŭ���� ��ü���� ����
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		sound(cat);
		sound(dog);
		
	}
	
	static void sound(Animal animal) {
		animal.sound();
	}

}
