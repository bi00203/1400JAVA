package Ch19Exception;

public class C01NullPointer {

	public static void main(String[] args) {

		try {
		String data = null;
		System.out.println(data.toString());
		}catch(NullPointerException e) {
			//System.out.println("예외발생!!");
			System.out.println(e.getCause()); // 원인
			System.out.println(e.toString()); // 예외객체 정보
			System.out.println(e.getStackTrace()); // 예외객체 식별주소
			e.printStackTrace();
		}
		System.out.println("실행되어야 할 코드 1");
		System.out.println("실행되어야 할 코드 2");

	}

}
