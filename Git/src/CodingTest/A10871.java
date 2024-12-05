package CodingTest;

import java.util.Scanner;

//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
public class A10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X;
		// 정수 N개로 이루어진 수열 A
		N = sc.nextInt();

		// 정수 X
		X = sc.nextInt();

		// 수열 A
		int[] arr = new int[N];

		// N 개 배열 돌려서 arr 수열에 담기
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		// 스캔 종료
		// arr 배열 중에 X값 보다 낮은 값 출력
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
