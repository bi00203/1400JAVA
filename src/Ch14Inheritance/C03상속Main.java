package Ch14Inheritance;

class Employee{
	String name;
	int age;
	int wh;
	public Employee(){}
	public Employee(String name, int age, int wh) {
		this.name = name;
		this.age = age;
		this.wh = wh;
	}
	
	
}
class PartTimer extends Employee{
	int wage;
	int contract_day;
	PartTimer(){}
	PartTimer(String name, int age, int wh, int wage, int contract_day)
	{
		super(name,age,wh);
		this.wage = wage;
		this.contract_day = contract_day;
	}
	@Override
	public String toString() {
		return "PartTimer [name=" + name + ", age=" + age + ", wh=" + wh + ", wage=" + wage + ", contract_day="
				+ contract_day + "]";
	}
	
	
}
class Regular extends Employee{
	int salary;
	String position;
	Regular(){}
	Regular(String name, int age, int wh, int salary, String position) {
		super(name,age,wh);
		this.salary = salary;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Regular [name=" + name + ", age=" + age + ", wh=" + wh + ", salary=" + salary + ", position=" + position
				+ "]";
	}
	
	
}
public class C03상속Main {

	public static void main(String[] args) {
		PartTimer hong = new PartTimer("홍길동", 55, 4, 20000, 90);
						// 이름, 나이, 근무시간, 시급, 계약일수
		Regular kim = new Regular("김상중", 44, 8, 3800, "대리");
						// 이름, 나이, 근무시간, 연봉, 직책
		System.out.println(hong.toString());
		System.out.println(kim.toString());

	}

}
