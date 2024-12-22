package D1219;

import java.util.Scanner;

public class A24568 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int big = 8;
		int small = 3;

		int R = sc.nextInt();
		int S = sc.nextInt();
		
		int total = (R * big) +(S * small); 
		int cup = total - 28;
		System.out.println(cup);
	}
}
