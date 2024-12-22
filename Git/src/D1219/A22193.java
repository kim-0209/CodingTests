package D1219;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class A22193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		BigInteger N = new BigInteger(br.readLine());
		
		System.out.println(N.multiply(new BigInteger(br.readLine())));
	}

}
