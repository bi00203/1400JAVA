package Ch09ClassBasic;

public class C02Car {
	String owner;
	int speed;
	int fuel;
	
	void Accel()
	{
		System.out.printf("%s님의 차의 속도가 증가합니다\n",owner);
	}
	
	void Break()
	{
		System.out.printf("%s님의 차의 속도가 감소합니다\n",owner);
	}
	
	void ShowInfo()
	{
		System.out.printf("%s %d %d\n",owner,speed,fuel);
	}
}
