package D1222;

import java.util.Arrays;
import java.util.Scanner;

public class A32154 {
	public static void main(String[] args) {

		String[][] board = { { "11", "A B C D E F G H J L M" }, { "9", "A C E F G H I L M" },
				{ "9", "A C E F G H I L M" }, { "9", "A B C E F G H L M" }, { "8", "A C E F G H L M" },
				{ "8", "A C E F G H L M" }, { "8", "A C E F G H L M" }, { "8", "A C E F G H L M" },
				{ "8", "A C E F G H L M" }, { "8", "A B C F G H L M" } };

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] A = board[N - 1];

		for (String B : A) {
			System.out.println(B);
		}
	}

}
