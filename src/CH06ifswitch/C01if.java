package CH06ifswitch;

import java.util.Scanner;

public class C01if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		1 단순 IF
//		if(조건식)
//		{
//		 참일 경우 실행되는 코드
//		}
		int age = 7;
//		
//		if(age >= 8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		
//		if(age < 8)
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램을 종료합니다");
		
		
//		IF ELSE 문
		
//		if(조건식)
//		{
//		   참일 경우 실행되는 코드
//		}
//		else
//		{
//			거짓일 경우 실행되는 코드
//		}
		
		
//		if(age >= 8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("프로그램을 종료합니다");
		
		// 문제
		// 정수를 받아서 짝 홀 구분
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		if(num1 % 2 == 0)
//		{
//			System.out.printf("%d는 짝수\n",num1);
//		}
//		else
//		{
//			System.out.printf("%d는 홀수\n",num1);
//		}
		
		//문제
		//정수를 받아서 3의배수, 4의배수 구분
		
//		int num = sc.nextInt();
//		if(num % 3 == 0)
//		{
//			System.out.println("3의 배수");
//		}
//		if(num % 4 == 0)
//		{
//			System.out.println("4의 배수");
//		}
		
		//문제
		//두 정수를 입력받아서 큰 수 출력(IF-ELSE)
		
//		System.out.print("첫번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2)
//		{
//			System.out.printf("큰 수는 %d\n", num1);
//		}
//		else
//		{
//			System.out.printf("큰 수는 %d\n", num2);
//		}
		
		//3의 배수이면서 4의 배수라면 출력
		//3의 배수가 아니면서 5의 배수라면 출력
		
//		int num = sc.nextInt();
//		
//		if(num % 3 == 0)
//		{		//3의 배수인 경우
//			if(num % 4 ==0)
//				System.out.println("3의 배수 o 4의 배수 o");
//		}
//		else
//		{		//3의 배수가 아닌 경우
//			if(num % 5 == 0)
//				System.out.println("3의 배수 x 5의 배수 o");
//		}
//		System.out.println("그냥");
		
//		if(num % 3 == 0 && num % 4 == 0 )
//		{
//			System.out.println("3의 배수 o 4의 배수 o");
//		}
//		else
//		{
//			// 3의 배수 x or 4의 배수 x
//			// 3의 배수 x and 4의 배수 x
//		}
//		
//		if(num % 3 != 0 && num % 5 == 0)
//		{
//			System.out.println("3의 배수 x 5의 배수 o");
//		}
//		else
//		{
//			// 3의 배수 o or 5의 배수 x
//			// 3의 배수 o and 5의 배수 x
//		}
		
		//문제
		//세 정수를 입력 받아서 큰 수 출력( 단순 if 문으로만)
		
//		System.out.print("첫번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("세번째 정수 입력 : ");
//		int num3 = sc.nextInt();
//		
//		int max = num3;
//		
//		if(num1 > num2)
//		{
//			max = num1;
//		}
//		if(num1 > num3)
//		{
//			max = num1;
//		}
//		if(num2 > num3)
//		{
//			max = num2;
//		}
//		
//		System.out.printf("가장 큰 수는 : %d\n",max);
		
		
		//예제
		//국영수 각 점수가 40 이상
		//총 평균이 60점 이상 -> 합격
		//아니면 불합격
		
//		System.out.print("국어 점수 : ");
//		int kor = sc.nextInt();
//		
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		
//		System.out.print("수학 점수 : ");
//		int mat = sc.nextInt();
//		double avg = (double)((kor + eng + mat) / 3);
//		
//		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 )
//			System.out.println("합격");
//		else
//			System.out.println("불합격");
		
		
		//평균점수를 입력받아 그 점수가
		//90 이상 A
		//80 이상 B
		//70 이상 C
		//60 이상 D
		//그 외 F
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 90)
		{
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 70)
		{
			System.out.println("C");
		}
		else if(score >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}

}
