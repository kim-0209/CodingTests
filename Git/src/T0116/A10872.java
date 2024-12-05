package T0116;

import java.util.Scanner;

//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
//첫째 줄에 N!을 출력한다.
public class A10872 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 기능

		int N = sc.nextInt(); // N값
		sc.close(); // 스캐너 닫기

		int sum = 1; // 팩토리얼 구하기 위해 곱하는 값

		while (N != 0) { // N이 0이 아니면 계속 반복
			sum = sum * N; // ex) 1 * 5 ,1 * 4 .... 반복
			N--; // 한번 반복할 때마다 1씩 감소
		}
		System.out.println(sum); // 다 더한 값 출력
	}
}
