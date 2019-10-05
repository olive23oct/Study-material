package com.mystudy.ex04_generic;

class BoxT<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}

public class GenericWildcardExam {

	public static void main(String[] args) {
		// 제네릭(Generic) : 와일드카드(wildcard - 대표문자)
		//1. <?> : 모든 타입(객체) 자료형에 대한 대표문자를 의미
		//2. <? extends 자료형> : 자료형을 상속받은 자녀(sub) 클래스 타입 사용
		//3. <? super 자료형> : 자료형의 부모(super) 타입 사용
		//---------------------
		BoxT<String> box1 = new BoxT<String>();
		box1.setObj("문자열");
		
		BoxT<Integer> box2 = new BoxT<>();
		//box2.setObj("문자열"); //타입 미스매치
		//box2.setObj(100.00); //타입 미스매치
		
		box2.setObj(new Integer(1000));
		
		System.out.println("------------------");
		//<?> 모든 것을 담을 수 있는 형태
		BoxT<?> box3 = new BoxT<String>();
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		//<? extends 자료형> : 자료형포함 sub 타입(extends 한 타입들 사용 가능)
		BoxT<? extends Number> box10 = null;
		box10 = new BoxT<Number>();
		box10 = new BoxT<Integer>();
		box10 = new BoxT<Double>();
		
		//[컴파일오류 ] Character가 Number 타입을 상속(extends) 받지 않았음
		//box10 = new BoxT<Character>(); 
		
		//<? super 자료형> : 자료형 포함 부모(super) 타입 사용 가능
		BoxT<? super Number> box20 = null;
		box20 = new BoxT<Number>();
		box20 = new BoxT<Object>();
		
		//[컴파일오류] Integer가 Number의 수퍼(super)타입이 아니기 때문
		//box20 = new BoxT<Integer>();
	}

}









