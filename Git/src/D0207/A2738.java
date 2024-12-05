package D0207;

import java.util.Scanner;

//N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

//첫째 줄에 행렬의 크기 N 과 M이 주어진다.

//둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
//이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. 

//N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
//첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
public class A2738 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 기능
        int n = sc.nextInt(); //N값
        int m = sc.nextInt(); //M값
        
        int[][] arr1 = new int[n][m]; //A 행렬
//      [0][0] 1 [0][1] 1 [0][2] 1 
//      [1][1] 2 [1][1] 2 [1][2] 2 
//      [2][2] 0 [2][1] 1 [2][2] 0 
        
        int[][] arr2 = new int[n][m]; //B 행렬
//      [0][0] 3 [0][1] 3 [0][2] 3 
//      [1][1] 4 [1][1] 4 [1][2] 4 
//      [2][2] 5 [2][1] 5 [2][2] 100 
      
        for (int i = 0; i < n; i++) { //A행렬 값
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        
        for (int i = 0; i < n; i++) { //B 행렬 값
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) { // A + B 행렬 출력 
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
                if(j == m-1) // j가 3번째 값까지 돌았을 때 줄바꿈
                    System.out.println();
            }
        }
    }
}
