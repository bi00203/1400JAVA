package Ch02Su;



//	CPU는 가산회로에 존재해서 가산처리 (+)를 할 수 있다? ( O )
//	CPU는 감산회로가 존재해서 감산처리 (-)를 할 수 있다? ( X )

//	보수 개념을 도입해서 사용자가 뺄셈 요청시 덧셈으로 치환하여 뺄셈과 동일한 결과값을 전달해준다

//	10 - 3 = 7
//	10 + 7 = (1)7
//
//	75  - 32 = 43
//	75  + 68 = (1)43
//	777 - 222 = 555
//	777 + 778 = (1)555
//
//   	 0000 0101 = 5
//   	 1111 1010 =    ( 비트 반전 : 1의보수 )
//    	 1111 1011 = -5 ( 1의 보수 + 0000 0001 : 2의보수 )
//	-----------------
// 	  1  0000 0000 = 0
//
// 		2의보수값이 변환되었을때 왼쪽 끝비트를 부호비트로 해석
//	 	왼쪽 끝 비트가 0이라면 양수
// 		왼쪽 끝 비트가 1이라면 음수
public class C03음의정수 {

	public static void main(String[] args) {

		System.out.printf("%d\n", (byte)(0b11001100));
		//문제
		//10진수		->		2진수
		//11			->		0000 1011
		//-11			->      1111 0101
		//111			->		0110 1111
		//-111			->		1001 0001
		//96			->		0110 0000
		//-96			->		1010 0000
		//
		////문제
		//2진수		->		10진수
		//1000 1010	-> -128+8+2= -118
		//1100 0101	-> -128+69 = -59
		//0111 0101	-> 		117
		//1100 1100	-> -128+76 = -52


		//0000 0011 = 0
		//0000 0001 = 1
		//0000 0010 = 2
		//0000 0011 = 3
		//0111 1111 = 127
		//1000 0000 = -128
		//1000 0001 = -128 + 1
		//1000 0010 = -128 + 2
		//1000 0011 = -125
		//1000 0100 = -128+4
		//1111 1111 = -128+127 = -1
	}

}
