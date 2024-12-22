package D1219;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A28235 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = br.readLine();

		if (A.equals("SONGDO")) {
			System.out.println("HIGHSCHOOL");
		} else if (A.equals("CODE")) {
			System.out.println("MASTER");
		} else if (A.equals("2023")) {
			System.out.println("0611");
		} else {
			System.out.println("CONTEST");
		}
	}
}
