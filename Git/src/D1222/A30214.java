package D1222;

import java.util.Scanner;

public class A30214 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		double half = B / 2.0;
		
		if (half <= A) {
			System.out.println("E");
		} else {
			System.out.println("H");
		}
	}
}
