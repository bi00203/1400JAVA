package Ch11Array;

import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {
		
		
		
//		Scanner sc = new Scanner(System.in);
		
		// 1 배열의 크기를 입력 받습니다.
		
//		System.out.print("배열 크기 입력 : ");
//		int n = sc.nextInt(); 
//		int[] arr1 = new int[n];
//		int sum = 0;
		
		// 2 크기만큼 점수를 키보드로 부터 입력받아 배열에 차례대로 저장합니다
		
//		for(int i = 0 ; i < n ; i++)
//		{
//			System.out.printf("%d번째 점수를 입력하세요 : ",i+1);
//			arr1[i] = sc.nextInt();
//		}
//		int max = arr1[0];
//		int min = arr1[0];
//		
		// 3 배열에 저장된 각 요소에 접근하여 전체 합과 평균을 출력
		// 4 배열안의 저장된 점수중에 가장 큰 값과 가장 작은 값을 출력해봅니다
		
//		for(int i = 0 ; i < n ; i++)
//		{
//			sum += arr1[i];
//			if(max < arr1[i])
//				max = arr1[i];
//			if(min > arr1[i])
//				min = arr1[i];
//		}
//		
//		System.out.printf("합 : %d\n", sum);
//		System.out.printf("평균 : %.2f\n", (double)sum/n);
//		System.out.printf("최댓값 : %d\n", max);
//		System.out.printf("최솟값 : %d\n", min);
		
		
		// 문제
		int arr[] = {10,30,20,15,4};
		sort(arr); // 정렬 함수
		for(int i : arr) // 정렬된 결과 출력
		{
			System.out.print(i +" ");
		}
		
	}
	
	public static void sort(int[] ar) {
		
		
		// 배열을 정렬합니다
		// 선택,삽입,버블,기수,병합,퀵... 아무거나 정렬 로직 사용해봅시다
		// 선택 정렬 사용( 왼쪽 요소부터 차례대로 정렬되는 방식)
		int len = ar.length;
		int temp;
		for(int i = 0 ; i < len - 1 ; i++) {
			for(int j = i + 1 ; j < len ; j++) {
			
				if(ar[j] < ar[i]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
	}

}
