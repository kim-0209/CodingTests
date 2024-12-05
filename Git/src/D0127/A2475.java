package D0127;

import java.util.Scanner;

//컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다. 
//고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다. 
//검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
//예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
public class A2475 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //스캐너

		int result = 0; // 값 담을 곳
		
		for (int i = 0; i < 5; i++) { // 5개 숫자 받기
			int a = sc.nextInt(); // 고유번호 하나씩 받기
			result += a*a; // 고유번호 제곱
		}
		System.out.println(result % 10); // 제곱한 값 10으로 나눈 값 출력
	}
}
