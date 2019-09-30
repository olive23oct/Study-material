public class Ex03_switch_case {

	public static void main(String[] args) {
		//switch case문 : 동등비교구문
		/*
		switch (조건값) {
		case 비교값 :
			실행할 문장(들);
			break;
		case 비교값 :
			실행할 문장(들);
			break;
		...
		default : 
			실행할 문장(들);
			break;
		}
		*/
		int month = 2;
		
		switch (month) {
		case 1 :
			System.out.println("31일까지 있습니다");
			break; //중단하고 빠져나감
		case 2 :
			System.out.println("28일 또는 29일까지 있습니다");
			break;
		case 3 :
			System.out.println("31일까지 있습니다");
			break; 
		case 4 :
			System.out.println("30일까지 있습니다.");
			break;
		default : 
			System.out.println("일치하는 값이 없습니다.");
			break;
		}
		System.out.println(">> swtich 끝");

		//-------------------------------
		System.out.println("------------------");
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 2:
			System.out.println(month + "월은 28 또는 29일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		}
		
		//---------------------
		//추첨 결과에 따라서 상품 지급
		//1등: 냉장고, 2등: 김치냉장고, 3등: 세탁기, 4등: 청소기
		//등수안에 들지 못한경우(꽝인경우) : 휴지
		//추첨결과: 냉장고
		String result = "3등"; //추첨결과
		String resultMsg = "";
		switch (result) {
			case "1등":
				//System.out.println("추첨결과: 냉장고");
				resultMsg = resultMsg + "냉장고 ";
				//break;
			case "2등":
				//System.out.println("추첨결과: 김치냉장고");
				resultMsg = resultMsg + "김치냉장고 ";
				//break;
			case "3등":
				//System.out.println("추첨결과: 세탁기");
				resultMsg = resultMsg + "세탁기 ";
				//break;
			case "4등":
				//System.out.println("추첨결과: 청소기");
				resultMsg = resultMsg + "청소기 ";
				//break;
			default:
				//System.out.println("추첨결과: 휴지");
				resultMsg = resultMsg + "휴지 ";
		}
		System.out.println("추첨결과 "+ result + "은 " + resultMsg +" 입니다.");
		

	}

}








