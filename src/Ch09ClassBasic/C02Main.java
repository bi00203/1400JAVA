package Ch09ClassBasic;

public class C02Main {

	public static void main(String[] args) {
		C02Car mycar = new C02Car();
		mycar.owner = "홍길동";
		mycar.speed = 0;
		mycar.fuel = 100;
		mycar.Accel();
		mycar.Break();
		mycar.ShowInfo();
		
		C03Computer mycom = new C03Computer();
		mycom.SerialNo = "11-22-33";
		mycom.CPUSpec = "I7";
		mycom.RAMSpec="16G";
		mycom.DISKSpec="1T";
		System.out.printf("%s %s %s %s\n",mycom.SerialNo,mycom.CPUSpec,mycom.RAMSpec,mycom.DISKSpec);
	}

}
