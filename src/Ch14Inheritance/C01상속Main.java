package Ch14Inheritance;


class Point2D 	// 상위 클래스(부모,슈퍼)
{
	public int x;
	public int y;
	
	Point2D()
	{
		System.out.println("Point2D생성자 호출!!!");
	}
	public void ShowXY() {
		System.out.println("X : " + x + " Y : " + y);
	}
}

class Point3D extends Point2D // Point2D를 상위클래스로 하는 Point3D클래스(하위/서브/자식)
{
	public int z; // 추가
	
	Point3D()
	{
		System.out.println("Point3D생성자 호출!!!");
	}
	public void ShowXYZ() // 추가
	{
		ShowXY();
		System.out.println("Z : " + z);
		
	}
}
public class C01상속Main {

	public static void main(String[] args) {
		Point3D ob = new Point3D();
		ob.x = 10;
		ob.y = 20;
		ob.z = 30; // 하위클래스 확장된 멤버
		ob.ShowXY();
		ob.ShowXYZ(); // 하위 클래스 확장ㅈ된 멤버

	}

}
