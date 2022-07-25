package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// 1 행, 열의 크기를 키보드로 받습니다.
		System.out.print("행, 열의 크기 입력(ex 5 7) : ");
		int size_row = sc.nextInt();
		int size_col = sc.nextInt();
		int sum = 0 ;
		int[][] arr = new int[size_row][size_col];
		
		// 2 행, 열 안에 각각의 위치에 값을 입력합니다
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.printf("[%d][%d] 값 입력 : ",i,j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 3 각 행의 값의 총합을 따로 출력합니다
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				sum += arr[i][j];
			}
			System.out.printf("%d행 합 : %d\n",i+1,sum);
			sum = 0;
		}
		
		
		// 4 각 열의 값의 총합을 따로 출력
		for(int i = 0 ; i < arr[0].length ; i++) {
			for(int j = 0; j < arr.length ; j++) {
				sum += arr[j][i];
			}
			System.out.printf("%d열 합 : %d\n",i+1,sum);
			sum = 0;
		}
	}

}
