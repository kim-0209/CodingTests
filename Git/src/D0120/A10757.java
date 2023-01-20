package D0120;

import java.math.BigInteger;
import java.util.Scanner;

public class A10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger A = new BigInteger(sc.next()); // A 값
		BigInteger B = new BigInteger(sc.next()); // B값
		
		//A에 B를 넣어서 추가 
		System.out.println(A.add(B));
	}
}
