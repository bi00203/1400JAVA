package Ch10ClassBasic;

class Employee
{
	public int id;
	public String name;
	public String dept;
	public String title;
	private int salary;
	private String addr;
	
	
	public Employee(int id, String name, String dept, String title, int salary, String addr) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.title = title;
		this.salary = salary;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", title=" + title + ", salary=" + salary
				+ ", addr=" + addr + "]";
	}
	
	
	// +id : int; 			// 사번
	// +name : String;		// 이름
	// +dept : String;		// 부서
	// +title : String;		// 직책
	// -salary : int;	// 연봉
	// -addr : String; 		// 주소
	
	// private 항목만 getter and setter 지정
	// 모든 필드를 받는 생성자 함수 지정
	// toString() 재정의를 통한 내용 출력가능하도록 할것
	
}


public class C02PracMain {

	public static void main(String[] args) {
		
		Employee hong = new Employee(1010, "홍길동", "인사부", "대리", 4500, "대구");
		hong.setSalary(6000);
		hong.setAddr("울산");
		System.out.println(hong.toString()); // hong의 모든 필드 내용 출력

	}

}
