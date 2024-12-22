package D1222;

import java.util.Scanner;

public class A28927 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int totalA = (A * 3) + (B * 20) + (C * 120);

		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();

		int totalB = (D * 3) + (E * 20) + (F * 120);

		if (totalA > totalB) {
			System.out.println("Max");
		} else if (totalA == totalB) {
			System.out.println("Draw");
		} else {
			System.out.println("Mel");
		}
	}
}
