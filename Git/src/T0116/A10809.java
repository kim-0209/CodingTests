package T0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 알파벳마다 위치 값 출력하기 위한 저장소

		String s = br.readLine(); // baekjoon 값 출력
	
		for (char c = 'a'; c <= 'z'; c++) // a 부터 z까지 반복
			sb.append(s.indexOf(c) + " "); // s문자에 사용된 알파벳 인덱스 값 넣기
		System.out.println(sb); // 넣은 값 출력
	}
}