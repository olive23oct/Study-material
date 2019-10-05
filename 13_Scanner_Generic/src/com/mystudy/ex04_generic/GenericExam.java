package com.mystudy.ex04_generic;

class Box {
	Object obj; //�ʵ�(���) ������ Ÿ��
	void setObj(Object obj) {//�Ķ����(�Ű�����)
		this.obj = obj;
	}
	Object getObj() {//����Ÿ��
		return obj;
	}
}
//���׸� ����� �ڽ�
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
		// ���׸�(Generic) : �÷����� � ��ü��� �̷�������� ǥ���ϴ� ��üŸ���� �ǹ�
		// ���׸� ���� : <��ü�ڷ���>, <>
		//    API -> <T> : ��ü�ڷ���, <E> : �ϳ��� ���(�� ��ü �ϳ��� �ǹ�)
		//           Map���� : <K, V> K�� key(Ű), V�� value(��)
		////////////////////////////
		//�÷���(Collection) : ��ü���� ��� ���� ��(��ü�� ��Ƽ� ����)
		//Collection<E> => Set<E>, List<E>, Queue<E>
		//                 Map<K,V>
		Box box = new Box();
		box.setObj("���ڿ� String");
		box.setObj(100);
		box.setObj(new Box());
		box.setObj(new Integer(1000));
		
		System.out.println(box.getObj());
		Integer integer = (Integer) box.getObj();
		System.out.println(integer.MAX_VALUE);

		String str = "Hello Java";
		String str2 = "100000";
		int str3 = 333;
		
		System.out.println("---- ���׸� ��� ----");
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("���ڿ� String");
		boxg.setObj(str);
		boxg.setObj(str2);
		//boxg.setObj(str3); //Ÿ���� ���� ������ ������ ���� �߻�
		
		System.out.println(boxg.getObj());
		String obj = boxg.getObj();
	}

}











