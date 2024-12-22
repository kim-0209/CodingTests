package D1221;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A26489 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = 0;

		while (true) {
			String B = br.readLine();

			if (B == null) {
				break;
			} 
			A++;
		}
		System.out.println(A);
	}

}
