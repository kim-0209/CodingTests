package D1221;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A29731 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(br.readLine());

		String[] list = { "Never gonna give you up", "Never gonna let you down",
				"Never gonna run around and desert you", "Never gonna make you cry", "Never gonna say goodbye",
				"Never gonna tell a lie and hurt you", "Never gonna stop" };
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String A = br.readLine();
			for (int j = 0; j < list.length; j++) {
				if (A.equals(list[j])) {
					cnt++;
					break;
				}
			}
		}

		if (cnt == N) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
