package D1222;

import java.util.Scanner;

public class A27328 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A < B) {
			System.out.println("-1");
		} else if (A == B) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
}