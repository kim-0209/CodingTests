package CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class A2753 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 400 == 0)
				System.out.println("1");
			else if (year % 100 == 0)
				System.out.println("0");
			System.out.println("1");
		}
		System.out.println("0");
	}
}
