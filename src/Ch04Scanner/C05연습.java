package Ch04Scanner;

import java.util.Scanner;

public class C05연습 {

	public static void main(String[] args) {
		/*
		String name;
		int age;
		String addr;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.printf("%s 님의 나이를 입력하세요 : ",name);
		age = sc.nextInt();
		
		System.out.printf("%s 님의 주소를 입력하세요 : ",name);
		sc.nextLine();
		addr = sc.nextLine();
		
		System.out.println("[PROFILE]");
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d세\n",age);
		System.out.printf("주소 : %s\n",addr);
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		String strNum1= scanner.next();

		System.out.print("두번째 수 : ");
		String strNum2= scanner.next();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		*/
		
		String name;
		int re_num;
		String ph_num;
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("주민번호 6자리 : ");
		re_num = sc.nextInt();
		
		System.out.print("전화번호(-포함) : ");
		ph_num = sc.next();
		
		System.out.println("[입력한 내용]");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("주민번호 : %d\n", re_num);
		System.out.printf("PH : %s\n", ph_num);
		
	}

}
