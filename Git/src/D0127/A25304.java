package D0127;

import java.util.Scanner;

//준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다.
//몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
//준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
//영수증에 적힌,
//구매한 각 물건의 가격과 개수
//구매한 물건들의 총 금액
//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

//첫째 줄에는 영수증에 적힌 총 금액 
//X가 주어진다.

//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
//N이 주어진다.
//이후 
//N개의 줄에는 각 물건의 가격 

//A와 개수 
//B가 공백을 사이에 두고 주어진다.

//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
public class A25304 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	// 영수증에 적힌 총 금액 X 값
	int total = sc.nextInt();
	
	// 영수증에 적힌 구매한 물건의 종류의 수
	int count = sc.nextInt();
	
	for (int i = 0; i < count; i++) {
		int price = sc.nextInt(); // 가격 
		int num = sc.nextInt(); // 수량 

		total = total - (price * num); //토탈 값 빼기
	}

	if (total == 0)
		System.out.println("Yes"); // 토탈 0원이면 Yes
	else
		System.out.println("No"); // 토탈 0원 아니면 No

	}
}
