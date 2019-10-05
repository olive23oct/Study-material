package com.mystudy.ex05_generic_person;

import java.util.ArrayList;

public class PersonManager {

	public static void main(String[] args) {
		//ArrayList<? extends Aniaml>
		ArrayList<PersonVO> list = new ArrayList<>();
		
		PersonVO person = new PersonVO("홍길동", 25);
		list.add(person);
		
		System.out.println(list);
		System.out.println("---------------");
		System.out.println("person : " + person);
		person = new PersonVO("김유신", 30);
		System.out.println("person : " + person);
		list.add(person);
		
		System.out.println(list);
		
		for (PersonVO vo : list) {
			String name = vo.getName();
			int age = vo.getAge();
			System.out.println("이름: " + name + ", 나이: " + age);
		}
	}
}










