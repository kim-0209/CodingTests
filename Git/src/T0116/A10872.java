package T0116;

import java.util.Scanner;

public class A10872 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); //스캐너 기능
		
		int N=sc.nextInt(); //N값
		sc.close(); // 스캐너 닫기
		
		int sum =1; // 팩토리얼 구하기 위해 곱하는 값
		
		while (N!=0) { // N이 0이 아니면 계속 반복
			sum=sum*N; // ex) 1 * 5 ,1 * 4 .... 반복
			N--; //한번 반복할 때마다 1씩 감소
		}
		System.out.println(sum); //다 더한 값 출력
	}
}
