package Ch09ClassBasic;

class TV
{
	String corporation;
	int year;
	int inch;
	
	void showInfo()
	{
		System.out.printf("회사 : %s\n",corporation);
		System.out.printf("년도 : %d\n",year);
		System.out.printf("인치 : %d\n",inch);
	}
}
public class C05TVMain {

	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.corporation = "LG";
		myTV.year = 2022;
		myTV.inch = 32;
		myTV.showInfo(); // 함수 호출시 회사 : LG 년도 : 2022 인치 : 32가 출력

	}

}
