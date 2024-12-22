package D1222;

import java.util.Scanner;

public class A27219 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A = N / 5;
		int B = N % 5;
		
		for (int i = 0; i < A; i++) {
			System.out.printf("V");
		}
		
		for (int i = 0; i < B; i++) {
			System.out.printf("I");
		}
	}
}
