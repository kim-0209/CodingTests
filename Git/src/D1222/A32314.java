package D1222;

import java.util.Arrays;
import java.util.Scanner;

public class A32314 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int w = sc.nextInt();
		int v = sc.nextInt();

		if (w / v >= a) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
