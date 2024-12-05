package CodingTest;

import java.util.Scanner;

public class A10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X;
		// N 첫번째 숫자 값
		N = sc.nextInt();
		// X 두번째 숫자 값
		X = sc.nextInt();

		int[] arr = new int[N];
		// int N을 배열에 담고
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
