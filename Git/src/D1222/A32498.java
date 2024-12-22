package D1222;

import java.util.Scanner;

public class A32498 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();

			if (b % 2 != 0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
