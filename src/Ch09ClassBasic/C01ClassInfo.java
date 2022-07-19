package Ch09ClassBasic;

import java.util.Scanner;

public class C01ClassInfo {

	public static void main(String[] args) {
		// 1 객체
		// -> 현실 존재(독점적이고 배타적인 공간을 차지한다) 사물
		// -> 실존하는 객체의 처리를 위한 일부정보를 추출하여(추상화) 프로그램의 메모리공간에 담아
		// -> 놓은 단위(==인스턴스)
		
		// 2 객체의 구조
		// - 속성 : 객체를 표현하는 세부 데이터 단위(변수로 처리)
		// - 기능 : 객체가 구현할 수 있는 행위 단위(함수(==메서드)로 처리)
		
		// 에어컨
		// 속성 : 로고문양, 팬, EVA, Display, Moter, SN, 에너지레벨...
		// 기능 : PowerOn/Off, 제습, 냉방, 온풍...
		
		
		// 3 클래스
		// 객체에 필요한 공간을 생성하기 위해 미리 선언된 자료형
		
		
		// 4 자바의 메모리 영역
		//  1) 스택 영역		: 메서드 내에서 생성되는 공간(일반자료형,int,double,참조변수..)
		//  2) 힙 영역		: 객체 저장되는 영역(동적할당 영역)
		//  3) 클래스 영역		: 공유 메모리 영역(일반메서드,static메서드,생성자메서드,static변수)
		
		
		// 5 단순코드로 확인
//		Scanner sc = new Scanner(System.in);
//		
//		Scanner : 클래스 자료형
//		sc : 참조변수
//		new : 동적할당(힙영역에 공간할당)
//		Scanner() : 생성자메서드	- 객체생성시 한번만 호출되는 메서드
//								- 객체에 공간생성에 관여, 초기값을 부여(기본값은 0);
	}

}
