package CH18API;


class A
{
	int x;
	int y;
	@Override
	public String toString() {
		return "x=" +x+" y=" +y; // 멤버 변수의 값을 리턴
	}
	
}
public class C01ObjectTest {

	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1.toString());
		System.out.println(ob1);
		
		A ob2 = new A();
		System.out.println(ob2.toString());
		System.out.println(ob2);

	}

}
