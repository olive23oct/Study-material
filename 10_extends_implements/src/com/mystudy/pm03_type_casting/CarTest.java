package com.mystudy.pm03_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car Ŭ���� ===");
		Car car = new Car();
		car.type = "�ڵ���";
		System.out.println("Ÿ�� : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance ===");
		Ambulance am = new Ambulance();
		am.type = "������";
		System.out.println("Ÿ�� : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine ===");
		FireEngine fe = new FireEngine();
		fe.type = "�ҹ���";
		System.out.println("Ÿ�� : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("========================");
		Car carTemp = new Car(); //Car <- Car
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //undefined : CarŸ�Կ��� siren()����
		
		System.out.println("--- Car <- Ambulance ������ ");
		//Ambulance <- (Ambulance) Car : ���������ȯ, ��������ȯ
		carTemp = am; //Car <- Ambulance : �ڵ�����ȯ
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //undefined : CarŸ�Կ��� siren()����
		
		
		System.out.println("--- Ambulance <- Car <- Ambulance ---");
		//Ambulance Ÿ���� ����Ǿ� �ִ� Car Ÿ���� ����Ÿ�� �ٽ� Ambulance Ÿ�Կ� ����
		Ambulance am2 = (Ambulance) carTemp; //���������ȯ(��������ȯ)
		am2.siren();
		
		//(�ں深����ü).siren()
		((Ambulance) carTemp).siren();
	}
}



















