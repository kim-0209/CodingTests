package D1221;

import java.math.BigInteger;
import java.util.Scanner;

public class A29699 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String A = "WelcomeToSMUPC";

		int idx = (N - 1) % A.length();

		System.out.println(A.charAt(idx));

	}

}
