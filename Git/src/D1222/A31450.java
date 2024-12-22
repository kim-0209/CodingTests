package D1222;

import java.util.Scanner;

public class A31450 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int K = sc.nextInt();

		if (M % K != 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}
