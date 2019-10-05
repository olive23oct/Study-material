package com.mystudy.ex04_generic;

class BoxT<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}

public class GenericWildcardExam {

	public static void main(String[] args) {
		// ���׸�(Generic) : ���ϵ�ī��(wildcard - ��ǥ����)
		//1. <?> : ��� Ÿ��(��ü) �ڷ����� ���� ��ǥ���ڸ� �ǹ�
		//2. <? extends �ڷ���> : �ڷ����� ��ӹ��� �ڳ�(sub) Ŭ���� Ÿ�� ���
		//3. <? super �ڷ���> : �ڷ����� �θ�(super) Ÿ�� ���
		//---------------------
		BoxT<String> box1 = new BoxT<String>();
		box1.setObj("���ڿ�");
		
		BoxT<Integer> box2 = new BoxT<>();
		//box2.setObj("���ڿ�"); //Ÿ�� �̽���ġ
		//box2.setObj(100.00); //Ÿ�� �̽���ġ
		
		box2.setObj(new Integer(1000));
		
		System.out.println("------------------");
		//<?> ��� ���� ���� �� �ִ� ����
		BoxT<?> box3 = new BoxT<String>();
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		//<? extends �ڷ���> : �ڷ������� sub Ÿ��(extends �� Ÿ�Ե� ��� ����)
		BoxT<? extends Number> box10 = null;
		box10 = new BoxT<Number>();
		box10 = new BoxT<Integer>();
		box10 = new BoxT<Double>();
		
		//[�����Ͽ��� ] Character�� Number Ÿ���� ���(extends) ���� �ʾ���
		//box10 = new BoxT<Character>(); 
		
		//<? super �ڷ���> : �ڷ��� ���� �θ�(super) Ÿ�� ��� ����
		BoxT<? super Number> box20 = null;
		box20 = new BoxT<Number>();
		box20 = new BoxT<Object>();
		
		//[�����Ͽ���] Integer�� Number�� ����(super)Ÿ���� �ƴϱ� ����
		//box20 = new BoxT<Integer>();
	}

}









