package D1219;

import java.util.Scanner;

public class A28701 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A = 0;
		int B = 0;

		for (int i = 1; i <= N; i++) {
			A = i + A;
			B += i * i * i;
		}
		System.out.println(A);
		System.out.println(A * A);
		System.out.println(B);
	}
}
