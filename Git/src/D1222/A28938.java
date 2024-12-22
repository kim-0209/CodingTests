package D1222;

import java.util.Scanner;

public class A28938 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		int postion = 0;

		for (int i = 0; i < A; i++) {
			int B = sc.nextInt();
			postion += B;
		}

		if (postion > 0) {
			System.out.println("Right");
		} else if (postion == 0) {
			System.out.println("Stay");
		} else {
			System.out.println("Left");
		}
	}
}
