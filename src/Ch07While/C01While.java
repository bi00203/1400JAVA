package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 기본
		//1 탈출용 변수 지정
		//2 탈출용 조건식
		//3 조건식이 false가 되도록 하는 연산식
		
//		int i = 1 ; //1 탈출용 변수
//		while(i <= 10)//2 탈출용 조건식
//		{
//			System.out.println("Hello world!");
//			i++; //3 조건식이 거짓이 되기 위한 연산식
//		}
		
		// 02 1부터 10까지 합 구하기
		
//		int i = 1;
//		int sum = 0;	//누적합 저장용
//		while(i <=10 )
//		{
//			sum += i; //증가되는 i 값을 sum에 누적
//			i++;
//		}
//		System.out.println("1부터 10까지의 합은 : " + sum);
		
		
		// 문제
		// 정수값 하나(N)을 입력받아
		// 1부터 N까지의 합을 구합니다
		
//		int N = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=N)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.printf("1부터 %d 까지의 합은 : %d\n",N,sum);
		
		
		// 문제
		// 정수값 두개(N, M)을 입력받아
		// N부터 M까지의 합을 구합니다
//		System.out.print("첫번째 정수 입력 ");
//		int N = sc.nextInt();
//		
//		System.out.print("두번째 정수 입력 ");
//		int M = sc.nextInt();
//		int i = N ;
//		int sum = 0;
//		
//		while(i <= M)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터 %d 까지의 합은 %d다\n",N,M,sum);
		
		//구구단 2단
		
//		int i = 1;
//		while(i <= 9)
//		{
//			System.out.printf("%d x %d = %d\n",2,i,2*i);
//			i++;
//		}
		
		// 2단 역순
		// 2 x 9 , 2 x 8 ....
		
//		int i = 9;
//		while(i > 0)
//		{
//			System.out.printf("%d x %d = %d\n",2,i,2*i);
//			i--;
//		}
		
		// N단 역순
		// 정수값 하나 받아서
		
//		int N = sc.nextInt();
//		int i = 9;
//		while(i > 0)
//			{
//				System.out.printf("%d x %d = %d\n",N,i,N*i);
//				i--;
//			}
		
		// 문제
		// 1부터 N까지 수 중에
		// 3의 배수의 합만 구하세요
		
//		int N = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i <= N)
//		{
//			if(i % 3 == 0)
//				sum += i;
//			i++;
//		}
//		
//		System.out.printf("1부터 %d까지 3의 배수의 합은 : %d\n",N,sum);
	}

}
