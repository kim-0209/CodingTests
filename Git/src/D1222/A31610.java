package D1222;

import java.math.BigInteger;
import java.util.Scanner;

public class A31610 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			BigInteger A = sc.nextBigInteger();
			
			if (A.equals(BigInteger.ZERO)) {
				break;
			}

			if (A.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
				System.out.println("PREMIADO");
			} else {
				System.out.println("TENTE NOVAMENTE");
			}
		}
	}
}
