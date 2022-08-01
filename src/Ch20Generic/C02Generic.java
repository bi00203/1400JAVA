package Ch20Generic;


class Simple<T,S>
{
	T x;
	S y;
	@Override
	public String toString() {
		return "Simple [x=" + x + ", y=" + y + "]";
	}
	
}
public class C02Generic {

	public static void main(String[] args) {
		
		Simple<String,String> ob1 = new Simple<String,String>();
		ob1.x = "문자열1"; ob1.y = "문자열2";
		System.out.println(ob1.toString());
		
		Simple<Integer,Double> ob2 = new Simple<Integer,Double>();
		ob2.x = 10; ob2.y = 10.5;
		
		System.out.println(ob2.toString());

	}

}
