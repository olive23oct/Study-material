
public class Ex12_while {

	public static void main(String[] args) {
		// 반복문 : while
		/* while문 사용 형태
		반복인자의 선언 및 초기값 설정
		while (실행조건문) {
			반복인자값 증감설정(선택적);
			실행문(들);
			반복인자값 증감설정(선택적);
		}
		*/
		//1~10 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("--------------");
		//while문으로
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		System.out.println("--------------");
		//while문으로
		i = 0;
		while (i < 10) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("----- 반복문 내의 break문 ---------");
		//break문 : 현재 실행중인 반복문을 종료하고 빠져나감
		//while문 무한반복
		int num = 1;
		while (true) {
			System.out.println(num + " ");
			if (num == 10) break; //반복문의 중단처리 break
			num++;
		}
		System.out.println("--- continue -------");
		//continue : 반복문의 다음 반복으로 진행
		//          (continue 문 이후의 실행문을 실행하지 않음)
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; //continue문 후의 실행문 처리 안하고 다음반복
			System.out.println(num);
		}
		
		System.out.println("--- continue -------");
		
		num = 0;
		while (num < 10) {
			num++;
			if (num % 2 == 0) continue; //사용시 반복인자 변경후 사용 
			System.out.println(num);
		}
		
		System.out.println("--- for continue -------");
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue; 
			System.out.println(m);
		}
		
		System.out.println("======= do ~ while ========");
		/* do ~ while : 무조건 한 번은 실행
		
		반복인자의 선언 및 초기값 설정;
		do {
			증감치 설정(실행문 전/후 선택적);
			실행문;
		} while (조건문);
		*/
		//1~10까지 출력(do~while 문으로)
		int doNum = 1;
		do {
			System.out.println("do~while: " + doNum);
			doNum++;
		} while (doNum <= 10);
		
		System.out.println("--------------");
		doNum = 0;
		do {
			doNum++;
			System.out.println("do~while: " + doNum);
		} while (doNum < 10);
		
		//======================================
		System.out.println("========================");
		for (int out = 1; out <= 3; out++) {
			for (int in = 1; in <= 5; in++) {
				System.out.println("out: " + out +", in: " + in);
				if (in == 2) break; //안쪽에 있는 for문을 중단하고 빠져나감
			}
		}
		
		System.out.println("----------------");
		//중첩 반복문을 모두 종료하는 경우(위치지정후 break문에서 사용)
		//라벨지정
		outFor: for (int out = 1; out <= 3; out++) {
			for (int in = 1; in <= 5; in++) {
				System.out.println("out: " + out +", in: " + in);
				if (out == 2) break outFor; //안쪽에 있는 for문을 중단하고 빠져나감
			}
		}
		System.out.println(">>> 프로그램 끝");
		
		
	}

}









