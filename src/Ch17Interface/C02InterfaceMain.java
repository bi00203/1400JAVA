package Ch17Interface;


interface Tire
{
	void FL();	// 상단 왼쪽
	void FR();  // 상단 오른쪽
	void BL();  // 하단 왼쪽
	void BR();  // 하단 오른쪽
	void run();
}
class KumhoTire implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러갑니다");
		
	}

	@Override
	public void FL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BR() {
		// TODO Auto-generated method stub
		
	}
	
}
class Hankook implements Tire{

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다");
		
	}

	@Override
	public void FL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BR() {
		// TODO Auto-generated method stub
		
	}
	
}
class Car
{
	Tire FR;
	Tire FL;
	Tire BR;
	Tire BL;
	Car()
	{
		FR = new KumhoTire();
		FL = new KumhoTire();
		BR = new KumhoTire();
		BL = new KumhoTire();
	}
	void CarStart() {
		FR.run();
		FL.run();
		BR.run();
		BL.run();
	}
}
public class C02InterfaceMain {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.CarStart();
		
		mycar.FL = new Hankook();
		mycar.BR = new Hankook();
		System.out.println("------------------");
		mycar.CarStart();
	}

}
