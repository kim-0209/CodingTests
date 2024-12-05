package D0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//입력 받은 대로 출력하는 프로그램을 작성하시오.
//입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
//각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
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
