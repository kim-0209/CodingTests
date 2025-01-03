package CodingTest;

import java.util.Scanner;

//좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
public class A14681 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// X 좌표 값
		int X = sc.nextInt();

		// Y 좌표 값
		int Y = sc.nextInt();

		// 1사분면 : X 양수 Y 양수
		// 2사분면 : X 음수 Y 양수
		// 3사분면 : X 음수 Y 음수
		// 4사분면 : X 양수 Y 음수
		if (X > 0 && Y > 0) {
			System.out.println("1");
		} else if (X < 0 && Y > 0) {
			System.out.println("2");
		} else if (X < 0 && Y < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}

	}
}
