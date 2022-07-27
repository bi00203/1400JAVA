package Ch15UpdownCasting;

class Computer{
	// -SN : String; // SerialNo
	// -CPUSpec : String;
	// -RAMSpec : String;
	// -DISKSpec : String;
	// +PowerOn() : void ->  "전원을 켭니다" 가 출력
	// +PowerOff() : void -> "전원을 끕니다" 가 출력
	// Getter and Setter 메서드 필요
	// 모든 인자를 받는 생성자 함수 만드세요
	
	private String SN;
	private String CPUSpec;
	private String RAMSpec;
	private String DISKSpec;
	
	public Computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		super();
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
	}
	public void PowerOn() {System.out.println("전원을 켭니다");}
	public void PowerOff() {System.out.println("전원을 끕니다");}
	public String getSN() {
		return SN;
	}
	public String getCPUSpec() {
		return CPUSpec;
	}
	public String getRAMSpec() {
		return RAMSpec;
	}
	public String getDISKSpec() {
		return DISKSpec;
	}
	
	
	
	
}
class NoteBook extends Computer{

	public int battery;
	public NoteBook(String sN, String cPUSpec, String rAMSpec, String dISKSpec, int battery) {
		super(sN, cPUSpec, rAMSpec, dISKSpec);
		this.battery = battery;
	}
	public void move() {
		if(battery-5 < 0)
		{
			battery = 0;
			System.out.println("배터리가 방전되어 전원이 꺼집니다");
			PowerOff();
		}
		else {
		System.out.println("이동합니다");
		battery -= 5;
		}
	}
	// +battery : int;
	// +move() : void -> "이동합니다" 가 출력, 호출시마다 배터리 -5 감소
	@Override
	public String toString() {
		return "NoteBook [SN=" + getSN() + ", CPUSpec=" + getCPUSpec() + ", RAMSpec=" + getRAMSpec()
				+ ", DISKSpec=" + getDISKSpec() + ", battery=" + battery + "]";
	}
	
	
}
class Tablet extends Computer{

	public String PencilNo;
	public Tablet(String sN, String cPUSpec, String rAMSpec, String dISKSpec, String PencilNo) {
		super(sN, cPUSpec, rAMSpec, dISKSpec);
		this.PencilNo = PencilNo;
	}
	
	public void WritePen() {System.out.println("Pen으로 씁니다.");}
	// +PencilNo : String;
	// +WritePen() : void : "Pen으로 씁니다" 가 출력

	@Override
	public String toString() {
		return "Tablet [SN=" + getSN() + ", CPUSpec=" + getCPUSpec()
				+ ", RAMSpec=" + getRAMSpec() + ", DISKSpec=" + getDISKSpec() + ", PencilNo=" + PencilNo + "]";
	}
	
	
}

public class C03UpdownCastingMain {

	public static void ShowInfo(Computer ref) {
		// instanceof 로 각각 연결된 객체에 맞게 Downcasting
		// 전달받은 멤버의 Spec값을 출력하는 코드 생성
		
		if(ref instanceof NoteBook)
		{
			NoteBook down = (NoteBook) ref;
			System.out.println(down.toString());
		}
		else if (ref instanceof Tablet)
		{
			Tablet down = (Tablet) ref;
			System.out.println(down.toString());
		}
		
		
	}
	public static void main(String[] args) {
		NoteBook Mycom = new NoteBook("1-2-3-4","I7","16G","1T",100);
						 // SN, CPUSpec, RAMSpec, DISKSpec, battery
		Tablet Mytab = new Tablet("9-8-7-6","I3","8G","128G","Pen-123");
						 // SN, CPUSpec, RAMSpec, DISKSpec, PencilNo
		
		ShowInfo(Mycom);
		ShowInfo(Mytab);

	}

}
