package Ch13Static;


// 메모리 영역 비교
// 스택 영역 : {}내의 지역변수공간 생성
//			 {}내에서 공간형성, {} 벗어나면 공간 소멸
// 힙 영역   : 객체 저장공간
//			  new 예약어 사용시 공간 생성, 참조변수 연결해제시 JVM의 GC에 의해서 소멸
// 클래스 영역 : 공유메모리 영역, static변수, 일반메서드, static메서드, 생성자
//			   프로그램 시작과 동시에 형성, 프로그램 종료시 소멸

class C01Simple
{
	static int Num1 = 0;
	int num2;
	// toString 재정의 할 것
	@Override
	public String toString() {
		return "C01Simple [Num1 = "+Num1+" num2 = " + num2 + "]";
	}
	
}
public class C01StaticMain {

	public static void main(String[] args) {
		// static에 접근 위해서는 클래스명.static멤버
		C01Simple.Num1 = 1010;
		C01Simple ob1 = new C01Simple();
		System.out.println("ob = "+ob1.toString());
		
		
		C01Simple ob2 = new C01Simple();
		ob1.Num1 = 10;
		ob1.num2 = 20;
		System.out.println("ob = "+ob2.toString());
		
		ob2.Num1 = 100;
		System.out.println("ob = "+ob1.toString());
	}

}
