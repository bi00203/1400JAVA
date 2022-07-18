package Ch07While;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		// 전체 구구단 출력(2-9단)
		
//		int dan = 2;
//		int i = 1;
//		
//		while(dan <= 9)
//		{
//			while(i <= 9)
//			{
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//			i = 1;
//		}

		// 문제
		// 2 x 9, 2 x 8 ------ 9 x 2, 9 x 1
		
//		int dan = 2;
//		int i = 9;
//		
//		while(dan <= 9)
//		{
//			while(i >= 1)
//			{
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//			i = 9;
//		}
		
		// 문제
		// 9 x 9, 9 x 8 ------------- 2 x 2, 2 x 1
		
//		int dan = 9;
//		int i = 9;
//		
//		while(dan >= 2)
//		{
//			while(i >= 1)
//			{
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//			i = 9;
//		}
		
		// 별 찍기
		// *****
		// *****
		// *****
		// *****
		
//		int i = 1;
//		int j = 1;
//		while(i <= 5)
//		{
//			while(j <= 5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			j = 1;
//		}
		
		// *
		// **
		// ***
		// ****
		
//		int i = 0;
//		int j = 0;
//		while(i < 4)
//		{
//			while(j < i + 1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			j = 0;
//		}
		
		// ****
		// ***
		// **
		// *
		
//		int i = 4;
//		int j = 0;
//		while(i > 0)
//		{
//			while(j < i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//			j = 0;
//		}
		
		
		//    *
		//   ***
		//  *****
		// *******
		
//		int i = 3;
//		int j = 0;
//		int k = 0;
//		while(i >= 0)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 2*k +1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i--;
//			j = 0;
//		}
		
		// *******
		//  *****
		//   ***
	    //    *
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < 4)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 7-2*k)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i++;
//			j = 0;
//		}
		
		
		// 문제
		// 다이아몬드 모양 출력
		
		
			//	  *
			//   ***
			//  *****
			// *******
			//  *****
			//   ***
		    //    *
		
//		int i = 3;
//		int j = 0;
//		int k = 0;
//		while(i >= 0)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 2*k +1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i--;
//			j = 0;
//		}
//		
//		i = 0;
//		j = 0;
//		k = 0;
//		while(i < 3)
//		{
//			while(j < i + 1)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 5-2*k)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i++;
//			j = 0;
//		}
		
		
		
		
		
		
		
		
		
		// 모래시계모양 출력
		
					// *******
					//  *****
					//   ***
				    //    *
					//   ***
					//  *****
					// *******
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < 4)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 7-2*k)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i++;
//			j = 0;
//		}
//		
//		i = 2;
//		j = 0;
//		k = 1;
//		while(i >= 0)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 2*k +1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i--;
//			j = 0;
//		}
		
		// 높이 입력받아 출력하는 직각 삼각형
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i < n)
//		{
//			while(j < i + 1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			j = 0;
//		}
		
		// 높이 입력받아 출력하는 정삼각형
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		int i = sc.nextInt();
//		int j = 0;
//		int k = 0;
//		while(i >= 0)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 2*k +1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i--;
//			j = 0;
//		}
		
		// 높이 입력받아 출력하는 역삼각형
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < n)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < (n*2-1)-2*k)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i++;
//			j = 0;
//		}
		
		// 높이 입력받아 출력하는 다이아몬드
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요(홀수만) : ");
//		int n = sc.nextInt();
//		n /= 2;
//		int i = n;
//		int j = 0;
//		int k = 0;
//		while(i >= 0)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 2*k +1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i--;
//			j = 0;
//		}
//		
//		i = 0;
//		j = 0;
//		k = 0;
//		while(i < n )
//		{
//			while(j < i + 1)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < (n*2-1)-2*k)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i++;
//			j = 0;
//		}
		
		// 높이 입력받아 출력하는 모래시계
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요(홀수만) : ");
//		int n = sc.nextInt();
//		n /= 2;
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < n + 1)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < (n*2)-2*k + 1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i++;
//			j = 0;
//		}
//		
//		i = n - 1;
//		j = 0;
//		k = 1;
//		while(i >= 0)
//		{
//			while(j < i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			j = 0;
//			
//			while(j < 2*k +1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k++;
//			i--;
//			j = 0;
//		}
		
		
		
		
	
	}
}
