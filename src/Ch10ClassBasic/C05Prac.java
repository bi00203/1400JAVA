package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// String 클래스로 문자열을 하나 입력 받습니다
		String str = sc.nextLine();
		// 1 입력받은 문자열의 길이 출력
		System.out.println(str.length());
		// 2 문자열의 idx중에 2, 3, 4 만 출력
		System.out.printf("%c %c %c\n",str.charAt(2),str.charAt(3),str.charAt(4));
		// 3 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어
		// 있는지 여부 확인
		String str2 = sc.nextLine();
		System.out.println(str.contains(str2));
		// 4 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이
		// 일치하는가 확인
		System.out.println("일치 여부 : " +str.equals(str2));
		// 5 저장된 문자열의 길이를 확인해서, 특정문자열 위치 idx 확인 후
		// 확인된 idx 위치에서 마지막 idx까지 잘라내기
		System.out.println("N부터 마지막까지 자르기 : " + str.substring(3,str.length()));
		
		
		
		
		

	}

}
