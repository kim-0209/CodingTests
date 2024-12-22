package D1222;

import java.util.Scanner;

public class A30224 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
//		숫자에 7이 포함되지 않고 7로 나누어 떨어지지 않으면 0을 출력합니다.
//		숫자에 7이 포함되지 않지만 7로 나누어 떨어지는 경우 1을 출력합니다.
//		숫자에 7이 포함되어 있지만 7로 나누어 떨어지지 않는 경우 2를 출력합니다.
//		숫자에 7이 포함되어 있고 7로 나누어 떨어지면 3을 출력합니다.

		String str = String.valueOf(A);
		
		if (str.indexOf("7") == -1 && A % 7 != 0) {
			System.out.println("0");
		} else if (str.indexOf("7") == -1 && A % 7 == 0) {
			System.out.println("1");
		} else if (str.indexOf("7") != -1 && A % 7 != 0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	}
}
