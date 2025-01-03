package CodingTest;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
public class A11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 갯수
		int T = sc.nextInt();
		
		// 두개의 정수값
		int A,B;
		
		// 테스트 케이스 갯수만큼 배열 돌림
		for (int i = 1; i <= T; i++) {
			
			// A 정수값
			A = sc.nextInt();
			
			// B 정수값
			B = sc.nextInt();
			
			// 테스트 케이스마다 Case #x: A+B 값 출력
			System.out.println("Case #"+i+": "+(A+B));
		}

	}

}
