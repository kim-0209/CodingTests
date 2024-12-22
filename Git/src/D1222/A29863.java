package D1222;

import java.util.Scanner;

public class A29863 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A >= 20 && A <= 23) {
			System.out.println(24 - A + B);
		} else {
			System.out.println(B - A);
		}
	}
}
