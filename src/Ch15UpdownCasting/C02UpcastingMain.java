package Ch15UpdownCasting;

class Person{
	String name;
}
class Employee extends Person{
	String dept;
}
class PartTimer extends Employee{
	String hourlyPay;

	@Override
	public String toString() {
		return "PartTimer [name=" + name + ", dept=" + dept + ", hourlyPay=" + hourlyPay + "]";
	}
	
}
class Regular extends Employee{
	String salary;

	@Override
	public String toString() {
		return "Regular [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
public class C02UpcastingMain {

	public static void ShowInfo(Person person) { // 상속관계의 상위 클래스
												 // 하위 객체를 연결할 수 있는 매개변수
												 // Person person = ob1; // 업캐스팅
		{
			System.out.println(person.name);  // Person 클래스에서 물려준 멤버(접근o)
//			System.out.println(person.dept); // Employee 클래스에서 물려준 멤버(접근x)
			if(person instanceof PartTimer) {
				PartTimer down = (PartTimer) person;
				System.out.println(down.toString());
			}
			else if(person instanceof Regular) {
				Regular down = (Regular) person;
				System.out.println(down.toString());
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		PartTimer ob1 = new PartTimer();
		ob1.name = "홍길동"; ob1.dept = "인사부"; ob1.hourlyPay = "20000";
		ShowInfo(ob1);
		Regular ob2 = new Regular();
		ob2.name = "김상중"; ob2.dept = "총무부"; ob2.salary = "4000";
		ShowInfo(ob2);
	}

}
