package Ch09ClassBasic;

// 지역변수 : {} 내에서 생성 , {} 벗어나면 소멸되는 변수

class LocalTest
{
	int num = 10; 		// 멤버변수
	void Func1()
	{
		System.out.println("num : " + num); // 멤버변수 num
		int num = 100;		// 지역변수 num
		num++;
		System.out.println("num : " + num); // 지역변수 num
		System.out.println();
		
	}
	void Func2()
	{
		System.out.println("num : " + num);
		if(true)
		{
			int num = 55; // 지역변수 num
			num++;
			System.out.println("num : " + num); // 지역변수 num
			System.out.println();
		}
		
		
	}
	void Func3()
	{
		System.out.println("멤버번수num : " + num); // 멤버변수 num
		for(int num=1;num<=10;num++)
		{
		System.out.println("지역변수num : " + num); // 지역변수 num
		}
		System.out.println("멤버변수num : " + num);
		System.out.println();
	}
	
	
	
}
public class C08LocalVar {

	public static void main(String[] args) {
		LocalTest obj = new LocalTest();
		obj.Func1();
		obj.Func2();
		obj.Func3();

	}

}
