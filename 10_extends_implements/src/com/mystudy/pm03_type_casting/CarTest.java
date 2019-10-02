package com.mystudy.pm03_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car 클래스 ===");
		Car car = new Car();
		car.type = "자동차";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance ===");
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine ===");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("========================");
		Car carTemp = new Car(); //Car <- Car
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //undefined : Car타입에는 siren()없음
		
		System.out.println("--- Car <- Ambulance 변경후 ");
		//Ambulance <- (Ambulance) Car : 명시적형변환, 강제형변환
		carTemp = am; //Car <- Ambulance : 자동형변환
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //undefined : Car타입에는 siren()없음
		
		
		System.out.println("--- Ambulance <- Car <- Ambulance ---");
		//Ambulance 타입이 저장되어 있던 Car 타입의 데이타를 다시 Ambulance 타입에 저장
		Ambulance am2 = (Ambulance) carTemp; //명시적형변환(강제형변환)
		am2.siren();
		
		//(앰뷸런스객체).siren()
		((Ambulance) carTemp).siren();
	}
}



















