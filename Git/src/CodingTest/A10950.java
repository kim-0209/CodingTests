package CodingTest;

import java.util.Iterator;
import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
public class A10950 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 T 값
		int T = sc.nextInt();
		
		// T 만큼 반복문 돌림
		for (int i = 0; i <= T; i++) {
			// 정수 A 값 받음
			int A = sc.nextInt();
			
			// 정수 B 값 받음
			int B = sc.nextInt();
			
			// 정수 A + B 값을 출력
			System.out.println(A + B);
		}
	}
}
