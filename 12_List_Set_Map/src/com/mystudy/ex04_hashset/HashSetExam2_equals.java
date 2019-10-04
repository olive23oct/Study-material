package com.mystudy.ex04_hashset;

import java.util.HashSet;

class Person {
	String name; //�̸�
	int age; //����
	String jumin; //�ֹι�ȣ
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}
	
}

public class HashSetExam2_equals {

	public static void main(String[] args) {
		// Set�� �ߺ�����Ÿ�� �ϳ��� ����
		// ������ ����Ÿ�� ���� ����Ÿ ���δ� equals �޼ҵ� ����
		// �츮�� ����� Ŭ������ ���ϵ���Ÿ ���θ� ������ ��
		// equals() �޼ҵ带 ������(override)�ϰ�, hashCode() �Բ� ������
		// �񱳼��� : hashCode() �� �� �� ������ equals() ��
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add("def");
		set.add(new Person("ȫ�浿3", 30, "901010-1111111"));
		set.add(new Person("ȫ�浿", 27, "901010-1111111"));
		Person person = new Person("ȫ�浿2", 29, "911010-1222222");
		set.add(person);
		Person person2 = person;
		set.add(person2);
		
		System.out.println(set);
	}

}










