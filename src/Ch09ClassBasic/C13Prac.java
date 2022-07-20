package Ch09ClassBasic;

import java.util.Scanner;

class Grade
{
	int math;
	int science;
	int english;
	Grade(){
		this.math = 0;
		this.science = 0;
		this.english = 0;
	}
	Grade(int math, int science, int english)
	{
		this.math = math;
		this.science = science;
		this.english = english;
	}
	double avg() {
		return (double) (this.math+this.science+this.english) / 3;
	}
	void showInfo() {
		System.out.printf("수학 점수 : %d\n", this.math);
		System.out.printf("과학 점수 : %d\n", this.science);
		System.out.printf("영어 점수 : %d\n", this.english);
		System.out.printf("평균 : %.1f\n", avg());
	}
}
public class C13Prac {

	// Grade 클래스를 작성. 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade myGrade = new Grade(math,science,english);
		myGrade.showInfo();
		

	}

}
