package Ch19Exception;

public class C05ExceptionMain {

	public static void div(int n1, int n2) throws Exception{
		if(n2 == 0)
			throw new ArithmeticException("산술 예외발생!!");
		
		System.out.println(n1/n2);
	}
	public static void main(String[] args) {
		
		try {
			div(10,0);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("MAIN에서 예외처리!!");
		}

	}

}
