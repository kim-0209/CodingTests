package D1222;

import java.util.Scanner;

public class A29163 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int even = 0;
		int odd = 0;

		for (int i = 0; i < A; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		if (even > odd) {
			System.out.println("Happy");
		} else {
			System.out.println("Sad");
		}
	}
}
