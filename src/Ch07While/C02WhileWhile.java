package Ch07While;

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
		
	}
}
