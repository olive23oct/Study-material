
public class Ex09_for_star_ex {

	public static void main(String[] args) {
		//¹®Á¦1 -------------------------
		//***** : * 5¹ø
		//****  : * 4
		//***   : * 3
		//**
		//*
		int lineCnt = 5;
		int starCnt = lineCnt;
		String dispStr = "*";
		for (int line = 1; line <= lineCnt; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispStr);
			}
			System.out.println();
			starCnt--;
		}
		System.out.println("------------");
		
		
		//¹®Á¦2 ---------------------------
		//    * : ºóÄ­4 + "*" + ÁÙ¹Ù²Þ
		//   **
		//  ***
		// ****
		//*****
		starCnt = 1;
		int spaceCnt = 4;
		
		//¶óÀÎ¿¡ ´ëÇÑ ¹Ýº¹Ã³¸®¹®
		for (int line = 1; line <= 5; line++) {
			//ºóÄ­ Ãâ·Â¿ë ¹Ýº¹¹®(4, 3, 2, 1..)
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			
			//"*" Ãâ·Â¿ë ¹Ýº¹¹®(1, 2, 3, ...)
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println(); //¶óÀÎ ³¡ ÁÙ¹Ù²Þ
			starCnt++;
			spaceCnt--;
		}
		
		
		
		//¹®Á¦3 ---------------------------
		//***** : ºóÄ­ 0, * 5, ÁÙ¹Ù²Þ
		// **** : ºóÄ­ 1, * 4, ÁÙ¹Ù²Þ
		//  *** : ºóÄ­ 2, * 3, ÁÙ¹Ù²Þ
		//   **
		//    *
		System.out.println("------------");
		starCnt = 5;
		spaceCnt = 0;
		
		//¶óÀÎ¿¡ ´ëÇÑ ¹Ýº¹Ã³¸®¹®
		for (int line = 1; line <= 5; line++) {
			//ºóÄ­ Ãâ·Â¿ë ¹Ýº¹¹®(0, 1, 2, 3 ...)
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			
			//"*" Ãâ·Â¿ë ¹Ýº¹¹®(5, 4, 3,...)
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println(); //¶óÀÎ ³¡ ÁÙ¹Ù²Þ
			starCnt--;
			spaceCnt++;
		}
		
		
		//======================================
		//¹®Á¦4 -------------------------
		//1       : (1 + ºóÄ­1) + ÁÙ¹Ù²Þ
		//1 2     : (1 + ºóÄ­1) + (2 + ºóÄ­1) + ÁÙ¹Ù²Þ
		//1 2 3   : (1 + ºóÄ­1) + (2 + ºóÄ­1) + (3 + ºóÄ­1) + ÁÙ¹Ù²Þ
		//1 2 3 4
		starCnt = 1;
		for (int line = 1; line <= 4; line++) {
			int dispNum = 1;
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispNum + " ");
				dispNum++;
			}
			System.out.println();
			starCnt++;
		}
		
		//¹®Á¦5 -------------------------
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		starCnt = 1;
		int dispNum = 1;
		for (int line = 1; line <= 4; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispNum + " ");
				dispNum++;
			}
			System.out.println();
			starCnt++;
		}
	}
}









