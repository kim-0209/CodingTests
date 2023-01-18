package D0118;

import java.util.Scanner;

public class A3003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너 기능

		int king = 1; //킹 수
		int queen = 1; //퀸 수
		int rook = 2; //룩 수
		int bishop = 2; //비숍 수
		int knight = 2; //나이트 수
		int pawn = 8; //폰 수

		king = king - sc.nextInt(); //킹 - 받은 갯수
		queen = queen - sc.nextInt(); // 퀸 - 받은 갯수
		rook = rook - sc.nextInt(); // 룩 - 받은 갯수
		bishop = bishop - sc.nextInt(); // 비숍 - 받은 갯수
		knight = knight - sc.nextInt(); // 나이트 - 받은 갯수
		pawn = pawn - sc.nextInt(); // 폰 - 받은 갯수

		System.out.print(king + " "); //줄바꿈 안 쓰기 위해 print
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);

	}
}
