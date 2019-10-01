//��Ű������ : java ������ �� ù�ٿ� ��ġ�ϸ� �� ���� �ۼ�
//�ڹ�(class) ������ ��ġ�� ��Ÿ��
//�Ϲ������� ȸ���� �����θ��� �ݴ�� ���
//�ۼ���) com.bitcamp.mystudy
package com.mystudy; 

//Ŭ������ �������� : public, (default) 
class Ex01_class {
	//�ʵ�(�������, �ν��Ͻ�����, �Ӽ�-property, attribute) ����
	int num = 111; //�ʱⰪ ��������
	
	//Ŭ��������, ����ƽ(static)����, �ν��Ͻ�(��ü)���� ����
	static int staticNum = 222; 
	
	
	public static void main(String[] args) {
		//���ú���(��������)
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 + num2;
		System.out.println("result: " + result);
		System.out.println("---------------------");
		
		//�޼ҵ���(ȣ��) : �޼ҵ��(�μ���1, �μ���2,..., �μ���n)
		result = add(num1, num2);
		System.out.println("result(add ������) : "+ result);
		
		System.out.println("staticNum: " + staticNum);
		
		//System.out.println("num: " + num);
		//result = sub(num1, num2);
		
		///////////////////////////////////
		//��ü����(�ν��Ͻ� ����, �ν��Ͻ�ȭ �Ѵ�)
		//Ŭ����Ÿ�Ը� ������;
		//������ = new Ŭ������();
		//Ŭ����Ÿ�Ը� ������ = new Ŭ������();
		
		//Ex01_class ex01;
		//ex01 = new Ex01_class();
		Ex01_class ex01 = new Ex01_class(); //�⺻�����ڷ� ��ü����
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		result = ex01.add(num1, num2);
		System.out.println("result(add) : " + result);
		
		//static �޼ҵ忡�� non-static �޼ҵ� �Ǵ� �ʵ� ���
		//������ ��ü�� ���ؼ��� ��� ����
		System.out.println("num: " + ex01.num);
		result = ex01.sub(num1, num2);
		System.out.println("ex01.sub(num1, num2) : " + result);
		
		System.out.println("ex01 : " + ex01);
	}
	
	//�޼ҵ�(method) ����
	//void �޼ҵ��() {}
	//����(����Ÿ)Ÿ�� �޼ҵ��() {}
	//����(����Ÿ)Ÿ�� �޼ҵ��(�Ķ����Ÿ�� �Ķ���͸�, ...) {}
	
	//2���� �������� ���޹޾� 2���� �������� ���� ����� �ǵ�����
	public static int add(int a, int b) {
		return a + b;
	}
	
	//2���� �������� ���޹޾� ù��° ������ �ι�° ���� �� ����� �ǵ�����
	public int sub(int a, int b) {
		return a - b;
	}

}





