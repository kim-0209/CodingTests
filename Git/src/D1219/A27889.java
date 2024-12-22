package D1219;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A27889 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		
		if(A.equals("NLCS")) {
			System.out.println("North London Collegiate School");
		}else if(A.equals("BHA")) {
			System.out.println("Branksome Hall Asia");
		}else if(A.equals("KIS")) {
			System.out.println("Korea International School");			
		}else {
			System.out.println("St. Johnsbury Academy");
		}
	}

}
