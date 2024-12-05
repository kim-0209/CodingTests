package CodingTest;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//입력의 마지막에는 0 두 개가 들어온다.
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
