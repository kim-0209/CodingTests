package D0203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//사파리월드는 인터넷으로만 존재하는 미스테리한 나라이다. 
//사파리월드에는 2개의 서브도메인이 seunghwan.royal.gov.sw와 kyuhyun.royal.gov.sw 이 있는데, 

//이것이 couple.royal.gov.sw으로 합쳐질 것이다. 
//서브도메인의 유명도는 정수이다. 두 서브도메인의 유명도가 주어졌을 때, 그 차이를 구하는 프로그램을 작성하시오.
//첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
//첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.
public class A2420 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼기능
		StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열 쪼개기

		long n = Long.valueOf(st.nextToken()); // n 값 Long 타입으로 변환
		long m = Long.valueOf(st.nextToken()); // m값 Long 타입으로 변환
		
		long result = n + (m * -1);
		//result 절대값으로 변경
		System.out.println(Math.abs(result));
	}

}
