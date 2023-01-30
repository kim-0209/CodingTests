package D0130;

import java.util.Scanner;

public class A10807 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		int find = sc.nextInt();

		int n = 0;
		for (int i = 0; i < num.length; i++) {
			if (find == num[i]) {
				n += 1;
			}
		}
		System.out.println(n);
	}

}
