package Ch10ClassBasic;

// this : 만들어진 객체의 위치값을 저장하고 있는 내장형 참조변수
// this.멤버변수 : 멤버변수와 매개변수명이 동일할 경우 구별 할 수 있다.
// this() : 다른 생성자 호출 가능


class C06Simple
{
	int x;
	int y;
	int z;
	
	public C06Simple() {
//		x = 10;
//		y = 10;
//		z = 10;
		this(10,10,10); // 인자 3 생성자
	} // 디폴트
	
	public C06Simple(int x) {// 인자 1
//		this.x = x;
//		y = 10;
//		z = 10;
		this(x,10,20);
	}

	public C06Simple(int x, int y) {// 인자 2
//		this.x = x;
//		this.y = y;
//		z = 10;
		this(x,y,10);
	}

	public C06Simple(int x, int y, int z) {// 인자 3
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}

//class TestThis
//{
//	TestThis getThis() {
//		return this;
//	}
//}
public class C06this {

	public static void main(String[] args) {
		
		
		// 1 This 확인
//		TestThis ob1 = new TestThis();
//		System.out.println("ob1 = " + ob1);
//		System.out.println("this = " + ob1.getThis());
		
		//2 This 확인
		C06Simple ob1 = new C06Simple();
		C06Simple ob2 = new C06Simple(100);
		C06Simple ob3 = new C06Simple(100,200);
		C06Simple ob4 = new C06Simple(100,200,300);

	}

}
