package D0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A11718 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in); // 스캐너 기능

		while (sc.hasNextLine()) { //다음 줄이 없을 때 까지 반복
			String str = sc.nextLine(); // 입력값
			System.out.println(str); //출력
		}
		sc.close(); // 스캐너 기능 닫기

	}

}
