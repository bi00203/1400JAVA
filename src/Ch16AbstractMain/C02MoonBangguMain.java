package Ch16AbstractMain;

abstract class Moonbanggu{
	
	static int scount = 100; // 샤프 재고량
	static int pcount = 100; // 연필 재고량
	
	// 함수 정의
	abstract protected void write();
	
}
class sharp extends Moonbanggu{
	sharp(){
		super.scount--;		// 샤프 객체 생성시 재고량 감소
	}
	// 강제 재정의된 함수
	protected void write() { System.out.println("샤프로 씁니다");}
}
class pencil extends Moonbanggu{
	pencil(){
		super.pcount--;		// 연필 객체 생성시 재고량 감소
	}
	// 강제 재정의된 함수
	protected void write() { System.out.println("연필로 씁니다");}
}
public class C02MoonBangguMain {
	
	public static Moonbanggu ReqMoonbanggu(String thing) {
		if(thing.equals("샤프")) {
			return new sharp();
		}
		else if(thing.equals("연필")) {
			return new pencil();
		}
		else {
			return null;
		}
		
	}
	
	public static void ShowInfo() {
		System.out.println("샤프 재고량 : "+ Moonbanggu.scount);
		System.out.println("연필 재고량 : " + Moonbanggu.pcount);
	}
	public static void main(String[] args) {
		sharp ob1 = (sharp)ReqMoonbanggu("샤프"); // sharp ob1 = 상위클래스 참조
		sharp ob2 = (sharp)ReqMoonbanggu("샤프");
		pencil ob3 = (pencil)ReqMoonbanggu("연필");
		ob1.write();
		ob2.write();
		ob3.write();
		ShowInfo();

	}

}
