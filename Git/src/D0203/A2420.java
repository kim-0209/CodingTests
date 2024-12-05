package ddd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2420 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼기능
		StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열 쪼개기

		long n = Long.valueOf(st.nextToken()); // n 값 Long 타입으로 변환
		long m = Long.valueOf(st.nextToken()); // m값 Long 타입으로 변환

		long result = n + (m * -1);
		System.out.println(Math.abs(result));
	}

}
