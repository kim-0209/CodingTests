package D0118;

import java.util.Scanner;

//동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 
//하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
//첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다
//첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 
//만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
public class A3003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너 기능
//		16 총 피스 
//		킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
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
