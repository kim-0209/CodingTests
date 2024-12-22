package D1222;

import java.util.Scanner;

public class A32775 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		int F = sc.nextInt();
		
		if (S > F) {
			System.out.println("flight");
		} else {
			System.out.println("high speed rail");
		}
	}
}
