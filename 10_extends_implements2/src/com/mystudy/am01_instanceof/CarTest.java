package com.mystudy.am01_instanceof;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== Car Ŭ���� ===");
		Car car = new Car();
		car.type = "�Ϲ��ڵ���";
		System.out.println("�ڵ���Ÿ��: " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance ====");
		Ambulance am = new Ambulance();
		am.type = "������";
		System.out.println("�ڵ���Ÿ��: " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine ====");
		FireEngine fe = new FireEngine();
		fe.type = "�ҹ���";
		System.out.println("�ڵ���Ÿ��: " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("====== ����ȯ �� =====");
		//Car <== Ambulance
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		
		//�ڵ�����ȯ(Super <- Sub) : Car <== Ambulance
		carTemp = am; 
		carTemp.drive();
		carTemp.stop();
		
		//Car Ÿ���̱� ������ �������� ���̷� ��� ��� ����
		//�������� ���̷� ����� ����Ϸ��� �������� �Ǿ�� ��
		((Ambulance)carTemp).siren();
		
		//System.out.println("---- �������� �ҹ����� �ٲٰ� ���̷� �︮�� �õ�");
		//[���ܹ߻�] java.lang.ClassCastException �߻�
		//((FireEngine)carTemp).siren();
		
		System.out.println("---- Ÿ�� Ȯ��(instaceof) ----");
		//carTemp = new Car();
		//carTemp = am; //Car <== Ambulance
		carTemp = fe; //Car <== FireEngine
		System.out.println("--- Object Ÿ���� ���");
		if (carTemp instanceof Object) {
			System.out.println("Object Ÿ���Դϴ�.");
		}
		
		System.out.println("--- Car Ÿ���� ���");
		if (carTemp instanceof Car) {//Car Ÿ���� ��ü(instance)��?
			carTemp.drive();
			carTemp.stop();
		}
		
		System.out.println("--- Ambulance Ÿ���� ���");
		if (carTemp instanceof Ambulance) {//Ambulance Ÿ���� �ν��Ͻ���?
			carTemp.drive();
			carTemp.stop();
			((Ambulance)carTemp).siren();
		}
		
		System.out.println("--- FireEngine Ÿ���� ���");
		if (carTemp instanceof FireEngine) {//FireEngine Ÿ���̳�?
			carTemp.drive();
			carTemp.stop();
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
		
		System.out.println("========================");
		System.out.println("--- Car Ÿ�� ���޽�(Ÿ��üũ) ---");
		typeCheck(car);
		
		System.out.println("--- Ambulance Ÿ�� ���޽�(Ÿ��üũ) ---");
		typeCheck(am);
		
		System.out.println("--- FireEngine Ÿ�� ���޽�(Ÿ��üũ) ---");
		typeCheck(fe);
		
	}
	
	static void typeCheck(Car carTemp) {
		System.out.println("::: Car Ÿ���Դϴ� ---");
		carTemp.drive();
		carTemp.stop();
		
		//instanceof : ��ü�� Ÿ�� Ȯ��
		//���Ұ�ü   instanceof  ����Ŭ������(Ÿ�Ը�)
		if (carTemp instanceof Ambulance) {//Ambulance Ÿ���� �ν��Ͻ���?
			System.out.println("::: Ambulance Ÿ���Դϴ� ---");
			((Ambulance)carTemp).siren();
		}
		
		if (carTemp instanceof FireEngine) {//FireEngine Ÿ���̳�?
			System.out.println("::: FireEngine Ÿ���Դϴ� ---");
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
	}
	
}












