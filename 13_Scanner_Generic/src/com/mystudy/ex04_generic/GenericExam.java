package com.mystudy.ex04_generic;

class Box {
	Object obj; //필드(멤버) 변수의 타입
	void setObj(Object obj) {//파라미터(매개변수)
		this.obj = obj;
	}
	Object getObj() {//리턴타입
		return obj;
	}
}
//제네릭 적용된 박스
class BoxG<T> { //ArrayList<String>
	T obj;
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
}

public class GenericExam {

	public static void main(String[] args) {
		// 제네릭(Generic) : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체타입을 의미
		// 제네릭 형태 : <객체자료형>, <>
		//    API -> <T> : 객체자료형, <E> : 하나의 요소(즉 객체 하나를 의미)
		//           Map형식 : <K, V> K는 key(키), V는 value(값)
		////////////////////////////
		//컬렉션(Collection) : 객체들을 모아 놓은 것(객체를 모아서 관리)
		//Collection<E> => Set<E>, List<E>, Queue<E>
		//                 Map<K,V>
		Box box = new Box();
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Box());
		box.setObj(new Integer(1000));
		
		System.out.println(box.getObj());
		Integer integer = (Integer) box.getObj();
		System.out.println(integer.MAX_VALUE);

		String str = "Hello Java";
		String str2 = "100000";
		int str3 = 333;
		
		System.out.println("---- 제네릭 사용 ----");
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("문자열 String");
		boxg.setObj(str);
		boxg.setObj(str2);
		//boxg.setObj(str3); //타입이 맞지 않으면 컴파일 오류 발생
		
		System.out.println(boxg.getObj());
		String obj = boxg.getObj();
	}

}











