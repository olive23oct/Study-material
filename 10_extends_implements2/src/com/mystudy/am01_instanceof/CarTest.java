package com.mystudy.am01_instanceof;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== Car 클래스 ===");
		Car car = new Car();
		car.type = "일반자동차";
		System.out.println("자동차타입: " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance ====");
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println("자동차타입: " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine ====");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("자동차타입: " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("====== 형변환 후 =====");
		//Car <== Ambulance
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		
		//자동형변환(Super <- Sub) : Car <== Ambulance
		carTemp = am; 
		carTemp.drive();
		carTemp.stop();
		
		//Car 타입이기 때문에 구급차의 사이렌 기능 사용 못함
		//구급차의 사이렌 기능을 사용하려면 구급차가 되어야 함
		((Ambulance)carTemp).siren();
		
		//System.out.println("---- 구급차를 소방차로 바꾸고 사이렌 울리기 시도");
		//[예외발생] java.lang.ClassCastException 발생
		//((FireEngine)carTemp).siren();
		
		System.out.println("---- 타입 확인(instaceof) ----");
		//carTemp = new Car();
		//carTemp = am; //Car <== Ambulance
		carTemp = fe; //Car <== FireEngine
		System.out.println("--- Object 타입인 경우");
		if (carTemp instanceof Object) {
			System.out.println("Object 타입입니다.");
		}
		
		System.out.println("--- Car 타입인 경우");
		if (carTemp instanceof Car) {//Car 타입의 객체(instance)냐?
			carTemp.drive();
			carTemp.stop();
		}
		
		System.out.println("--- Ambulance 타입인 경우");
		if (carTemp instanceof Ambulance) {//Ambulance 타입의 인스턴스냐?
			carTemp.drive();
			carTemp.stop();
			((Ambulance)carTemp).siren();
		}
		
		System.out.println("--- FireEngine 타입인 경우");
		if (carTemp instanceof FireEngine) {//FireEngine 타입이냐?
			carTemp.drive();
			carTemp.stop();
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
		
		System.out.println("========================");
		System.out.println("--- Car 타입 전달시(타입체크) ---");
		typeCheck(car);
		
		System.out.println("--- Ambulance 타입 전달시(타입체크) ---");
		typeCheck(am);
		
		System.out.println("--- FireEngine 타입 전달시(타입체크) ---");
		typeCheck(fe);
		
	}
	
	static void typeCheck(Car carTemp) {
		System.out.println("::: Car 타입입니다 ---");
		carTemp.drive();
		carTemp.stop();
		
		//instanceof : 객체의 타입 확인
		//비교할객체   instanceof  비교할클래스명(타입명)
		if (carTemp instanceof Ambulance) {//Ambulance 타입의 인스턴스냐?
			System.out.println("::: Ambulance 타입입니다 ---");
			((Ambulance)carTemp).siren();
		}
		
		if (carTemp instanceof FireEngine) {//FireEngine 타입이냐?
			System.out.println("::: FireEngine 타입입니다 ---");
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
	}
	
}












