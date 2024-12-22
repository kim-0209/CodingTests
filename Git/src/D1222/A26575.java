package D1222;

import java.util.Scanner;

public class A26575 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double d, f, p;

		for (int i = 0; i < N; i++) {

			d = sc.nextDouble();
			f = sc.nextDouble();
			p = sc.nextDouble();

			System.out.println("$" + String.format("%.2f", d * f * p));

		}
		;

	}
}
