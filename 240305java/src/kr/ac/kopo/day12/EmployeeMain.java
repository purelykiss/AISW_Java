package kr.ac.kopo.day12;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.employeeTotalInfo();
		
		Employee e = new Employee("홍길동", 3_200);
		Employee e2 = new Employee("강길동", 3_500);
		
		e.info();
		e2.info();
		
		Employee.employeeTotalInfo();
	}
}
