package D0127;

import java.util.Scanner;

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
