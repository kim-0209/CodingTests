package CodingTest;

import java.util.Scanner;

public class A10952 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 기능
		int A, B; // 2개의 값

		while (true) { // 무한 반복
			A = sc.nextInt(); // A 값
			B = sc.nextInt(); // B값
			if (A == 0 && B == 0) { // A , B가 0일때 브레이크
				break;
			}
			System.out.println(A + B); // A,B 더한 값 출력 
			//여기 위치에 둔 이유는 if 위에 두면 
			//if문 돌고 브레이크 할 때 0+0을 더한 값 0이 출력되기 때문
		}
	}
}
