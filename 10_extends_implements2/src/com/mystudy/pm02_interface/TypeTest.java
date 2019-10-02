package com.mystudy.pm02_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		sound(cat);
		sound(dog);

	}
	
	static void sound(I_Animal animal) {
		animal.sound();
	}

}
