package D1219;

import java.util.Scanner;

public class A29751 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		
		double A = (W * H / 2.0);
		System.out.printf("%.1f", A);
	}
}
