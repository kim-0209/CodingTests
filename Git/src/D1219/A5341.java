package D1219;

import java.util.Scanner;

public class A5341 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int A = sc.nextInt();
			int B = 0;

			if (A == 0) {
				break;
			} else {
				for (int i = 0; i < A; i++) {
					B += i + 1;
				}
				System.out.println(B);
			}
		}
	}

}
